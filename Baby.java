import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Baby here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Baby extends Actor
{
    GreenfootImage idle[] = new GreenfootImage[10];
    
    public Baby()
    {
        for(int i = 0; i < 10; i++)
        {
            idle[i] = new GreenfootImage("images/DaBaby_sprite/idle" + i + ".png");
        }
        setImage(idle[0]);
    }
    
    int imageIndex = 0;
    public void animateDaBaby()
    {
        setImage(idle[imageIndex]);
        imageIndex = (imageIndex + 1) % idle.length;
    }
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
        
        animateDaBaby();
    }
}
