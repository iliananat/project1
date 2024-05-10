import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartScreen extends World
{
    GreenfootSound menu=new GreenfootSound("blue monday.wav");
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public StartScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 600, 1); 
        //GreenfootImage img=new GreenfootImage("sky.jpeg");
       //img.scale(1500, 700);
       //setBackground(img);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Player.doorKey=false;
        menu.playLoop();
        GreenfootImage bg = getBackground();
        Font font = bg.getFont();
        bg.setColor(Color.WHITE);
        bg.setFont(font.deriveFont(80));
        bg.drawString("START GAME", 270, 120);
        bg.setFont(font.deriveFont(32));
        bg.drawString("PRESS ENTER TO CONTINUE", 270, 160);
        bg.drawString("PRESS SPACEBAR TO SEE INSTRUCTIONS", 270, 200);

        Cloud cloud = new Cloud();
        addObject(cloud,1009,103);
        Cloud cloud2 = new Cloud();
        addObject(cloud2,105,65);
        Cloud cloud3 = new Cloud();
        addObject(cloud3,1000,539);
        cloud3.setLocation(848,555);
        Cloud cloud5 = new Cloud();
        addObject(cloud5,987,360);
        cloud2.setLocation(112,42);
        Cloud cloud6 = new Cloud();
        addObject(cloud6,133,404);
    }

    public void act(){
        startGame();
        showInstructions();
    }
    
    public void startGame(){
        if(Greenfoot.isKeyDown("enter")){
            menu.stop();
            Greenfoot.setWorld(new Level1());
        }
    }
    public void showInstructions(){
        if(Greenfoot.isKeyDown("space")){
            getBackground().drawImage(new GreenfootImage("You are trapped. Find the key to open the door and escape.", 36, null, null), 270, 220);
            getBackground().drawImage(new GreenfootImage("You have 3 lives and a limited amount of time to escape", 36, null, null), 270, 245);
            getBackground().drawImage(new GreenfootImage("before the monster finds you.", 36, null, null), 270, 270);
            
            getBackground().drawImage(new GreenfootImage("Use", 36, null, null), 270, 320);
            GreenfootImage leftarrow=new GreenfootImage("left arrow key.png");
            leftarrow.scale(leftarrow.getWidth()/12, leftarrow.getHeight()/12);
            getBackground().drawImage(leftarrow, 330, 320);
            
            getBackground().drawImage(new GreenfootImage("and", 36, null, null), 380, 320);
            GreenfootImage rightarrow=new GreenfootImage("right arrow key.png");
            rightarrow.scale(rightarrow.getWidth()/8, rightarrow.getHeight()/8);
            getBackground().drawImage(rightarrow, 430, 310);
            getBackground().drawImage(new GreenfootImage("arrow keys to move and", 36, null, null), 490, 320);
            
            GreenfootImage spacebar=new GreenfootImage("spacebar.png");
            spacebar.scale(spacebar.getWidth(), spacebar.getHeight()/2);
            getBackground().drawImage(spacebar, 250, 335);
            getBackground().drawImage(new GreenfootImage("to jump", 36, null, null), 445, 360);
            
            getBackground().drawImage(new GreenfootImage("Collect", 36, null, null), 270, 415);
            GreenfootImage key = new GreenfootImage("key-icon.png");
            key.scale(key.getWidth()/10, key.getHeight()/10);
            getBackground().drawImage(key, 380, 415);
            getBackground().drawImage(new GreenfootImage("to open", 36, null, null), 425, 415);
            GreenfootImage door=new GreenfootImage("door.png");
            door.scale(door.getWidth()/24, door.getHeight()/24);
            getBackground().drawImage(door, 550, 385);
            
            getBackground().drawImage(new GreenfootImage("Collect as many", 36, null, null), 270, 460);
            GreenfootImage coin=new GreenfootImage("coin1.png");
            coin.scale(coin.getWidth()/8, coin.getHeight()/8);
            getBackground().drawImage(coin, 490, 460);
            getBackground().drawImage(new GreenfootImage("and", 36, null, null), 530, 460);
            GreenfootImage chest=new GreenfootImage("closed chest.png");
            chest.scale(chest.getWidth()/20, chest.getHeight()/20);
            getBackground().drawImage(chest, 590, 450);
            getBackground().drawImage(new GreenfootImage("as you can", 36, null, null), 660, 460);
            
            getBackground().drawImage(new GreenfootImage("Avoid", 36, null, null), 270, 500);
            GreenfootImage spike=new GreenfootImage("spikes.png");
            spike.scale(spike.getWidth()/6, spike.getHeight()/6);
            getBackground().drawImage(spike, 360, 500);
            getBackground().drawImage(new GreenfootImage("at all cost", 36, null, null), 500, 500);
            
            getBackground().drawImage(new GreenfootImage("Drink", 36, null, null), 270, 540);
            GreenfootImage energyDrink=new GreenfootImage("energydrink.png");
            energyDrink.scale(energyDrink.getWidth()/30, energyDrink.getHeight()/30);
            getBackground().drawImage(energyDrink, 340, 540);
            getBackground().drawImage(new GreenfootImage("to duplicate your jump", 36, null, null), 380, 540);
        }
    }
}
