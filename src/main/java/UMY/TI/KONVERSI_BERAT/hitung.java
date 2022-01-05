/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UMY.TI.KONVERSI_BERAT;

/**
 *
 * @author AISYAH SUHERMAN
 */
public class hitung {
    public static double kilogramToGram(double value)
    {
        return (value*1000);
    }
    public static double gramTokilogram (double value)
    {
        return (value/1000);
    }
    
    public static double kilogramToKuintal(double value)
    {
        return (value/100);
    }
    public static double KuintalTokilogram(double value){
        return (value*100);
    }
    public static double kilogramToPon(double value)
    {
        return (value*2.205);
    }
    public static double PonTokilogram(double value){
        return (value/2.205);
    }
    public static double gramToOns(double value)
    {
        return (value/28.35);
    }
    public static double OnsTogram(double value){
        return (value*28.35);
    }
  
}