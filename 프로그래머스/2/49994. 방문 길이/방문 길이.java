import java.util.*;

class Solution {
        
    private static boolean checkMove(int x, int y){
        return -5 <= x && x <= 5 && -5 <= y && y <= 5;
    }
    
    public int solution(String dirs) {
        HashSet<String> hashSet = new HashSet<>();
        
        int x = 0;
        int y = 0;
        
        for(int i=0;i<dirs.length();i++){
            int nx = x;
            int ny = y;
            String s="";
            
            if(dirs.charAt(i)=='U'){
                ny++;
                s+=x+""+y+" "+nx+""+ny;
            }else if(dirs.charAt(i)=='D'){
                ny--;
                s+=nx+""+ny+" "+x+""+y;
            }else if(dirs.charAt(i)=='R'){
                nx++;
                s+=x+""+y+" "+nx+""+ny;
            }else{
                nx--;
                s+=nx+""+ny+" "+x+""+y;
            }
            if(!checkMove(nx, ny)){
                continue;
            }
            hashSet.add(s);
            
            x=nx;
            y=ny;
        }
        System.out.println(hashSet);
        return hashSet.size();
    }
}