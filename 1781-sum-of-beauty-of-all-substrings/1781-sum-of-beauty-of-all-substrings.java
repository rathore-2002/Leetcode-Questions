class Solution {
    public int beautySum(String s) {
        int sum=0;
        for(int i=0;i<s.length()-2;i++)
        {
            int freq[]=new int[26];
            freq[s.charAt(i)-'a']++;
            int mf=1,lf=1;
            char least=s.charAt(i);
            for(int j=i+1;j<s.length();j++)
            {
                char k=s.charAt(j);
                freq[k-'a']++;
                if(freq[k-'a']>mf)
                {
                    mf=freq[k-'a'];
                }
                if(k==least)
                {
                    lf++;
                    for(char ch='a';ch<='z';ch++)
                    {
                        if(freq[ch-'a']!=0&&freq[ch-'a']<lf)
                        {
                            lf=freq[ch-'a'];
                            least=ch;
                        }
                    }
                }
                else if(freq[k-'a']<lf)
                {
                    lf=freq[k-'a'];
                    least=k;
                }
                sum+=mf-lf;
            }
        }
        return sum;
    }
}