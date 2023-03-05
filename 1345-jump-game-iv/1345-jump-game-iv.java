class Solution 
{
    public int minJumps(int[] arr)
    {
    HashMap<Integer,List<Integer>> hm=new HashMap<Integer,List<Integer>>(); 
    for(int i=0;i<arr.length;i++)
    {
        if(hm.containsKey(arr[i]))
        {
            hm.get(arr[i]).add(i);
        }
        else
        {
            hm.put(arr[i],new LinkedList<Integer>());
            hm.get(arr[i]).add(i);
        }
    }
    int visited[]=new int[arr.length];
    Queue<Integer> q=new LinkedList<Integer>();
    q.add(0);
    visited[0]=1;    
    int step=0;
    while(q.size()>0)
    {
        int qs=q.size();
        //for level
        for(int i=1;i<=qs;i++)
        {
            int node=q.poll();
            if(node==arr.length-1)
                return step;
            List<Integer> ls=hm.get(arr[node]);
            for(int adj:ls)
            {
                if(visited[adj]==0)
                {
                    q.add(adj);
                    visited[adj]=1;
                }
            }
            hm.put(arr[node],new LinkedList<Integer>());
            if(node-1>=0)
            {
                if(visited[node-1]==0)
                q.add(node-1);
                 visited[node-1]=1;
            }
            if(node+1<arr.length&&visited[node+1]==0)
            {   
            q.add(node+1);
            visited[node+1]=1;
            }
        }
        step++;
    }
    return step;    
    }
}