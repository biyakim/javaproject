package javaStudy;

public class conditionTest {
    public int conditionTest(int value){
		 int ret = 0;
	        if( value % 3 == 0 ){
	            ret = 3;
	        }else if(value %4==0){// �� �Ʒ� �ٿ� else ������ �߰��ؼ� �ڵ带 �ϼ��ϼ���.
	            ret =4;
	        }
	        // ��� üũ�� ���� �ڵ��Դϴ�.
	        return ret;
	    }
	    
	    //�Ʒ��� ������ ���� �ڵ��Դϴ�. �������� ������.
	    public static void main(String[]args){
	    	conditionTest exam = new conditionTest();
	        exam.conditionTest(6);
	        exam.conditionTest(8);

	}

}
