public class PromotionCasting {
    public static void main(String[] args) {
        int i = 3;
        long l = i;
        // i gets promoted to "long" by assignment
        double d = i;
        // i gets promoted to "double" by assignment - happens at compiler
        System.out.println("int " + i);
        System.out.println("double " + d);

        // avoid truncated values through promotion
        int num1 = 55555;
        long num2 = 66666;
        long num3 = num1 * num2; // promotion will look only at rightmost side of equation
        System.out.println(num3);
    }
    
}
