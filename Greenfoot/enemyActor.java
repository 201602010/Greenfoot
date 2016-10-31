import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class enemyActor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemyActor extends Actor
{
    private int time;
    /**
     * Act - do whatever the enemyActor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(getOneObjectAtOffset(0,0, mainActor.class) != null) {
            getWorld().removeObject(getOneObjectAtOffset(0,0,mainActor.class));
            getWorld().removeObject(this);
        }
        int xpos=getX();
        int ypos=getY();
        if (time > 0) {
            time--;
        }
        else {
            xpos=xpos+(Greenfoot.getRandomNumber(15)-7)*3;
            ypos=ypos+(Greenfoot.getRandomNumber(15)-7)*3;
            time = 5;
        }
        setLocation(xpos,ypos);
    }    
}
