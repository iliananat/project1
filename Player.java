import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Mover
{
    GifImage gifImage=new GifImage("mario_walking.gif");
    Level1 game1;
    Level2 game2;
    public static int level;
    public static int numberOfCoins=0;
    public static boolean doorKey=false;
    public static int life;
    private int speed=5;
    private int vSpeed = 0;
    private int acceleration = 1;
    private int jumpHeight = -12;
    private boolean firstKey=false;
    private boolean rightdirection=true;
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void prepare(){
        level=1;
    }
    public void act()
    {
        checkKeys();
        checkFalling();
        getKey();
        drinkSoda();
        getCoin();
        loseLife();
        checkNextLevel();
    }
    public Player(){
        life=3;
        GreenfootImage img=new GreenfootImage(gifImage.getCurrentImage());
        img.scale(img.getWidth()/2,img.getHeight()/2);
        setImage(img);
    }
    private void checkKeys()
    {
        if (Greenfoot.isKeyDown("right"))
        {
            firstKey=false;
            setLocation(getX() + speed, getY());
            GreenfootImage img=new GreenfootImage(gifImage.getCurrentImage());
            img.scale(img.getWidth()/2,img.getHeight()/2);
            if(rightdirection==false){
                //turn( 180 ); 
                img.mirrorHorizontally();
            }
            setImage(img);
        }
        if (Greenfoot.isKeyDown("left"))
        {
            firstKey=false;
            setLocation(getX() - speed, getY());
            GreenfootImage img=new GreenfootImage(gifImage.getCurrentImage());
            img.scale(img.getWidth()/2,img.getHeight()/2);
            if(rightdirection){
                //turn( 180 );
                img.mirrorHorizontally();
            }
            setImage(img);
        }
        if (Greenfoot.isKeyDown("space") && (onGround() == true))
        {
            firstKey=false;
            vSpeed = jumpHeight;
            fall();
            Greenfoot.playSound("jump.wav");
        }
    }
    public void getKey(){
        Actor key=getOneIntersectingObject(DoorKey.class);
        if(key!=null){
            getWorld().removeObject(key);
            Greenfoot.playSound("door bell.wav");
            Greenfoot.delay(50);
            Greenfoot.playSound("door unlock.wav");
            Greenfoot.delay(50);
            game1.key=true;
            doorKey=true;
        }
    }
    public void drinkSoda(){
        if(isTouching(EnergyDrink.class)){
            getWorld().removeObject(getOneIntersectingObject(EnergyDrink.class));
            Greenfoot.playSound("energy drink.wav");
            jumpHeight=-20;
            speed=increaseSpeed();
        }
    }
    public void getCoin(){
        Actor coin=getOneIntersectingObject(Coin.class);
        if(coin!=null){
            getWorld().removeObject(coin);
            game1.coins=game1.coins+10;
            numberOfCoins=numberOfCoins+10;
            Greenfoot.playSound("coin.wav");
        }
    }
    public boolean touchSpike(){
        return(isTouching(Spike.class));
    }
    public void loseLife(){
        if(isTouching(Spike.class)){
            life=life-1;
            Greenfoot.playSound("death.wav");
            Greenfoot.delay(100);
            if(life>0){
                setLocation(80, 300);
            }
        }
    }
    private boolean onGround()
    {
        Actor under = getOneObjectAtOffset(0,(getImage().getHeight()/2)-5,Ground.class);
        
        return under != null;
    }
    private void checkFalling()
    {
        if (onGround() == false)
        {
            fall();
        }
    }
    private void fall()
    {
        setLocation(getX(),getY()+ vSpeed);
        vSpeed = vSpeed + acceleration;
    }
     public void checkNextLevel()
    {
        if (level==1 && isTouching(Door.class) && doorKey)
        {
            doorKey=false;
            numberOfCoins=numberOfCoins+(Level1.timer/100)*10;
            level=2;
            life=3;
            Greenfoot.playSound("stage_clear.wav");
            getWorld().removeObject(this);
            Greenfoot.setWorld(new Level2());
        }
        else if (level==2 && isTouching(Door.class) && doorKey)
        {
            doorKey=false;
            getWorld().removeObject(this);
            Greenfoot.setWorld(new WinScreen(numberOfCoins+(Level2.timer/100)*10));
        }
    }
}
