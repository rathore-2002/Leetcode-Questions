class Solution {
   public List<Integer> findClosestElements(int[] arr, int k, int x) {

    List<Integer> list = new ArrayList<>();
    int i=0,j=arr.length - 1;
    while (j-i>= k){
         if (Math.abs(arr[i]-x)>Math.abs(arr[j]-x)) i++;
         else j--;
     }
     for (int a=i;a<=j;a++)
         list.add(arr[a]);
     return list;
    
   }
}