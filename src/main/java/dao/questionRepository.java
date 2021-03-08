package dao;

import org.springframework.data.jpa.repository.JpaRepository;

import model.question;

public interface questionRepository extends JpaRepository<question, Integer> {

}
