/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.modelData;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

/**
 *
 * @author William
 */
public class ChangeHandler implements ChangeIF {

    private modelData data = new modelData();

    /**
     *Creates a new ArrayList based on String
     */
    public ArrayList<String> items = new ArrayList<String>();
    
    /**
     *Adds a list of countries to the JComboBox from a file.
     * @param temp JComboBox as input
     */
    @Override
    public void addGameToCombo(JComboBox temp) {
        data.addGameToCombo(temp);

    }

   /**
     *Displays the list of countries available for travel
     * @param Country String as input
     */
    @Override
    public void setList(String Country) {

     data.setList(Country);

    }
    
     /**
     *The getCaught method returns a Boolean based on wether the randomly generated  number in 
     * the method is higher or lower than the input int. 
     * The method is used to determine wether or not the player gets caught in the Customer Toll.
     * @param i int as input
     * @return a Boolean 
     */
    @Override
    public boolean getCaugt(int i) {
      return data.getCaugt(i);
    }
    
      /**
     *Determines wether the prices will go up or down when travelling between countries.
     * @return boolean
     */
    @Override
    public boolean priceUpOrDown(){
        return data.priceUpOrDown();
    }
    
     /**
     *Uses a random number to determine wether there will be any price changes 
     * when the player travels between countries.
     * @return randomInt
     */
    @Override
     public int priceChange(){
          return data.priceChange();
    }
     
     /**
     *If the boolean of in method priceUpOrDown is true this method calculates new increased prices.
     */
    @Override
     public void newPriceUp(){
     data.newPriceUp();
     }
     
     /**
     * If the boolean of in method priceUpOrDown is false, this method calculates new decreased prices.
     *
     */
    @Override
     public void newPriceDown(){
       data.newPriceDown();
     }

    /**
     *The isNegative method checks the players current money balance (currentBalance) and returns
     * a boolean based on wether the currentBlanec is below or above 0.
     * @return a Boolean
     */
    @Override
    public boolean isNegative() {
       return data.isNegative();
    }

    /**
     **!Method is not in use!*
     * The refreshInventory method refreshes the inventory 
     * @param index jList as input
     */
    @Override
    public void refreshInventory(JList index) {
        data.refreshInventory(index);
    }

   /**
     *The refreshJCombo method refreshes the players comboBox to show the items that have 
     * been bought from dealers, and makes them available for selection by the player.
     * @param temp JComboBox as inout
     */
    @Override
    public void refreshJCombo(JComboBox temp) {
        data.refreshJCombo(temp);
    }

     /**
     *Sets the drugs prices
     * @param drug String as input
     */
    @Override
    public void checkDrug(String drug) {
       data.checkDrug(drug);
    }

    /**
     *Gets the players current health.
     * @return Health
     */
    public String getHealth() {
        return data.getHealth();
    }

     /**
     *Sets the players health
     * @param Health String as input
     */
    public void setHealth(String Health) {
        data.setHealth(Health);
    }

   /**
     *Gets the cocaine
     * @return cocaine
     */
    public String getCocaine() {
        return data.getCocaine();
    }

     /**
     *Sets cocaine
     * @param cocaine String as input
     */
    public void setCocaine(String cocaine) {
        data.setCocaine(cocaine);
    }

    /**
     * Gets Heroin
     * @return heroin
     */
    public String getHeroin() {
        return data.getHeroin();
    }

   /**
     *Sets heroin
     * @param heroin String as input
     */
    public void setHeroin(String heroin) {
        data.setHeroin(heroin);
    }

    /**
     *Gets Amphetamine.
     * @return amphetamine
     */
    public String getAmphetamine() {
        return data.getAmphetamine();
    }

    /**
     *Sets Amphetamine.
     * @param amphetamine String as input
     */
    public void setAmphetamine(String amphetamine) {
        data.setAmphetamine(amphetamine);
    }

   /**
     *Gets Acid
     * @return acid
     */
    public String getAcid() {
        return data.getAcid();
    }

   /**
     *Sets Acid
     * @param acid String as input
     */
    public void setAcid(String acid) {
        data.setAcid(acid);
    }

