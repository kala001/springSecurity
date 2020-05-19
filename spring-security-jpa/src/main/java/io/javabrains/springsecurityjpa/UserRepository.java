package io.javabrains.springsecurityjpa;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

import io.javabrains.springsecurityjpa.models.User;

//@Repository
public interface UserRepository extends JpaRepository <User, Integer> {
	
	Optional<User> findByUserName(String userName);

}
