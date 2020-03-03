package com.example.demo.pdd.persistence.vo;

import lombok.Data;

@Data
public class UserVo {

  private String userId;
  private String name;
  private String sex;
  private Integer age;
  private String updateDate;
  private String createDate;
}
