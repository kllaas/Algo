package medium;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task554 {

    public int leastBricks(List<List<Integer>> wall) {
        if (wall.size() == 0) return 0;

        int height = wall.size();
        int width = wall.get(0).size();

        Map<Double, Integer> map = new HashMap<>();

        for (List<Integer> level: wall) {
            int currentWidth = 0;

            for (Integer w: level) {
                currentWidth += w;
                map.put(currentWidth / (double) width, map.getOrDefault(w, 0));
            }
        }

        int max = 0;

        for (Integer val: map.values()) {
            max = max > val ? max : val;
        }

        return height - max;
    }
}
