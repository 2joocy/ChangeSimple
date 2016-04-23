/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handlers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;
import javax.swing.*;


/**
 *
 * @author William
 */
public class ChangeHandler implements ChangeIF {

    private String Health;
    private String currentBalance;
    private String countrySelected;
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

//                   System.out.println(cocaine);
//                   System.out.println(heroin);
//                   System.out.println(amphetamine);
//                   System.out.println(acid);
//                   System.out.println(angeldust);
//                   System.out.println(meth);
            }

            bufferReader.close();
        } catch (Exception e) {
            System.out.println("Fejl ved linje:" + e.getMessage());
        }

    }
    @Override
    public int getCaugt(int i){
    Random randomGenerator = new Random();
    int randomInt = randomGenerator.nextInt(i);
    return randomInt;
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
    
    public String getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(String currentBalance) {
        this.currentBalance = currentBalance;
    }

}
