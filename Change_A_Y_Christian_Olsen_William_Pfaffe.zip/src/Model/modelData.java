/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 *
 * @author RadeonXRay
 */
public class modelData {
    
    /**
     *
     */
    public ArrayList<String> items = new ArrayList<String>();
    private String Health;
    private String item;
    private int highScore;
    private int itemPrice;
    private int currentBalance;
    private int turns;
    private int customsCaugt;
    private boolean agents;
    private String countrySelected;
    private String countryTravel;
    private String cocaine;
    private String cocaineWeight;
    private String heroin;
    private String heroinWeight;
    private String amphetamine;
    private String amphWeight;
    private String acid;
    private String acidWeight;
    private String angeldust;
    private String angeldustWeight;
    private String meth;
    private String methWeight;
    private String cocaineB;
    private String heroinB;
    private String amphB;
    private String acidB;
    private String angelB;
    private String methB;
    private String player;
    
    /**
     *Adds a list of countries to the JComboBox from a file.
     * @param temp JComboBox as input
     */
    public void addGameToCombo(JComboBox temp) {
        String fileName = "countrylist.txt";
        try {

            FileReader inputFile = new FileReader(fileName);

            BufferedReader bufferReader = new BufferedReader(inputFile);

            String line;

            while ((line = bufferReader.readLine()) != null) {

                String split[] = line.split(",");
                for (int i = 0; i < split.length; i++) {
                    temp.addItem(split[i]);
                }

            }

            bufferReader.close();
        } catch (Exception e) {
            System.out.println("Fejl ved linje:" + e.getMessage());
        }

    }
     
    /**
     *Displays the list of countries available for travel
     * @param Country String as input
     */
    public void setList(String Country) {

        String fileName = Country + ".txt";
        try {

            FileReader inputFile = new FileReader(fileName);

            BufferedReader bufferReader = new BufferedReader(inputFile);

            String line;

            while ((line = bufferReader.readLine()) != null) {
                System.out.println(line);
                String split[] = line.split(";");

                String[] splitCocaine = split[0].split(",");
                cocaine = splitCocaine[1];
                cocaineWeight = splitCocaine[2];

                String[] splitHeroin = split[1].split(",");
                heroin = splitHeroin[1];
                heroinWeight = splitHeroin[2];

                String[] splitAmph = split[2].split(",");
                amphetamine = splitAmph[1];
                amphWeight = splitAmph[2];

                String[] splitAcid = split[3].split(",");
                acid = splitAcid[1];
                acidWeight = splitAcid[2];

                String[] splitAngel = split[4].split(",");
                angeldust = splitAngel[1];
                angeldustWeight = splitAngel[2];

                String[] splitMeth = split[5].split(",");
                meth = splitMeth[1];
                methWeight = splitMeth[2];

                   System.out.println(cocaine);
                   System.out.println(heroin);
                   System.out.println(amphetamine);
                   System.out.println(acid);
                   System.out.println(angeldust);
                   System.out.println(meth);
            }

            bufferReader.close();
        } catch (Exception e) {
            System.out.println("Fejl ved linje:" + e.getMessage());
        }

    }
    
    /**
     *The getCaught method returns a Boolean based on wether the randomly generated  number in 
     * the method is higher or lower than the input int. 
     * The method is used to determine wether or not the player gets caught in the Customer Toll.
     * @param i int as input
     * @return a Boolean 
     * 
     * 
     */
    public boolean getCaugt(int i) {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(100);
        if (randomInt > i) {
            return false;
        }
        return true;
    }

    /**
     *Determines wether the prices will go up or down when travelling between countries.
     * @return boolean
     */
    public boolean priceUpOrDown(){
          Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(100);
        if (randomInt >= 50) {
            return false;
        } 
        return true;
    }
      
    /**
     *Uses a random number to determine wether there will be any price changes 
     * when the player travels between countries.
     * @return randomInt
     */
    public int priceChange(){
          Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(84)+1;
        return randomInt;
    }
      
