
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=11;
		int temp=0;
		for(int i=2;i<10;i++)
		{
			
		        if(n%i==0)
		        {
		        	System.out.println("hi");
		        	temp=temp+1;
		        }
		}
		if(temp ==0)
		{
			System.out.println(n+" prime");
		}
		else {
			System.out.println("not Prime");
		}

	}

}
