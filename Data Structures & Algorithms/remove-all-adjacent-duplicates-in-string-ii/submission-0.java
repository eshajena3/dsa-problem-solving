class Solution {
    public String removeDuplicates(String s, int k) {
        int j =0;
        char[]  arr = s.toCharArray();
        int[] count = new int[arr.length] ;
        for(int i =0; i<arr.length; i++){
           arr[j] = arr[i];
           if(j > 0 && arr[j] == arr[j-1]){
            count[j] = count[j-1] + 1;
           }
           else{
            count[j] = 1;
           }
           if(count[j] == k){
            j = j-k + 1;
           }else{
            j++;
           }
        }
        return new String(arr,0,j) ;
    }
}