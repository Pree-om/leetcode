class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>(); //<Int, Int>; num,frequency
        HashSet<Integer> set = new HashSet<>(); //is used when we only need unique elements
        for(int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else {
                map.put(arr[i], 1);
            }
        }
        for(int key : map.keySet()) {
            if(!set.add(map.get(key))) {
                return false;
            }
        }
        return true;
    }
}
