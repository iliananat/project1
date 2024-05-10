import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ChestOpen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ChestOpen extends Actor
{
    /**
     * Act - do whatever the ChestOpen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public ChestOpen(){
        GreenfootImage img=new GreenfootImage("open chest.png");
        img.scale(img.getWidth()/5, img.getHeight()/5);
        setImage(img);
    }
}
