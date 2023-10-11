package practiceDay1;

public class multiplication {
    public void multiplyTwoNumbers(float num,float num) {
        try {
            float m = num * num;
            System.out.println(m);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
            multiplication obj = new multiplication();
            obj.multiplyTwoNumbers(1.0f, Float.parseFloat("abc"));
        }

}
