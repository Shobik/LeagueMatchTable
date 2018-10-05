/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generic.main;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class GenericMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        League<Team<FootballPlayer>> footballLeague = new League<> ("Premier League");
        Team<FootballPlayer> ManchesterUnited = new Team<>("Manchester United");
        Team<FootballPlayer> Liverpool = new Team<>("Liverpool");
        Team<FootballPlayer> ManchesterCity = new Team<>("Manchester City");
        Team<FootballPlayer> Chelsea = new Team<>("Chelsea");
        
        
        Liverpool.matchResult(Chelsea, 1, 2);
        Liverpool.matchResult(ManchesterUnited, 2, 1);
        
        footballLeague.add(Liverpool);
        footballLeague.add(Chelsea);
        footballLeague.add(ManchesterUnited);
        footballLeague.add(ManchesterCity);
        
        
        footballLeague.showLeagueTable();
        
        
        
        
    
    }
}
