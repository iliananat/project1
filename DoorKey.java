import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ChessKey here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DoorKey extends Actor
{
    /**
     * Act - do whatever the ChessKey wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    public DoorKey() {
        GreenfootImage img = new GreenfootImage("key-icon.png");
        img.scale(img.getWidth()/10, img.getHeight()/10);
        setImage(img); 
    }
}
