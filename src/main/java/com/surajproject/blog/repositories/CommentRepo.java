package com.surajproject.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.surajproject.blog.entites.Comment;

public interface CommentRepo extends JpaRepository<Comment, Integer> {

	
	
}
