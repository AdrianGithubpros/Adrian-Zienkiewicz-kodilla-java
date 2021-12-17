package com.kodilla.testing.forum;

import java.util.List;

public class ForumUser {
    String nick;
    String realName;
    List<String> posts;
    List<String> comments;

    public ForumUser(String nick,String realName){
        this.nick = nick;
        this.realName = realName;


    }

    public void postAdd(String post){
        posts.add(post);

    }
    public void postComment(String comment){
        comments.add(comment);

    }

    public String getNick() {
        return nick;
    }

    public String getRealName() {
        return realName;
    }

    public List<String> getPosts() {
        return posts;
    }

    public List<String> getComments() {
        return comments;
    }
    public void removePost(String post){
        posts.remove(post);

    }
    public void removeComment(String comment){
        comments.remove(comment);

    }

}
