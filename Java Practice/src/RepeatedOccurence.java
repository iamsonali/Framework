import java.util.HashMap;
import java.util.Set;


public class RepeatedOccurence {

	public static void main(String[] args) {
		
		String s="occurence";
		HashMap<Character,Integer>hm=new HashMap<Character,Integer>();
		char arr[]= s.toCharArray();
		for(char ch:arr)
		{
			if(hm.containsKey(ch))
			{
				hm.put(ch,hm.get(ch)+1);
			}
			
			else
			{
				hm.put(ch,1);
			}
		
//			Set<Character> hs=hm.keySet();
//			for(char c:hs)
//			{ 
//				
//				
//				System.out.println(c+" "+hm.get(c));
//				
//			}
			
			if (hm.get(ch)==1)
				
			{
				System.out.println(ch);
		}

		}
	}
}
