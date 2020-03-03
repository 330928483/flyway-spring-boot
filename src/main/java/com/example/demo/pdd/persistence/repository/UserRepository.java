package com.example.demo.pdd.persistence.repository;

import com.example.demo.pdd.persistence.po.UserPo;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserPo, Long> {

  Optional<UserPo> findByUserId(String userId);
}
