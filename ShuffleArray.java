import java.util.ArrayList;
import java.util.Collections;

public class ShuffleArray{
	public static void main(String args[])
	{
		ArrayList<Integer> l = new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		l.add(7);

		Collections.shuffle(l);

		for(Integer i: l)
		{
			System.out.print(i+ " ");
		}
	}
}