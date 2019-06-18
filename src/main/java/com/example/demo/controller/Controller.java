package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.TopicService;
import com.example.demo.model.Topic;

@RestController
public class Controller {

	@Autowired
	private TopicService service;

	@GetMapping("/topics")
	List<Topic> getAllTopics() {
		return service.getAllTopics();
	}

	@PutMapping("/topics")
	Topic updateTopic(@RequestBody Topic topic) {
		return service.updateTopic(topic);
	}

	@DeleteMapping("/topics")
	void deleteTopic(@RequestBody Topic topic) {
		service.deleteTopic(topic);
	}

	@GetMapping("/topic")
	List<Topic> findByName(@RequestParam(value = "name", required = true) String name) {
		return service.findByName(name);
	}
	
	@PostMapping("/topics")
	List<Topic> createTopics(@RequestBody List<Topic> topics) {
		return service.saveAll(topics);
	}

}
