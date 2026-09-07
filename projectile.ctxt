import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class npc extends Actor
{
    
    int fadeCount = 100;
    
    GreenfootImage img = new GreenfootImage("bubble.png");

    public npc()
    {
        img.scale(50, 50);
        setImage(img);
    }
    
    public void act()
    {
        this.setLocation(getX(), getY()+1);
        
        if (this.getY() >= getWorld().getHeight() - 26)
        { 
            fadeCount = fadeCount - 2;
            img.setTransparency(fadeCount);
            if(fadeCount < 10){
                MyWorld gameW = (MyWorld) getWorld(); 
                gameW.removeObject(this);
            }
       }
       
    }
}