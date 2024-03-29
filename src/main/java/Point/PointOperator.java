package Point;

import java.util.*;

public final class PointOperator {

    /** TODO
     * Translates a vector of size N by another vector of size N
     * Similar to adding two vector of size N together
     * @param vector Vector to translate
     * @param translateVector Translation to apply
     */
    public static void translate(Double[] vector, Double[] translateVector) {
        final int VECTOR_LENGTH=vector.length;
        for (int i=0; i<VECTOR_LENGTH;i++) {
            vector[i] += translateVector[i];
        }
    }

    /** TODO
     * Rotates a vector of size N by a matrix of size N x N
     * Similar to a matrix vector multiplication
     * @param vector Vector to rotate
     * @param rotationMatrix Matrix by which to rotate
     */
    public static void rotate(Double[] vector, Double[][] rotationMatrix) {
        Double[] vectorCopy=vector.clone();
        Double[] rotationMatrixLine;
        final int  VECTOR_LENGTH=vector.length;
        double resultCell;
        int index;

        for (int i=0;i<VECTOR_LENGTH;i++){
            resultCell= (double) 0;
            rotationMatrixLine=rotationMatrix[i];
            index=0;
            for(double element:vectorCopy){
                resultCell+=rotationMatrixLine[index]*element;
                index++;
            }
            vector[i]=resultCell;
        }

    }

    /** TODO
     * Divide a vector of size N by a scalar
     * @param vector Vector to divide
     * @param divider Scalar by which to divide
     */
    public static void divide(Double[] vector, Double divider) {
        if (divider==0 || divider==1)
            return;

        final int  VECTOR_LENGTH=vector.length;
        for (int i=0; i<VECTOR_LENGTH;i++) {
            vector[i] /= divider;
        }
    }

    /** TODO
     * Multiply a vector of size N by a scalar
     * @param vector Vector to multiply
     * @param multiplier Scalar by which to multiply
     */
    public static void multiply(Double[] vector, Double multiplier) {
        if (multiplier==1)
            return;
        final int  VECTOR_LENGTH=vector.length;
        for (int i=0; i<VECTOR_LENGTH;i++) {
            vector[i] *= multiplier;
        }
    }

    /** TODO
     * Add a scalar to a vector of size N
     * @param vector Vector that we have to add to
     * @param adder Scalar to add to vector
     */
    public static void add(Double[] vector, Double adder) {
        if (adder==0){
            return;
        }
        final int  VECTOR_LENGTH=vector.length;
        for (int i=0; i<VECTOR_LENGTH;i++) {
            vector[i] += adder;
        }
    }
}
