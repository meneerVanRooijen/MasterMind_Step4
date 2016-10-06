package mastermind.view;

import java.awt.Color;
import javax.swing.JPanel;

/**
 * Main panel holding the button panel and combinations panel
 * @author vanrooijen
 */
class PanelMain extends JPanel {
    
    public PanelMain() {
        initPanelMain();
        addPanels();
    }
    
    private void initPanelMain() {
        setLayout(null);
        setBackground(Color.RED);
    }
    
    private void addPanels() {
        PanelCombinations panelCombinations = new PanelCombinations();
        add(panelCombinations);
        add(new PanelButtons(panelCombinations));
    } 
}