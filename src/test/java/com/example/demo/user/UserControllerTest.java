package com.example.demo.user;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class UserControllerTest {
  
  @Autowired
  private MockMvc mockMvc;

  @Test
  void success() throws Exception {
    mockMvc.perform(get("/api/users"))
      .andDo(print())
      .andExpect(jsonPath("$.length()", is(3)))
      .andExpect(jsonPath("$[0].id", is(1)))
      .andExpect(jsonPath("$[0].name", is("Alex")))
      .andExpect(jsonPath("$[1].id", is(2)))
      .andExpect(jsonPath("$[1].name", is("Tod")))
      .andExpect(jsonPath("$[2].id", is(3)))
      .andExpect(jsonPath("$[2].name", is("Dave")))
    ;
  }
}
