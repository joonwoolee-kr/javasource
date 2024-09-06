package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectEx3 {
    public static void main(String[] args) {
        // SelectEx => try~with~resources 형태로 변경
        // finally 자원 닫기 자동으로 처리

        // 2. 연결 문자열 작성
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "scott";
        String password = "TIGER";

        String sql = "SELECT * FROM EMP WHERE EMPNO = 7369";

        try (Connection con = DriverManager.getConnection(url, user, password);
                PreparedStatement pstmt = con.prepareStatement(sql);
                ResultSet rs = pstmt.executeQuery()) {

            Class.forName("oracle.jdbc.OracleDriver");

            // 6. 결과값이 담긴 rs에서 하나씩 조회
            if (rs.next()) {
                // number => getInt() / varchar2 => getString() / date => getDate()
                // () 안에는 컬럼 번호 or 컬럼명 가능
                System.out.println("EMPNO: " + rs.getInt(1));
                System.out.println("ENAME: " + rs.getString(2));
                System.out.println("JOB: " + rs.getString(3));
                System.out.println("MGR: " + rs.getInt(4));
                System.out.println("HIREDATE: " + rs.getDate(5));
                System.out.println("SAL: " + rs.getInt(6));
                System.out.println("COMM: " + rs.getInt(7));
                System.out.println("DEPTNO: " + rs.getInt(8));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
