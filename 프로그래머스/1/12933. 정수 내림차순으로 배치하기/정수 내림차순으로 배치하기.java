class Solution {
    public long solution(long n) {
        long[] arr = new long[Long.toString(n).length()];
        int count = arr.length;
        for(long i=0;i<arr.length;i++){
            arr[count-1] = n%10;
            n /= 10;
            count--;
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]<arr[j+1]){
                    long save = arr[j];
                    arr[j] =  arr[j+1];
                    arr[j+1] = save;
                }
            }
        }
        long answer = 0;
        for(int i=0;i<arr.length;i++){
            answer *= 10;
            answer += arr[i];
            
        }
        return answer;
    }
}