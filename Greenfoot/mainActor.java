import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class mainActor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mainActor extends Actor
{
    private int time = 0;
    /**
     * Act - do whatever the mainActor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here
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
