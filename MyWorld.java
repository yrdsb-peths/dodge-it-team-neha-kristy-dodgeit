import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        Bomb bomb = new Bomb();
        addObject(bomb, 600, 100);

        Hero hero = new Hero();
        addObject(hero, 100, 100);
        
        Stopwatch stopwatch = new Stopwatch();
        addObject(stopwatch, 50, 400);
        
        addObject(new Stopwatch(), 100, 50);
        addObject(new LevelDisplay(), 100, 100);
    }
    
}
