package Letter;

import Point.Point2d;
import Shape.*;

public final class LetterFactory {
    final static Double maxHeight = 150.0;
    final static Double maxWidth = maxHeight / 2.5;
    final static Double halfMaxHeight = maxHeight / 2;
    final static Double halfMaxWidth = maxWidth / 2;
    final static Double oneThirdMaxWidth = maxWidth / 3;
    final static Double stripeThickness = maxHeight / 8;
    final static Double halfStripeThickness = stripeThickness / 2;
    final static double ROTATION_ANGLE=9;

     private static BaseShape shapeFactory;

    /** TODO
     * Create the letter A graphically
     * @return BaseShape containing the letter A
     */
    public static BaseShape create_A()  {
        BaseShape aShape=new Square(stripeThickness);

        shapeFactory = new Rectangle(stripeThickness,maxHeight)
                .translate(new Point2d(oneThirdMaxWidth,0.0))
                .rotate(Math.toRadians(-ROTATION_ANGLE));
        aShape.add(shapeFactory);
        shapeFactory.rotate(Math.toRadians(ROTATION_ANGLE))
                .translate(new Point2d(-2*oneThirdMaxWidth,0.0))
                .rotate(Math.toRadians(ROTATION_ANGLE));

        aShape.add(shapeFactory);
        return aShape;
    }

    /** TODO
     * Create the letter B graphically
     * @return BaseShape containing the letter B
     */
    public static BaseShape create_B() {
        BaseShape bShape=new Rectangle(stripeThickness,maxHeight)
                .translate(new Point2d(-halfMaxWidth,0.0));

        shapeFactory =new Circle((double) Math.round(maxWidth+stripeThickness))
                .remove(new Circle(maxWidth))
                .translate(new Point2d(0.0,halfMaxHeight/2));
        bShape.add(shapeFactory);
        shapeFactory.translate(new Point2d(0.0,-halfMaxHeight));
        bShape.add(shapeFactory);

        return bShape;
    }

    /** TODO
     * Create the letter C graphically
     * @return BaseShape containing the letter C
     */
    public static BaseShape create_C() {
        BaseShape cShape=create_O();
        shapeFactory =new Rectangle(stripeThickness,halfMaxHeight)
                .translate(new Point2d(halfMaxWidth-halfStripeThickness,0.0));
        cShape.remove(shapeFactory);
        return cShape;
    }

    /** TODO
     * Create the letter E graphically
     * @return BaseShape containing the letter E
     */
    public static BaseShape create_E() {
        BaseShape eShape=new Rectangle(stripeThickness,maxHeight)
                .translate(new Point2d(-halfMaxWidth,0.0));
        shapeFactory = new Rectangle(maxWidth,stripeThickness);
        eShape.add(shapeFactory);
        shapeFactory.translate(new Point2d(0.0,halfMaxHeight-halfStripeThickness));
        eShape.add(shapeFactory);
        shapeFactory.translate(new Point2d(0.0,-2*(halfMaxHeight-halfStripeThickness)));
        eShape.add(shapeFactory);

        return eShape;
    }

    /** TODO
     * Create the letter H graphically
     * @return BaseShape containing the letter H
     */
    public static BaseShape create_H() {
        BaseShape hShape=new Rectangle(maxWidth,stripeThickness);
        shapeFactory = new Rectangle(stripeThickness,maxHeight)
                .translate(new Point2d(halfMaxWidth,0.0));
        hShape.add(shapeFactory);
        shapeFactory.translate(new Point2d(-maxWidth,0.0));
        hShape.add(shapeFactory);

        return hShape;
    }

    /** TODO
     * Create the letter N graphically
     * @return BaseShape containing the letter N
     */
    public static BaseShape create_N() {
        BaseShape nShape=new Rectangle(stripeThickness,maxHeight)
                .rotate(Math.toRadians(-2*ROTATION_ANGLE));
        shapeFactory = new Rectangle(stripeThickness,maxHeight)
                .translate(new Point2d(halfMaxWidth,0.0));
        nShape.add(shapeFactory);
        shapeFactory.translate(new Point2d(-maxWidth,0.0));
        nShape.add(shapeFactory);
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
