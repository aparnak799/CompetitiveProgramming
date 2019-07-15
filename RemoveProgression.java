import java.util.Scanner;
public class RemoveProgression
{

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n, e, t;
		t = sc.nextInt();
		while(t>0)
		{
			n = sc.nextInt();
			int no = n+1;
			e = sc.nextInt();
			int arr[] = new int[no];
			for(int i=0; i<n; i++)
			{
				arr[i] = (i+1);
			}
			for(int i=1; i<=n; i++)
			{
				for(int j=0; j<=n-2; j++)
				{
						arr[j] = arr[j+1];
				}
				if(i==e)
					System.out.println(arr[i-1]);
				else continue;
			}
			t--;
		}

	}
}