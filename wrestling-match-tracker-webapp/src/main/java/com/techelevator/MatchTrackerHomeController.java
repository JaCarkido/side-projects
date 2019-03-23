package com.techelevator;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.wrestlermodel.Wrestler;
import com.techelevator.wrestlermodel.WrestlerDao;




@Controller
public class MatchTrackerHomeController {
	
	@Autowired
	private WrestlerDao dao;
	
	@RequestMapping(path= {"/","/matchTrackerHome"})
		public String displayTrackerHome() {
			return "matchTrackerHome";
		}

	
}
//  controller to bring us to the base post page
//	
//	@RequestMapping("/newReview")
//	public String displayForum() {
//		return "newReview";
//	}
//	
//  save the input to the database	
//	
//	@RequestMapping(path="/newReview", method=RequestMethod.POST)
//	public String forumSubmission(@RequestParam String username,
//								  @RequestParam String rating,
//								  @RequestParam String title,
//								  @RequestParam String message) {   
//		
//		Review review = new Review();
//		//DateTimeFormatter formatter= DateTimeFormatter.ofPattern("MM-dd-yyyy");     <-------- format date when i have time, happy path first
//		
//		review.setUsername(username);
//		review.setRating(Integer.parseInt(rating));
//		review.setTitle(title);
//		review.setText(message);
//		review.setDateSubmitted(LocalDateTime.now());
//		
//		//review.setDateSubmitted(LocalDateTime.parse(LocalDateTime.now().format(formatter)));     <------------Parsing issue?
//		
//		dao.save(review);
//		
//	
//		return "redirect:/reviews";  
//		
//	}
//	
//	allows us to view the results of the query
//	
//	@RequestMapping("/reviews")
//	public String displayReviews(HttpServletRequest request) {
//		List<Review> reviewList = dao.getAllReviews();
//		request.setAttribute("reviews", reviewList);
//		return "reviews";
//	}

	
	
