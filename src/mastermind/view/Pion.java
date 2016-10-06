package mastermind.view;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Draw a pion on the surface
 * @author vanrooijen
 */
public class Pion {
    final int pinRadius = 15;
    
    private Color pionColor = Color.LIGHT_GRAY;
    private int currentColor = 0;
    
    private int positionX;
    private int positionY;
 
    public void drawPion( Graphics g, int posX, int posY ) {
        positionX = posX;
        positionY = posY;
        
        g.setColor(getPionColor());
        g.fillOval(posX, posY, pinRadius, pinRadius);
        g.setColor(Color.BLACK);
        g.drawOval(posX, posY, pinRadius, pinRadius);
    }

    /**
     * @return the pionColor
     */
    public Color getPionColor() {
        return pionColor;
    }

    /**
     * Set the pionColor
     */
    public void setPionColor() {
        if(currentColor >= MasterMind.numberOfColors) {
            currentColor = 0;
        }
        pionColor = MasterMind.availableColors.get(currentColor++);
    }  
    
    public boolean collision(int x, int y) {
        // Testing if (mouse)position x, y is hitting the pion
        if ((x >= positionX) && (x <= positionX + pinRadius) 
                && (y >= positionY) && (y <= positionY + pinRadius)) {
            return true;
        } else {
            return false;
        }
    }
}
