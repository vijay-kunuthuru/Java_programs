package OOPs;

import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
//declaring exceptions with throws
public class ThrowsandThrow {
    public static void readline(String filename) throws IOException {
        FileReader reader = new FileReader(filename);
        //file operations
        reader.close();
    }
    public  static void processData() throws Exception {
        try{
            throw new SQLException("Database error");
        }catch (SQLException e){
            System.out.println("Logging error: "+e.getMessage());
            throw e;
        }
    }

    public static void main(String[] args) throws Exception {
        readline("Vijay");
        processData();

    }
}


