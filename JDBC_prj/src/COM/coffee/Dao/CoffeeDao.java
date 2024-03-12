package COM.coffee.Dao;

import COM.coffee.Vo.CoffeeOrderVo;
import COM.coffee.Vo.CoffeeSalesVo;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CoffeeDao {
    public List<CoffeeSalesVo> DaillySales() {

        List<CoffeeSalesVo> list = new ArrayList<>();
        try {
            String url = "jdbc:mysql://localhost:3306/testdb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            String id = "root";
            String pass = "1234";
            String driver = "com.mysql.jdbc.Driver";
            Connection con  = DriverManager.getConnection(url, id, pass);

            Statement st = con.createStatement();

            ResultSet rs = null;

            String sql = "SELECT DATE_FORMAT(tsn.SALE_DATE, '%Y-%m-%d')as SALE_DATE , tcm.COFFE_ID, " +
                    " tcm.COFFE_NM, tcn.PRICE, SUM(tsn.SALE_CNT) AS SALE_CNT " +
                    "  FROM TB_COFFE_001MT tcm, " +
                    "         TB_COFFE_002NT tcn, " +
                    "         TB_SALES_001NT tsn " +
                    " WHERE tcm.USEYN ='Y' " +
                    "   AND tcn.PRICE_DATE ='202403' " +
                    "   AND tcm.COFFE_ID = tcn.COFFE_ID " +
                    "   AND tcm.COFFE_ID = tsn.COFFE_ID " +
                    "   AND DATE_FORMAT(tsn.SALE_DATE, '%Y-%m-%d') = DATE_FORMAT(now(), '%Y-%m-%d') " +
                    "  GROUP BY DATE_FORMAT(tsn.SALE_DATE, '%Y-%m-%d'), tcm.COFFE_ID ,tcm.COFFE_NM, tcn.PRICE ";

            rs = st.executeQuery(sql);

            while(rs.next()) {
                Date saleDate = rs.getDate("SALE_DATE");
                int coffeId = rs.getInt("COFFE_ID");
                String coffeNm = rs.getString("COFFE_NM");
                int price = rs.getInt("PRICE");
                int saleCnt = rs.getInt("SALE_CNT");

                CoffeeSalesVo csv = new CoffeeSalesVo(coffeId, coffeNm, price, saleCnt, saleDate, "202403");
                list.add(csv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<CoffeeSalesVo> getCoffeeList(){
        List<CoffeeSalesVo> list = new ArrayList<>();
        try {
            String url = "jdbc:mysql://localhost:3306/testdb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            String id = "root";
            String pass = "1234";
            String driver = "com.mysql.jdbc.Driver";
            Connection con  = DriverManager.getConnection(url, id, pass);

            Statement st = con.createStatement();

            ResultSet rs = null;

            String sql = "select tcm.COFFE_ID, tcm.COFFE_NM, tcn.PRICE " +
                    " from tb_coffe_001mt tcm, " +
                    "  tb_coffe_002nt tcn " +
                    " where tcm.USEYN = 'Y' " +
                    "  AND tcn.PRICE_DATE ='202403' " +
                    " and tcm.COFFE_ID = tcn.COFFE_ID ";

            rs = st.executeQuery(sql);

            while(rs.next()) {
                int coffeId = rs.getInt("COFFE_ID");
                String coffeNm = rs.getString("COFFE_NM");
                int price = rs.getInt("PRICE");

                //System.out.println("|" + coffeId + "|" + coffeNm + "|" + price  + "|");
                CoffeeSalesVo csv = new CoffeeSalesVo();

                csv.setCoffeId(coffeId);
                csv.setCoffeNm(coffeNm);
                csv.setPrice(price);
                list.add(csv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public void setOrderMenu(List<CoffeeOrderVo> orderList) {

        try {
            String url = "jdbc:mysql://localhost:3306/testdb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            String id = "root";
            String pass = "1234";
            String driver = "com.mysql.jdbc.Driver";
            Connection con = DriverManager.getConnection(url, id, pass);
            PreparedStatement psmt = null;

            String sql = "INSERT INTO TB_SALES_001NT " +
                    "  (COFFE_ID, SALE_CNT) " +
                    "  VALUES(?, ?) ";

            for (CoffeeOrderVo cov : orderList) {
                int coffeId = cov.getCoffeeId();
                int cnt = cov.getOrderCnt();

                psmt = con.prepareStatement(sql);

                psmt.setInt(1, coffeId);
                psmt.setInt(2, cnt);

                psmt.executeUpdate();
            }
            psmt.executeUpdate(sql);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
