import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Bomb extends Actor
{
    public Bomb() 
    {
        GreenfootImage img = getImage();
        setImage(img);
    }
    
    private int touchCount = 0;
    private boolean touching = false;
    
    public void act()
    {
        move(-15);
        
        if(getX() <= 0)
        {
            resetBomb();
        }
        
        
        
        if(isTouching(Hero.class))
        {
            if(!touching)
            {
               touchCount ++; 
               touching = true;
            
                MyWorld world = (MyWorld) getWorld();
    
                if(touchCount == 1)
                {
                    getWorld().removeObject(world.heart3);
                }
                
                else if(touchCount == 2)
                {
                    getWorld().removeObject(world.heart2);
                }
                
                else if(touchCount == 3)
                {
                    getWorld().removeObject(world.heart1);
                    Skull skull = new Skull();
                    getWorld().addObject(skull, 300, 200);
                    getWorld().removeObject(this);                  
                }
            }
        }  
        else
        {
            touching = false;
        }


    }
    
    public void resetBomb()
    {
        int num = Greenfoot.getRandomNumber(2);
        if(num == 0)
        {
            setLocation(600, 100);
        }
        else
        {
            setLocation(600, 300);
        }
    }
}
