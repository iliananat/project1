import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOverScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOverScreen extends World
{
    private int coins;
    /**
     * Constructor for objects of class GameOverScreen.
     * 
     */
    public GameOverScreen(int c)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        coins=c;
        Greenfoot.playSound("game_over.wav");
    }
    public void act(){
        GreenfootImage bg = getBackground();
        Font font = bg.getFont();
        bg.setColor(Color.WHITE);
        bg.setFont(font.deriveFont(64));
        bg.drawString("Final score: "+coins, 100, 350);;
    }
    
}
