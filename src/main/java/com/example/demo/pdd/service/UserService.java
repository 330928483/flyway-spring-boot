package com.example.demo.pdd.service;

import com.example.demo.pdd.persistence.mapper.UserMapper;
import com.example.demo.pdd.persistence.repository.UserRepository;
import com.example.demo.pdd.persistence.vo.UserVo;
import com.google.common.collect.Lists;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

  private final UserMapper userMapper;
  private final UserRepository userRepository;

  public List<UserVo> findUsers() {
    return userMapper.toVos(Lists.newArrayList(userRepository.findAll()));
  }
}
