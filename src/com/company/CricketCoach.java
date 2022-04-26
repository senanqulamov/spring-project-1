package com.company;

public class CricketCoach implements Coach{
    private FortuneService ftserv;
    private String emailAddress;
    private String team;


    //---- setter with literals start ----
    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("CricketCoach : inside setter method - setEmail");
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("CricketCoach : inside setter method - setTeam");
        this.team = team;
    }
    //---- setter with literals end ----

    public CricketCoach() {
        System.out.println("CricketCoach inside no-arg const");
    }

    public void setFortuneService(FortuneService ftserv) {
        System.out.println("CricketCoach inside setter method");
        this.ftserv = ftserv;
    }

    @Override
    public String getDailyWorkout() {
        return "OK";
    }

    @Override
    public String getFortune() {
        return "I m not that happy";
    }
}
