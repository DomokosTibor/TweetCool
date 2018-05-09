package com.codecool.web.database;

import com.codecool.web.model.Tweet;
import java.util.ArrayList;
import java.util.List;

public class SingletonDB {

    private List<Tweet> tweetList = new ArrayList<>();
    private static SingletonDB instance = new SingletonDB();

    public static SingletonDB getInstance() {
        return instance;
    }

    private SingletonDB() {
        tweetList.add(new Tweet("Teszt Elek", "This is a test message."));
        tweetList.add(new Tweet("roBOT", "Beep beep..."));
        tweetList.add(new Tweet("reTECH", "What is the meaning of the life?"));
    }

    public List<Tweet> getTweetList() {
        return tweetList;
    }

}