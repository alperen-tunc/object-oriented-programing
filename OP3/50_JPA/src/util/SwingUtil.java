/*
 * Copyright (c) 2023.
 * 5.1.2023
 * Salah Lejmi
 */

package util;

import javax.swing.*;
import java.awt.*;

public class SwingUtil {
  
  public static void viewImageWithSwing( String text, byte[] image ) {
    Image img = Toolkit.getDefaultToolkit().createImage(image);
    JLabel photoLabel = new JLabel(new ImageIcon(img) );
    photoLabel.setText(text);
    JOptionPane.showMessageDialog(null, photoLabel);
  }
  
}
