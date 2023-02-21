class Solution {
public int[] nextGreaterElement(int[] nums1, int[] nums2) {
HashMap<Integer,Integer> n=new HashMap<Integer,Integer>();
for(int i=0;i<nums2.length;i++){
n.put(nums2[i],i);
}

    for(int j=0;j<nums1.length;j++){
        int v=n.get(nums1[j]);
         if(v==nums2.length-1){
        nums1[j]=-1;
    }
       for(int k=v+1;k<nums2.length;k++){
            if(nums2[v]<nums2[k]){
           nums1[j]=nums2[k];
                break;
           }
              else{
            nums1[j]=-1;
        }
       }
       
     
}
    return nums1;
}
}
// without stack