package com.example.demo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.core.CrudMethods;

import com.example.demo.model.Topic;

public interface TopicRepository extends CrudRepository<Topic, String> {
	
	public List<Topic> findByName(String name);

}
