package day1;

import java.sql.*;

public class pr {
    public static void main(String[] args) throws SQLException {


        String url=            "jdbc:oracle:thin:@54.160.160.130:1521:XE";
        String usr="hr";
        String pass="hr";

        Connection connection=DriverManager.getConnection(url,usr,pass);
        Statement statement=connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);

        ResultSet rs=statement.executeQuery("select * from Employees");

        while (rs.next()){
            System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(5));}



        System.out.println("rs.getRow() = " + rs.getRow());

        while (rs.previous()){
            System.out.println(rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));}


        rs.absolute(8);
        System.out.println("rs.getRow() = " + rs.getRow());



    }
}
