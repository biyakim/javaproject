package javaStudy;

public class ArrayExam3 {

		 public int sum(int[] array) {
		        int sum = 0;
		        // array�� ���̸� �� �� ���� int�� �迭�Դϴ�.
		        // ���� sum�� array�� ��� ���� ���غ�����.
		        for(int i=0; i<array.length;i++){
		            sum=sum+array[i];
		            }
		        // �Ʒ��� ��� �򰡸� ���� �ڵ��Դϴ�. �������� ������.
		        return sum;
		    }
		    
		    // �Ʒ��� ������ ���� �ڵ��Դϴ�. �������� ������.
		    public static void main(String[] args) {
		        int[] testcase1 = {1, 2, 3, 4};
		        int[] testcase2 = {5, 6, 7};
		        ArrayExam3 exam = new ArrayExam3();

		        int answer1 = exam.sum(testcase1);        
		        int answer2 = exam.sum(testcase2);        
		        if (answer1 == 10 && answer2 == 18)
		            System.out.println("�����Դϴ�. [����]�� ��������.");
		        else {
		            System.out.println("Ʋ�Ƚ��ϴ�.");
		            System.out.printf("1, 2, 3, 4�� ���ߴµ� %d�� ���Գ׿�.\n", answer1);
		            System.out.printf("5, 6, 7�� ���ߴµ� %d�� ���Գ׿�.\n", answer2);
		        }

	}

}
