class RecentCounter {
Queue<Integer>q;
    public RecentCounter() {
        q=new LinkedList<>();
        int front=0;
        int rear=0;
    }
    
    public int ping(int t) {
        q.add(t);
        while(q.peek()<t-3000){
             q.poll();
        }
   return q.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */