package com.example.demo.pdd.persistence.mapper;

import static com.example.demo.core.util.DateUtil.formatDate;
import static com.example.demo.pdd.contract.enums.Gender.MEN;
import static org.mapstruct.ReportingPolicy.IGNORE;

import com.example.demo.pdd.contract.enums.Gender;
import com.example.demo.pdd.persistence.po.UserPo;
import com.example.demo.pdd.persistence.vo.UserVo;
import java.time.ZonedDateTime;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", unmappedTargetPolicy = IGNORE)
public interface UserMapper {

  UserVo toVo(UserPo po);

  List<UserVo> toVos(List<UserPo> pos);

  default String toSex(Gender gender) {
    return MEN == gender ? "男" : "女";
  }

  default String toDateTime(ZonedDateTime dateTime) {
    return formatDate(dateTime);
  }
}
