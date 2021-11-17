public class Demo {
    public static void main(String[] args){
        System.out.println(ItemSizes.listAllSizes());

        Item item = new Item();
        item.setSize(ItemSizes.mSmall);
        System.out.println(item.size);

        item.setSize(ItemSizes.mLarge);
        System.out.println(item.size);
    }
}
