/*class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum=0;
        for(int i=1;i<=num;i++){
            if(num%i==0)
                sum+=i;
        }
        if(sum==num)
            return true;
        else
            return false;
    }
}*/


class Solution{
public boolean checkPerfectNumber(int num) {
  if(num <= 1)
    return false;
  int sum = 1;
  for(int i = 2; i*i <= num; i++) {
    if(num % i == 0){
      sum += i + num/i;
    }
  }
  return sum == num ? true : false;
}
}