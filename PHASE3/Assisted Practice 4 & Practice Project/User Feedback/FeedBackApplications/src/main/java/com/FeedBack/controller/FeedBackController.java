package com.FeedBack.controller;
import java.util.List;


import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.FeedBack.entity.Feedback;
import com.FeedBack.service.FeedBackService;

@Controller
public class FeedBackController {
	@Autowired
	FeedBackService feedbackService;
	
		@RequestMapping(value = "SendFeedback",method = RequestMethod.POST)
		public String SendFeedback(HttpServletRequest req, Feedback feedback, Model model) {
			String Email = req.getParameter("Email");
			feedback.setCname(Email);
			String Cname = req.getParameter("Cname");
			feedback.setCname(Cname);
			String FeedBacks = req.getParameter("FeedBacks");
			feedback.setCname(FeedBacks);
			String Rating = req.getParameter("Rating");
			feedback.setRating(Rating);
			
			String result = feedbackService.SendFeedback(feedback);
			model.addAttribute("msg", result);
			return "SendFeedback";
		}

		// http://localhost:9090/			with method as get 
		
		@RequestMapping(value = "viewAll",method = RequestMethod.GET)
		public String findAllFeedBackDetails(Model model) {
			List<Feedback> listFeedback=feedbackService.findAllFeedBackDetails();
			model.addAttribute("feedbacks", listFeedback);
			return "ViewFeedBack";
		}
		
}
