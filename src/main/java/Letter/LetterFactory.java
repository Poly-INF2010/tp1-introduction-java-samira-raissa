package Letter;

import Point.Point2d;
import Shape.*;

import java.util.ArrayList;
import java.util.Collection;

public final class LetterFactory {
    final static Double maxHeight = 150.0;
    final static Double maxWidth = maxHeight / 2.5;
    final static Double halfMaxHeight = maxHeight / 2;
    final static Double halfMaxWidth = maxWidth / 2;
    final static Double stripeThickness = maxHeight / 8;
    final static Double halfStripeThickness = stripeThickness / 2;
     private static BaseShape shapePart;

    /** TODO
     * Create the letter A graphically
     * @return BaseShape containing the letter A
     */
    public static BaseShape create_A()  {
        BaseShape aShape=new Square(stripeThickness);

        shapePart= new Rectangle(stripeThickness,maxHeight) ;
        shapePart.translate(shapePart.getCoords(),new Point2d((2*halfMaxWidth)/3,0.0));
        shapePart.rotate(shapePart.getCoords(),Math.toRadians(-9));
        aShape.add(shapePart);
        shapePart.rotate(shapePart.getCoords(),Math.toRadians(9));
        shapePart.translate(shapePart.getCoords(),new Point2d((-2*maxWidth)/3,0.0));
        shapePart.rotate(shapePart.getCoords(),Math.toRadians(9));

        aShape.add(shapePart);

        return aShape;
    }

    /** TODO
     * Create the letter B graphically
     * @return BaseShape containing the letter B
     */
    public static BaseShape create_B() {
        BaseShape bShape=new Rectangle(stripeThickness,maxHeight);
        bShape.translate(bShape.getCoords(),new Point2d(-halfMaxWidth,0.0));
        shapePart=new Circle((double) Math.round(maxWidth+stripeThickness));
        shapePart.remove(new Circle(maxWidth));
        shapePart.translate(shapePart.getCoords(),new Point2d(0.0,halfMaxHeight/2));
        bShape.add(shapePart);
        shapePart.translate(shapePart.getCoords(),new Point2d(0.0,-halfMaxHeight));
        bShape.add(shapePart);

        return bShape;
    }

    /** TODO
     * Create the letter C graphically
     * @return BaseShape containing the letter C
     */
    public static BaseShape create_C() {
        BaseShape cShape=create_O();
        shapePart=new Rectangle(stripeThickness,halfMaxHeight);
        shapePart.translate(shapePart.getCoords(),new Point2d(halfMaxWidth-halfStripeThickness,0.0));
        cShape.remove(shapePart);


        return cShape;
    }

    /** TODO
     * Create the letter E graphically
     * @return BaseShape containing the letter E
     */
    public static BaseShape create_E() {
        BaseShape eShape=new Rectangle(stripeThickness,maxHeight);
        eShape.translate(eShape.getCoords(),new Point2d(-halfMaxWidth,0.0));
        shapePart= new Rectangle(maxWidth,stripeThickness);
        eShape.add(shapePart);
        shapePart.translate(shapePart.getCoords(),new Point2d(0.0,halfMaxHeight-halfStripeThickness));
        eShape.add(shapePart);
        shapePart.translate(shapePart.getCoords(),new Point2d(0.0,-2*(halfMaxHeight-halfStripeThickness)));
        eShape.add(shapePart);

        return eShape;
    }

    /** TODO
     * Create the letter H graphically
     * @return BaseShape containing the letter H
     */
    public static BaseShape create_H() {
        BaseShape hShape=new Rectangle(maxWidth,stripeThickness);
        shapePart= new Rectangle(stripeThickness,maxHeight) ;
        shapePart.translate(shapePart.getCoords(),new Point2d(halfMaxWidth,0.0));
        hShape.add(shapePart);
        shapePart.translate(shapePart.getCoords(),new Point2d(-maxWidth,0.0));
        hShape.add(shapePart);

        return hShape;
    }

    /** TODO
     * Create the letter N graphically
     * @return BaseShape containing the letter N
     */
    public static BaseShape create_N() {
        BaseShape nShape=new Rectangle(stripeThickness,maxHeight);

         shapePart= new BaseShape(nShape.cloneCoords()) ;
        nShape.rotate(nShape.getCoords(),Math.toRadians(-18));
        shapePart.translate(shapePart.getCoords(),new Point2d(halfMaxWidth,0.0));
        nShape.add(shapePart);
        shapePart.translate(shapePart.getCoords(),new Point2d(-maxWidth,0.0));
        nShape.add(shapePart);

        return nShape;
    }

    /** TODO
     * Create the letter O graphically
     * @return BaseShape containing the letter O
     */
    public static BaseShape create_O() {
        Ellipse ellipse=new Ellipse(maxWidth,maxHeight);
        ellipse.remove(new Ellipse(maxWidth-stripeThickness,maxHeight-stripeThickness));

        return ellipse;
    }

}