    /**
     *If the boolean of in method priceUpOrDown is true this method calculates new increased prices.
     */
    public void newPriceUp(){
         int i = this.priceChange();
         cocaine= Integer.toString(Integer.parseInt(cocaine) + (Integer.parseInt(cocaine) /100 * i));
         heroin= Integer.toString(Integer.parseInt(heroin) + (Integer.parseInt(heroin) /100 * i));
         amphetamine= Integer.toString(Integer.parseInt(amphetamine) + (Integer.parseInt(amphetamine) /100 * i));
         acid= Integer.toString(Integer.parseInt(acid) + (Integer.parseInt(acid) /100 * i));
         angeldust= Integer.toString(Integer.parseInt(angeldust) + (Integer.parseInt(angeldust) /100 * i));
         meth= Integer.toString(Integer.parseInt(meth) + (Integer.parseInt(meth) /100 * i));
         
     }

    /**
     * If the boolean of in method priceUpOrDown is false, this method calculates new decreased prices.
     *
     */
    public void newPriceDown(){
         int i = this.priceChange();
         cocaine= Integer.toString(Integer.parseInt(cocaine) - (Integer.parseInt(cocaine) /100 * i));
         heroin= Integer.toString(Integer.parseInt(heroin) - (Integer.parseInt(heroin) /100 * i));
         amphetamine= Integer.toString(Integer.parseInt(amphetamine) - (Integer.parseInt(amphetamine) /100 * i));
         acid= Integer.toString(Integer.parseInt(acid) - (Integer.parseInt(acid) /100 * i));
         angeldust= Integer.toString(Integer.parseInt(angeldust) - (Integer.parseInt(angeldust) /100 * i));
         meth= Integer.toString(Integer.parseInt(meth) - (Integer.parseInt(meth) /100 * i));
         
     }

    /**
     *The isNegative method checks the players current money balance (currentBalance) and returns
     * a boolean based on wether the currentBlanec is below or above 0.
     * @return a Boolean
     */
    public boolean isNegative() {
        if (currentBalance < 0) {
            JOptionPane.showMessageDialog(null, "You cannot make this purchase!\n\n "
                    + "The amount you're trying to buy is higher than you "
                    + "current balance, please try again!");
            return false;
        }
        return true;
    }
       
    /**
     **!Method is not in use!*
     * The refreshInventory method refreshes the inventory 
     * @param index jList as input
     */
    public void refreshInventory(JList index) {
        DefaultListModel model = new DefaultListModel();
        for (int i = 0; i < items.size(); i++) {
            model.addElement(items.get(i));
        }

        index.setModel(model);
    }
        
    /**
     *The refreshJCombo method refreshes the players comboBox to show the items that have 
     * been bought from dealers, and makes them available for selection by the player.
     * @param temp JComboBox as inout
     */
    public void refreshJCombo(JComboBox temp) {
        for (int i = 0; i < items.size(); i += 2) {
            temp.addItem(items.get(i));
        }
    }
        
    /**
     *Sets the drugs prices
     * @param drug String as input
     */
    public void checkDrug(String drug) {
        if (drug.equalsIgnoreCase("Cocaine")) {
            itemPrice = Integer.parseInt(cocaine);
        } else if (drug.equalsIgnoreCase("Heroin")) {
            itemPrice = Integer.parseInt(heroin);
        } else if (drug.equalsIgnoreCase("Amphetamine")) {
            itemPrice = Integer.parseInt(amphetamine);
        } else if (drug.equalsIgnoreCase("Acid")) {
            itemPrice = Integer.parseInt(acid);
        } else if (drug.equalsIgnoreCase("Angel Dust")) {
            itemPrice = Integer.parseInt(angeldust);
        } else if (drug.equalsIgnoreCase("Crystal Meth")) {
            itemPrice = Integer.parseInt(meth);
        }
    }
            
    /**
     *Gets the players current health.
     * @return Health
     */
    public String getHealth() {
        return Health;
    }

    /**
     *Sets the players health
     * @param Health String as input
     */
    public void setHealth(String Health) {
        this.Health = Health;
    }

    /**
     *Gets the cocaine
     * @return cocaine
     */
    public String getCocaine() {
        return cocaine;
    }

    /**
     *Sets cocaine
     * @param cocaine String as input
     */
    public void setCocaine(String cocaine) {
        this.cocaine = cocaine;
    }

