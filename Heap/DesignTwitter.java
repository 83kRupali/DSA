import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
import java.util.HashSet;
import java.util.LinkedList;

public class DesignTwitter {

    class Tweet implements Comparable<Tweet>{
        int time;
        int tweetId;

        Tweet(int t, int id){
            this.time = t;
            this.tweetId = id;
        }

        public int compareTo(Tweet t2){
            return this.time - t2.time;
        }
    }

    public class User {
        int userId;
        HashSet<Integer> follwers;
        List<Tweet>tweets;

        User(int userId){
            this.userId = userId;
            follwers = new HashSet<>();
            follwers.add(userId);
            tweets = new LinkedList<>();
        }   

        public void addTweet(Tweet t){
            tweets.add(0, t);    //insertion at the head;
        }

        public void addFollower(int followeeId){
            follwers.add(followeeId);
        }

        public void removeFollower(int followeeId){
            follwers.remove(followeeId);
        }
    }

    HashMap<Integer, User> userMap;
    int timecounter;

    public DesignTwitter(){
        userMap = new HashMap<>();
        timecounter = 0;
    }

    public void postTweet(int userId, int tweetId){
        timecounter++;

        if(!userMap.containsKey(userId)){
            userMap.put(userId, new User(userId));
        }

        User user = userMap.get(userId);
        user.addTweet(new Tweet(timecounter, tweetId));
    }

    public void follow(int followerId, int followeeId){
        if(!userMap.containsKey(followerId)){
            userMap.put(followerId, new User(followerId));
        }

        if(!userMap.containsKey(followeeId)){
            userMap.put(followeeId, new User(followeeId));
        }

        User user = userMap.get(followerId);
        user.addFollower(followeeId);
    }

    public void unFollow(int followerId, int followeeId){
        if(!userMap.containsKey(followerId) || !userMap.containsKey(followeeId)){
            return;
        }

        User user = userMap.get(followerId);
        user.removeFollower(followeeId);
    }

    public List<Integer> getNewsFeed(int userId){
        if(!userMap.containsKey(userId)){
            return new ArrayList<>();
        }

        PriorityQueue<Tweet> pq = new PriorityQueue<>();
        // add self tweets + followers tweets
        User user = userMap.get(userId);

        for(int followerId : user.follwers){
            int count = 0;

            for(Tweet tweet : userMap.get(followerId).tweets){
                pq.offer(tweet);
                count++;

                if(count > 10){
                    break;
                }
            }
        }

        // int count = 0;
        // for(Tweet tweet : user.tweets){
        //     pq.offer(tweet);
        //     count++;

        //     if(count > 10){
        //         break;
        //     }
        // }

        List<Integer> res = new ArrayList<>();
        int idx = 0;
        while (!pq.isEmpty() && idx < 0) {
            Tweet tweet = pq.poll();
            res.add(tweet.tweetId);
            idx++;
        }

        return res;
    }

    public static void main(String[] args) {
        
    }
}