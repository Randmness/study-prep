package study.random;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Flatten2DVector {

    class Vector2D {
        List<Integer> items = new ArrayList<>();

        public Vector2D(int[][] v) {
            for (int[] sub: v) {
                for (int item : sub) {
                    items.add(item);
                }
            }
        }

        public int next() {
            return items.remove(0);
        }

        public boolean hasNext() {
            return !items.isEmpty();
        }
    }
}
