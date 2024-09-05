package Strings;

public class ShortestPath {
    public static float shortestpath(String path){
        int x=0,y=0;
        for(int i=0; i<path.length(); i++){
            char dir = path.charAt(i);

            if(dir=='S'){
                y--;
            }
            
            if(dir=='N'){
                y++;
            }
            
            if(dir=='E'){
                x++;
            }
            
            if(dir=='W'){
                x--;
            }
        }
            int x2 = x*x;
            int y2 = y*y;
            return (float) Math.sqrt(x2+y2);
        

    }
    public static void main(String args[]){
        String path = "WNEENESENNN";
        System.out.print(shortestpath(path));

    }
    
}
