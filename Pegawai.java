/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugaspertemuan6pbo;

/**
 *
 * @author DWI ADITYA BUDI
 */
public class Pegawai {
    private String Nama;
    private double GajiPokok;
    
    public void SetNama(String Nama){
        this.Nama = Nama;
    }
    public void SetGajiPokok(double GajiPokok){
        this.GajiPokok = GajiPokok;
    }
    public String getNama(){
        return this.Nama;
    }
    public double getGajiPokok(){
        return this.GajiPokok;
    }
    public void CetakInfo(){
        System.out.println("PEGAWAI");
        System.out.println("Nama            : " + getNama());
        System.out.println("Gaji POkok      : " + getGajiPokok());
    }
}
