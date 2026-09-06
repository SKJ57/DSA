class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
            int ans = -1;
            int minDist = Integer.MAX_VALUE;
        for(int i=0; i<drones.length; i++){
            int dist = Math.abs(target[0]-drones[i][0]) + Math.abs(target[1]-drones[i][1]);
            if(dist <= drones[i][2] && dist < minDist){
                minDist = dist;
                ans =  i;
            }
        }
        return ans;
    }
}