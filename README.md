# Tugas Pertemuan 6
Pada tugas kita di minta untuk membuat program dengan penerapan Inheritance . Dalam Tugas ini saya menggunakan Apache NetBeans IDE 15, Pertama saya membuat 4 file yaitu,

- Beraksi.java = File Utama
- Pegawai.java = File Induk
- Manager.java = File Anak
- Programmer.java = File Anak

kita di minta untuk mengikuti diagram sebagai berikut,

![image](https://user-images.githubusercontent.com/115923969/199669416-115ce30c-56b8-48f5-95d2-81eda3b77f75.png)

Pertama saya membuat terlebih dahulu untuk kelas Induknya yaitu Pegawai.java dan membuat method kosong bernama cetakInfo().

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

Kemudian kita membuat dua file anak yaitu Manager.java dan Programmer.java sebagai Berikut,
Manager.Java

    public class Manager extends Pegawai{
        double Tunjangan;
    
        public void setTunjangan(double Tunjangan){
            this.Tunjangan = Tunjangan;
        }
        public double getTunjangan(){
            return this.Tunjangan;
        }
        public void CetakInfo (){
            System.out.println("  ==== MANAGER ====  ");
            System.out.println("Nama            : " + getNama());
            System.out.println("Gaji Pokok      : " + getGajiPokok());                
        }
        public void CetakTunjangan(){
            System.out.println("Tunjangan       : " + getTunjangan());
        }
    }

Programmer.Java

    public class Programmer extends Pegawai{
        private double Bonus;
    
        public void setBonus(double Bonus){
            this.Bonus = Bonus;        
        }
        public double getBonus (){
            return this.Bonus;
        }
        public void CetakInfo(){
            System.out.println("  ==== Programmer ====  ");
            System.out.println("Nama            : " + getNama());
            System.out.println("Gaji Pokok      : " + getGajiPokok());
        
        }
        public void CetakBonus(){
            System.out.println("Bonus          : " + getBonus());
        }
    }

Setelah semua di isi Kemuadian Kita Panggil pada Main Class Beraksi.java jadi seperti berikut,

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
    
Kemudian Run dan Hasilnya sebagai berikut,

![image](https://user-images.githubusercontent.com/115923969/199673315-9ace2e84-7aa0-4f0b-b164-5b64db5beb7e.png)
