import java.sql.*;
import oracle.jdbc.driver.OracleDriver;
public class connect
     {
public static void main (String args[])
    {
     try{
  OracleDriver driver=new OracleDriver();
  DriverManager.registerDriver(driver);
  Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","SYSTEM","sini1234");
       if(cn!=null)
            {
      System.out.println("connection object is created");
            }
  cn.close();
        }catch(SQLException ss)
             {
             ss.printStackTrace();
             }
     }
}