    /**
     *Gets Angel Dust
     * @return angeldust
     */
    public String getAngeldust() {
        return data.getAngeldust();
    }

   /**
     *Sets Angel Dust
     * @param angeldust String as input
     */
    public void setAngeldust(String angeldust) {
        data.setAngeldust(angeldust);
    }

     /**
     *Gets Meth
     * @return meth
     */
    public String getMeth() {
        return data.getMeth();
    }

    /**
     *Sets Meth
     * @param meth String as input
     */
    public void setMeth(String meth) {
        data.setMeth(meth);
    }

     /**
     *Gets the amount (weight) of cocaine available at the dealer.
     * @return cocaineWeight
     */
    public String getCocaineWeight() {
        return data.getCocaineWeight();
    }

    /**
     *Sets the amount (weight) of cocaine available at the dealer.
     * @param cocaineWeight String as input
     */
    public void setCocaineWeight(String cocaineWeight) {
        data.setCocaineWeight(cocaineWeight);
    }

   /**
     *Gets the amount (weight) of Heroin available at the dealer.
     * @return heroinWeight
     */
    public String getHeroinWeight() {
        return data.getHeroinWeight();
    }

    /**
     *Sets the amount (weight) of heroin available at the dealer.
     * @param heroinWeight String as input
     */
    public void setHeroinWeight(String heroinWeight) {
        data.setHeroinWeight(heroinWeight);
    }

    /**
     *Gets the amount (weight) of Amph(etamine) available at the dealer.
     * @return ampWight
     */
    public String getAmphWeight() {
        return data.getAmphWeight();
    }

    /**
     *Sets the amount (weight) of Amph(etamine) available at the dealer.
     * @param amphWeight
     */
    public void setAmphWeight(String amphWeight) {
        data.setAmphWeight(amphWeight);
    }

     /**
     *Gets the amount (weight) of Acid available at the dealer.
     * @return
     */
    public String getAcidWeight() {
        return data.getAcidWeight();
    }

    /**
     *Sets the amount (weight) of acid available at the dealer.
     * @param acidWeight String as input
     */
    public void setAcidWeight(String acidWeight) {
        data.setAcidWeight(acidWeight);
    }

    /**
     *Gets the amount (weight) of angeldust available at the dealer.
     * @return angeldustWeight
     */
    public String getAngeldustWeight() {
        return data.getAngeldustWeight();
    }

    /**
     *Sets the amount (weight) of angeldust available at the dealer.
     * @param angeldustWeight String as input
     */
    public void setAngeldustWeight(String angeldustWeight) {
        data.setAngeldustWeight(angeldustWeight);
    }

    /**
     *Gets the amount (weight) of meth available at the dealer.
     * @return methWeight
     */
    public String getMethWeight() {
        return data.getMethWeight();
    }

    /**
     *Sets the amount (weight) of meth available at the dealer.
     * @param methWeight String as input
     */
    public void setMethWeight(String methWeight) {
        data.setMethWeight(methWeight);
    }

    /**
     *Gets the CountrySelected for when travelling
     * @return countrySelected
     */
    public String getCountrySelected() {
        return data.getCountrySelected();
    }

     /**
     *Sets the CountrySelected for when travelling
     * @param countrySelected String as input
     */
    public void setCountrySelected(String countrySelected) {
        data.setCountrySelected(countrySelected);
    }

    /**
     *Gets the players current balance, for which to purchase drugs with.
     * @return currentBalance
     */
    public int getCurrentBalance() {
        return data.getCurrentBalance();
    }

    /**
     *Sets the players current balance, for which to purchase drugs with.
     * @param currentBalance int as input
     */
    public void setCurrentBalance(int currentBalance) {
        data.setCurrentBalance(currentBalance);
    }

      /**
     *Gets the currently selected item.
     * @return item
     */
    public String getItem() {
        return data.getItem();
    }

        /**
     *Sets the currently selected item
     * @param item String as input
     */
    public void setItem(String item) {
        data.setItem(item);
    }

