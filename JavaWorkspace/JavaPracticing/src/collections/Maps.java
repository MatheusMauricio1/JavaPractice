package collections;

import java.util.HashMap;
import java.util.Map;

public class Maps {
	public static void main(String[] args) {
		Map<Integer, String> users = new HashMap<>();
		users.put(1, "Bubu");
	
		for(Entry<Integer, String> register: user.entrySet()) {
			System.out.println(register.getKey() + "===> ");
			System.out.println(register.getValue());
		}
	
	
	}
}
