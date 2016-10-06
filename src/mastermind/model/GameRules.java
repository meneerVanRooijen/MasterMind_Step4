package mastermind.model;

import java.awt.Color;
import mastermind.view.PanelCombination;

/**
 * Containing the MasterMind game rules 
 * @author vanrooijen
 */
public class GameRules {
    
    public static final boolean codeCorrect = false;
    
    private static final Color colorSecretPion1 = Color.BLUE;
    private static final Color colorSecretPion2 = Color.WHITE;
    private static final Color colorSecretPion3 = Color.GREEN;
    private static final Color colorSecretPion4 = Color.RED;
    
    public static void generateSecretCode() {
    }
    
    public static boolean checkCode(PanelCombination panelCombination) {
        
        Color colorPion1 = panelCombination.getPion1().getPionColor();
        Color colorPion2 = panelCombination.getPion1().getPionColor();
        Color colorPion3 = panelCombination.getPion1().getPionColor();        
        Color colorPion4 = panelCombination.getPion1().getPionColor();
        
        if(colorPion1 == colorSecretPion1) {
            return true;
        } 
        
        return false;
    }    
}