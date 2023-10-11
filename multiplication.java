package practiceDay1;

public class multiplication {
    public void multiplyTwoNumbers(float numbera,float numberb) {
        try {
            float mul = numbera * numberb;
            System.out.println(mul);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
            multiplication obj = new multiplication();
            obj.multiplyTwoNumbers(1.0f, Float.parseFloat("bc"));
        }

}
