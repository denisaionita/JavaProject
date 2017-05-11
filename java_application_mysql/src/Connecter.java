
import java.sql.*;

public class Connecter {
    Connection con;
    public Connecter(){
    try{
    Class.forName("com.mysql.jdbc.Driver");
    }catch(ClassNotFoundException e){
        System.err.println(e);//show err 
    }
    try{con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studiu?zeroDateTimeBehavior=convertToNull","root","");
    }catch(SQLException e){System.err.println(e);}
    }
    Connection obtainconnection(){return con;}

    Object ObtainConnexion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
