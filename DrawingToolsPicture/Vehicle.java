
/**
 * This class is for your week 1 portfolio project.
 * You need to draw a picture of a vehicle and add methods to move
 * the vehicle right and left across the canvas.
 * Put your name into the template below:
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vehicle
{
    // instance variables.  Declare the shapes you will use.
    // See the picture class for an example.
    private Rectangle trailer;
    private Rectangle cab;
    private Rectangle window;
    private Rectangle chassis;
    private Circle frontWheel;
    private Circle rearWheel;
    private Rectangle frontLights;
    private Rectangle rearLights;
    private Text logistics;
    int x = 20;
    /**
     * Constructor for objects of class Vehicle.
     */
    public Vehicle()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw your vehicle.
     */
    public void draw()
    {
        // put your code here
        // construct the shapes, move the to the right position, change color
        // and size as necessary.  See the Picture class for an example
        trailer = new Rectangle();
        trailer.changeColor("blue");
        trailer.moveVertical(20);
        trailer.changeSize(400, 160);
        trailer.makeVisible();
        
        cab = new Rectangle();
        cab.changeColor("blue");
        cab.moveVertical(80);
        cab.changeSize(80, 100);
        cab.makeVisible();
        
        window = new Rectangle();
        window.changeColor("black");
        window.moveVertical(90);
        window.changeSize(45, 50);
        window.makeVisible();
        
        chassis = new Rectangle();
        chassis.changeColor("gray");
        chassis.moveVertical(160);
        chassis.changeSize(400,20);
        chassis.makeVisible();

        frontWheel = new Circle();
        frontWheel.changeColor("black");
        frontWheel.moveVertical(180);
        frontWheel.changeSize(40);
        frontWheel.makeVisible();
        
        rearWheel = new Circle();
        rearWheel.changeColor("black");
        rearWheel.moveVertical(180);
        rearWheel.changeSize(40);
        rearWheel.makeVisible();
        
        frontLights = new Rectangle();
        frontLights.changeColor("black");
        frontLights.moveVertical(140);
        frontLights.changeSize(10, 40);
        frontLights.makeVisible();
        
        rearLights = new Rectangle();
        rearLights.changeColor("black");
        rearLights.moveVertical(160);
        rearLights.changeSize(10, 20);
        rearLights.makeVisible();
        
        logistics = new Text("Logistics");
        logistics.changeColor("black");
        logistics.moveVertical(100);
        logistics.changeSize(40);
        logistics.makeVisible();
        x=20;
        trailer.moveHorizontal(x);
        cab.moveHorizontal(420 + x);
        window.moveHorizontal(440 + x);
        chassis.moveHorizontal(70 + x);
        frontWheel.moveHorizontal(440 + x);
        rearWheel.moveHorizontal(100 + x);
        frontLights.moveHorizontal(490 + x);
        rearLights.moveHorizontal(x);
        logistics.moveHorizontal(20 + x);
    }
    
    public void move(int x){
        trailer.moveHorizontal(x);
        cab.moveHorizontal(x);
        window.moveHorizontal(x);
        chassis.moveHorizontal(x);
        frontWheel.moveHorizontal(x);
        rearWheel.moveHorizontal(x);
        frontLights.moveHorizontal(x);
        rearLights.moveHorizontal(x);
        logistics.moveHorizontal(x);
        
    }
    
    /**
     * Move your vehicle a little to the right.
     */
    public void moveRight(int x)
    {
        // put your code here
         move(x);
            
    }

    /**
     * Move your vehicle a little to the left.
     */
    public void moveLeft(int x)
    {
            move(-x);
    }
}
