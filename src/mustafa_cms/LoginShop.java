
package mustafa_cms;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginShop {
    private String Username;
    private String Password;
    
    public void setUsername(String username){
        this.Username=username;
    }
    public void setPassword(String password){
        this.Password=password;
    }
    public boolean isLogin() throws SQLException{
        Model Model=new Model();
       ResultSet admins= Model.getAdmins();
       while(admins.next()){
        if(admins.getString("username").equals(this.Username)&& 
           admins. getString("password").equals(this.Password)){
               return true;    
            }
        }
       return false;
    }
        public static void main(String args[]) {
            LoginShop log =new LoginShop();
        }
    
}
