import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2_temp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends World
{
    public static int coins;
    public static boolean key;
    private boolean flag=true;
    public static int timer;
    /**
     * Constructor for objects of class Level2_temp.
     * 
     */
    public Level2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Greenfoot.delay(250);
        Player.level=2;
        key=false;
        timer=1600;
        Cloud cloud = new Cloud();
        addObject(cloud,964,110);
        Cloud cloud2 = new Cloud();
        addObject(cloud2,264,288);
        Cloud cloud3 = new Cloud();
        addObject(cloud3,439,66);
        Cloud cloud4 = new Cloud();
        addObject(cloud4,687,238);
        Cloud cloud5 = new Cloud();
        addObject(cloud5,970,494);
        Cloud cloud6 = new Cloud();
        addObject(cloud6,17,481);
        Cloud cloud7 = new Cloud();
        addObject(cloud7,501,492);

        Spike spike = new Spike();
        addObject(spike,60,592);
        Spike spike2 = new Spike();
        addObject(spike2,185,592);
        Spike spike3 = new Spike();
        addObject(spike3,310,592);
        Spike spike4 = new Spike();
        addObject(spike4,435,592);
        Spike spike5 = new Spike();
        addObject(spike5,560,592);
        Spike spike6 = new Spike();
        addObject(spike6,685,592);
        Spike spike7 = new Spike();
        addObject(spike7,810,592);
        Spike spike8 = new Spike();
        addObject(spike8,935,592);
        Spike spike9 = new Spike();
        addObject(spike9,1060,592);

        Player player = new Player();
        player.level=2;
        player.life=3;
        addObject(player,80,300);
        Ground ground = new Ground();
        addObject(ground,62,511);
        Ground ground2 = new Ground();
        addObject(ground2,171,486);
        Ground ground3 = new Ground();
        addObject(ground3,280,463);
        Ground ground4 = new Ground();
        addObject(ground4,382,440);
        Ground ground5 = new Ground();
        addObject(ground5,482,390);
        Ground ground6 = new Ground();
        addObject(ground6,381,290);
        Ground ground7 = new Ground();
        addObject(ground7,498,190);
        Ground ground8 = new Ground();
        addObject(ground8,687,195);
        Ground ground9 = new Ground();
        addObject(ground9,867,200);
        Ground ground10 = new Ground();
        addObject(ground10,260,179);
        Ground ground11 = new Ground();
        addObject(ground11,140,178);
        Ground ground12 = new Ground();
        addObject(ground12,617,417);
        Ground ground13 = new Ground();
        addObject(ground13,749,420);
        Ground ground14 = new Ground();
        addObject(ground14,873,421);
        Ground ground15 = new Ground();
        addObject(ground15,1005,422);
        ground.setLocation(64,517);

        Chest chest = new Chest();
        addObject(chest,142,155);
        Door door = new Door();
        addObject(door,867,153);
        ground2.setLocation(185,529);
        ground3.setLocation(274,522);
        ground4.setLocation(381,512);
        removeObject(ground2);
        removeObject(ground3);
        removeObject(ground4);
        Ground ground16 = new Ground();
        addObject(ground16,523,519);
        Ground ground17 = new Ground();
        addObject(ground17,636,520);
        removeObject(ground17);
        removeObject(ground16);
        removeObject(ground4);
        removeObject(ground3);
        Ground ground18 = new Ground();
        addObject(ground18,194,518);
        Ground ground19 = new Ground();
        addObject(ground19,328,518);
        Ground ground20 = new Ground();
        addObject(ground20,459,518);
        Ground ground21 = new Ground();
        addObject(ground21,584,519);
        Ground ground22 = new Ground();
        addObject(ground22,706,520);
        removeObject(ground14);
        removeObject(ground12);
        ground15.setLocation(955,481);
        removeObject(ground13);
        removeObject(ground15);
        addObject(ground13,819,473);
        ground13.setLocation(832,520);
        ground15.setLocation(951,485);
        DoorKey doorKey = new DoorKey();
        addObject(doorKey,707,469);
        Ground ground23 = new Ground();
        addObject(ground23,958,520);

        Coin coin = new Coin();
        addObject(coin,189,457);
        Coin coin2 = new Coin();
        addObject(coin2,326,452);
        Coin coin3 = new Coin();
        addObject(coin3,455,460);
        Coin coin4 = new Coin();
        addObject(coin4,581,460);
        cloud5.setLocation(827,454);
        Coin coin5 = new Coin();
        addObject(coin5,827,454);
        doorKey.setLocation(705,453);
        cloud4.setLocation(719,340);
        cloud5.setLocation(957,451);
        EnergyDrink energyDrink = new EnergyDrink();
        addObject(energyDrink,957,451);
        Coin coin6 = new Coin();
        addObject(coin6,479,330);
        cloud2.setLocation(379,232);
        cloud2.setLocation(379,229);
        Coin coin7 = new Coin();
        addObject(coin7,379,229);
        Coin coin8 = new Coin();
        addObject(coin8,262,114);
        cloud3.setLocation(496,124);
        Coin coin9 = new Coin();
        addObject(coin9,496,124);
        Coin coin10 = new Coin();
        addObject(coin10,685,122);
    }

    public void act(){
       if(flag){
           flag=false;
           Greenfoot.delay(50);
       }
       showText("Score: "+Player.numberOfCoins, 600, 25);
       showText("Remaining Time: "+timer/100, 350, 25);
       timer--;
       if(timer<=0){
           Greenfoot.playSound("time's up.wav");
           Monster monster = new Monster();
           addObject(monster,194,460);
           Greenfoot.delay(200);
           Greenfoot.setWorld(new GameOverScreen(Player.numberOfCoins));
       }
       decreaseLife();
    }
    public void resetLife()
    {
        removeObjects(getObjects(Heart.class)); 
        Heart heart1 = new Heart();
        addObject(heart1, 50,25);
        Heart heart2 = new Heart();
        addObject(heart2, 100,25);
        Heart heart3 = new Heart();
        addObject(heart3, 150,25);
    }
    public void decreaseLife(){
        if(Player.life==3){
            resetLife();
        }
        if(Player.life==2){
            removeObjects(getObjects(Heart.class)); 
            Heart heart1 = new Heart();
            addObject(heart1, 50,25);
            Heart heart2 = new Heart();
            addObject(heart2, 100,25);
            Heart heart3 = new Heart();
            addObject(heart3, 150,25);
            GreenfootImage img = new GreenfootImage("heartEmpty.png");
            heart3.setImage(img);
        }
        if(Player.life==1){
            removeObjects(getObjects(Heart.class)); 
            Heart heart1 = new Heart();
            addObject(heart1, 50,25);
            Heart heart2 = new Heart();
            addObject(heart2, 100,25);
            Heart heart3 = new Heart();
            addObject(heart3, 150,25);
            GreenfootImage img = new GreenfootImage("heartEmpty.png");
            heart2.setImage(img);
            heart3.setImage(img);
        }
        if(Player.life==0){
            removeObjects(getObjects(Heart.class)); 
            Heart heart1 = new Heart();
            addObject(heart1, 50,25);
            Heart heart2 = new Heart();
            addObject(heart2, 100,25);
            Heart heart3 = new Heart();
            addObject(heart3, 150,25);
            GreenfootImage img = new GreenfootImage("heartEmpty.png");
            heart1.setImage(img);
            heart2.setImage(img);
            heart3.setImage(img);
            removeObjects(getObjects(Player.class));
            Greenfoot.delay(50);
            Greenfoot.setWorld(new GameOverScreen(Player.numberOfCoins));
        }
    }
}
