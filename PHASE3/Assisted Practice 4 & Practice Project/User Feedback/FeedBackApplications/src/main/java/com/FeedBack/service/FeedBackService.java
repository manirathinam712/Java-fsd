package com.FeedBack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FeedBack.entity.Feedback;
import com.FeedBack.repository.FeedBackRepository;

@Service
public class FeedBackService {
	@Autowired
	FeedBackRepository feedbackRepository;
	
	public String SendFeedback(Feedback feedback) {
		feedbackRepository.save(feedback);
		return "Project details stored successfully";
	}
	
	public List<Feedback> findAllFeedBackDetails() {
		return feedbackRepository.findAll();		// it is pre -defined method. 
	}
}
