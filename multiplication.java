package practiceDay1;

public class multiplication {
    public void multiplyTwoNumbers(float number1,float number2) {
        try {
            float mul = number1 * number2;
            System.out.println(mul);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
            multiplication obj = new multiplication();
            obj.multiplyTwoNumbers(1.0f, Float.parseFloat("abc"));
        }

}
