class Solution {
    boolean flag=false;
    boolean []vis;
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>>adj=new ArrayList<>();
        vis= new boolean[n];
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int i[]:edges)
        {
            adj.get(i[0]).add(i[1]);
            adj.get(i[1]).add(i[0]);
        }
        if(adj.get(source).contains(destination))
        {
            return true;
        }
        
        dfs(adj,source,destination);
        return flag;
    }
    void dfs(List<List<Integer>>adj,int start,int end)
    {
        if(start==end)
        {
            flag=true;
            return ;
        }
        else
        {
            for(int i:adj.get(start))
            {
                if(!vis[i])
                {
                    vis[i]=true;
                    dfs(adj,i,end);
                }
            }
        }

    }
}
