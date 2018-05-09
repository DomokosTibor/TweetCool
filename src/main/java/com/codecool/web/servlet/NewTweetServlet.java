package com.codecool.web.servlet;
import com.codecool.web.model.Tweet;
import com.codecool.web.service.TweetService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/new-tweet")
public class NewTweetServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String message = req.getParameter("message");

        if (name.equals("") || message.equals("")) {
            String error_message = "Name and Message cannot be empty!";
            req.setAttribute("error_message", error_message);
            req.getRequestDispatcher("index.jsp").include(req, resp);
        }
        else {
            Tweet newTweet = new Tweet(name, message);

            TweetService tweetService = new TweetService();
            tweetService.addTweet(newTweet);
            req.setAttribute("tweetList", tweetService.getTweetList());

            req.getRequestDispatcher("tweets.jsp").include(req, resp);
        }
    }

}
