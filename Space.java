import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * Space. Something for rockets to fly in...
 * 
 * @author Tanner Bortel
 * @version 3.0
 */
public class Space extends World
{
    /**
     * Create the space world with black background and stars.
     */
    public Space() 
    {
        super(800, 600, 1);
        GreenfootImage background = getBackground();
        background.setColor(Color.BLACK);
        background.fill();
        Rocket rocket = new Rocket();
        addObject(rocket, getWidth()/2 + 100, getHeight()/2);
        paintStars(300);
        Explosion.initializeImages();
        prepare();
    }
    
    private void paintStars(int count)
    {
        GreenfootImage background = getBackground(); 
        for (int i=0; i < count + 1; i++)
        {
           int x = Greenfoot.getRandomNumber( getWidth() );
           int y = Greenfoot.getRandomNumber( getHeight() );
           int color1 = 150 - Greenfoot.getRandomNumber(120);
           int color2 = color1 - Greenfoot.getRandomNumber(20);
           int color3 = color1 + Greenfoot.getRandomNumber(20);
           background.setColorAt(x, y, new Color(color1,color2,color3));
           int size1 = 3 - Greenfoot.getRandomNumber(2);
           int size2 = 3 - Greenfoot.getRandomNumber(2);
           background.fillOval(x, y, size1, size2);
        }
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Asteroid asteroid = new Asteroid();
        addObject(asteroid,376,149);
        Asteroid asteroid2 = new Asteroid();
        addObject(asteroid2,473,343);
    }
}