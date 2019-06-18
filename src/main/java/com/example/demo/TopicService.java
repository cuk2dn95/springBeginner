package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.Topic;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepo;

	public List<Topic> getAllTopics() {
		List<Topic> topics = new ArrayList();
		topicRepo.findAll().forEach(t -> topics.add(t));
		return topics;
	}

	public Topic updateTopic(Topic topic) {
		return topicRepo.save(topic);
	}

	public void deleteTopic(Topic topic) {
		topicRepo.delete(topic);
	}

	public Topic createTopic(Topic topic) {
		return topicRepo.save(topic);
	}
	
	public List<Topic> saveAll(List<Topic> topics) {
		topicRepo.save(topics);
		return topics;
	}
	
	public List<Topic> findByName(String name) {
		return topicRepo.findByName(name);
	}
}
