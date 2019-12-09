package day5.classroom.oops;

import java.util.HashMap;
import java.util.Map;

public class LearnMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name= "TestLeaf";
		char[] charArray = name.toUpperCase().toCharArray();
		Map <Character,Integer> map = new HashMap<>();
		for (char c : charArray) {
			if(map.containsKey(c)) {
				Integer intvalue = map.get(c)+1;
				map.put(c, intvalue);
			}else {
				map.put(c, 1);
			}

		}
		System.out.println(map);
	}

}
