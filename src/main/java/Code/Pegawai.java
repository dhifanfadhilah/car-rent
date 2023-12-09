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

public class Pegawai {
    private String id;
    private String name;
    private String username;
    private String password;
    private String code;
    private String jabatan;
    
    public Pegawai(){
        
    }
    
    public String getId(){
        return this.id;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getusername(){
        return this.username;
    }
    
    public String getPassword(){
        return this.password;
    }
    
    public String getCode(){
        return this.code;
    }
    
    public String getJabatan(){
        return this.jabatan;
    }
    
    public void setId(String id){
        this.id = id;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setUsername(String username){
        this.username = username;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public void setCode(String code){
        this.code = code;
    }
    
    public void setJabatan(String jabatan){
        this.jabatan = jabatan;
    }
    
    public void insertPegawai(){
        Koneksi kon = new Koneksi();
        String s = "insert into user values('"+this.id+"', '"+this.name+"', '"+this.username+"', '"+this.password+"', '2', 'Pegawai')";
        kon.query(s);
    }
    
    public void updatePegawaiAdmin(){
        Koneksi kon = new Koneksi();
        String s = "update user set id='"+this.id+"', name='"+this.name+"', username='"+this.username+"', password='"+this.password+"', code='"+this.code+"', jabatan='Administrator' where id = '"+this.id+"'";
        kon.query(s);
    }
    
    public void updatePegawai(){
        Koneksi kon = new Koneksi();
        String s = "update user set id='"+this.id+"', name='"+this.name+"', username='"+this.username+"', password='"+this.password+"', code='"+this.code+"', jabatan='Pegawai' where id = '"+this.id+"'";
        kon.query(s);
    }
    
    public void deletePegawai(){
        Koneksi kon = new Koneksi();
        String s = "delete from user where id = '"+this.id+"'";
        kon.query(s);
    }
    
    public ResultSet getPegawai(){
        ResultSet r = null;
        Koneksi kon = new Koneksi();
        String s = "insert into user values('"+this.id+"', '"+this.name+"', '"+this.username+"', '"+this.password+"', '2', 'Pegawai')";
        kon.query(s);
        return r;
    }
}
