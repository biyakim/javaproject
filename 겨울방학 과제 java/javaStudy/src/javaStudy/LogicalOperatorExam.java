package javaStudy;

public class LogicalOperatorExam {
	public boolean isAgeDiscountable(int age) {
        boolean isDiscount = false;
        // �Ʒ� ��ĭ�� ä�� �ڵ带 �ϼ��ϼ���.
        if( age<=19||age>=60) {
            isDiscount = true;
        }
        else {
            isDiscount = false;
        }
        return isDiscount;
    }

    public static void main(String[]args) {
        LogicalOperatorExam exam = new LogicalOperatorExam();
        exam.isAgeDiscountable(15);
        exam.isAgeDiscountable(27);
    }
}
