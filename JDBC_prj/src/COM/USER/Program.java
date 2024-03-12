package COM.USER;

import COM.USER.DAO.UserDAO;
import COM.USER.VO.UserVO;

public class Program {
	public static void main(String[] args) {
		UserVO ua[] = new UserVO[5];
		UserDAO ud = new UserDAO();
		
		ua = ud.getUserInfo(5);
		
		for(UserVO uv : ua) {
			int userNo = uv.getUSERNO();
			String userId = uv.getUSERNM();
			String userPw = uv.getUSERPW();
			String userNm = uv.getUSERNM();
			String userRole = uv.getUSERROLE();
			
			System.out.printf("| %d | %s | %s | %s | %s | ", userNo, userId, userPw, userNm, userRole);
			
		}
	}
}
