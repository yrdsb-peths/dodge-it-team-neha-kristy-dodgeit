import greenfoot.*;

public class MyWorld extends World {
    public Heart heart1;
    public Heart heart2;
    public Heart heart3;


    public MyWorld() {
        super(600, 400, 1);
        Bomb bomb = new Bomb();
        addObject(bomb, 600, 100);

        Hero hero = new Hero();
        addObject(hero, 100, 100);
        
        heart1 = new Heart();
        addObject(heart1, 490, 40); 
        
        heart2 = new Heart();
        addObject(heart2, 530, 40);
        
        heart3 = new Heart();
        addObject(heart3, 570, 40);

        Stopwatch stopwatch = new Stopwatch();
        addObject(stopwatch, 55, 375);
        
        LevelDisplay leveldisplay = new LevelDisplay();
        addObject(leveldisplay, 55, 25);
    }
    
}
