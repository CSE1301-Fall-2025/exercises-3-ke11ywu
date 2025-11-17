package module09._01lists;
import java.util.List;
import java.util.ArrayList;

public class UsingLists {

	public static void main(String[] args) {

		// your code here!!
		List<String> eating = new ArrayList<String>();
		eating.add("Pizza");
		eating.add("Burrito");
		eating.add("Banana");
		eating.add("Pie");
		eating.add("food5");
		System.out.println(eating.size());
		for (int i = 0; i < eating.size(); i++){
			System.out.println(eating.get(i));
		}
		eating.remove(2);
		System.out.println(eating.get(2));
		System.out.println(eating.size());

	}
}
