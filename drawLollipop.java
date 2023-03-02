import ecs100.*;
import java.awt.Color;
/**
 * class demostrations to draw a loolypop for our first GUI.
 *
 * @author (Ruth )
 * @version (2/03/2023)
 */
public class drawLollipop
{
    // feilds

    /**
     * Constructor for objects of class drawLollipop
     */
    public drawLollipop()
    {
        UI.initialise(); // bring up the esc100 canvas
        UI.addButton("Draw", this::drawLollipops);
        UI.addButton("Quit", UI::quit);
    }

    //draw a loolypop s00, 180, 80 ,200
    public void doDrawLollipop(double x, double y, double size, double stick){
        double left = x-size/2.0; // left most position of object
        double top = y-size/2.0; //top most position of onject
        double bottom = y+stick; //bottom most position of object
        
        final int STICKWIDTH = 5;
        final int LOLLIWIDTH = 1;
        
        
    // draw stick 
    UI.setLineWidth(STICKWIDTH);
    UI.setColor(Color.black);
    UI.drawLine(x, y, x, bottom);
    
    //draw the lolly 
    UI.setLineWidth(LOLLIWIDTH);
    UI.setColor(Color.red);
    UI.fillOval(left, top, size, size);
   
}
// calls the drawlooly pop method with a nubmer of differnt parameters
public void drawLollipops(){
doDrawLollipop(300, 180, 80, 200);
doDrawLollipop(100, 50, 20, 20);
doDrawLollipop(200, 100, 50, 100);
doDrawLollipop(400, 150, 30, 50);
}

}
