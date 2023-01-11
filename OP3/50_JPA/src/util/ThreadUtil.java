/*
 * Copyright (c) 2023.
 * 6.1.2023
 * Salah Lejmi
 */

package util;

import static util.ConsoleUtil.print;

public class ThreadUtil {
  public static void pause( int sec, String text ) {
    try {
      print(text + "- Pause " + sec + " Sek");
      Thread.sleep(sec * 1000);
    } catch ( InterruptedException e ) {
      throw new RuntimeException(e);
    }
    
  }
  
}
