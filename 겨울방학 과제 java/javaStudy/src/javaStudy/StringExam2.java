package javaStudy;

public class StringExam2 {

	public static void main(String[] args) {
		 	String str1 = "�ȳ��ϼ���. ";
	        String str2 = "���� ������� ���̳׿�. ������ ȭ����!!";
	        
	        String concatResult;
	        String substringResult;
	        
	        // �Ʒ��ʿ� �ڵ带 �ۼ��ϼ���.
	        concatResult=str1.concat(str2);
	        substringResult=str1.substring(2);
	           
	        // �� �Ʒ��� ���� Ȯ���� ���� �ڵ��Դϴ�. �������� ������.
	        System.out.println(concatResult);
	        System.out.println(substringResult);

	}

}
