package day_1;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class monsterData {
    public static Map<String, monster> getMonsters() {
        Map<String, monster> monsters = new HashMap<>();

        // JSON 파일에서 몬스터 데이터 읽어오기
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader("monsters.json")); // JSON 파일 경로 설정
            JSONObject jsonObject = (JSONObject) obj;
            
            // JSON 데이터를 읽어서 Monster 객체 생성 후 HashMap에 추가
            for (Object key : jsonObject.keySet()) {
                String monsterName = (String) key;
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
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return monsters;
    }
}