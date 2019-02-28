import java.util.LinkedHashSet;


public class RemoveDuplicate {

public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={78,32,13,19,32,78,56,10};
		LinkedHashSet<Integer>hs=new LinkedHashSet<Integer>();
		
		for(int num:arr)
		{
			hs.add(num);
		}
		
 System.out.println(hs);
	}

}