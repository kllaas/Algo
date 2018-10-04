package medium;

import java.util.*;

public class Task40 {

    public static void main(String[] args) {
        List<List<Integer>> res = combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8);

        for (List<Integer> re : res) {
            for (Integer integer : re) {
                System.out.println(integer + ", ");
            }

            System.out.println();
        }
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        if (candidates.length == 0) return new ArrayList<>();
        Set<List<Integer>> res = new HashSet<>();

        Arrays.sort(candidates);

        combinationSumHelper(candidates, target, 0, new LinkedList<>(), res);
        return new ArrayList<>(res);
    }

    public static void combinationSumHelper(int[] candidates, int target, int startIndex, List<Integer> currentList, Set<List<Integer>> res) {
        if (target == 0) {
            res.add(new LinkedList<>(currentList));
            return;
        }

        if (startIndex >= candidates.length || target < 0) {
            return;
        }
        for (int i = startIndex; i < candidates.length; i++) {
            if (candidates[i] > target) return;
            currentList.add(candidates[i]);
            combinationSumHelper(candidates, target - candidates[i], i + 1, currentList, res);
            currentList.remove(currentList.size() - 1);
        }
    }

}
