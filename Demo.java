import java.beans.Customizer;

public class Demo {
    public static void main(String[] args) {
        Customer cust = new Customer();

        Item shirt = new Item();
        System.out.println(shirt.getPrice());

        //shirt.price = 10.00; this won't work because price is private
        shirt.setPrice(10.00, cust);

        System.out.println(shirt.getPrice());
    }
    // public static void main(String[] args){
    //     System.out.println(ItemSizes.listAllSizes());

    //     Item item = new Item();
    //     item.setSize(ItemSizes.mSmall);
    //     System.out.println(item.size);

    //     item.setSize(ItemSizes.mLarge);
    //     System.out.println(item.size);
    // }
    /*
        String sNum = "true";
        Boolean bNum = Boolean.parseBoolean(sNum);
        System.out.println(bNum);
        // ExampleConstants constx = new ExampleConstants();
        System.out.println(ExampleConstants.COLUMNS);
        System.out.println(ExampleConstants.TIMEOUT);
        System.out.println(ExampleConstants.MAX_CONNECTIONS);
        System.out.println(ExampleConstants.PROTOCOL);
        System.out.println(ExampleConstants.METHOD);
    */

}
