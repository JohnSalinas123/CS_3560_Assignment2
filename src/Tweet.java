package src;

public class Tweet {

    private static int timeValue = 0;
    private String username;
    private String tweetStr;
    private int counter;
    private long timestamp;

    public Tweet(String tweetStr, String username) {
        this.tweetStr = tweetStr;
        this.counter = Tweet.timeValue;
        this.username = username;
        this.timestamp = System.currentTimeMillis();
        Tweet.timeValue++;
    }

    public String getTweet() {
        return this.tweetStr;
    }

    public int getCounterValue() {
        return this.counter;
    }

    public String getUserName() {
        return this.username;
    }

    public long getTimeStamp() {
        return this.timestamp;
    }

    @Override
    public String toString() {
        return this.username + " " + "(" + this.counter + ") :" + this.tweetStr;
    }

}
