import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class array {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        //int length=s.nextInt();
        //int[] arr=new int[length];
         // for(int i=0;i<arr.length;i++){
        //     arr[i]=s.nextInt();
        // }
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }
        List<Integer> arr=new ArrayList<Integer>();
       while(s.hasNextInt()){
        arr.add(s.nextInt());
       }
       System.out.println(arr);
       for(int i:arr){
        System.out.println(i);
       }
       Integer ar[]=new Integer[arr.size()];
       ar=arr.toArray(ar);
       for(Integer i=0;i<ar.length;i++){
        System.out.println(ar[i]);
       }
       s.close();
    }
}
