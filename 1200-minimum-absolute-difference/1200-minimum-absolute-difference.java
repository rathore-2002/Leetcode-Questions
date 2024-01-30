class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
          List<List<Integer>> result = new ArrayList<>();
          Arrays.sort(arr);
         int min=(arr[1]-arr[0]);
         for(int i=2 ;i<=arr.length-1;i++)
         {
             if((arr[i]-arr[i-1])<min)
             {
                 min=(arr[i]-arr[i-1]);
             }

         }
         for(int i=1;i<=arr.length-1;i++)
         {
             if(min==(arr[i]-arr[i-1]))
             {
                 result.add(Arrays.asList(arr[i - 1], arr[i])); 
             }
         }
         return result;
        
        
    }
}