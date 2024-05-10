import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Door here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Door extends Actor
{
    Level1 game1;
    Level2 game2;
    Player player;
    /**
     * Act - do whatever the Door wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        openDoor();
    }
    public Door(){
        GreenfootImage img=new GreenfootImage("door.png");
        img.scale(img.getWidth()/20, img.getHeight()/20);
        setImage(img);
    }
    public void openDoor(){
        if(Player.doorKey){
            GreenfootImage img=new GreenfootImage("door open.png");
            img.scale(img.getWidth()/5, img.getHeight()/5);
            setImage(img);
        }
    }
}
