
public class Demo {
	
	public static void main(String[] args) {
		
		String s="java is boss";
		s=s+" ";
		String rev="",word="";
		
		for(int i=0; i<s.length(); i++)
		{
			char ch=s.charAt(i);
			
			if(ch!=' ')
			{
				word=word+ch;
			}
			else {
				rev=word+" "+rev;
				word="";
			}
		}
		System.out.println(rev);
	}

}
