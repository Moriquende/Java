import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

public class myStructure {
	Random r = new Random();
	
	ArrayList<Integer> list;
	HashMap<Integer, Integer> map;
	
	public myStructure() {
		list = new ArrayList<>();
		map = new HashMap<>();
	}
	
	public void add(int val) {
		if(!map.containsKey(val)) {
			list.add(val);
			map.put(val, list.size()-1);
		}
	}
	
	public void remove(int val) {
		if(map.containsKey(val)) {
			int index = map.get(val);
			int lastElem = list.get(list.size()-1);
			Collections.swap(list, index, lastElem);
			list.remove(list.size()-1);
			map.put(lastElem, index);
		}
	}
}
