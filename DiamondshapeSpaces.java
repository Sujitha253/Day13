package patternExamples;

public class DiamondshapeSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=7;i++) {
			for(int j=7;j>=i;j--) {
				System.out.print("*");
			}
			for(int s=1;s<=2*i-1;s++) {
				System.out.print(" ");
				
			}
			for(int j=7;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=6;i>=1;i--) {
			for(int j=7;j>=i;j--) {
				System.out.print("*");
			}
			for(int s=1;s<=2*i-1;s++) {
				System.out.print(" ");
				
			}
			for(int j=7;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
