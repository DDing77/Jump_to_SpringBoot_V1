package com.mysite.sbb.repository;

import com.mysite.sbb.entitiy.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer, Long> {
}
