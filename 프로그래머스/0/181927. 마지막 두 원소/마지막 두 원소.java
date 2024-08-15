import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

class Solution {
    public List solution(int[] num_list) {
        int len = num_list.length;
        int last = num_list[len-1];
        int front = num_list[len-2];
        
        List<Integer> list = IntStream.of(num_list).boxed().collect(Collectors.toList());
        list.add(last>front?last-front:last*2);
        return list;
    }
}