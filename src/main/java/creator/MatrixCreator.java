package creator;
import entity.Matrix;
import exceptions.MatrixException;
public class MatrixCreator {


    public static void fillRandomized(Matrix t, int start, int end) {

        int v = t.getVerticalSize();
        int h = t.getHorizontalSize();
        for(int i = 0; i < v; i++) {
            for(int j = 0; j < h; j++) {
                try {
                    int value = (int)(Math.random() * (end - start) + start);
                    t.setElement(i, j, value);
                } catch (MatrixException e) {
/* в данном случае exception невозможен, поэтому обработка отсутствует */
                }
            }
        }
    }

}