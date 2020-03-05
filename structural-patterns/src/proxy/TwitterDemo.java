package proxy;

public class TwitterDemo {
    public static void main(String[] args) {
        TwitterService twitterService = (TwitterService) SecurityProxy.newInstance(new TwitterServiceImpl());

        System.out.println(twitterService.getTimeline("moldova"));

        twitterService.postToTimeline("ajigor", "Some message that shouldnt go through");

    }
}
