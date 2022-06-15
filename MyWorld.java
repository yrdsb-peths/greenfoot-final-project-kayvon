import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    HealthBar healthbar = new HealthBar();
    Counter counter = new Counter();
    int villainCount = 0;
    boolean bossLevel = false;
    public MyWorld()
    {
        super(600, 600, 1);
        prepare();
    }
    public Counter getCounter()
    {
        return counter;
    }
    public HealthBar getHealthBar()
    {
        return healthbar;
    }
    public void act()
    {
        villainCount++;
        if(villainCount>30)
        {
            addVillain1();
            villainCount = 0;
        }
        Boss();
    }
    public void Boss()
    {
        if (counter.score == 25 || counter.score == 26)
        {
            if (bossLevel == false)
            {
                addObject(new Boss(), 300, 0);
                bossLevel = true;
            }
            
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
        addObject(counter, 50, 50);
        addObject(healthbar, 250, 50);
        Hero hero = new Hero();
        addObject(hero,290,443);
        hero.setLocation(301,494);
        hero.setLocation(298,525);
        Counter counter = new Counter();
        HealthBar healthBar = new HealthBar();
    }
}
    
