import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Villain1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Villain1 extends Villain
{
public Villain1()
{
    getImage().scale(50, 50);
}
public void act()
{
    moveVillain();
    hitByProjectile();
}
public void hitByProjectile()
{
    Actor projectile = getOneIntersectingObject(Projectile.class);
    if (projectile != null)
    {
        getWorld().removeObject(projectile);
        World world = getWorld();
        MyWorld myWorld = (MyWorld)world;
        Counter counter = myWorld.getCounter();
        counter.addScore();
        getWorld().removeObject(this);
    }
    else if (getY() ==599)
        {
            World world = getWorld();
            MyWorld myWorld = (MyWorld)world;
            HealthBar healthbar = myWorld.getHealthBar();
            healthbar.loseHealth();
            getWorld().removeObject(this);
        }   
    
}
}