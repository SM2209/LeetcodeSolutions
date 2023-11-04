class RandomizedSet {
    ArrayList<Integer> list;
    static Random random = new Random();
    public RandomizedSet() {
        list = new ArrayList<>();
    }

    public boolean insert(int val) {
        int res = Collections.binarySearch(list, val);
        if (res < 0) {
            list.add(-res - 1, val);
            return true;
        } else return false;
    }

    public boolean remove(int val) {
        int res = Collections.binarySearch(list, val);
        if (res < 0) {
            return false;
        } else {
            list.remove(res);
            return true;
        }
    }

    public int getRandom() {
        return list.get(random.nextInt(list.size())); 
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */