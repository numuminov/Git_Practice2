package utility;

import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class practiceUtil {

    static Connection con;
    static Statement statement;
    static ResultSet rs;

    public static void conn(){

        try {
             con = DriverManager.getConnection("jdbc:oracle:thin:@54.160.160.130:1521:XE","hr","hr");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public static ResultSet GetQuery(String query){

        try {
            statement=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs= statement.executeQuery(query);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }


        return rs;
    }

    public static void destroy() {

        try {
            con.close();
            statement.close();
            rs.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }


    public static int rowCount() {
        int rows = 0;

        try {
            rs.last();
            rows = rs.getRow();
            rs.beforeFirst();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }


        return rows;

    }

    /**
     * Get the column count
     *
     * @return count of column the result set have
     */

    public  static int getColumnCount()  {

        int columnCount=0;

        try {
            ResultSetMetaData rsmt= rs.getMetaData();

        columnCount= rsmt.getColumnCount();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }


        return columnCount;


    }

    /**
     * a method that return all column names as List<String>
     */

    public static List<String> allCulumnName() {

        List<String> allColumns = new ArrayList<>();

try{
        ResultSetMetaData rsmd= rs.getMetaData();

        for (int i = 1; i <=rsmd.getColumnCount() ; i++) {

            allColumns.add(rsmd.getColumnLabel(i));

        }}catch (SQLException e){

    e.getMessage();
}


        return allColumns;

    }

    public static void main(String[] args) {

        conn();
        GetQuery("Select * from Employees");
        System.out.println(allCulumnName());
        System.out.println("oneRowdata(4) = " + oneRowdata(4));
        System.out.println("cellValue(5,3) = " + cellValue(5, 3));
        System.out.println("oneColumnAllData(2) = " + oneColumnAllData(2));
        allData();

        System.out.println("rowDataAsMap(2) = " + rowDataAsMap(2));
        System.out.println(allDataAsMapList());

    }


    /**
     * Create a method that return all row data as a List<String>
     *
     * @param rowNum Row number you want to get the data
     * @return the row data as List object
     */


    public static List<String> oneRowdata(int rowNum){

        List<String> allDataoneRow = new ArrayList<>();

        try {
            rs.absolute(rowNum);

            for (int i = 1; i <= getColumnCount(); i++) {


            allDataoneRow.add(rs.getString(i));
        } }catch (SQLException throwables) {
            throwables.printStackTrace();
        }



        return allDataoneRow;


    }

    /**
     * Create a method to return the cell value at certain row certain column
     *
     * @param rowNum
     * @return Cell value as String
     * @parem colNum
     */


    public static String cellValue(int rowNum, int colNum) {

        String result = "";


        try {
            rs.absolute(rowNum);
           result= rs.getString(colNum);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


        return result;
    }

    /**
     * return value of all cells in that column
     *
     * @param colNum the column number you want to get the list out of
     * @return value of all cells in that column as a List<String>
     */

    public static List<String> oneColumnAllData(int colNum){
        List <String> columndata=new ArrayList<>();



        try {
            rs.last();
            int last=rs.getRow();

            for (int i = 1; i <=last ; i++) {


            rs.absolute(i);
            columndata.add(rs.getString(colNum));}

        } catch (SQLException e) {
            e.getMessage();
        }


        return  columndata;



    }

    /**
     * A method that display all the result set data on console
     */

    public  static void allData(){

        try{

        rs.beforeFirst();


        while (rs.next()){

            for (int i = 1; i <getColumnCount() ; i++) {
                System.out.printf("%-20s",rs.getString(i));

            }

            System.out.println();
        }}catch (SQLException e){e.getMessage();}





    }

    public static Map<String,String> rowDataAsMap(int rowN){
        Map<String,String> rowMap= new LinkedHashMap<>();


        try{

            ResultSetMetaData rsmt= rs.getMetaData();

            rs.absolute(rowN);

            for (int i = 1; i <rsmt.getColumnCount() ; i++) {


                rowMap.put(rsmt.getColumnName(i), rs.getString(i));

            }}catch (SQLException e){e.getMessage();}
        return rowMap;
    }

    public static  List<Map<String,String>>allDataAsMapList(){

        List<Map<String,String>> mapList=new ArrayList<>();

        for (int i = 1; i <=rowCount() ; i++) {

            mapList.add(rowDataAsMap(i));

        }




     return mapList;
    }





}
