class Solution {
    public List<String> ambiguousCoordinates(String s) {
        
        String digits = s.substring(1, s.length() - 1);
        
        List<String> result = new ArrayList();
        if(digits.length() < 2) return result;
        
        
        for(int i = 1; i < digits.length(); i++){
            //split the digits in 2 parts
            String left = digits.substring(0, i);
            String right = digits.substring(i);
            
            //check any of part contains only zeroes 
            if((left.length() > 1 && Long.valueOf(left) == 0) || (right.length() > 1 && Long.valueOf(right) == 0)) continue;
            
            
            List<String> leftCoordinates = getValidCoordinates(left);
            if(leftCoordinates.size() == 0) continue;
            
            List<String> rightCoordinates = getValidCoordinates(right);
            if(rightCoordinates.size() == 0) continue;
            
            
            for(String leftCor : leftCoordinates){
                for(String rightCor : rightCoordinates){
                    //concatenate right and left coordinate
                    StringBuilder sb = new StringBuilder();
                        sb
                        .append('(')
                        .append(leftCor)
                        .append(", ")
                        .append(rightCor)
                        .append(')');
                    //String coordinate = "(" + leftCor + ", " + rightCor + ")";
                    //result.add(coordinate);
                    
                    result.add(sb.toString());
                }
            }
            
        }
        
        
        
        return result;
    }
    
    private List<String> getValidCoordinates(String str){
        
        List<String> result = new ArrayList();
        
        int n = str.length();
        
        if(n == 1) {
            result.add(str);
            return result;
        }
        
        if(str.charAt(0) == '0'){
            if(str.charAt(n - 1) == '0'){
                return result;
            }
            
            String coordinate = "0." + str.substring(1); 
            result.add(coordinate);
            return result;
        }
        
        if(str.charAt(n - 1) == '0'){
            result.add(str);
            return result;
        }
        
        
        for(int i = 1; i < n; i++){
            String coordinate = str.substring(0, i) + "." + str.substring(i); 
            result.add(coordinate);
        }
        result.add(str);
        
        return result;
    }
}