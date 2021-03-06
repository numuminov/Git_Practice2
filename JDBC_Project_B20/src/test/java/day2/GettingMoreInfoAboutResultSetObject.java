package day2;

import java.sql.*;

public class GettingMoreInfoAboutResultSetObject {

    public static void main(String[] args) throws SQLException {
        String connectionStr = "jdbc:oracle:thin:@54.160.160.130:1521:XE";
        String username = "hr" ;
        String password = "hr" ;

        Connection conn = DriverManager.getConnection(connectionStr,username,password) ;
        // this way of creating statement will give you ability to generate
        // ResultSet that can move forward and backward anytime
        Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);

        ResultSet rs   =   stmt.executeQuery("SELECT * FROM jobs") ;

        // Metadata -- data about the data --
        // ResultSetMetaData -- data about the ResultSet object that contain our resulting rows and columns
        //   for example column names , column counts .. and more
        // This is how we get the ResultSetMetaData object

        // ResultSetMetaData itself does not contains any row data
        // it only has information about the columns
        ResultSetMetaData rsmd = rs.getMetaData();
        // we only need two methods from this to get column count and column name | label

        int colCount = rsmd.getColumnCount();
        System.out.println("colCount = " + colCount);
        // this is how we get column label | name using index
        // get first column name
        System.out.println("First Column Name is " + rsmd.getColumnLabel(1)  );
        System.out.println("Second Column Name is " + rsmd.getColumnLabel(2)  );

        // now print out all column names :

        for (int colNum = 1; colNum <= colCount ; colNum++) {
            System.out.println("Column name " + rsmd.getColumnLabel(colNum)   );


        }

        int ColumnCount=rsmd.getColumnCount();

        for(int colNum=1; colNum<=ColumnCount;colNum++){
            System.out.print(rsmd.getColumnLabel(colNum)+"\t");

        }

        System.out.println();

        while(rs.next()){

            for (int i = 1; i <=ColumnCount ; i++) {



            System.out.print(rs.getString(i)+"\t");

        }

            System.out.println();}




        rs.close();
        stmt.close();
        conn.close();

    }

}
