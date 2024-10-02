public class Main {
    public static void main(String[] args) {
        SellerCarrot sellerCarrotOne = new SellerCarrot();
        SellerCarrot sellerCarrotTwo = new SellerCarrot();
        sellerCarrotOne.setName("Martin Dlouhý");
        sellerCarrotOne.setAddress("Chomutovská 1256 Kadaň");
        sellerCarrotTwo.setAddress("Golovinova 1254 Kadaň");
        sellerCarrotTwo.setName("Lukáš Ztracený");
        System.out.println(sellerCarrotOne.getName());
        System.out.println(sellerCarrotOne.getAddress());
        System.out.println(sellerCarrotTwo.getName());
        System.out.println(sellerCarrotTwo.getAddress());

    }
}
