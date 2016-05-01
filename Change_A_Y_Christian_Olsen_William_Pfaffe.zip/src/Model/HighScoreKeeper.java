/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Ceo
 */
public class HighScoreKeeper {
    private String playerName;
    private int playerScore;

    public HighScoreKeeper(String playerName, int playerScore) {
        this.playerName = playerName;
        this.playerScore = playerScore;
    }

    
    
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public void setPlayerScore(int playerScore) {
        this.playerScore = playerScore;
    }

    @Override
    public String toString() {
        return playerName + "," + playerScore;
    }
    
    
    
}
