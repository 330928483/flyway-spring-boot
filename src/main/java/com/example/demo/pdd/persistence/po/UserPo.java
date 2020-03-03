package com.example.demo.pdd.persistence.po;

import com.example.demo.core.persistence.po.EntityBaseModel;
import com.example.demo.pdd.contract.enums.Gender;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(name = "user")
@EqualsAndHashCode(callSuper = false)
public class UserPo extends EntityBaseModel {

  private String userId;
  private String name;
  @Enumerated(EnumType.STRING)
  private Gender sex;
  private Integer age;
}
