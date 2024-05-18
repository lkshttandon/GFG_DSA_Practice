import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        // System.out.println("Try programiz.pro");
        GFG g = new GFG();
        int n = 10;
        int i = 0;
        System.out.println("\nFibonacci till " + n);
        while(i<10){
            System.out.print(g.fibn(i)+" ");
            i++;
        }
        System.out.println("\n");
        int a = 45;
        int b = 75;
        System.out.println("GCD of " + a +" & " +b+ ": "+g.gcd(a,b));
        
        int[] sampArr = {12,45,54};
        System.out.println("\nGCD of " + Arrays.toString(sampArr) + ": " + g.gcdOfArray(sampArr));
        
        ArrayList<Integer> slist = new ArrayList<>();
        slist.add(2);
        slist.add(3);
        slist.add(5);
        ArrayList<Integer> res = new ArrayList<>();
        g.backTrack(slist,0,8,res);
    }
}

class GFG {
    public void GFG(){};
    public int fibn(int n){
        if(n==0 || n ==1) return n;
        // System.out.println(n);
        return fibn(n-1) + fibn(n-2);
    }
    
    public int gcd(int a, int b){
        if(a == 0) return b;
        if(b == 0) return a;
        if(a>b) return gcd(a-b,a);
        if(a<b) return gcd(a,b-a);
        return a;
    }
    
    public int gcdo(int a, int b){
        if(a==0) return b;
        return gcd(b%a,a);
    }
    
    public int gcdOfArray(int num[]){
        
        int var = num[0];
        for(int i=1; i<num.length; i++){
            var = gcdo(var,num[i]);
        }
        return var;
    }
    
    public void backTrack(ArrayList<Integer> num,int start, int target, ArrayList<Integer> res){
        if(target<0) return;
        if(target == 0){
            System.out.println(res);
            return;
        }
        for(int i = start; i<num.size(); i++){
            res.add(num.get(i));
            backTrack(num,start,target - num.get(i),res);
            res.remove(res.size()-1);
        }
    }
}

