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

    public ArrayList<String> items = new ArrayList<String>();
    
    @Override
    public void addGameToCombo(JComboBox temp) {
        data.addGameToCombo(temp);

    }

    @Override
    public void setList(String Country) {

     data.setList(Country);

    }
    

    @Override
    public boolean getCaugt(int i) {
      return data.getCaugt(i);
    }
    
    @Override
    public boolean priceUpOrDown(){
        return data.priceUpOrDown();
    }
    
    @Override
     public int priceChange(){
          return data.priceChange();
    }
     
    @Override
     public void newPriceUp(){
     data.newPriceUp();
     }
     
    @Override
     public void newPriceDown(){
       data.newPriceDown();
     }

    @Override
    public boolean isNegative() {
       return data.isNegative();
    }

    @Override
    public void refreshInventory(JList index) {
        data.refreshInventory(index);
    }

    @Override
    public void refreshJCombo(JComboBox temp) {
        data.refreshJCombo(temp);
    }

    @Override
    public void checkDrug(String drug) {
       data.checkDrug(drug);
    }

    public String getHealth() {
        return data.getHealth();
    }

    public void setHealth(String Health) {
        data.setHealth(Health);
    }

    public String getCocaine() {
        return data.getCocaine();
    }

    public void setCocaine(String cocaine) {
        data.setCocaine(cocaine);
    }

    public String getHeroin() {
        return data.getHeroin();
    }

    public void setHeroin(String heroin) {
        data.setHeroin(heroin);
    }

    public String getAmphetamine() {
        return data.getAmphetamine();
    }

    public void setAmphetamine(String amphetamine) {
        data.setAmphetamine(amphetamine);
    }

    public String getAcid() {
        return data.getAcid();
    }

    public void setAcid(String acid) {
        data.setAcid(acid);
    }

    public String getAngeldust() {
        return data.getAngeldust();
    }

    public void setAngeldust(String angeldust) {
        data.setAngeldust(angeldust);
    }

    public String getMeth() {
        return data.getMeth();
    }

    public void setMeth(String meth) {
        data.setMeth(meth);
    }

    public String getCocaineWeight() {
        return data.getCocaineWeight();
    }

    public void setCocaineWeight(String cocaineWeight) {
        data.setCocaineWeight(cocaineWeight);
    }

    public String getHeroinWeight() {
        return data.getHeroinWeight();
    }

    public void setHeroinWeight(String heroinWeight) {
        data.setHeroinWeight(heroinWeight);
    }

    public String getAmphWeight() {
        return data.getAmphWeight();
    }

    public void setAmphWeight(String amphWeight) {
        data.setAmphWeight(amphWeight);
    }

    public String getAcidWeight() {
        return data.getAcidWeight();
    }

    public void setAcidWeight(String acidWeight) {
        data.setAcidWeight(acidWeight);
    }

    public String getAngeldustWeight() {
        return data.getAngeldustWeight();
    }

    public void setAngeldustWeight(String angeldustWeight) {
        data.setAngeldustWeight(angeldustWeight);
    }

    public String getMethWeight() {
        return data.getMethWeight();
    }

    public void setMethWeight(String methWeight) {
        data.setMethWeight(methWeight);
    }

    public String getCountrySelected() {
        return data.getCountrySelected();
    }

    public void setCountrySelected(String countrySelected) {
        data.setCountrySelected(countrySelected);
    }

    public int getCurrentBalance() {
        return data.getCurrentBalance();
    }

    public void setCurrentBalance(int currentBalance) {
        data.setCurrentBalance(currentBalance);
    }

    public String getItem() {
        return data.getItem();
    }

    public void setItem(String item) {
        data.setItem(item);
    }

    public int getItemPrice() {
        return data.getItemPrice();
    }

    public void setItemPrice(int itemPrice) {
        data.setItemPrice(itemPrice);
    }

    public int getTurns() {
        return data.getTurns();
    }

    public void setTurns(int turns) {
        data.setTurns(turns);
    }

    public String getCountryTravel() {
        return data.getCountryTravel();
    }

    public void setCountryTravel(String countryTravel) {
        data.setCountryTravel(countryTravel);
    }

    public int getCustomsCaugt() {
        return data.getCustomsCaugt();
    }

    public void setCustomsCaugt(int customsCaugt) {
        data.setCustomsCaugt(customsCaugt);
    }

    public boolean isAgents() {
        return data.isAgents();
    }

    public void setAgents(boolean agents) {
        data.setAgents(agents);
    }
    public String getCocaineB() {
        return data.getCocaineB();
    }

    public void setCocaineB(String cocaineB) {
        data.setCocaineB(cocaineB);
    }

    public String getHeroinB() {
        return data.getHeroinB();
    }

    public void setHeroinB(String heroinB) {
        data.setHeroinB(heroinB);
    }

    public String getAmphB() {
        return data.getAmphB();
    }

    public void setAmphB(String amphB) {
        data.setAmphB(amphB);
    }

    public String getAcidB() {
        return data.getAcidB();
    }

    public void setAcidB(String acidB) {
        data.setAcidB(acidB);
    }

    public String getAngelB() {
        return data.getAngelB();
    }

    public void setAngelB(String angelB) {
        data.setAngelB(angelB);
    }

    public String getMethB() {
        return data.getMethB();
    }

    public void setMethB(String methB) {
        data.setMethB(methB);
    }

    public String getPlayer() {
        return data.getPlayer();
    }

    public void setPlayer(String player) {
        data.setPlayer(player);
    }
    
    
    
    
}
