package day1;

import java.sql.*;

public class Practice {
    public static void main(String[] args) throws SQLException {

        String connectionStr = "jdbc:oracle:thin:@54.160.160.130:1521:XE";
        String username ="hr";
        String password ="hr";
        Connection connection= DriverManager.getConnection(connectionStr,username,password);
        Statement statement =connection.createStatement();
        ResultSet rs=statement.executeQuery("Select * from Regions");

        //rs.next();
        while (rs.next()){

        System.out.println(rs.getString(2));}

        rs= statement.executeQuery("Select * from Countries");

        //rs.absolute(5);
        System.out.println("rs.getRow() = " + rs.getRow());
        rs.next();
        System.out.println("rs.getRow() = " + rs.getRow());
        System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));

        rs.next();

        System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
while (rs.next()){
        System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));}


        while (rs.previous()){
            System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));}





    }
}
