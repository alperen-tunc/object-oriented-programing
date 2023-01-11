/*
 * Copyright (c) 2023.
 * 10.1.2023
 * Salah Lejmi
 */

package util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateUtil {
  public static DateTimeFormatter germanFormatter =
      DateTimeFormatter.ofPattern("dd.MM.yyyy");
  
  public static String de( LocalDate date ) {
    return date.format(germanFormatter);
  }
}
