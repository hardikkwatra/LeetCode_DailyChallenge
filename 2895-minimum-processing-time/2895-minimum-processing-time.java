class Solution {
    public int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) {
        Collections.sort(tasks);
        Collections.sort(processorTime);
        int max = -1;
        int j = 0;
        
        for(int i = tasks.size() - 1; i >= 0 ; i = i - 4){
            max = Math.max(max, tasks.get(i) + processorTime.get(j));
            
            j++;
        }
        return max;
        
    }
}