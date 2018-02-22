
package mustafa_cms;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Model{ 
  public ResultSet  getMatreal() throws SQLException{
       Connection conn = null;
       ResultSet row = null;
       try {
        connected my = new connected();
        Connection con = my.con();
        Statement qurrey = con.createStatement();
        row =qurrey.executeQuery("select * from matreal");
         } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
       return row;
}

 
        
    public int sizeRsult(ResultSet row) throws SQLException{
        int i=0;
        while(row.next())
        {
          i++;  
        }
       
      return i; 
   }

   public void deleteRow(int rowid) throws SQLException{
       Connection conn = null;
       try {
        connected my = new connected();
        Connection con = my.con();
        Statement qurrey = con.createStatement();
        qurrey.executeQuery("delete from matreal where id = '"+rowid+"'");
         } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }    
   }
   
  
  public void UpdataRow(
                        String name,String data,
                        String exp,String priceget,
                        String priceout,String number,
                        String pr,int id
                       ) throws SQLException
       {
       Connection conn = null;
       try {
        connected my = new connected();
        Connection con = my.con();
        Statement qurrey = con.createStatement();
        qurrey.executeQuery
        (
        "update matreal set"+" "
        +"name = '"+name+"' "+","
        +"data = '"+data+"' "+","
        +"dataexp = '"+exp+"' "+","
        +"priceget = '"+priceget+"' "+","
        +"priceout = '"+priceout+"' "+","
        +"number = '"+number+"' "+","
        +"pr = '"+pr+"'"
        +" where id == '"
        +id+"'"
        );
         } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }    
   } 
   
  public void InsertRow(
                        String name,String data,
                        String exp,String priceget,
                        String priceout,String number,
                        String pr
                       ) throws SQLException
       {
       Connection conn = null;
       try {
        connected my = new connected();
        Connection con = my.con();
        Statement qurrey = con.createStatement();
        qurrey.executeQuery
        (
        "insert into matreal(name,data,dataexp,priceget,priceout,number,pr)"
        +"values("
        +"'"+name+"',"
        +"'"+data+"',"
        +"'"+exp+"',"
        +"'"+priceget+"',"
        +"'"+priceout+"',"
        +"'"+number+"',"       
        +"'"+pr+"')"
        
        );
         } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }    
   }


  public static void main(String args[]) throws SQLException{
     Model m=new Model();
     m.InsertRow("husse","1","1","1","1","1","1");
    
  }
    public ResultSet  getAdmins() throws SQLException{
        connected my = new connected();
        Connection con = my.con();
        Statement qurrey = con.createStatement();
        ResultSet row;
        row =qurrey.executeQuery("select * from admin");
        return row;
       
   }
   
 

}




