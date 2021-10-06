
import java.util.*;
import java.io.*;
public class BogoSort
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list = new ArrayList<>();
		int N = Integer.parseInt(in.readLine());
		for(int i = 0; i < N; i++)
			list.add(Integer.parseInt(in.readLine()));
		Bogo(list);
		Disp(list);
	}
	static void Bogo(ArrayList<Integer> list)
	{
		while(!(isSorted(list)))
		{
			Collections.shuffle(list);
		}
	}
	static boolean isSorted(ArrayList<Integer> list)
	{
		for(int i = 0; i < list.size() - 1; i++)
		{
			if(list.get(i) <= list.get(i+1))
				continue;
			else
				return false;
		}
		return true;
	}
	static void Disp(ArrayList<Integer> list)
	{
		for(Integer i : list)
			System.out.println(i);
	}
}