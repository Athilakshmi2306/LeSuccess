class Solution { 
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> que =new LinkedList<>();
        for(int s:students){
               que.add(s);
        }
        int index=0;
        int count=0;
        while(!que.isEmpty() && count<que.size()){
            if(que.peek()==sandwiches[index]){
                que.poll();
                index++;
                count=0;
            }
            else{
                que.add(que.poll());
                count++;
            }
        }
        return que.size();
    }
}