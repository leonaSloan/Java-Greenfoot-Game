import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MyWorld extends World
{
    
    clown thePlayer = new clown(); 
    
    
    int playerLives = 10;
    int playerScore = 0;
    boolean heart = false;
    
    
      public MyWorld()
    {    
        super(1200, 667, 1); 
        setBackground("sea3.png");
        
        showText("Circus Cruise Control", 600, 30);

        
        
        clown thePlayer = new clown();
        ghost thePlayer2 = new ghost();
        addObject(thePlayer2, 400, 600);
        addObject(thePlayer, 800, 600);
        
        
    
    }
    
      public void act()
    {
        int getRan = Greenfoot.getRandomNumber(1000);
        
        if(getRan < 10){
            npc coin = new npc();
            
            int rX = Greenfoot.getRandomNumber(1100) + 25;
            int rY = Greenfoot.getRandomNumber(400) + 250;
            
            addObject(coin, rX, rY);
        }
    
        if(getRan < 10){ 
            addObject(new blowFish(), 35, 50);
            
        }
        
        
        showText("Lives: "+playerLives, 50, 30);
        showText("Score: "+playerScore, 1100, 30); 
        
        if(playerLives < 0 ){
            showText("GAME OVER", 600, 333);
            showText("", 50, 30);
            removeObjects(getObjects(null));
            Greenfoot.stop();
        }
        
        if(playerScore > 100){
            showText("YOU WON!", 600, 333);
            showText("", 50, 30);
            removeObjects(getObjects(null));
            Greenfoot.stop();
        }
    }
}