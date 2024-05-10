import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Chest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Chest extends Actor
{
    private boolean closed;
    Level1 game1;
    /**
     * Act - do whatever the Chest wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        chestOpen();
    }
    public Chest(){
        GreenfootImage img=new GreenfootImage("closed chest.png");
        img.scale(img.getWidth()/20, img.getHeight()/20);
        setImage(img);
        closed=true;
    }
    public void chestOpen(){
        if(isTouching(Player.class)){
            GreenfootImage img=new GreenfootImage("open chest.png");
            img.scale(img.getWidth()/5, img.getHeight()/5);
            setImage(img);
            getCoins();
            closed=false;
        }
    }
    public void getCoins(){
        if(closed){
            game1.coins=game1.coins+50;
            Greenfoot.playSound("chest open.wav");
            Player.numberOfCoins=Player.numberOfCoins+50;
        }
    }
    public boolean isClosed(){
        return closed;
    }
}
