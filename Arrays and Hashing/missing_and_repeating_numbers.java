//Accepted
import java.util.*;
public class missing_and_repeating_numbers {
    public static int[] findMissingRepeatingNumbers(int []a) {
        int x[]=new int[2];
        HashMap<Integer,Integer> hm=new HashMap<>();
        int l=a.length;
        int r=0;
        int m=0;
        for(int i=0;i<l;i++){
            if(hm.containsKey(a[i])){
                hm.put(a[i], hm.get(a[i])+1);
            }
            else if(!hm.containsKey(a[i])){
                hm.put(a[i], 1);
            }
        }
        for(int i=1;i<=l;i++){
            if(hm.containsKey(i)){
                if(hm.get(i)>1){
                    r=i;
                }
            }
            else if(!hm.containsKey(i)){
                m=i;
            }
        }
        x[0]=r;
        x[1]=m;
        return x;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int resp[]=findMissingRepeatingNumbers(a);
        for(int i:resp){
            System.out.println(i);
        }
    }   
}