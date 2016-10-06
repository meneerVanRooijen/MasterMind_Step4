package mastermind.view;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 * Panel holding the multiple panelCombination's
 * @author vanrooijen
 */
public class PanelCombinations extends JPanel {    

    private final ArrayList<PanelCombination> combinations = new ArrayList<>();
    private final int numberOfCombinations = 8;
    private int combinationUnLocked = 0;
    
    public PanelCombinations() {
        initPanelCombinations();
        addPanels();
    }
    
    private void initPanelCombinations() {
        setLayout(null);
        setBounds(20, 100, 250, 350);
        setBackground(Color.WHITE);
    }
    
    private void addPanels() {
        // First panel is at bottom, where we start guessing
        int y = 300;
        
        for(int i=0; i < numberOfCombinations; i++) {
            PanelCombination newCombination = new PanelCombination();
            newCombination.setBounds(20, y, 150, 30);
            combinations.add(newCombination);
            
            add(newCombination);
            
            // Substract for placing next panel
            y -= 30;
        }
        
        combinations.get(combinationUnLocked).setCombinationLocked(false);
    }

    public void unlockNextCombination() {
        combinations.get(combinationUnLocked).setCombinationLocked(true);
        if(combinationUnLocked <= (numberOfCombinations - 2) ) {
            combinations.get(++combinationUnLocked).setCombinationLocked(false);
        }
    }
      
    public PanelCombination getUnLockedCombination() {
        return combinations.get(combinationUnLocked);
    }
}