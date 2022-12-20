class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        boolean []vis=new boolean[n];
        Queue<Integer>q=new LinkedList<>();
        vis[0]=true;
        q.add(0);
        while(!q.isEmpty())
        {
            int a=q.poll();
            if(vis[a])
            {
                for(int i=0;i<rooms.get(a).size();i++)
                {
                    if(!vis[rooms.get(a).get(i)])
                    {
                        vis[rooms.get(a).get(i)]=true;
                        q.add(rooms.get(a).get(i));
                    }
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            if(!vis[i])
            return false;
        }
        return true;
    }
}
