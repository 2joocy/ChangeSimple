/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handlers;

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

    public ArrayList<String> items = new ArrayList<String>();
    private String Health;
    private String item;
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

    
   
    

    @Override
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
    

    public boolean getCaugt(int i) {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(100);
        if (randomInt > i) {
            return false;
        }
        return true;
    }
    
    public boolean upOrDown(){
          Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(100);
        if (randomInt >= 50) {
            return false;
        } 
        return true;
    }
    
     public int priceChange(){
          Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(84)+1;
        return randomInt;
    }
     
     public void newPriceUp(){
         int i = this.priceChange();
         cocaine= Integer.toString(Integer.parseInt(cocaine) + (Integer.parseInt(cocaine) /100 * i));
         heroin= Integer.toString(Integer.parseInt(heroin) + (Integer.parseInt(heroin) /100 * i));
         amphetamine= Integer.toString(Integer.parseInt(amphetamine) + (Integer.parseInt(amphetamine) /100 * i));
         acid= Integer.toString(Integer.parseInt(acid) + (Integer.parseInt(acid) /100 * i));
         angeldust= Integer.toString(Integer.parseInt(angeldust) + (Integer.parseInt(angeldust) /100 * i));
         meth= Integer.toString(Integer.parseInt(meth) + (Integer.parseInt(meth) /100 * i));
         
     }
     
     public void newPriceDown(){
         int i = this.priceChange();
         cocaine= Integer.toString(Integer.parseInt(cocaine) - (Integer.parseInt(cocaine) /100 * i));
         heroin= Integer.toString(Integer.parseInt(heroin) - (Integer.parseInt(heroin) /100 * i));
         amphetamine= Integer.toString(Integer.parseInt(amphetamine) - (Integer.parseInt(amphetamine) /100 * i));
         acid= Integer.toString(Integer.parseInt(acid) - (Integer.parseInt(acid) /100 * i));
         angeldust= Integer.toString(Integer.parseInt(angeldust) - (Integer.parseInt(angeldust) /100 * i));
         meth= Integer.toString(Integer.parseInt(meth) - (Integer.parseInt(meth) /100 * i));
         
     }

    public boolean isNegative() {
        if (currentBalance < 0) {
            JOptionPane.showMessageDialog(null, "You cannot make this purchase!\n\n "
                    + "The amount you're trying to buy is higher than you "
                    + "current balance, please try again!");
            return false;
        }
        return true;
    }

    public void refreshInventory(JList index) {
        DefaultListModel model = new DefaultListModel();
        for (int i = 0; i < items.size(); i++) {
            model.addElement(items.get(i));
        }

        index.setModel(model);
    }

    public void refreshJCombo(JComboBox temp) {
        for (int i = 0; i < items.size(); i += 2) {
            temp.addItem(items.get(i));
        }
    }

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

    public String getHealth() {
        return Health;
    }

    public void setHealth(String Health) {
        this.Health = Health;
    }

    public String getCocaine() {
        return cocaine;
    }

    public void setCocaine(String cocaine) {
        this.cocaine = cocaine;
    }

    public String getHeroin() {
        return heroin;
    }

    public void setHeroin(String heroin) {
        this.heroin = heroin;
    }

    public String getAmphetamine() {
        return amphetamine;
    }

    public void setAmphetamine(String amphetamine) {
        this.amphetamine = amphetamine;
    }

    public String getAcid() {
        return acid;
    }

    public void setAcid(String acid) {
        this.acid = acid;
    }

    public String getAngeldust() {
        return angeldust;
    }

    public void setAngeldust(String angeldust) {
        this.angeldust = angeldust;
    }

    public String getMeth() {
        return meth;
    }

    public void setMeth(String meth) {
        this.meth = meth;
    }

    public String getCocaineWeight() {
        return cocaineWeight;
    }

    public void setCocaineWeight(String cocaineWeight) {
        this.cocaineWeight = cocaineWeight;
    }

    public String getHeroinWeight() {
        return heroinWeight;
    }

    public void setHeroinWeight(String heroinWeight) {
        this.heroinWeight = heroinWeight;
    }

    public String getAmphWeight() {
        return amphWeight;
    }

    public void setAmphWeight(String amphWeight) {
        this.amphWeight = amphWeight;
    }

    public String getAcidWeight() {
        return acidWeight;
    }

    public void setAcidWeight(String acidWeight) {
        this.acidWeight = acidWeight;
    }

    public String getAngeldustWeight() {
        return angeldustWeight;
    }

    public void setAngeldustWeight(String angeldustWeight) {
        this.angeldustWeight = angeldustWeight;
    }

    public String getMethWeight() {
        return methWeight;
    }

    public void setMethWeight(String methWeight) {
        this.methWeight = methWeight;
    }

    public String getCountrySelected() {
        return countrySelected;
    }

    public void setCountrySelected(String countrySelected) {
        this.countrySelected = countrySelected;
    }

    public int getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(int currentBalance) {
        this.currentBalance = currentBalance;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getTurns() {
        return turns;
    }

    public void setTurns(int turns) {
        this.turns = turns;
    }

    public String getCountryTravel() {
        return countryTravel;
    }

    public void setCountryTravel(String countryTravel) {
        this.countryTravel = countryTravel;
    }

    public int getCustomsCaugt() {
        return customsCaugt;
    }

    public void setCustomsCaugt(int customsCaugt) {
        this.customsCaugt = customsCaugt;
    }

    public boolean isAgents() {
        return agents;
    }

    public void setAgents(boolean agents) {
        this.agents = agents;
    }
    public String getCocaineB() {
        return cocaineB;
    }

    public void setCocaineB(String cocaineB) {
        this.cocaineB = cocaineB;
    }

    public String getHeroinB() {
        return heroinB;
    }

    public void setHeroinB(String heroinB) {
        this.heroinB = heroinB;
    }

    public String getAmphB() {
        return amphB;
    }

    public void setAmphB(String amphB) {
        this.amphB = amphB;
    }

    public String getAcidB() {
        return acidB;
    }

    public void setAcidB(String acidB) {
        this.acidB = acidB;
    }

    public String getAngelB() {
        return angelB;
    }

    public void setAngelB(String angelB) {
        this.angelB = angelB;
    }

    public String getMethB() {
        return methB;
    }

    public void setMethB(String methB) {
        this.methB = methB;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }
    
    
}
