/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        
        // X Positions: Y Positions: Values
        HashMap<Integer, HashMap<Integer, List<Integer>>> groups = new HashMap();
        List<List<Integer>> output = new ArrayList<>();
        
        int[] minMaxBounds = new int[]{0, 0, 0}; // minX, maxX, maxY
        populateDepthMap(groups, root, 0, 0, minMaxBounds);
        
        int xmin = minMaxBounds[0], xmax = minMaxBounds[1], ymax = minMaxBounds[2];
        
        // After all our traversal work is done we just need to populate our output.
        for(int x = xmin; x <= xmax; x++){
            List<Integer> xposnList = new ArrayList<>();
            for(int y = 0; y <= ymax; y++){
                if(groups.get(x).containsKey(y)){
                    List<Integer> currRowColmn = groups.get(x).get(y);
                    if(!currRowColmn.isEmpty()){
                        Collections.sort(currRowColmn); // Sort values that have the same row and the same column 
                        xposnList.addAll(currRowColmn);
                    }
                }
            }
            output.add(xposnList);
        }
        return output;
    }
    
    public void populateDepthMap(
         HashMap<Integer, HashMap<Integer, List<Integer>>> groups,
        TreeNode root, 
        int xposn,
        int level, 
        int[] minMaxBounds
    ){
        if(root == null) return;
        
        /* There are 3 cases for every new values: 
         *  1) X value isn't present -- Add (X, Y, (root.val))
         *  2) Y value isn't present -- Add (Y, (root.val))
         *  3) Both are present -- Add (root.val)
         */ 
        if(!groups.containsKey(xposn)){
            HashMap<Integer, List<Integer>> colms = new HashMap();
            colms.put(level, new ArrayList(Arrays.asList(root.val)));
            groups.put(xposn, colms);
        }
        else if(!groups.get(xposn).containsKey(level)){
            groups.get(xposn).put(level, new ArrayList(Arrays.asList(root.val)));
        } 
        else groups.get(xposn).get(level).add(root.val);
            
        // Update our bounds for X / Y.
        if(xposn < minMaxBounds[0]) minMaxBounds[0] = xposn;
        if(xposn > minMaxBounds[1]) minMaxBounds[1] = xposn;
        if(level > minMaxBounds[2]) minMaxBounds[2] = level;
            
        populateDepthMap(groups, root.left, xposn - 1, level + 1, minMaxBounds);
        populateDepthMap(groups, root.right, xposn + 1, level + 1, minMaxBounds);
    }
}