    /**
     * Gets Heroin
     * @return heroin
     */
    public String getHeroin() {
        return heroin;
    }

    /**
     *Sets heroin
     * @param heroin String as input
     */
    public void setHeroin(String heroin) {
        this.heroin = heroin;
    }

    /**
     *Gets Amphetamine.
     * @return amphetamine
     */
    public String getAmphetamine() {
        return amphetamine;
    }

    /**
     *Sets Amphetamine.
     * @param amphetamine String as input
     */
    public void setAmphetamine(String amphetamine) {
        this.amphetamine = amphetamine;
    }

    /**
     *Gets Acid
     * @return acid
     */
    public String getAcid() {
        return acid;
    }

    /**
     *Sets Acid
     * @param acid String as input
     */
    public void setAcid(String acid) {
        this.acid = acid;
    }

    /**
     *Gets Angel Dust
     * @return angeldust
     */
    public String getAngeldust() {
        return angeldust;
    }

    /**
     *Sets Angel Dust
     * @param angeldust String as input
     */
    public void setAngeldust(String angeldust) {
        this.angeldust = angeldust;
    }

    /**
     *Gets Meth
     * @return meth
     */
    public String getMeth() {
        return meth;
    }

    /**
     *Sets Meth
     * @param meth String as input
     */
    public void setMeth(String meth) {
        this.meth = meth;
    }

    /**
     *Gets the amount (weight) of cocaine available at the dealer.
     * @return cocaineWeight
     */
    public String getCocaineWeight() {
        return cocaineWeight;
    }

    /**
     *Sets the amount (weight) of cocaine available at the dealer.
     * @param cocaineWeight String as input
     */
    public void setCocaineWeight(String cocaineWeight) {
        this.cocaineWeight = cocaineWeight;
    }

    /**
     *Gets the amount (weight) of Heroin available at the dealer.
     * @return heroinWeight
     */
    public String getHeroinWeight() {
        return heroinWeight;
    }

    /**
     *Sets the amount (weight) of heroin available at the dealer.
     * @param heroinWeight String as input
     */
    public void setHeroinWeight(String heroinWeight) {
        this.heroinWeight = heroinWeight;
    }

    /**
     *Gets the amount (weight) of Amph(etamine) available at the dealer.
     * @return ampWight
     */
    public String getAmphWeight() {
        return amphWeight;
    }

    /**
     *Sets the amount (weight) of Amph(etamine) available at the dealer.
     * @param amphWeight
     */
    public void setAmphWeight(String amphWeight) {
        this.amphWeight = amphWeight;
    }

    /**
     *Gets the amount (weight) of Acid available at the dealer.
     * @return
     */
    public String getAcidWeight() {
        return acidWeight;
    }

    /**
     *Sets the amount (weight) of acid available at the dealer.
     * @param acidWeight String as input
     */
    public void setAcidWeight(String acidWeight) {
        this.acidWeight = acidWeight;
    }

    /**
     *Gets the amount (weight) of angeldust available at the dealer.
     * @return angeldustWeight
     */
    public String getAngeldustWeight() {
        return angeldustWeight;
    }

    /**
     *Sets the amount (weight) of angeldust available at the dealer.
     * @param angeldustWeight String as input
     */
    public void setAngeldustWeight(String angeldustWeight) {
        this.angeldustWeight = angeldustWeight;
    }

    /**
     *Gets the amount (weight) of meth available at the dealer.
     * @return methWeight
     */
    public String getMethWeight() {
        return methWeight;
    }

    /**
     *Sets the amount (weight) of meth available at the dealer.
     * @param methWeight String as input
     */
    public void setMethWeight(String methWeight) {
        this.methWeight = methWeight;
    }

    /**
     *Gets the CountrySelected for when travelling
     * @return countrySelected
     */
    public String getCountrySelected() {
        return countrySelected;
    }

    /**
     *Sets the CountrySelected for when travelling
     * @param countrySelected String as input
     */
    public void setCountrySelected(String countrySelected) {
        this.countrySelected = countrySelected;
    }

    /**
     *Gets the players current balance, for which to purchase drugs with.
     * @return currentBalance
     */
    public int getCurrentBalance() {
        return currentBalance;
    }

