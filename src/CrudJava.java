import Connection.dbFunction;

import java.sql.Connection;

public class CrudJava {
    public static void main(String[] args) {
        dbFunction db = new dbFunction();
        Connection conn = db.connectDb("kawah-edu", "postgres", "moemoe12.");
//        db.createTable(conn,"tbl_fruit");
//        db.insert_row(conn, "tbl_fruit", "Anggur", "Ungu", 5000);
//        db.read_data(conn,"tbl_fruit");
//        db.update_row(conn, "tbl_fruit", "Mengkudu","Anggur");
//        db.searching_by_name(conn,"tbl_fruit","Mengkudu");
//        db.deleting_by_name(conn, "tbl_fruit","orange");
//        db.delete_table(conn, "tbl_fruit");
    }
}