     /**
     *Gets the items current price
     * @return itemPrice
     */
    public int getItemPrice() {
        return data.getItemPrice();
    }

   /**
     *Sets the items price
     * @param itemPrice int as input
     */
    public void setItemPrice(int itemPrice) {
        data.setItemPrice(itemPrice);
    }

    /**
     *Gets the current turn number of the game.
     * @return turns
     */
    public int getTurns() {
        return data.getTurns();
    }

    /**
     *Sets the current turn number of the game.
     * @param turns int as input
     */
    public void setTurns(int turns) {
        data.setTurns(turns);
    }

    /**
     *Gets the country the player wants to travel to.
     * @return countryTravel
     */
    public String getCountryTravel() {
        return data.getCountryTravel();
    }

    /**
     *Sets the country the player wants to travel to.
     * @param countryTravel String as input
     */
    public void setCountryTravel(String countryTravel) {
        data.setCountryTravel(countryTravel);
    }

    /**
     **Method not in use*
     * @return customsCaught
     */
    public int getCustomsCaugt() {
        return data.getCustomsCaugt();
    }

    /**
     **Method not in use*
     * @param customsCaugt int as input
     */
    public void setCustomsCaugt(int customsCaugt) {
        data.setCustomsCaugt(customsCaugt);
    }

     /**
     *Checks wether or not the player has any active and avaiable agents.
     * @return agents
     */
    public boolean isAgents() {
        return data.isAgents();
    }

   /**
     *Sets the agents boolean
     * @param agents boolean as input
     */
    public void setAgents(boolean agents) {
        data.setAgents(agents);
    }

    /**
     *Gets the players current amount of cocaine
     * @return cocaineB
     */
    public String getCocaineB() {
        return data.getCocaineB();
    }

    /**
     *Sets the players amount of cocaine
     * @param cocaineB String as input
     */
    public void setCocaineB(String cocaineB) {
        data.setCocaineB(cocaineB);
    }

    /**
     *Gets the players amount of Heroin
     * @return heroinB
     */
    public String getHeroinB() {
        return data.getHeroinB();
    }

     /**
     *Sets the players amount of heroin
     * @param heroinB String as input
     */
    public void setHeroinB(String heroinB) {
        data.setHeroinB(heroinB);
    }


    /**
     *Gets the players amount of Amph(etamine)
     * @return amphB
     */
    public String getAmphB() {
        return data.getAmphB();
    }

    /**
     *Sets the players amount of Amph(etamine)
     * @param amphB String as input
     */
    public void setAmphB(String amphB) {
        data.setAmphB(amphB);
    }

     /**
     *Gets the players amount of Acid
     * @return acidB
     */
    public String getAcidB() {
        return data.getAcidB();
    }

    /**
     *Sets the players amount of Acid
     * @param acidB String as input
     */
    public void setAcidB(String acidB) {
        data.setAcidB(acidB);
    }

    /**
     *Gets the players amount of Angel(dust)
     * @return angelB
     */
    public String getAngelB() {
        return data.getAngelB();
    }

    /**
     *Sets the players amount of Angel(dust)
     * @param angelB String as input
     */
    public void setAngelB(String angelB) {
        data.setAngelB(angelB);
    }

    /**
     *Gets the players amount of Meth
     * @return methB
     */
    public String getMethB() {
        return data.getMethB();
    }

    /**
     *Sets the players amount of Acid
     * @param methB String as input
     */
    public void setMethB(String methB) {
        data.setMethB(methB);
    }

    /**
     *Gets the player
     * @return player
     */
    public String getPlayer() {
        return data.getPlayer();
    }

    /**
     *Sets the player
     * @param player String as input
     */
    public void setPlayer(String player) {
        data.setPlayer(player);
    }
    
    /**
     *Gets the final highscore of the player
     * @return highscore
     */
    public int getHighScore() {
        return data.getHighScore();
    }

    /**
     *Sets the final highscore of the player
     * @param highScore int as input
     */
    public void setHighScore(int highScore) {
        data.setHighScore(highScore);
    }
    
    
    
    
}
