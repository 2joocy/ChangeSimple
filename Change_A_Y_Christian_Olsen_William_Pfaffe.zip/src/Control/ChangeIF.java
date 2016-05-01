/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import javax.swing.JComboBox;
import javax.swing.JList;

/**
 *
 * @author William
 */
public interface ChangeIF {

     /**
     *Adds a list of countries to the JComboBox from a file.
     * @param temp JComboBox as input
     */
    public void addGameToCombo(JComboBox temp);

     /**
     *The getCaught method returns a Boolean based on wether the randomly generated  number in 
     * the method is higher or lower than the input int. 
     * The method is used to determine wether or not the player gets caught in the Customer Toll.
     * @param i int as input
     * @return a Boolean 
     */
    public boolean getCaugt(int i);

    /**
     *Determines wether the prices will go up or down when travelling between countries.
     * @return boolean
     */
    public boolean priceUpOrDown();

    /**
     *Uses a random number to determine wether there will be any price changes 
     * when the player travels between countries.
     * @return randomInt
     */
    public int priceChange();

     /**
     *Displays the list of countries available for travel
     * @param Country String as input
     */
    public void setList(String Country);

      /**
     *If the boolean of in method priceUpOrDown is true this method calculates new increased prices.
     */
    public void newPriceUp();

    /**
     * If the boolean of in method priceUpOrDown is false, this method calculates new decreased prices.
     *
     */
    public void newPriceDown();

    /**
     *The isNegative method checks the players current money balance (currentBalance) and returns
     * a boolean based on wether the currentBlanec is below or above 0.
     * @return a Boolean
     */
    public boolean isNegative();

    /**
     **!Method is not in use!*
     * The refreshInventory method refreshes the inventory 
     * @param index jList as input
     */
    public void refreshInventory(JList index);

    /**
     *The refreshJCombo method refreshes the players comboBox to show the items that have 
     * been bought from dealers, and makes them available for selection by the player.
     * @param temp JComboBox as inout
     */
    public void refreshJCombo(JComboBox temp);

     /**
     *Sets the drugs prices
     * @param drug String as input
     */
    public void checkDrug(String drug);



}
