package com.kodilla.spring.portfolio;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
public class BoardConfig {

    @Bean(name = "list1")
    @Scope("prototype")
    public TaskList getTaskList1(){return new TaskList();}
    @Bean(name = "list2")
    @Scope("prototype")
    public TaskList getTaskList2(){return new TaskList();}
    @Bean(name = "list3")
    @Scope("prototype")
    public TaskList getTaskList3(){return new TaskList();}

    @Bean
    public Board getBoard(){
        return new Board(getTaskList1(),getTaskList2(),getTaskList3());
    }

}
