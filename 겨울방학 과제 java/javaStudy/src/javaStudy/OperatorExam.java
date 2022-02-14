package javaStudy;

public class OperatorExam {
		public int[] calculate() {
	        int a = 7; 
	        int b = 3;

	        int c = a+b;

	        int d = a-b;

	        int e = a*b;

	        int f = a%b;


	        System.out.printf("c는: %d\n", c);
	        System.out.printf("d는: %d\n", d);
	        System.out.printf("e는: %d\n", e);
	        System.out.printf("f는: %d\n", f);

	        int ret[] = {c, d, e, f};
	        return ret;
	    }

	    public static void main(String []args){
	        new OperatorExam().calculate();
	}

}
