package com.kodilla.stream;


import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        Forum theForum = new Forum();
        Map<Integer, ForumUser> theResultMap = theForum.getList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getDate().getYear() < 2002)
                .filter(forumUser -> forumUser.getNumberOfPosts() > 0)
                .collect(Collectors.toMap(ForumUser::getId, forumUser -> forumUser));

        theResultMap.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);



    }
}
