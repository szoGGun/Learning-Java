package com.przemyslawrutkowski;

// Create a generic class to implement a league table for a sport.
// The class should allow teams to be added to the list, and store
// a list of teams that belong to the league.
//
// Your class should have a method to print out the teams in order,
// with the team at the top of the league printed first.
//
// Only teams of the same type should be added to any particular
// instance of the league class - the program should fail to compile
// if an attempt is made to add an incompatible team.

public class Main {

    public static void main(String[] args) {
        League<Team<SoccerPlayer>> footballLeague = new League<>("Ekstraklasa");
        Team<SoccerPlayer> lech = new Team<>("Lech Poznań");
        Team<SoccerPlayer> legia = new Team<>("Legia Warszawa");
        Team<SoccerPlayer> lechia = new Team<>("Lechia Gdańsk");
        Team<SoccerPlayer> pogon = new Team<>("Pogoń Szczecin");

        footballLeague.addTeam(lech);
        footballLeague.addTeam(legia);
        footballLeague.addTeam(lechia);
        footballLeague.addTeam(pogon);

        footballLeague.leagueTable();
        lech.matchResult(legia,1, 1);
        lech.matchResult(lechia, 2, 1);
        lechia.matchResult(legia, 4, 0);
    }
}
