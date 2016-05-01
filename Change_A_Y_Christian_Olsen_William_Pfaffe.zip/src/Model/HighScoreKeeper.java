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

    /**
     *Constructor creating HighScoreKeeper
     * @param playerName String as input
     * @param playerScore int as input
     */
    public HighScoreKeeper(String playerName, int playerScore) {
        this.playerName = playerName;
        this.playerScore = playerScore;
    }

    /**
     *Gets the playerName
     * @return playerName
     */
    public String getPlayerName() {
        return playerName;
    }

    /**
     *Sets the playerName
     * @param playerName String as input
     */
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    /**
     *Gets the playerScore
     * @return playerScore
     */
    public int getPlayerScore() {
        return playerScore;
    }

    /**
     *Sets the playerScore
     * @param playerScore int as input
     */
    public void setPlayerScore(int playerScore) {
        this.playerScore = playerScore;
    }

    @Override
    public String toString() {
        return playerName + "," + playerScore;
    }
    
    
    
}
