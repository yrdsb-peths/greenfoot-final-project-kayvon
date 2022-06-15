import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Baby here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    
    boolean canFire = true;
    GreenfootImage[] idle = new GreenfootImage[9];
    
    {
        setRotation(270);
    }
    public Hero()
    {
        for(int i = 0; i < 9; i++)
        {
            idle[i] = new GreenfootImage("images/Spider_sprite/Idle" + i + ".png");
        }
        setImage(idle[0]);
    }
    
    int imageIndex = 0;
    public void animateSpider()
    {
        setImage(idle[imageIndex]);
        imageIndex = (imageIndex + 1) % idle.length;
    }
    public void act()
        {
            moveAround();
            animateSpider();  
            fireProjectile();
        }
    public void moveAround()
    {
        if(Greenfoot.isKeyDown("d"))
        {
            setLocation(getX()+6,getY());
        }
        if(Greenfoot.isKeyDown("a"))
        {
            setLocation(getX()-6,getY());
        }
    }
    public void fireProjectile()
    {
        if (Greenfoot.isKeyDown("space") && canFire == true)
        {
            getWorld().addObject(new Projectile(), getX(), getY());
            canFire = false;
        }
        else if (!Greenfoot.isKeyDown("space"))
        {
            canFire = true;
        }
        
    }
    
    
}
    
