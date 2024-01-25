class Solution {
    public int maximumValue(String[] strs) {
        int max=0;
		for(int i=0;i<strs.length;i++) {
			String s=strs[i];
			int temp=0;
			int ans=0;
			int mul=1;
			boolean f=false;
			for(int j=s.length()-1;j>=0;j--) {
				char ch=s.charAt(j);
				if(ch>=97&&ch<=122) {
					temp++;
					ans=temp;
					f=true;
				}else if(!f) {
					temp++;
					ans=(ch-48)*mul+ans;
					mul*=10;
				}else {
					ans++;
				}
			}
			if(ans>=max) {
				max=ans;
			}
		}
		return max;
    }
}