class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        
        // adding all chars to a hashmap
        for(int i=0;i<s.length();i++)
        {
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0)+1);
        }
        
        // creating a Pair array class and storing the char and its count
        Pair[] arr = new Pair[hm.size()];
        int k=0;
         for (Map.Entry<Character, Integer> entry : hm.entrySet())
         {
             arr[k] = new Pair(entry.getKey(), entry.getValue());
             k++;
         }
        
        // sorting this array based on the count of each character
        Arrays.sort(arr, (a, b) -> b.count - a.count);
        
        StringBuilder sb = new StringBuilder("");
        
        
        // from sorted array appending all chars to a string
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].count;j++)
            {
                sb.append(arr[i].c);
            }
        }
        
        return sb.toString();
            
    }
    
}

class Pair
{
        Character c;
        Integer count;
        
        public Pair(Character c , Integer count)
        {
            this.c = c;
            this.count = count;
        }
}