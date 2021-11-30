package com.example.demo.user;

import static org.springframework.beans.BeanUtils.copyProperties;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
  private Integer id;
  private String name;
  @JsonProperty("created_at")
  private LocalDateTime createdAt;

  public UserDto(User source) {
    copyProperties(source, this);
  }
}
