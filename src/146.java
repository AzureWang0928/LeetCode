class LRUCache {
    int capacity;
    int count;
    HashMap<Integer, DoubleLinkedNode> cache = new HashMap();
    DoubleLinkedNode head;
    DoubleLinkedNode tail;
    
    public LRUCache(int capacity) {
        this.capacity = capacity;
        count = 0;
        head = new DoubleLinkedNode();
        head.prev = null;
        tail = new DoubleLinkedNode();
        tail.next = null;
        head.next = tail;
        tail.prev = head;
        
    }
    
    //Add to the head
    public void addNode(DoubleLinkedNode node){
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }
    
    //Remove from the list
    public void removeNode(DoubleLinkedNode node){
        DoubleLinkedNode prev = node.prev;
        prev.next = node.next;
        node.next.prev = prev;
    }
    
    //Remove from tail
    public int removeTail(){
        DoubleLinkedNode node = tail.prev;
        removeNode(node);
        return node.key;
    }
    
    // public void removeTail(Double)
    
    public int get(int key) {
        if(!cache.containsKey(key)){
            return -1;
        }
        else{//find the node
            removeNode(cache.get(key));
            addNode(cache.get(key));
            return cache.get(key).val;
        }
        
        
    }
    
    public void put(int key, int value) {
        if(cache.containsKey(key)){
            DoubleLinkedNode node = cache.get(key);
            node.val = value;
            removeNode(node);
            addNode(node);    
        }
        else{//not in the map
            DoubleLinkedNode node = new DoubleLinkedNode(key, value);
            cache.put(key, node);
            addNode(node);
            count++;
            if(count > capacity){
                int removeKey = removeTail();
                cache.remove(removeKey);
                count--;
            }
        }
    }
}

class DoubleLinkedNode{
    int key;
    int val;
    DoubleLinkedNode prev;
    DoubleLinkedNode next;
    
    public DoubleLinkedNode(){

    }
    
    public DoubleLinkedNode(int key, int val){
        this.key = key;
        this.val = val;
    }
}


/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
