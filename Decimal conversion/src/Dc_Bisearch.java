

public class Dc_Bisearch {
	
	public static void main(String[] args)
	{
		Dc_16(19);
		System.out.print("\n");
		Dc_2(8);
		System.out.print("\n");
		Dc_8(100);
		System.out.print("\n");
		int[] m={11,22,3,45,15};
		Sort(m);
		for(int x=0;x<m.length;x++)
		{
			System.out.print(m[x]+",");
		}
	}
	
	public static void Sort(int[] m) {
		for(int i=0;i<m.length-1;i++){
			for(int j=i+1;j<m.length;j++)
			{
				if(m[i]>m[j])
				{
					int temp=m[i];
					m[i]=m[j];
					m[j]=temp;
					
				}
			}
			
		}
	}
	
//	public static void swap(int[] arr,int a,int b){
//		int temp=arr[a];
//		arr[a]=arr[b];
//		arr[b]=temp;
//	}
	
	public static void Dc_16(int num) {
		tran(num, 15, 4);
	}
	
	public static void Dc_8(int num){
		tran(num, 7, 3);
	}

	public static void Dc_2(int num){
		tran(num, 1, 1);
	}
	
	public static void tran(int num,int sm,int lr) {
		if(num == 0)
		{
			System.out.println("0");
			return;
		}
		
		char[] ch={'0','1','2','3',
					'4','5','6','7',
					'8','9','A','B',
					'C','D','E','F'};
		char[] arr=new char[32];
		int pos=arr.length;
		
		while(num!=0)
		{
			int temp=num&sm;
			arr[--pos]=ch[temp];
			num=num>>>lr;
		}
		while(pos!=arr.length)
		{
			System.out.print(arr[pos++]);
		}
	}
}

