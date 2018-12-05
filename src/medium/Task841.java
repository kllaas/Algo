package medium;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task841 {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Set<Integer> visited = new HashSet<>();
        canVisitRoomsDFS(rooms.get(0), rooms, visited);
        return visited.size() == rooms.size();
    }

    public void canVisitRoomsDFS(List<Integer> keys,
                                 List<List<Integer>> rooms,
                                 Set<Integer> visited) {
        if (keys == null) return;

        for (Integer index: keys) {
            visited.add(index);
            canVisitRoomsDFS(rooms.get(index), rooms, visited);
        }
    }
}
