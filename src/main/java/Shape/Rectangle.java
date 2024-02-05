package Shape;

import Point.Point2d;

import java.util.ArrayList;
import java.util.Collection;

public class Rectangle extends BaseShape {
    private Collection<Point2d> segment(Double length,Double otherCoord,Boolean isVertical){
        Collection<Point2d> array=new ArrayList<>();
        if (isVertical)
            for (double y=length/2;y>=0;y-=spaceBetweenPoints){
                array.add(new Point2d(otherCoord,y));
                array.add(new Point2d(otherCoord,-y));

            }
        else
            for (double x=length/2;x>=0;x-=spaceBetweenPoints){
                array.add(new Point2d(x,otherCoord));
                array.add(new Point2d(-x,otherCoord));

            }

        return array;

    }
    private void empty_rectangle(Double width, Double height){
        double HALF_WIDTH=width/2,HALF_HEIGHT=height/2;
        addAll(segment(height,HALF_WIDTH,true));
        addAll(segment(height,-HALF_WIDTH,true));
        addAll(segment(width,HALF_HEIGHT,false));
        addAll(segment(width,-HALF_HEIGHT,false));
    }
    /** TODO
     * Create a filled rectangle centered on (0, 0)
     * @param width Width of the rectangle
     * @param height Height of the rectangle
     */
    public Rectangle(Double width, Double height) {
        while(width>0 & height>0 ){
            empty_rectangle(width,height);
            width-=spaceBetweenPoints;
            height-=spaceBetweenPoints;
        }

    }

    /** TODO
     * Create a filled rectangle centered on (0, 0)
     * @param dimensions 2D point containing the width and height of the rectangle
     */
    public Rectangle(Point2d dimensions) {

        this(dimensions.X(),dimensions.Y());
    }

    /**
     * Create a rectangle from a given collection of Points
     * @param coords The collection of 2D points
     */
    private Rectangle(Collection<Point2d> coords) {
            super(coords);
    }

    /** TODO
     * @return Deep copy of the rectangle
     */
    @Override
    public Rectangle clone() {
        return new Rectangle(cloneCoords());
    }
}
