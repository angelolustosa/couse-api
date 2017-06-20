package com.course.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics = Arrays.asList(
			new Topic("spring",  "Spring Framework", "Spring Framework Description"),
			new Topic("java",  "Core Java", "Core Java Description"),
			new Topic("javascript",  "Javascript", "Javascript Description")
			);
	
	public List<Topic> getAllTopics() {
		return topics;
	}
	
	public Topic getTopicById(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		
	}

}
