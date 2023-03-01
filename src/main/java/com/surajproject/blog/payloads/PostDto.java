package com.surajproject.blog.payloads;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.surajproject.blog.entites.Comment;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PostDto {

	private Integer postId;
	
	private String title;
	
	private String content;
	
	private Date addedDate;
	
	private String imageName;
	
	private CategoryDto category;
	
	private UserDto user;
	
	private Set<CommentDto> comments=new HashSet<>();
}
