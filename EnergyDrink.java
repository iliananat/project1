import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnergyDrink here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnergyDrink extends Actor
{
    /**
     * Act - do whatever the EnergyDrink wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
    }
    public EnergyDrink(){
        GreenfootImage img=new GreenfootImage("energydrink.png");
        img.scale(img.getWidth()/30, img.getHeight()/30);
        setImage(img);
    }
}
