class Solution {
    public int solution(int[] num_list) {
        int mtp = 1;
        int sum = 0;
        for(int i=0; i<num_list.length; i++){
            mtp *= num_list[i];
            sum += num_list[i];
        }
        
        return mtp<sum*sum?1:0;
    }
}