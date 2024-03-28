package com.post.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.post.PostRepository;
import com.post.entity.Post;

@RestController
@RequestMapping("/post")
public class PostController {
	@Autowired
	PostRepository repo;
public ResponseEntity<Post>	createpost(@RequestBody Post p){
	return repo.save(p);
}
}
