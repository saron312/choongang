package pg743;

import java.util.HashMap;
import java.util.Map;

public class TestEx1 {
	public static void main(String[] args) {
		//Map 拿泛记 积己
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//按眉 历厘
		map.put("全辨悼", 85);
		map.put("全辨枚", 90);
		map.put("全辨鉴", 95);
		map.put("全辨枚", 92);
		int val = map.get("全辨枚");
		System.out.println(val);
	}
}
