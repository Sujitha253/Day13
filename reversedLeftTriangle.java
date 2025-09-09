package patternExamples;

public class reversedLeftTriangle {

	public static void main(String[] args) {
		// TODO Auto-geneated method stub
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				//System.out.print("* ");
				System.out.print((6-j)+" ");
			}
			System.out.println();
		}

	}

}
