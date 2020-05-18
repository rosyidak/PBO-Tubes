/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasbesar_privatemusik;

/**
 *
 * @author Ronaldo
 */
public class UserHashMap extends User{
    public String id;
    public String nama;
    
    public UserHashMap(String id,String nama){
        this.id=id;
        this.nama=nama;
    }
    @Override
    public void setUserLogin(String id){
        this.id=id;
    }
    @Override
    public void setNama(String nama){
        this.nama=nama;
    }
    @Override
    public String getUserLogin(){
        return id;
    }
    @Override
    public String getNama(){
        return nama;
    }
}
