import java.awt.Rectangle;
import java.util.ArrayList;

public class BigRectLister {
    public static void main(String[] args) {
        ArrayList<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(1, 1));  
        rectangles.add(new Rectangle(5, 1));  
        rectangles.add(new Rectangle(3, 4));  
        rectangles.add(new Rectangle(2, 2));  
        rectangles.add(new Rectangle(5, 3)); 
        rectangles.add(new Rectangle(1, 2));
        rectangles.add(new Rectangle(4, 5));
        rectangles.add(new Rectangle(8, 6));
        rectangles.add(new Rectangle(3, 1));
        rectangles.add(new Rectangle(2, 9));


        BigRectangleFilter filter = new BigRectangleFilter();
        for (Rectangle rect : rectangles) {
            if (filter.accept(rect)) {
                System.out.println("Big rectangle: " + rect);
            }
        }
    }
}
