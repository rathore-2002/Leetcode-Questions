class Solution {
    public long subArrayRanges(int[] nums) {

        long tempSmallest=0;
        long tempLargest=0;

        Stack<Integer>st=new Stack<>();

        for(int i=0;i<=nums.length;i=i+1){

            while(!st.isEmpty() && (i==nums.length || nums[st.peek()]>=nums[i])){

                int temp=st.pop();
                int leftEnd= st.isEmpty() ? -1: st.peek();
                int rightEnd= i;

                tempSmallest+= (long)nums[temp]*(rightEnd-temp)*(temp-leftEnd);

            }

            st.push(i);

        }

        while(!st.isEmpty()){
            st.pop();
        }

        for(int i=0;i<=nums.length;i=i+1){

            while(!st.isEmpty() && (i==nums.length || nums[st.peek()]<=nums[i])){

                int temp=st.pop();
                int leftEnd= st.isEmpty() ? -1: st.peek();
                int rightEnd= i;

                tempLargest+= (long)nums[temp]*(rightEnd-temp)*(temp-leftEnd);

            }

            st.push(i);

        }

        return tempLargest-tempSmallest;
        
    }
}