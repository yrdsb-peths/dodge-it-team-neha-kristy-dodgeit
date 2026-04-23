import greenfoot.*;

public class LevelDisplay extends Actor
{
    private int level = 1;

    public void act()
    {
        updateLevel();
    }

    
    public LevelDisplay()
    {
        updateImage();
    }
    
    private void updateLevel()
    {
        World world = getWorld();
        Stopwatch timer = (Stopwatch) world.getObjects(Stopwatch.class).get(0);

        int seconds = timer.getSeconds();
        int newLevel = (seconds / 10) + 1;

        if (newLevel != level)
        {
            level = newLevel;
            updateImage();
        }

        // End game at 60 seconds
        if (seconds >= 60)
        {
            world.showText("You Win!!", world.getWidth()/2, world.getHeight()/2);
            Greenfoot.stop();
        }
    }

    private void updateImage()
    {
        setImage(new GreenfootImage("Level: " + level, 24, Color.YELLOW, Color.BLACK));
    }

    public int getLevel()
    {
        return level;
    }
}
