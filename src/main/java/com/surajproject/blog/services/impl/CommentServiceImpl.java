package com.surajproject.blog.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.surajproject.blog.entites.Comment;
import com.surajproject.blog.entites.Post;
import com.surajproject.blog.exceptions.ResourceNotFoundException;
import com.surajproject.blog.payloads.CommentDto;
import com.surajproject.blog.repositories.CommentRepo;
import com.surajproject.blog.repositories.PostRepo;
import com.surajproject.blog.services.CommentService;

@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	private CommentRepo commentRepo;

	@Autowired
	private PostRepo postRepo;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public CommentDto createComment(CommentDto commentDto, Integer postId) {

		Post post = this.postRepo.findById(postId)
				.orElseThrow(() -> new ResourceNotFoundException("Post", "post id", postId));

		Comment comment = this.modelMapper.map(commentDto, Comment.class);

		comment.setPost(post);
		Comment savedComment = this.commentRepo.save(comment);

		return this.modelMapper.map(savedComment, CommentDto.class);
	}

	@Override
	public void deleteComment(Integer commentId) {

		Comment com = this.commentRepo.findById(commentId)
				.orElseThrow(() -> new ResourceNotFoundException("Comment", "comment id", commentId));
		
		this.commentRepo.delete(com);
	}

}
