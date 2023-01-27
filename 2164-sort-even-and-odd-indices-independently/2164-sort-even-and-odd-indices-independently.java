class Solution {
    public int[] sortEvenOdd(int[] nums) {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i%2==0)
                even.add(nums[i]);
            else
                odd.add(nums[i]);
        }
        Collections.sort(even);
        Collections.sort(odd);
        Collections.reverse(odd);
        int arr[] = new int[nums.length];
        int index1=0,index2=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0)
                arr[i]=even.get(index1++);
            else
                arr[i]=odd.get(index2++);
        }
        return arr;
    }
}