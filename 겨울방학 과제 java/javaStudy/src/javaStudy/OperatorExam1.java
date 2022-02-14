package javaStudy;

public class OperatorExam1 {
		public boolean[] calculate(int a, int b) {
	        boolean c = a>b;

	        boolean d = a==b;

	        boolean e = a!=b;


	        boolean ret[] = {c, d, e};
	        return ret;
	    }

	    public static void main(String[]args){
	        int a = (int)(Math.random() * 10);
	        int b = (int)(Math.random() * 10);
	        new OperatorExam1().calculate(a, b);

	}

}
