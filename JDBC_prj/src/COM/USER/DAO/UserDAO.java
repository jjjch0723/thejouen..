package COM.USER.DAO;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import COM.USER.VO.UserVO;

public class UserDAO {

	public UserVO[] getUserInfo(int i) {
		UserVO[] ua = new UserVO[i];
		
		try {
			String url = "jdbc:mysql://localhost:3306/testDB?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
			String id = "root";
			String pw = "1234";
			String driver = "com.mysql.jdbc.Driver";
			Connection con = DriverManager.getConnection(url, id, pw);
		
			Statement st = con.createStatement();
			ResultSet rs = null;
			
			String sql = "SELECT userno, userid, usernm, userpw, userrole "
					+ "	from com_user limit " + i;
			
			rs = st.executeQuery(sql);
			
			int cnt = 0;
			while(rs.next()) {
				int USERNO = rs.getInt("userno");
				String USERID = rs.getString("userid");
				String USERNM = rs.getString("usernm");
				String USERPW = rs.getString("userpw");
				String USERROLE = rs.getString("userrole");
				
				UserVO uv = new UserVO(USERNO, USERID, USERNM, USERPW, USERROLE);
				ua[cnt] = uv;
				cnt++;
				
				if(cnt == 5) {
					break;
				}
			}
			rs = st.executeQuery(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return ua;
	}

	
}
// 수펄샤이수펄샤이~ 돈