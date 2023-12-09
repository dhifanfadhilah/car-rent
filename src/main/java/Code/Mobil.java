/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

import java.sql.ResultSet;

/*
Nama        :   Dhifan Fadhilah Aditya - 140810210042
                Aryan Dafi Maulana – 140810210012
        	Akmal Azzary Megaputra - 140810210048
*/

public class Mobil {
    private String id;
    private String jenis;
    private String sewa;
    private String stok;
    
    public Mobil(){
        
    }
    
    public String getId(){ return this.id; }
    public String getJenis(){ return this.jenis; }
    public String getSewa(){ return this.sewa; }
    public String getStok(){ return this.stok; } 
    
    public void setId(String id){ this.id = id; }
    public void setJenis(String jenis){ this.jenis = jenis; }
    public void setSewa(String sewa){ this.sewa = sewa; }
    public void setStok(String stok){ this.stok = stok; }
    
    public void insertMobil(){
        Koneksi kon = new Koneksi();
        String s = "insert into cars values('"+this.id+"', '"+this.jenis+"', '"+this.sewa+"', '"+this.stok+"')";
        kon.query(s);
    }
    
    public void updateMobil(){
        Koneksi kon = new Koneksi();
        String s = "update cars set car_id = '"+this.id+"', car_name = '"+this.jenis+"', rent = '"+this.sewa+"', stock = '"+this.stok+"' where car_id = '"+this.id+"'";
        kon.query(s);
    }
    
    public void deleteMobil(){
        Koneksi kon = new Koneksi();
        String s = "delete from cars where car_id = '"+this.id+"'";
        kon.query(s);
    }
    
    public ResultSet getMobil(){
        ResultSet r = null;
        Koneksi kon = new Koneksi();
        String s = "insert into cars values('"+this.id+"', '"+this.jenis+"', '"+this.sewa+"', '"+this.stok+"')";
        kon.query(s);
        return r;
    }
}
