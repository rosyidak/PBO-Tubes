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
public class UserSession{
    private static String id;
    
    public static void setUserLogin(String id){
        UserSession.id=id;
    }
    
    public static String getUserLogin(){
        return id;
    }
}
