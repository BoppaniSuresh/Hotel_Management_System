import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class insert_delete_update {
    public static void set(String sql) throws SQLException{
        Connection con = null;
        con = connectiontoDB.getcon();
        try(PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.executeUpdate(sql);
        }
        catch(Exception e){
             e.printStackTrace();
        }
        con.close();
    }
}
