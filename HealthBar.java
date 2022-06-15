import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HealthBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HealthBar extends Actor
{
    /**
     * Act - do whatever the HealthBar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int health = 4;
    int healthBarWidth = 80;
    int healthBarHeight = 10;
    int pixelsPerHealthPoint = healthBarWidth/health;
    public HealthBar()
    {
        update();
    }

    public void act()
    {
        update();
        youLose();
    }
    /**
     * health bar colo is set and is positioned next to score
     */

    public void update()
    {
        setImage(new GreenfootImage(healthBarWidth, healthBarHeight));
        GreenfootImage myImage = getImage();
        myImage.setColor(Color.WHITE);
        myImage.drawRect(0, 0, healthBarWidth + 1, healthBarHeight + 1);
        myImage.setColor(Color.RED);
        myImage.fillRect( 1, 1, health*pixelsPerHealthPoint, healthBarHeight);
    }

    public void loseHealth()
    {
        health--;
    }
    /**
     * when health is 0, game over screen will play
     * game is over
     */

    public void youLose()
    {
        if (health == 0)
        {
            gameOverScreen gameOver = new gameOverScreen();
            Greenfoot.setWorld(gameOver);
        }
    }
}
