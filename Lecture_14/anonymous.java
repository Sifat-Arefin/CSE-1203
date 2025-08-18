import java.awt.Point;

public class anonymous {

    
    public static void main(String[] args){
        
        Point p = AddPoint();
        System.out.println("Point coordinates: (" + p.x + ", " + p.y + ")");
    }
    public static Point AddPoint(){
        // Point q = new Point(1,2);
        // return q;
        return new Point(1, 2 );
    }

    
    
}
