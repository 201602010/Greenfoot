import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(new mainActor(), 590, 390);
        addObject(new food(), 300,200);
        addObject(new enemyActor(), 100, 100);
        addObject(new enemyActor(), 300, 100);
        addObject(new enemyActor(), 500, 100);
        addObject(new enemyActor(), 100, 350);
        addObject(new enemyActor(), 300, 350);
    }
}
