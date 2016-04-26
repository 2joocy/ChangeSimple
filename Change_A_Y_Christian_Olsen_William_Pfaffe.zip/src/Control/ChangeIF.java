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

    public void addGameToCombo(JComboBox temp);

    public boolean getCaugt(int i);

    public boolean priceUpOrDown();

    public int priceChange();

    public void setList(String Country);

    public void newPriceUp();

    public void newPriceDown();

    public boolean isNegative();

    public void refreshInventory(JList index);

    public void refreshJCombo(JComboBox temp);

    public void checkDrug(String drug);

    public String getHealth();

    public void setHealth(String Health);

}
