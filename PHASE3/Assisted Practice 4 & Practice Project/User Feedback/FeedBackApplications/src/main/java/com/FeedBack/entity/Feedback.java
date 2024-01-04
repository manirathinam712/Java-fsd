package com.FeedBack.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.context.annotation.Scope;

@Entity
@Scope("prototype")
public class Feedback {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String  Email;
	private String Cname;
	private String FeedBacks;
	private String Rating;
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getCname() {
		return Cname;
	}
	public void setCname(String cname) {
		Cname = cname;
	}
	public String getFeedBacks() {
		return FeedBacks;
	}
	public void setFeedBacks(String feedBacks) {
		FeedBacks = feedBacks;
	}
	public String getRating() {
		return Rating;
	}
	public void setRating(String rating) {
		Rating = rating;
	}
	@Override
	public String toString() {
		return "Feedback [Email=" + Email + ", Cname=" + Cname + ", FeedBacks=" + FeedBacks + ", Rating=" + Rating + "]";
	}
	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Feedback(String email, String cname, String feedBacks, String rating) {
		super();	
		this.Email = email;
		this.Cname = cname;
		this.FeedBacks = feedBacks;
		this.Rating = rating;
	}
	

}
