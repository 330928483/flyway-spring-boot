package com.example.demo.pdd.web;

import com.example.demo.pdd.persistence.vo.UserVo;
import com.example.demo.pdd.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("user")
@RequiredArgsConstructor
public class UserContorller {

  private final UserService userService;

  @GetMapping
  public Flux<UserVo> getUsers() {
    return Flux.fromIterable(userService.findUsers());
  }
}
