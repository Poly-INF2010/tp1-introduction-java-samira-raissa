package Shape;

import Point.Point2d;

import java.util.Collection;

public class Ellipse extends BaseShape {
    /** TODO
     * Create a filled Ellipse that is centered on (0, 0)
     * @param widthDiameter Width of the Ellipse
     * @param heightDiameter Height of the Ellipse
     */

    public Ellipse(Double widthDiameter, Double heightDiameter) {
        while(widthDiameter>0 & heightDiameter>0 ){
            empty_ellipse(widthDiameter,heightDiameter);
            widthDiameter-=spaceBetweenPoints;
            heightDiameter-=spaceBetweenPoints;
        }

    }
private void empty_ellipse(Double widthDiameter, Double heightDiameter){
    double HALF_HEIGHT=heightDiameter/2;
    double HALF_WIDTH=widthDiameter/2;
    double x;
    for (double y=HALF_HEIGHT;y>=0;y-=spaceBetweenPoints){
        {
            x= HALF_WIDTH * Math.sqrt(1.0-Math.pow(y/HALF_HEIGHT,2.0));
            add(new Point2d(x,y));
            add(new Point2d(-x,y));
            add(new Point2d(x,-y));
            add(new Point2d(-x,-y));
        }
    }
}
    /** TODO
     * Create a filled Ellipse that is centered on (0,0)
     * @param dimensions 2D point containing the width and height of the Ellipse
     */
    public Ellipse(Point2d dimensions) {
        this(dimensions.X(), dimensions.Y());
    }

    /**
     * Create an Ellipse from a given collection of 2D points
     * @param coords Collection of 2D points
     */
    private Ellipse(Collection<Point2d> coords) {
        replaceAll(coords);
    }

    /** TODO
     * @return Deep Copy of the Ellipse
     */
    @Override
    public Ellipse clone() {
        return new Ellipse(getCoords());
    }
}
