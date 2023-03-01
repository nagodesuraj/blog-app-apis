package com.surajproject.blog.services;

import java.util.List;

import com.surajproject.blog.entites.Post;
import com.surajproject.blog.payloads.PostDto;
import com.surajproject.blog.payloads.PostResponse;

public interface PostService {

	
	//create
	PostDto createPost(PostDto postDto,Integer userId,Integer categoryId);
	
	//update
	
	PostDto updatePost(PostDto postDto,Integer postId);
	
	//delete post
	void deletePost(Integer postId);
	
	//get all posts
	
	PostResponse getAllPost(Integer pageNumber,Integer pageSize,String sortBy,String sortDir);
	
	//get single post
	PostDto getPostById(Integer postId);
	
	//get all post by category
	List<PostDto> getPostByCategory(Integer categoryId);
	
	//get all post by User
	
    List<PostDto> getPostByUser(Integer userId);
    
    // serch posts
    List<PostDto> searchPosts(String keyword);
    
}
