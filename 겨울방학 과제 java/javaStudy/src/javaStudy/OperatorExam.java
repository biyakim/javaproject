package javaStudy;

public class OperatorExam {
		public int[] calculate() {
	        int a = 7; 
	        int b = 3;

	        int c = a+b;

	        int d = a-b;

	        int e = a*b;

	        int f = a%b;


	        System.out.printf("c��: %d\n", c);
	        System.out.printf("d��: %d\n", d);
	        System.out.printf("e��: %d\n", e);
	        System.out.printf("f��: %d\n", f);

	        int ret[] = {c, d, e, f};
	        return ret;
	    }

	    public static void main(String []args){
	        new OperatorExam().calculate();
	}

}
