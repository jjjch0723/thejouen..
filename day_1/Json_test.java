package day_1;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Json_test {
	public static JSONObject creatJsonData() {
		
		// 모든 데이터를 담을 JSONObject 생성		
		JSONObject jsonTest = new JSONObject();
		JSONArray jsonArrTest = new JSONArray();
		
		jsonTest.put("욕", "빡쳐");
		jsonTest.put("욕", "시발");
		
		System.out.println("욕" + jsonTest);
		
		return jsonTest;
		
	}
	
	

}
