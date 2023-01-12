package com.cts.project2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.project2.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
