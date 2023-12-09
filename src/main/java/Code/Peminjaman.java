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

public class Peminjaman {
    private String idPinjam;
    private String idCust;
    private String idPegawai;
    private String idMobil;
    private String phari;
    private String pbulan;
    private String ptahun;
    private String lama;
    private String tglKembali;
    private String telat;
    private String denda;
    private String biaya;
    private String status;
    
    public Peminjaman(){ };
    
    public String getIdPinjam(){ return this.idPinjam; }
    public String getIdCust(){ return this.idCust; }
    public String getIdPegawai(){ return this.idPegawai; }
    public String getIdMobil(){ return this.idMobil; }
    public String getPhari(){ return this.phari; }
    public String getPbulan(){ return this.pbulan; }
    public String getPtahun(){ return this.ptahun; }
    public String getLama(){ return this.lama; }
    public String getTglKembali(){ return this.tglKembali; }
    public String getTelat(){ return this.telat; }
    public String getDenda(){ return this.denda; }
    public String getBiaya(){ return this.biaya; }
    public String getStatus(){ return this.status; }
    public String getTanggal(){
        String help = "";
        String help2 = "";
        int num1 = Integer.parseInt(this.phari);
        int num2 = Integer.parseInt(this.pbulan);
        if(num1 < 10){
            help = "0";
        }
        if(num2 < 10){
            help2 = "0";
        }
        
        return (this.ptahun+"-"+help2+this.pbulan+"-"+help+this.phari);
    }
    
    public void setIdPinjam(String idPinjam){this.idPinjam = idPinjam;}
    public void setIdCust(String idCust){this.idCust = idCust;}
    public void setIdPegawai(String idPegawai){this.idPegawai = idPegawai;}
    public void setIdMobil(String idMobil){this.idMobil = idMobil;}
    public void setPhari(String phari){this.phari = phari;}
    public void setPbulan(String pbulan){this.pbulan = pbulan;}
    public void setPtahun(String ptahun){this.ptahun = ptahun;}
    public void setLama(String lama){this.lama = lama;}
    public void setTglKembali(String tglKembali){this.tglKembali = tglKembali;}
    public void setTelat(String telat){this.telat = telat;}
    public void setDenda(String denda){this.denda = denda;}
    public void setBiaya(String biaya){this.biaya = biaya;}
    public void setStatus(String status){this.status = status;}
    
    public void insertPeminjaman(){
        Koneksi kon = new Koneksi();
        String s = "insert into peminjaman values('"+this.idPinjam+"', '"+this.idCust+"', '"+this.idPegawai+"', '"+this.idMobil+"', '"+getTanggal()+"', '"+this.lama+"', '"+this.tglKembali+"', '0', '0', '"+this.biaya+"', 'Not Completed')";
        kon.query(s);
    }
    
    public void updatePeminjaman(){
        Koneksi kon = new Koneksi();
        String s = "update peminjaman set telat = '"+this.telat+"', denda = '"+this.denda+"', biaya = '"+this.biaya+"', status = 'Completed' where id_pinjam = '"+this.idPinjam+"'";
        kon.query(s);
    }
    
    public void deletePeminjaman(){
        Koneksi kon = new Koneksi();
        String s = "delete from peminjaman where id_pinjam = '"+this.idPinjam+"'";
        kon.query(s);
    }
    
    public ResultSet getPeminjaman(){
        ResultSet r = null;
        Koneksi kon = new Koneksi();
        String s = "insert into peminjaman values('"+this.idPinjam+"', '"+this.idCust+"', '"+this.idPegawai+"', '"+this.idMobil+"', '"+getTanggal()+"', '"+this.lama+"', '"+this.tglKembali+"', '0', '0', '"+this.biaya+"', 'Not Completed')";
        kon.query(s);
        return r;
    }
}
