package com.example.demo.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics = Arrays.asList(
			new Topic("spring", "Spring Framework", "Spring Description"),
			new Topic("java-spring", "Java Spring Framework", "Java Spring Description"),
			new Topic("springboot", "Springboot Framework", "Springboot  Description")
		);
	
	public List<Topic> getAllTopics(){
		return topics;
	}
}
