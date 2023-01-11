/*
 * Copyright (c) 2023.
 * 6.1.2023
 * Salah Lejmi
 */

package util;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class ConsoleUtil {
  
  public static void print( String txt ) {
    String formattedTime = LocalTime.now().format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM));
    System.out.println(formattedTime + " - " + txt);
  }
}
