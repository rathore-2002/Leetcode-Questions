class Solution {
    public int[] fullBloomFlowers(int[][] flowers, int[] people) {
        int m = flowers.length;
        int[] starts = new int[m];
        int[] ends = new int[m];
        for(int i=0;i<m;i++)
        {
            starts[i]=flowers[i][0];
            ends[i]= flowers[i][1];
        }
        Arrays.sort(starts);
        Arrays.sort(ends);
        int n = people.length;
        int[] result = new int[n];

        for(int i=0;i<n;i++)
        {
            int open =0, close=0;
            if(people[i]<starts[0])
            {
                open =0;
            }
            else if(people[i]>=starts[m-1])
            {
                open = m;
            }
            else
            {
                int l =0, r=m-1;
                while(l<r)
                {
                    int mid = (l+r+1)>>1;
                    if(starts[mid]<=people[i])
                    {
                        l = mid;
                    }
                    else
                    {
                        r=mid-1;
                    }
                }
                open = l+1;
            }
            if(people[i]<=ends[0]) 
                close =0;
            else if(people[i]>ends[m-1])
            {
                close =m;
            }
            else
            {
                int l=0, r=m-1;
                while(l<r)
                {
                    int mid = (l+r+1)>>1;
                    if(ends[mid]<people[i])
                    {
                        l=mid;

                    }
                    else
                    {
                        r = mid-1;
                    }
                }
                close = l+1;
            }
            result[i]=open-close;
        }
        return result;
    }
}
