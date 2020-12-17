package day4;

import utility.ConfigurationReader;
import utility.DB_Utility;

public class MySQL_Test {
    public static void main(String[] args) {
        String connection = ConfigurationReader.getProperty("library1.database.url");
        String username=ConfigurationReader.getProperty("library1.database.username");
        String password=ConfigurationReader.getProperty("library1.database.password");


        DB_Utility.createConnection(connection,username,password);
        DB_Utility.runQuery("Select * from books");
        DB_Utility.displayAllData();





    }
}
