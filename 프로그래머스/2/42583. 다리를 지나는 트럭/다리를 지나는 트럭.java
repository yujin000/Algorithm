import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> bridge = new LinkedList<>(); 
        int time = 0; 
        int currentWeight = 0; 
        
        for (int truckWeight : truck_weights) {
            while (true) {
                if (bridge.isEmpty()) { 
                    bridge.offer(truckWeight);
                    currentWeight += truckWeight; 
                    time++; 
                    break;
                } else if (bridge.size() == bridge_length) { 
                    currentWeight -= bridge.poll(); 
                } else { 
                    if (currentWeight + truckWeight > weight) { 
                        bridge.offer(0); 
                        time++; 
                    } else { 
                        bridge.offer(truckWeight); 
                        currentWeight += truckWeight; 
                        time++; 
                        break;
                    }
                }
            }
        }
        time += bridge_length;
        
        return time;
    }
}