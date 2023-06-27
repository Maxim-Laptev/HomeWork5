import java.util.Comparator;
public class SortingAtAHighPrice implements Comparator<Phone>{

	@Override
	public int compare(Phone o1, Phone o2) {
		return -o1.getPrice()+o2.getPrice();
	}
	
}
