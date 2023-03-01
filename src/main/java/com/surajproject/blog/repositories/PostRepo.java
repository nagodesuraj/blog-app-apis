package com.surajproject.blog.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.surajproject.blog.entites.Category;
import com.surajproject.blog.entites.Post;
import com.surajproject.blog.entites.User;

public interface PostRepo extends JpaRepository<Post, Integer> {
	
	
	List<Post> findByUser(User user);
	
	List<Post> findByCategory(Category category);
	
	
	@Query("select p from Post p where p.title like:key")
	List<Post> findByTitle(@Param("key") String title);
	
	//List<Post> findByTitleContaining(String title);

}
