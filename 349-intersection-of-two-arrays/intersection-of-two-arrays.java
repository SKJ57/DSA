class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int n: nums1){
            set1.add(n);
        }
        for(int i: nums2){
            set2.add(i);
        }
        HashSet<Integer> cSet = new HashSet<>(set1);
        cSet.retainAll(set2);
        List<Integer> ls = new ArrayList<>(cSet);
        int[] arr = new int[ls.size()];
        for(int i=0; i<arr.length; i++){
            arr[i] = ls.get(i);
        }

        return arr;
    }
}