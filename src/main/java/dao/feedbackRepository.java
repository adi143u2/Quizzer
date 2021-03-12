package dao;

import org.springframework.data.jpa.repository.JpaRepository;


import model.feedback;

public interface feedbackRepository extends JpaRepository<feedback, Integer> {

	

	
}
