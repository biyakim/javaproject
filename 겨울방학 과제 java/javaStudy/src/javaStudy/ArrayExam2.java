package javaStudy;

public class ArrayExam2 {

	 public int[] fill100() {
	        int[] array = new int[100];
	        // array�� ������� 1���� 100���� ������ �־����.
	        for(int i=0;i<=99;i++) {
	        	array[i]=i+1;
	        }
	        // �Ʒ��� ��� �򰡸� ���� �ڵ��Դϴ�. �������� ������.
	        return array;
	    }
	    
	    // �Ʒ��� ������ ���� �ڵ��Դϴ�. �������� ������.
	    public static void main(String[] args) {
	        ArrayExam2 exam = new ArrayExam2();
	        int[] arr2 = exam.fill100();
	        boolean flag = true;
	        for (int i = 0; i < 100; i++) {
	            if (arr2[i] != i + 1) {
	                System.out.println("array[" + i + "]�� ���� Ʋ���ϴ�.");
	                flag = false;
	                break;
	            }
	        }
	        if(flag){
	            System.out.println("�����Դϴ�.");
	        }
		

	}

}
