package mastermind.view;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 * Entry point for application MasterMind
 * @author vanrooijen
 */
public class MasterMind extends JFrame {

    public static ArrayList<Color> availableColors = new ArrayList<>();
    public static int numberOfColors;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        setAvailableColors();
        
        JFrame mmFrame = new MasterMind();
        mmFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mmFrame.setContentPane(new PanelMain());
        mmFrame.setBounds(300, 100, 400, 600);
        mmFrame.setVisible(true);
    }
    
    private static void setAvailableColors() {
        availableColors.add(Color.PINK);
        availableColors.add(Color.BLUE);
        availableColors.add(Color.GREEN);
        availableColors.add(Color.RED);
        availableColors.add(Color.WHITE);
        availableColors.add(Color.BLACK);
        
        numberOfColors = availableColors.size();
    }
}