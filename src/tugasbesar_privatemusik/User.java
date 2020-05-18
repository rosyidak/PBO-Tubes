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
public abstract class User {
    abstract void setUserLogin(String id);
    abstract void setNama(String nama);
    abstract String getUserLogin();
    abstract String getNama();
}
