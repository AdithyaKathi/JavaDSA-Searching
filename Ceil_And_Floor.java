import java.util.*;
public class Main
{
    public static int ceiling(int[] arr,int x){
        int i = 0 , j = arr.length-1 , res = 1;;
        while(i <= j){
            int mid = (i+j)/2;
            if(arr[mid] == x){
                return arr[mid];
            }else if(arr[mid] < x){
                i = mid+1;
            }else{
                res = arr[mid];
                j = mid-1;
            }
        }
        return res;
    }
    public static int floor(int[] arr,int x){
        int i = 0, j = arr.length-1,res = -1;
        while(i <= j){
            int mid = (i+j)/2;
            if(arr[mid] == x){
                return arr[mid];
            }else if(arr[mid] < x){
                res = arr[mid];
                i = mid+1;
            }else{
                j = mid-1;
            }
        }
        return res;
    }
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = {10,20,30,40,50,60,70,80,90,100};
		int target = scan.nextInt();
		int ceil = ceiling(arr,target);
		int flr = floor(arr,target);
		System.out.println("Array = "+Arrays.toString(arr));
		System.out.println("Flooring Of "+target+" Is = "+floor(arr,target));
		System.out.println("Ceiling Of "+target+" Is = "+ceil);
		
		scan.close();
	}
}
