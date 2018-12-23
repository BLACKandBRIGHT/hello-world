import java.sql.*;
public class Search {
            public static void main(String[] args) throws Exception {
                Class.forName("com.mysql.jdbc.Car");
                String jdbc="jdbc:mysql://127.0.0.1:3306/mydb";
                Connection conn=DriverManager.getConnection(jdbc, "root", "");

                Statement state=conn.createStatement();
                String sql="select * from xs";
                ResultSet rs=state.executeQuery(sql);

                while(rs.next()){
                    System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
                }
                conn.close();
            }
    }

