package com.FeedBack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.FeedBack.entity.Feedback;

@Repository
public interface FeedBackRepository extends JpaRepository<Feedback, Integer>{

}
