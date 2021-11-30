package com.example.demo.user;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

  private final UserRepository userRepository;
  
  public List<User> findAll() {
    return this.userRepository.findAll();
  }
}
