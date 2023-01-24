package com.example.pp_2_3_1_21_01.repositories;


import com.example.pp_2_3_1_21_01.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
