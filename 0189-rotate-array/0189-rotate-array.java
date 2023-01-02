class Solution {
    public void reverse(int a[],int s,int e){
        while(s<=e){
            int temp=a[s];
            a[s]=a[e];
            a[e]=temp;
            s++;
            e--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        reverse(nums,0,n-k-1);
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-1);
    }
}