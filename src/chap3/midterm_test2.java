package chap3;

public class midterm_test2 {
	public static void main(String[] args) {
		int letterNum = 26;
		char alpha;
		for(int i = 0;i<letterNum;i++)
		{
			alpha = (char)('A'+i);
			System.out.print(alpha + " ");
		}
		System.out.println();
		char[] arr = new char[letterNum];
		for(int i = 0;i<letterNum;i++)
		{
			arr[i] = (char) (65+i);
			System.out.print(arr[i] + " ");
		}
	}
}
