package javaStudy;

public class conditionTest {
    public int conditionTest(int value){
		 int ret = 0;
	        if( value % 3 == 0 ){
	            ret = 3;
	        }else if(value %4==0){// 이 아래 줄에 else 구문을 추가해서 코드를 완성하세요.
	            ret =4;
	        }
	        // 결과 체크를 위한 코드입니다.
	        return ret;
	    }
	    
	    //아래는 실행을 위한 코드입니다. 수정하지 마세요.
	    public static void main(String[]args){
	    	conditionTest exam = new conditionTest();
	        exam.conditionTest(6);
	        exam.conditionTest(8);

	}

}
