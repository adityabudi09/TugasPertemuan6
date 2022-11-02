/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspertemuan6pbo;

/**
 *
 * @author DWI ADITYA BUDI
 */
public class Programmer extends Pegawai{
    private double Bonus;
    
    public void setBonus(double Bonus){
        this.Bonus = Bonus;        
    }
    public double getBonus (){
        return this.Bonus;
    }
    public void CetakInfo(){
        System.out.println("Programmer");
        System.out.println("Nama            : " + getNama());
        System.out.println("Gaji Pokok      : " + getGajiPokok());
        
    }
    public void CetakBonus(){
        System.out.println("Bonus          : " + getBonus());
    }
    
    
}
