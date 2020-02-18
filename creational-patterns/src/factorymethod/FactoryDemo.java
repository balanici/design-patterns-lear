package factorymethod;

public class FactoryDemo {

    public static void main(String[] args) {
        Website shopWebsite = WebsiteFactory.getWebsite(WebsiteType.SHOP);
        shopWebsite.getPages().forEach(page -> System.out.println(page.getClass().getName()));
        System.out.println();
        Website blogWebsite = WebsiteFactory.getWebsite(WebsiteType.BLOG);
        blogWebsite.getPages().forEach(page -> System.out.println(page.getClass().getName()));
    }
}
