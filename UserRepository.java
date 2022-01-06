package com.example.repository;

import com.example.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface  UserRepository extends JpaRepository<User, Long> {
}
