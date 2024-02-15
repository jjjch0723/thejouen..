package day_1;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.simple.*;
import org.json.simple.parser.JSONParser;


public class Test_1 {

	public static void main(String[] args) {
		HashMap<String, monster> Map_monsters = new HashMap<>();
		//HshMap 사용해서 key값에 맞춰 value값 들고오기 
		
		System.out.println(Map_monsters);
		//System.out.println(Map_monsters);
		
		
	}
	
	// 
	public static Map<String, monster> getMonsters() {
        Map<String, monster> monsters = new HashMap<>();

        // JSON 파일에서 몬스터 데이터 읽어오기
        JSONParser parser = new JSONParser();
        try {
        	File path = new File("C:\\Users\\502\\Desktop\\thejouen..-main\\day_1\\monster.json");
            Object obj = parser.parse(new FileReader(path)); // JSON 파일 경로 설정
            JSONObject jsonObject = (JSONObject) obj;
            
            // JSON 데이터를 읽어서 Monster 객체 생성 후 HashMap에 추가
            for (Object key : jsonObject.keySet()) {
                String monsterName = (String) key; //몬스터 이름이 key값이 됨
                JSONObject monsterData = (JSONObject) jsonObject.get(monsterName);
                monster monster = new monster(
                    monsterName,
                    Integer.parseInt(monsterData.get("hp").toString()),
                    (String) monsterData.get("weaponName"),
                    Integer.parseInt(monsterData.get("weaponDice").toString()),
                    Integer.parseInt(monsterData.get("strength").toString()),
                    Integer.parseInt(monsterData.get("dexterity").toString()),
                    Integer.parseInt(monsterData.get("level").toString())
                );
                monsters.put(monsterName, monster);
  
               // System.out.printf("JSON: %s", jsonObject);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return monsters;
    }

}
