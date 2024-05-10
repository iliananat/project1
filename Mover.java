import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mover extends Actor
{
    GifImage gifImage=new GifImage("mario_walking.gif");
    private int speed = 5;
    public Mover()
    {
    }
    public Mover(int mySpeed)
    {
        speed = mySpeed;
    }
 
    public void move() 
    {
        
    }  
    
    public int increaseSpeed(){
        return 8;
    }
}
