package com.course.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	//imutable list
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("spring",  "Spring Framework", "Spring Framework Description"),
			new Topic("java",  "Core Java", "Core Java Description"),
			new Topic("javascript",  "Javascript", "Javascript Description")
			));
	
	public List<Topic> getAllTopics() {
		return topics;
	}
	
	public Topic getTopicById(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		
	}

	public void addTopic(Topic topic) {
		// TODO Auto-generated method stub
		topics.add(topic);
	}

}
