import java.util.ArrayList;
import java.util.List;

public class ListPractice {
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("Mazed");
		list.add("Ayub");
		list.add("Mazed");
		list.add("Anwar");
		list.add("Mazed");
		list.add("Ayub");
		System.out.println(list);
		
		for(int i=0;i<list.size();++i) {
			for(int k=0;k<list.size();++k) {
				if(k!=i && list.get(i).equals(list.get(k))) {
					list.remove(k);
				}
			}
		}
		System.out.println(list);
		
	}
}
