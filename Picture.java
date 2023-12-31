/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Square grass;
    private Triangle roof;
    private Circle sun;
    private Circle moon;
    private Person humano;
    private Person humane;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        grass = new Square();
        grass.changeColor("green");
        grass.moveVertical(140);
        grass.moveHorizontal(-350);
        grass.changeSize(600);
        grass.makeVisible();
        
        wall = new Square();
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-120);
        window.moveVertical(40);
        window.changeSize(40);
        window.makeVisible();

        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(-200);
        sun.moveVertical(-150);
        sun.changeSize(80);
        sun.makeVisible();
        
        moon = new Circle();
        moon.changeColor("magenta");
        moon.moveHorizontal(-200);
        moon.moveVertical(300);
        moon.changeSize(40);
        moon.makeVisible();
        
        sun.slowMoveVertical(370);
        moon.slowMoveVertical(-350);
        
        humano = new Person();
        humano.changeColor("black");
        humano.moveVertical(40);
        humano.moveHorizontal(-300);
        humano.makeVisible();
        
        humane = new Person();
        humane.changeColor("black");
        humane.moveVertical(40);
        humane.moveHorizontal(300);
        humane.makeVisible();
    }
    
    public void amanecer() {
        moon.makeInvisible();
        sun.slowMoveVertical(-300);
        humano.slowMoveHorizontal(340);
        humane.slowMoveHorizontal(-450);
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }
}
