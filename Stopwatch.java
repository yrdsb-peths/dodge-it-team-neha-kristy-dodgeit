import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Stopwatch extends Actor
{
    private int count = 0;
    private int seconds = 0;
    
    public void act()
    {
        count++;
        
        if (count % 60 == 0)
        {
            seconds++;
            updateImage();
        }
    }
    private void updateImage()
    {
        setImage(new GreenfootImage("Time: " + seconds, 24, Color.WHITE, Color.BLACK));
    }
}
