class Solution {
    public int minimumAddedCoins(int[] coinValues, int targetValue) {
        Arrays.sort(coinValues);  

        int currentSum = 1;  
        int addedCoins = 0;   

        for (int i = 0; i < coinValues.length; i++) {
            while (coinValues[i] > currentSum) {  
                addedCoins += 1;
                currentSum *= 2;
            }

            currentSum += coinValues[i];  

            if (currentSum > targetValue) {  
                break;
            }
        }

        while (currentSum <= targetValue) {  
            addedCoins += 1;
            currentSum *= 2;
        }

        return addedCoins;
    }
}