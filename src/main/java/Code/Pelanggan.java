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

public class Pelanggan {
    private String id;
    private String nama;
    private String alamat;
    private String nomor;
    private String status;
    
    public Pelanggan(){ }
    
    public String getId(){
        return this.id;
    }
    
    public String getNama(){
        return this.nama;
    }
    
    public String getAlamat(){
        return this.alamat;
    }
    
    public String getNomor(){
        return this.nomor;
    }
    
    public String getStatus(){
        return this.status;
    }
    
    public void setId(String id){
        this.id = id;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    
    public void setNomor(String nomor){
        this.nomor = nomor;
    }
    
    public void setStatus(String status){
        this.status = status;
    }
    
    public void insertPelanggan(){
        Koneksi kon = new Koneksi();
        String s = "insert into customer values('"+this.id+"', '"+this.nama+"', '"+this.alamat+"', '"+this.nomor+"')";
        kon.query(s);
    }
    
    public void updatePelanggan(){
        Koneksi kon = new Koneksi();
        String s = "update customer set customer_id = '"+this.id+"', name = '"+this.nama+"', address = '"+this.alamat+"', phone_number = '"+this.nomor+"' where customer_id = '"+this.id+"'";
        kon.query(s);
    }
    
    public void deletePelanggan(){
        Koneksi kon = new Koneksi();
        String s = "delete from customer where customer_id = '"+this.id+"'";
        kon.query(s);
    }
    
    public ResultSet getPelanggan(){
        ResultSet r = null;
        Koneksi kon = new Koneksi();
        String s = "insert into customer values('"+this.id+"', '"+this.nama+"', '"+this.alamat+"', '"+this.nomor+"')";
        kon.query(s);
        return r;
    }
}
