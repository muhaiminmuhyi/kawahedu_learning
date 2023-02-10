import Connection.dbFunction;

import java.sql.Connection;

public class CrudJava {
    public static void main(String[] args) {
        dbFunction db = new dbFunction();
        Connection conn = db.connectDb("kawah-edu", "postgres", "moemoe12.");
//        db.createTable(conn,"tbl_fruit");
        db.insert_row(conn, "kawahedu_learning.tbl_fruit", "Anggur", "Ungu", 5000);
    }
}
