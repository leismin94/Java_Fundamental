package java_20190719;

public class TwoArrayDemo {
	public static void main(String[] args) {
		int[][] a = new int[3][2];
		a[0][0] = 10;
		a[0][1] = 20;

		a[1][0] = 30;
		a[1][1] = 40;

		a[2][0] = 50;
		a[2][1] = 60;

		int[][] b = { { 10, 20 }, { 30, 40 }, { 50, 60 } };
		// int[][] mm = {{1},{1,2},{1}}  이런식으로 가능
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		int[] c = {10,20,30};
		
		//enhanced for loop
			// 배열변수를 c에 넣어놓으면 알아서 집어넣음
		
		for(int temp : c) {
			System.out.println(temp);
		}
		
		
	}
}
