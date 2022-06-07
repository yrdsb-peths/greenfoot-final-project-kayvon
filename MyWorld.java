import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1400, 650, 1); 

        Baby jim = new Baby();
        addObject(jim, 500, 100);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        ground ground = new ground();
        addObject(ground,400,724);
        ground.setLocation(604,725);
        ground ground2 = new ground();
        addObject(ground2,604,725);
        ground.setLocation(182,727);
        ground2.setLocation(70,709);
        ground2.setLocation(63,711);
        ground2.setLocation(82,711);
        ground.setLocation(996,571);
        ground.setLocation(361,579);
        ground.setLocation(528,653);
        ground.setLocation(533,591);
        ground.setLocation(1101,636);
        ground2.setLocation(405,575);
        ground2.setLocation(590,612);
        ground2.setLocation(650,592);
        ground2.setLocation(564,580);
        removeObject(ground2);
        removeObject(ground);
        ground ground3 = new ground();
        addObject(ground3,632,623);
        ground3.setLocation(599,624);
        removeObject(ground3);
        ground ground4 = new ground();
        addObject(ground4,692,575);
        ground4.setLocation(1173,563);
        ground4.setLocation(548,547);
        ground4.setLocation(945,462);
        ground4.setLocation(711,578);
    }
}
