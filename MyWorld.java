import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    public MyWorld()
    {
        super(600, 600, 1);
        prepare();
    }

    public void act()
    {
        if(Greenfoot.getRandomNumber(60)<1)
        {
            addVillain1();
        }
    }

    public void addVillain1()
    {
        addObject(new Villain1(), Greenfoot.getRandomNumber(600), 0);
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Hero hero = new Hero();
        addObject(hero,290,443);
        hero.setLocation(301,494);
        hero.setLocation(298,525);
    }
}
    
