package com.example.demo.core.util;

import static lombok.AccessLevel.PRIVATE;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(access = PRIVATE)
public class DateUtil {


  private static final String PATTERN_NORMAL = "yyyy-MM-dd HH:mm:ss";

  public static String formatDate(ZonedDateTime date) {
    return formatDate(date, PATTERN_NORMAL);
  }

  public static String formatDate(ZonedDateTime date, String pattern) {
    return Optional.ofNullable(date)
        .map(i -> DateTimeFormatter.ofPattern(pattern).format(i))
        .orElse(null);
  }
}
