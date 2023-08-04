package com.jojoldu.book.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.jojoldu.book.springboot.service.PostsService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class IndexController {

	private final PostsService postsService;
	
	@GetMapping("/")
    public String index() {
        return "index";
    }
	
	@GetMapping("/posts/save")
    public String postsSave() {
        return "posts-save";
    }
}
