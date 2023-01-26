class Solution {
    public boolean canWinNim(int n) {
        if(n%4!=0)   return true;
        
        return false;
    }
}




/*
Explanation:
1 win, 2 win, 3 win, 4 lose.
5 win because I can take 1 and there 4 stones left, which is loosing condition.
6 win, since I can take 2.
7 win, since I can take 3.
8 lose, since I can't make it left 4 stones, since my max move is removing only 3 stones.
The rest can be proven by induction.
*/