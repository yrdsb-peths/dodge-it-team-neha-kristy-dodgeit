import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        Bomb bomb = new Bomb();
        addObject(bomb, 600, 100);

        Hero hero = new Hero();
        addObject(hero, 100, 100);
        
        Heart heart1 = new Heart();
        addObject(heart1, 490, 40); 
        
        Heart heart2 = new Heart();
        addObject(heart2, 530, 40);
        
        Heart heart3 = new Heart();
        addObject(heart3, 570, 40);

        Stopwatch stopwatch = new Stopwatch();
        addObject(stopwatch, 55, 375);
    }
}
