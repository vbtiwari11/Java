
public class Matrix_addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstmatrix[][]= {{1,2,3},{11,22,33}};
		int secondmatrix[][]= {{4,5,6},{44,55,66}};
		int sum[][]= new int [2][3];
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				sum[i][j]=firstmatrix[i][j]+secondmatrix[i][j];
				System.out.print(sum[i][j]+" "); 
			}
			System.out.println();
			
			}
		
		
	}

}
