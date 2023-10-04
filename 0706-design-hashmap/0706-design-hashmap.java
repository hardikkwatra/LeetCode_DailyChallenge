class MyHashMap {
ArrayList<Integer> map; 
    public MyHashMap() {
      this.map=new ArrayList<>(100000+1);
      for(int i=0;i<1000000+1;i++){
          map.add(null);
      }
    }
    
    public void put(int key, int value) {
        map.set(key,value);
    }
    
    public int get(int key) {
        if(map.get(key)==null){
            return -1;
        }
        else{
            return map.get(key);
        }
    }
    
    public void remove(int key) {
        map.set(key,null);
    }
}
