class Solution {
    public int[] smallestSubarrays(int[] nums) {
        int[] res=new int[nums.length];
        int freq[]=new int[32];
        int or=0;
        for(int i:nums){
            or|=i;
            addFreq(i,freq);
        }
        int l=0;
        int r=0;
        int cur=0;
        int cFreq[]=new int[32];
        while(r<nums.length){
            if(or==0){
                res[l]=1;
                l++;
                r++;
                continue;
            }
            cur|=nums[r];
            addFreq(nums[r],cFreq);
            while(l<nums.length&&cur==or&&cur!=0){
                res[l]=r-l+1;
                dFreq(nums[l],freq);
                or=update(freq);
                dFreq(nums[l],cFreq);
                cur=update(cFreq);
                l++;
            }
            
            r++;
        }
        res[nums.length-1]=1;
        return res;
    }
    
    public void addFreq(int i,int[] freq){
        int j=0;
        while(i>0){
            int bit=i&1;
            i=i>>1;
            if(bit==1) freq[j]++;
            j++;
        }
        
    }
    
    public void dFreq(int i,int[] freq){
        int j=0;
        while(i>0){
            int bit=i&1;
            i=i>>1;
            if(bit==1) freq[j]--;
            j++;
        }
    }
    
    public int update(int[] freq){
        int ans=0;
        for(int i=0;i<32;i++){
            if(freq[i]>0)
            ans|=(1<<i);
        }
        return ans;
    }
    
    
}