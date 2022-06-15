import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class youWinScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class youWinScreen extends World
{

    /**
     * Constructor for objects of class youWinScreen.
     * 
     */
    public youWinScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("W"))
        {
            MyWorld world = new MyWorld();
            Greenfoot.setWorld(world);
        }
    }
}
