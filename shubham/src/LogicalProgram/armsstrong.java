package LogicalProgram;

public class armsstrong {
	public static void main(String[] args) 
	{
	//Armstrong number is a number that is equal to the sum of cubes of its digits.
	int OrgNum=153; //1+125+27=153
	int sum =0;
	for (int i = OrgNum; i >0; i=i/10) 
	{										//  i= 153/10=15.3 rem =3 hence sum =27
	int rem=i%10;							//	i=15/10 =1.5 rem =5 hence sum =27+125 =152
											// i=1/10=0.1 rem=1 hence sum=27+152+1 =153
	sum=sum+(rem*rem*rem);
	//System.out.println(sum);
	}
	if (OrgNum==sum)
	{
	System.out.println("given number : "+OrgNum+" = is an armstrongnumber");
	
	}
	else
	{
	System.out.println("given number : " + OrgNum + " = is not an armstrong number"); 
	
	}
	}

}
