package com.kodilla.patterns.strategy.social;

public class User {
    String name;
    SocialPublisher socialPublisher;

    public User(String name) {
        this.name = name;
    }

    public String sharePost(){
        return socialPublisher.share();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSocialPublisher(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }
}
