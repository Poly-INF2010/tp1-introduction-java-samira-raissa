package Shape;

import Point.Point2d;

import java.util.ArrayList;
import java.util.Collection;

public class Rectangle extends BaseShape {
    private Collection<Point2d> createLine(Double length, Double otherCoord, Boolean isVertical){
        Collection<Point2d> lineCoords=new ArrayList<Point2d>();
        final double HALF_LENGTH=length/2;
        if (isVertical)
            for (double y=HALF_LENGTH;y>=0;y-=spaceBetweenPoints){
                lineCoords.add(new Point2d(otherCoord,y));
                lineCoords.add(new Point2d(otherCoord,-y));

            }
        else
            for (double x=HALF_LENGTH;x>=0;x-=spaceBetweenPoints){
                lineCoords.add(new Point2d(x,otherCoord));
                lineCoords.add(new Point2d(-x,otherCoord));

            }

        return lineCoords;

    }
    /** Name  createEmptyRectangle
     * Create an empty rectangle centered on (0, 0)
     * @param width Width of the rectangle
     * @param height Height of the rectangle
     */
    private void createEmptyRectangle(Double width, Double height){
        final double HALF_WIDTH=width/2,HALF_HEIGHT=height/2;
        addAll(createLine(height,HALF_WIDTH,true));
        addAll(createLine(height,-HALF_WIDTH,true));
        addAll(createLine(width,HALF_HEIGHT,false));
        addAll(createLine(width,-HALF_HEIGHT,false));
    }
    /** TODO
     * Create a filled rectangle centered on (0, 0)
     * @param width Width of the rectangle
     * @param height Height of the rectangle
     */
    public Rectangle(Double width, Double height) {
        while(width>0 & height>0 ){
            createEmptyRectangle(width,height);
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
