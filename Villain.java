import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Villain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Villain extends Actor
{
    /**
     * Act - do whatever the Villain wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
    }
    public void moveVillain()
    {
    	this.setLocation(getX(), getY() +3);
    }
    public void removeVillain()
    {
           if (getY() ==599)
        {
            getWorld().removeObject(this);
        }   
    }

}
