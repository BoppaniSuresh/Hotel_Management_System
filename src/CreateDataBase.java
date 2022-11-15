import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

abstract class CreateDB{
       abstract void createdb(String DBname);
}
class MyDB extends CreateDB{
    @Override
    void createdb(String DBname)  {
       try{
       Connection con = connectiontoDB.getcon();
       String query = "CREATE DATABASE " + DBname;
       try(PreparedStatement stmt = con.prepareStatement(query)){
         stmt.executeQuery();
       }
    }catch(SQLException e){
      e.printStackTrace();
    }
}
}