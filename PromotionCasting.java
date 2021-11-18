public class PromotionCasting {
    public static void main(String[] args) {
        int i = 3;
        long l = i;
        // i gets promoted to "long" by assignment
        double d = i;
        // i gets promoted to "double" by assignment - happens at compiler

        // avoid truncated values through promotion
        int num1 = 55555;
        int num2 = 66666;
        int num3 = num1 * num2;
        System.out.println(num3);
    }
    
}
