package javaStudy;

public class StringExam {

	public static void main(String[] args) {
		 String str1 = new String("Hello world");
		 String str2 = new String("Hello world");
      
//	        if(str1 == str2){
//	            System.out.println("str1�� str2�� ���� �ν��Ͻ��� �����մϴ�.");
//	        }
//	        else{
//	            System.out.println("str1�� str2�� �ٸ� �ν��Ͻ��� �����մϴ�.");
//	        }
		 if( str1.equals(str2) ){
	            System.out.println("str1�� str2�� ���� ���� ������ �ֽ��ϴ�.");
	        }
	        else{
	            System.out.println("str1�� str2�� �ٸ� ���� ������ �ֽ��ϴ�.");
	        }
	}

}
