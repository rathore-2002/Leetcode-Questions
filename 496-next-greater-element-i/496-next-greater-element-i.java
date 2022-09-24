class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int a[]=new int[nums1.length];
        int k=0,flag=0;
        for(int i=0;i<nums2.length;i++){
            
                map.put(nums2[i],i);
        }
        for(int i=0;i<nums1.length;i++){
            int j=map.get(nums1[i])+1;
            for(;j<nums2.length;j++){
                if(nums2[j]>nums1[i]){
                    flag=1;
                    a[k++]=nums2[j];
                    break;
                }
            }
            if(flag==0)
                a[k++]=-1;
            flag=0;
        }
        
        return a;
    }
}