    /**
     *Sets the players current balance, for which to purchase drugs with.
     * @param currentBalance int as input
     */
    public void setCurrentBalance(int currentBalance) {
        this.currentBalance = currentBalance;
    }

    /**
     *Gets the currently selected item.
     * @return item
     */
    public String getItem() {
        return item;
    }

    /**
     *Sets the currently selected item
     * @param item String as input
     */
    public void setItem(String item) {
        this.item = item;
    }

    /**
     *Gets the items current price
     * @return itemPrice
     */
    public int getItemPrice() {
        return itemPrice;
    }

    /**
     *Sets the items price
     * @param itemPrice int as input
     */
    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    /**
     *Gets the current turn number of the game.
     * @return turns
     */
    public int getTurns() {
        return turns;
    }

    /**
     *Sets the current turn number of the game.
     * @param turns int as input
     */
    public void setTurns(int turns) {
        this.turns = turns;
    }

    /**
     *Gets the country the player wants to travel to.
     * @return countryTravel
     */
    public String getCountryTravel() {
        return countryTravel;
    }

    /**
     *Sets the country the player wants to travel to.
     * @param countryTravel String as input
     */
    public void setCountryTravel(String countryTravel) {
        this.countryTravel = countryTravel;
    }

    /**
     **Method not in use*
     * @return customsCaught
     */
    public int getCustomsCaugt() {
        return customsCaugt;
    }

    /**
     **Method not in use*
     * @param customsCaugt int as input
     */
    public void setCustomsCaugt(int customsCaugt) {
        this.customsCaugt = customsCaugt;
    }

    /**
     *Checks wether or not the player has any active and avaiable agents.
     * @return agents
     */
    public boolean isAgents() {
        return agents;
    }

    /**
     *Sets the agents boolean
     * @param agents boolean as input
     */
    public void setAgents(boolean agents) {
        this.agents = agents;
    }

    /**
     *Gets the players current amount of cocaine
     * @return cocaineB
     */
    public String getCocaineB() {
        return cocaineB;
    }

    /**
     *Sets the players amount of cocaine
     * @param cocaineB String as input
     */
    public void setCocaineB(String cocaineB) {
        this.cocaineB = cocaineB;
    }

    /**
     *Gets the players amount of Heroin
     * @return heroinB
     */
    public String getHeroinB() {
        return heroinB;
    }

    /**
     *Sets the players amount of heroin
     * @param heroinB String as input
     */
    public void setHeroinB(String heroinB) {
        this.heroinB = heroinB;
    }

    /**
     *Gets the players amount of Amph(etamine)
     * @return amphB
     */
    public String getAmphB() {
        return amphB;
    }

    /**
     *Sets the players amount of Amph(etamine)
     * @param amphB String as input
     */
    public void setAmphB(String amphB) {
        this.amphB = amphB;
    }

    /**
     *Gets the players amount of Acid
     * @return acidB
     */
    public String getAcidB() {
        return acidB;
    }

    /**
     *Sets the players amount of Acid
     * @param acidB String as input
     */
    public void setAcidB(String acidB) {
        this.acidB = acidB;
    }

    /**
     *Gets the players amount of Angel(dust)
     * @return angelB
     */
    public String getAngelB() {
        return angelB;
    }

    /**
     *Sets the players amount of Angel(dust)
     * @param angelB String as input
     */
    public void setAngelB(String angelB) {
        this.angelB = angelB;
    }

    /**
     *Gets the players amount of Meth
     * @return methB
     */
    public String getMethB() {
        return methB;
    }

    /**
     *Sets the players amount of Acid
     * @param methB String as input
     */
    public void setMethB(String methB) {
        this.methB = methB;
    }

    /**
     *Gets the player
     * @return player
     */
    public String getPlayer() {
        return player;
    }

    /**
     *Sets the player
     * @param player String as input
     */
    public void setPlayer(String player) {
        this.player = player;
    }

    /**
     *Gets the final highscore of the player
     * @return highscore
     */
    public int getHighScore() {
        return highScore;
    }

    /**
     *Sets the final highscore of the player
     * @param highScore int as input
     */
    public void setHighScore(int highScore) {
        this.highScore = highScore;
    }

  
    

}
