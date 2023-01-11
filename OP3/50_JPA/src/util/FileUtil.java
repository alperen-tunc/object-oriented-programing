/*
 * Copyright (c) 2023.
 * 5.1.2023
 * Salah Lejmi
 */

package util;

import javax.swing.*;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileUtil {
  
  public static void save( Path path, byte[] bytes ) {
    try {
      Files.write(path, bytes);
    } catch ( IOException e ) {}
  }
  
  public static boolean isImage( String filename ) {
    String ext = getExtention(filename);
    return List.of("bmp", "gif", "png", "jpeg", "jpg")
               .contains(ext);
  }
  
  public static Path getFromClassPath( String filename ) {
    // Relativ zum ClassPath-Root (src-Ordner)
    URL url = FileUtil.class.getResource(filename);
    String path = url.getPath().replaceFirst("/", "");
    //System.out.println("path: " + path);
    return Path.of(path);
  }
  
  public static Path selectFileFromDir( String startPath ) {
    // To load from classpath (src-dir)
    //URL url = FileUtil.class.getResource(startPath);
    //String dir = url.getFile();
    JFileChooser choose = new JFileChooser(startPath);
    int res = choose.showOpenDialog(null);
    File file = null;
    if (res == JFileChooser.APPROVE_OPTION) {
      file = choose.getSelectedFile();
      System.out.println(file.getAbsolutePath());
    }
    return file.toPath();
  }
  
  public static String getExtention( byte[] bytes )  {
    InputStream is = new ByteArrayInputStream(bytes);
    String mimeType = null;
    try {
      mimeType = URLConnection.guessContentTypeFromStream(is);
      is.close();
    } catch ( IOException e ) {
      throw new RuntimeException(e);
    }
    // image/jpeg => jpeg
    return mimeType.substring(mimeType.indexOf('/') + 1);
  }

  public static String getExtention( String filename )  {
    return filename.substring(filename.lastIndexOf(".") + 1);
  }

  public static String getname( String filename )  {
    return filename.substring(0, filename.lastIndexOf("."));
  }
  
}
