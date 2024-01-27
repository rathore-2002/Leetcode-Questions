class Solution {
    public int countDaysTogether(String a1, String l1, String a2, String l2) {
        int mm1=Integer.valueOf(a1.substring(0,2));
        int dd1=Integer.valueOf(a1.substring(3,5));

        int mml1=Integer.valueOf(l1.substring(0,2));
        int ddl1=Integer.valueOf(l1.substring(3,5));

        int mm2=Integer.valueOf(a2.substring(0,2));
        int dd2=Integer.valueOf(a2.substring(3,5));

        int mml2=Integer.valueOf(l2.substring(0,2));
        int ddl2=Integer.valueOf(l2.substring(3,5));

        int months[]={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int minus1=0;
        for(int i=0;i<mm1-1;i++)
        minus1+=months[i];

        minus1+=dd1;

        int start1=365-minus1;

        minus1=0;
        for(int i=0;i<mml1-1;i++)
        minus1+=months[i];

        minus1+=ddl1;

        int leave1=365-minus1;

        minus1=0;
        for(int i=0;i<mm2-1;i++)
        minus1+=months[i];

        minus1+=dd2;

        int start2=365-minus1;

        minus1=0;
        for(int i=0;i<mml2-1;i++)
        minus1+=months[i];
        System.out.println(minus1);

        minus1+=ddl2;

        int leave2=365-minus1;
        int count=0;
        
        for(int i=Math.min(start1,Math.min(start2,Math.min(leave1,leave2))) ; i<=Math.max(start1,Math.max(start2,Math.max(leave1,leave2))) ; i++){
            System.out.println(i+" "+start1+" "+start2);
            if(i<=start1&&i<=start2&&i>=leave1&&i>=leave2)
            count++;
        }


        return count;


    }
}