class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int max=0;
        int arr[]=new int[2];
        for(int i=0;i<mat.length;i++){
            int count=0;
            for(int nums:mat[i]){
                if(nums==1){
                    count++;
                }
            }
            if(count>max){
                max=count;
                arr[0]=i;
                arr[1]=max;
            }
        }
        return arr;
    }
}