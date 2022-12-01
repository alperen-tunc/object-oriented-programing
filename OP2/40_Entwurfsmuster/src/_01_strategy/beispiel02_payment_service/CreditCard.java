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

package _01_strategy.beispiel02_payment_service;

public class CreditCard
{
    private int amount = 1_000;
    private String number; // Kreditkartennummer
    private String date;   // Ablaufdatum
    private String cvv;    // Prüfziffer
    
    public CreditCard( String number, String date, String cvv )
    {
        this.number = number;
        this.date = date;
        this.cvv = cvv;
        System.out.println("Neue Kredit Karte wurde erstellt:\n" + number + "\n" + date + "\n" + cvv);
    }
    
    public void setAmount( int amount ) {
        this.amount = amount;
    }
    
    public void setNumber( String number ) {
        this.number = number;
    }
    
    public void setDate( String date ) {
        this.date = date;
    }
    
    public void setCvv( String cvv ) {
        this.cvv = cvv;
    }
    
    public int getAmount() {
        return amount;
    }
    
    public String getNumber() {
        return number;
    }
    
    public String getDate() {
        return date;
    }
    
    public String getCvv() {
        return cvv;
    }
    
}

