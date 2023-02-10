package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
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
            String query = String.format("insert into %s(name_fruit, color_fruit, price_fruit) values('%s','%s',%s);", table_name, name_fruit,color_fruit,price_fruit);
            statement = conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Data Successfully added!");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
