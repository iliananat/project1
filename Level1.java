import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1_temp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends World
{
    public static int coins;
    public static boolean key;
    private boolean startdelay=true;
    public static int timer;
    /**
     * Constructor for objects of class Level1_temp.
     * 
     */
    public Level1()
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
        coins=0;
        key=false;
        timer=1000;
        Cloud cloud = new Cloud();
        addObject(cloud,115,91);
        Cloud cloud2 = new Cloud();
        addObject(cloud2,323,422);
        Cloud cloud3 = new Cloud();
        addObject(cloud3,554,269);
        Cloud cloud4 = new Cloud();
        addObject(cloud4,915,90);
        Cloud cloud5 = new Cloud();
        addObject(cloud5,842,440);
        Cloud cloud6 = new Cloud();
        addObject(cloud6,862,408);

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
        player.level=1;
        player.numberOfCoins=0;
        player.life=3;
        addObject(player,80,300);

        Ground ground = new Ground();
        addObject(ground,59,495);
        Ground ground2 = new Ground();
        addObject(ground2,152,495);
        Ground ground3 = new Ground();
        addObject(ground3,247,496);
        Ground ground4 = new Ground();
        addObject(ground4,347,473);
        Ground ground5 = new Ground();
        addObject(ground5,446,457);
        Ground ground6 = new Ground();
        addObject(ground6,540,454);
        Ground ground7 = new Ground();
        addObject(ground7,647,398);
        Ground ground8 = new Ground();
        addObject(ground8,754,343);
        Ground ground9 = new Ground();
        addObject(ground9,646,240);
        Ground ground10 = new Ground();
        addObject(ground10,507,198);
        Ground ground11 = new Ground();
        addObject(ground11,870,394);
        Ground ground12 = new Ground();
        addObject(ground12,946,490);
        Ground ground13 = new Ground();
        addObject(ground13,1036,489);
        cloud3.setLocation(506,178);
        cloud5.setLocation(841,422);
        ground9.setLocation(666,267);
        cloud3.setLocation(520,213);
        cloud3.setLocation(659,280);
        cloud3.setLocation(661,273);
        removeObject(cloud3);
        ground10.setLocation(583,211);
        ground9.setLocation(670,276);
        cloud5.setLocation(870,418);
        cloud5.setLocation(849,443);
        cloud5.setLocation(426,208);
        ground11.setLocation(860,410);

        ground11.setLocation(862,408);
        Coin coin = new Coin();
        addObject(coin,151,447);
        cloud2.setLocation(247,449);
        Coin coin2 = new Coin();
        addObject(coin2,247,449);
        cloud2.setLocation(346,419);
        Coin coin3 = new Coin();
        addObject(coin3,346,419);
        cloud2.setLocation(443,404);
        Coin coin4 = new Coin();
        addObject(coin4,443,404);
        Chest chest = new Chest();
        addObject(chest,540,433);
        Coin coin5 = new Coin();
        addObject(coin5,645,356);
        Coin coin6 = new Coin();
        addObject(coin6,665,227);
        cloud5.setLocation(579,167);
        DoorKey doorKey = new DoorKey();
        addObject(doorKey,579,167);
        EnergyDrink energyDrink = new EnergyDrink();
        addObject(energyDrink,752,303);
        cloud6.setLocation(858,367);
        Coin coin7 = new Coin();
        addObject(coin7,858,367);
        cloud6.setLocation(942,445);
        Coin coin8 = new Coin();
        addObject(coin8,942,445);
        Door door = new Door();
        addObject(door,1037,443);
        cloud5.setLocation(640,250);
        cloud2.setLocation(300,380);
        cloud2.setLocation(155,411);
        cloud2.setLocation(153,437);
    }

    public void act(){
        showText("Score: "+Player.numberOfCoins, 600, 25);
        showText("Remaining Time: "+timer/100, 350, 25);
        timer--;
        if(timer<=0){
            Greenfoot.playSound("time's up.wav");
            Monster monster = new Monster();
            addObject(monster,153,435);
            Greenfoot.delay(200);
            Greenfoot.setWorld(new GameOverScreen(Player.numberOfCoins));
        }
        decreaseLife();
        if(startdelay){
            startdelay=false;
            Greenfoot.delay(100);
        }
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
            Greenfoot.setWorld(new GameOverScreen(coins));
        }
    }
}
