/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspertemuan6pbo;

/**
 *
 * @author DWI ADITYA BUDI
 */
public class Manager extends Pegawai{
    double Tunjangan;
    
    public void setTunjangan(double Tunjangan){
        this.Tunjangan = Tunjangan;
    }
    public double getTunjangan(){
        return this.Tunjangan;
    }
    public void CetakInfo (){
        System.out.println("MANAGER");
        System.out.println("Nama            : " + getNama());
        System.out.println("Gaji Pokok      : " + getGajiPokok());
                
    }
    public void CetakTunjangan(){
        System.out.println("Tunjangan       : " + getTunjangan());
    }
    
}
