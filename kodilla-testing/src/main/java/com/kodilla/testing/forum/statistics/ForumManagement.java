package com.kodilla.testing.forum.statistics;



public class ForumManagement{

    int numberOfUsers;
    int numberOfPosts;
    int numberOfComments;
    double averageNumberOfPostsPerUser;
    double averageNumberOfCommentsPerUser;
    double averageNumberOfCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics){

        this.numberOfUsers = statistics.usersNames().size();
        this.numberOfPosts = statistics.postsCount();
        this.numberOfComments = statistics.commentsCount();

        if(this.numberOfUsers > 0){
            this.averageNumberOfPostsPerUser = (double)this.numberOfPosts/this.numberOfUsers;
        }else{
            this.averageNumberOfPostsPerUser = 0.0;
        }

        if(this.numberOfUsers > 0){
            this.averageNumberOfCommentsPerUser = (double)this.numberOfComments/this.numberOfUsers;
        }else{
            this.averageNumberOfCommentsPerUser = 0.0;
        }

        if(this.numberOfPosts > 0){
            this.averageNumberOfCommentsPerPost = (double)this.numberOfComments/this.numberOfPosts;
        }else{
            this.averageNumberOfCommentsPerPost = 0.0;
        }
    }

    public void showStatistics(){
        System.out.println("Number of users: " + numberOfUsers);
        System.out.println("Number of posts: " + numberOfPosts);
        System.out.println("Number of comments: " + numberOfComments);
        System.out.println("Average number of posts per user: " + averageNumberOfPostsPerUser);
        System.out.println("Average number of comments per user: " + averageNumberOfCommentsPerUser);
        System.out.println("Average number of comments per post: " + averageNumberOfCommentsPerPost);
    }

}







