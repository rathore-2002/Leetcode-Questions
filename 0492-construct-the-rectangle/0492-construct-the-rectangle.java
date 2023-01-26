class Solution {
    public int[] constructRectangle(int area) {

        int sqrt = (int)Math.sqrt(area);
        for(int w=sqrt;w>1;w--)
        {
            if(area%w==0)
            {
                return new int[]{area/w,w};
            }
        }
        return new int[]{area,1};
        
    }
}



/*
Intuition
Since W<=L, loop iterator will be w.
L-W must be minimum so iterate from square root of area to 1.
Approach
Iterate from square root of area to 1.
If at any point of time if loop iterator w divides area return area/w as length and w as width.
Complexity
*/