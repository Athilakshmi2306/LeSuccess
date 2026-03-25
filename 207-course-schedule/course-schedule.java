class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
       ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge:prerequisites){
            adj.get(edge[1]).add(edge[0]);
        }
        int[] ind=new int[numCourses];
        for(int i=0;i<numCourses;i++){
            for(int n:adj.get(i)){
                ind[n]++;
            }
        }
        
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(ind[i]==0){
                q.add(i);
            }
        }
        int count=0;
        while(!q.isEmpty()){
            int vertex=q.poll();
            count++;
           
            for(int nei:adj.get(vertex)){
                ind[nei]--;
                if(ind[nei]==0){
                    q.add(nei);
                }
            }
        }
        return count==numCourses; 
    }
}