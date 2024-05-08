package sum;
/*
 *   ★
 *   ★★
 *   ★★★
 *   ★★★★
 */
public class for_for_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		for(int i = 1; i<=4; i++)
		{
			for (int j = 1; j<=i ; j++) 
			{
				//한 줄에 ★을 출력
				System.out.print("★");
				}
				System.out.println();
			}
			*/
		/*
		for(int i = 1; i<=4; i++)
		{
			for (int j = 1; j<=5-i ; j++) 
			{
				//한 줄에 ★을 출력
				System.out.print("★");
				}
				System.out.println();
			}
			*/
		/*
		for(int i = 1; i<=4; i++){
			{
				for (int j = 1; j<=4-i;j++)
				{
					System.out.print(" ");
			 	} for (int k = 1; k<=i;k++)
			 	{
			 		System.out.print("*");
			 	}
			 	System.out.println();
			}
		}
		*/
		for(int i = 1; i<=4; i++){
			{	for (int j = 1; j<=i-1;j++)
			{
				System.out.print(" ");
		 	}
				 for (int k = 1; k<=5-i;k++)
			 	{
			 		System.out.print("*");
			 	}
			 	System.out.println();
	}

	}
	}
}


