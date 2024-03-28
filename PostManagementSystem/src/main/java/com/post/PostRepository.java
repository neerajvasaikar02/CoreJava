package com.post;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository{

	List<Post>findby
}
