/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspertemuan6pbo;

/**
 *
 * @author DWI ADITYA BUDI
 */
public class Beraksi {
    public static void main(String[] args){
        Manager Antoni = new Manager();
        
        Antoni.SetNama("Anton");
        Antoni.SetGajiPokok(4000000);
        Antoni.setTunjangan(5000000);
        
        Programmer anton1 = new Programmer();
        
        anton1.SetNama("Riko");
        anton1.SetGajiPokok(5000000);
        anton1.setBonus(200000);
        
        Antoni.CetakInfo();
        Antoni.CetakTunjangan();
        
        anton1.CetakInfo();
        anton1.CetakBonus();
    }
    
}
