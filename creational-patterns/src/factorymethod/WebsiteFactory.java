package factorymethod;

import java.util.Map;

public class WebsiteFactory {

    private final static Map<WebsiteType, Website> sites = Map.of(
            WebsiteType.BLOG, new Blog(), WebsiteType.SHOP, new Shop()
    );

    public static Website getWebsite(WebsiteType siteType) {
        return sites.get(siteType);
//        switch (siteType) {
//            case "blog":
//                return new Blog();
//            case "shop" :
//                return new Shop();
//            default:
//                return null;
//        }
    }
}
