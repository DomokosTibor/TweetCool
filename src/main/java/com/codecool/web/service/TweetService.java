package com.codecool.web.service;

import com.codecool.web.database.SingletonDB;
import com.codecool.web.model.Tweet;
import java.util.List;

public class TweetService {

    public List<Tweet> getTweetList() {
        return SingletonDB.getInstance().getTweetList();
    }

    public void addTweet(Tweet newTweet) {
        SingletonDB.getInstance().getTweetList().add(newTweet);
    }

}
