package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

import static java.time.LocalDate.of;

public class Forum {

    private final List<ForumUser> theUserList = new ArrayList<>();

    public Forum() {
        theUserList.add(new ForumUser( 0,"Andrew",
                'M',of(2017, 1, 13), 4));
        theUserList.add(new ForumUser(1, "Susan",
                'F', of(1998,10,1),  6));
        theUserList.add(new ForumUser(2, "Max",
                'M',of(2000,6,7), 25));
        theUserList.add(new ForumUser(3, "Elen",
                'F', of(2006,8,11), 16));
        theUserList.add(new ForumUser(4, "Adam",
                'M', of(1988,4,8), 254));
        theUserList.add(new ForumUser(5,  "Helen",
                'F', of(1999,2,2), 27));
        theUserList.add(new ForumUser(6, "Brian",
                'M', of(1990,11,12), 0));
    }

    public List<ForumUser> getList() {
        return new ArrayList<>(theUserList);
    }
}
