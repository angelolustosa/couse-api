package com.course.springbootstarter.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topics")
	/*public String listAllTopics() {
		return "All topics";
	}*/
	
	public List<Topic> listAllTopics() {
		return topicService.getAllTopics();/*Arrays.asList(
				new Topic("spring",  "Spring Framework", "Spring Framework Description"),
				new Topic("java",  "Core Java", "Core Java Description"),
				new Topic("javascript",  "Javascript", "Javascript Description")
				);*/
	}
	@RequestMapping("/topics/{id}")
	public Topic getTopicById(@PathVariable String id) {
		return topicService.getTopicById(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}

}
