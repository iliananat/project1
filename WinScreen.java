import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WinScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WinScreen extends World
{
    GifImage gifImage=new GifImage("winner.gif");
    int coins;
    /**
     * Constructor for objects of class WinScreen.
     * 
     */
    public WinScreen(int c)
    {   
        super(769, 576, 1); 
        coins=c;
        Greenfoot.playSound("world_clear.wav");
    }
    public void prepare(){
        
    }
    public void act(){
       GreenfootImage img=new GreenfootImage(gifImage.getCurrentImage());
       setBackground(img);
       getBackground().drawImage(new GreenfootImage("SCORE: "+coins, 76, null, null),210, 360);
    }
}
