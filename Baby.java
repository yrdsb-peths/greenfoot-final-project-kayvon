import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Baby here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Baby extends Actor
{
    /**
     * Act - do whatever the Baby wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("d"))
        {
            setRotation(0);
            move(2);
        }
        if(Greenfoot.isKeyDown("a"))
        {
            setRotation(0);
            move(-2);
        }
        if(Greenfoot.isKeyDown("w"))
        {
            setRotation(270);
            move(2);
        }
        if(Greenfoot.isKeyDown("s"))
        {
            setRotation(90);
            move(2);
        }
    }
}
