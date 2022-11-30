/*
 * MIT License
 *
 * Copyright (c) 2022 Geekific (https://www.youtube.com/c/Geekific)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice, Geekific's channel link and this permission notice
 * shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package _01_strategy.beispiel02_payment_service.t01_vorher;


import _01_strategy.beispiel02_payment_service.CreditCard;

public class BezahlService {
  
  private int kosten;
  
  public void setKosten( int kosten ) {
    this.kosten = kosten;
    System.out.println("Neue Kosten wurde erstellt." + kosten);
  }
  
  public void bezahlungEinleiten( String paymentMethod ) {
    if ("CreditCard".equals(paymentMethod)) {
      // ================ Kreditkarte ================
      // Daten der Kreditkarte abfragen
      CreditCard card = new CreditCard("1234-5678-9874-5874", "05/2027", "177");
      // Kartendaten validieren ...
      card.setAmount(kosten); // Betrag setzen und abbuchen
      
    } else if ("PayPal".equals(paymentMethod)) {
      // ================   PayPal    ================
      // Zugangsdaten von PayPal abfragen
      String email = "...";
      String password = "...";
      // Konto validieren
      // Bezahlung einleiten
    }
    // else if ("Nachnahme".equals(paymentMethod))
    // else if ("Überweisung".equals(paymentMethod))
    // ...
    // =============================================
  }
  
  
}

