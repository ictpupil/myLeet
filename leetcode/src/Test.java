import java.util.ArrayList;
import java.util.List;

public class Test {

	public static List<List<Integer>>  sol(List<List<Integer>> ans,List<Integer > list) {
		ans.add(list);
		return ans;
	}
	
	public static void main(String[] args) {
		List<List<Integer>> ans = new ArrayList<>();
		List<Integer> tmp = new ArrayList<>();
		tmp.add(1);
		//ans.add(tmp);
		List<List<Integer>> tt = sol(ans,tmp);
		for(List list:tt) {
			System.out.println(list.get(0));
		}
	}

}
