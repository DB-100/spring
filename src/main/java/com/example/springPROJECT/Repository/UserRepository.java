package com.example.springPROJECT.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springPROJECT.Entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}