package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class dbFunction {
    public Connection connectDb(String dbName, String user, String pass){
        Connection conn = null;
        try{
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/"+dbName,user,pass);
            if (conn != null)
                System.out.println("Connection Established");
            else
                System.out.println("Connection Failed!");
        }catch (Exception e){
            System.out.println(e);
        }
        return conn;
    }

    public void createTable(Connection conn, String table_name){
        Statement statement;
        try{
            String query = "CREATE TABLE "+" kawahedu_learning."+table_name+"(fruitid SERIAL,name_fruit varchar,color_fruit varchar,price_fruit int,primary key(fruitid));";
            statement = conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Table Created");
        }catch (Exception e) {
            System.out.println(e);
        }
    }

    public void insert_row(Connection conn, String table_name, String name_fruit, String color_fruit, int price_fruit){
        Statement statement;
        try{
            String query = String.format("insert into kawahedu_learning.%s(name_fruit, color_fruit, price_fruit) values('%s','%s',%s);", table_name, name_fruit,color_fruit,price_fruit);
            statement = conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Data Successfully added!");
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public void read_data(Connection conn, String table_name)
    {
        Statement statement;
        ResultSet rs = null;
        try {
            String query = String.format("select * from kawahedu_learning.%s", table_name);
            statement = conn.createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()){
                System.out.print(rs.getString("fruitid")+" ");
                System.out.print(rs.getString("name_fruit")+" ");
                System.out.print(rs.getString("color_fruit")+" ");
                System.out.println(rs.getString("price_fruit")+" ");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void update_row(Connection conn, String table_name, String new_name, String old_name){
        Statement statement;
        try{
            String query = String.format("update kawahedu_learning.%s set name_fruit='%s' where name_fruit='%s';", table_name, new_name, old_name);
            statement = conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Data Successfully updated!");
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public void searching_by_name(Connection conn, String table_name, String name_fruit)
    {
        Statement statement;
        ResultSet rs = null;
        try
        {
            String query = String.format("select * from kawahedu_learning.%s where name_fruit='%s';",table_name,name_fruit);
            statement = conn.createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()){
                System.out.println(rs.getString("fruitid")+" ");
                System.out.println(rs.getString("name_fruit")+" ");
                System.out.println(rs.getString("color_fruit")+" ");
                System.out.println(rs.getString("price_fruit")+" ");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void deleting_by_name(Connection conn, String table_name, String name_fruit)
    {
        Statement statement;
        try
        {
            String query = String.format("delete from kawahedu_learning.%s where name_fruit ='%s'", table_name, name_fruit);
            statement = conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Data has been deleted");
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public void delete_table(Connection conn, String table_name)
    {
        Statement statement;
        try {
            String query = String.format("delete from kawahedu_learning.%s", table_name);
            statement = conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("All data was deleted!!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
