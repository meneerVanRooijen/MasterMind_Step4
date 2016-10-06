package mastermind.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import mastermind.model.GameRules;

/**
 * Panel containing game control buttons
 * @author vanrooijen
 */
public class PanelButtons extends JPanel {

    private PanelCombinations panelCombinations = new PanelCombinations();
    
    public PanelButtons(PanelCombinations combinations) {
        panelCombinations = combinations;
        initPanelButtons();
    }

    private void initPanelButtons() {
        setBounds(40, 460, 150, 70);
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
        setBackground(Color.CYAN);
        
        JButton buttonNewGame = new JButton("Nieuw");
        JButton buttonCheckCode = new JButton("Speel");
        
        buttonCheckCode.addActionListener(new ButtonCheckCodeHandler());
        
        // Not setting layoutmanger to null, default flow layout is used
        add(buttonCheckCode);
        add(buttonNewGame);
    }
    
    class ButtonCheckCodeHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // 1. Check if user select 4 colors
            // 2. Check rules if combination is correct
                
            
            // 3. If combination is correct then show messag correct
                // 3a. Game ends.
            // 4. If combination is not correct then display pens
                // 4a. lock current row and unlock next row
                
            // Step 1 i am going to skip for now.
            
            // Step 2 Check rules
            if(GameRules.checkCode(panelCombinations.getUnLockedCombination())) {
                // Game ends
                JOptionPane.showMessageDialog(null, "You cracked the code!");
            }
            else {
                // Wrong combination
                panelCombinations.unlockNextCombination();
            }
        }
    }
}