class Solution {
    private final int FREQUENCY_SIZE = 26;
    private boolean isPermutation(int[] firstStringFrequency, int[] secondStringFrequency) {
        for (int i = 0; i < FREQUENCY_SIZE; i++)
            if (firstStringFrequency[i] != secondStringFrequency[i])
                return false;
        return true;
    }

    public boolean checkInclusion(String firstString, String secondString) {
        int firstStringLength = firstString.length();
        int secondStringLength = secondString.length();

        if(firstStringLength > secondStringLength)
            return false;

        int[] firstStringFrequency = new int[FREQUENCY_SIZE];
        int[] secondStringFrequency = new int[FREQUENCY_SIZE];

        for (int i = 0; i < firstStringLength; i++)
            firstStringFrequency[firstString.charAt(i) - 'a']++;

        for (int i = 0; i < secondStringLength; i++) {
            if (i >= firstStringLength)
                secondStringFrequency[secondString.charAt(i - firstStringLength) - 'a']--;
            secondStringFrequency[secondString.charAt(i) - 'a']++;
            if (isPermutation(firstStringFrequency, secondStringFrequency))
                return true;
        }

        return false;
    }
}
