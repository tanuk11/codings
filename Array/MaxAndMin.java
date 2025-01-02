import java.util.*;

public Class MaxAndMin{

  public static void main(String[] args){
    // Scanner sc = new Scanner(System.in);
     
    // [3,10,4,8,22]
    int[] arr = {3,10,4,8,22};

    System.out.println("max element in the array" + max(arr));
    System.out.println("min element in the array" + min(arr));
  }


  public static int max(int[] arr){
    // max element
    int max = -1;
    for(int i=0; i < arr.length;i++){
        if(max < arr[i]){
            max = arr[i];
        }
       
    }
    return max;
  }

  public static int min(int[] arr){
    //min element
    int min = MAX.INTEGER;
    for(int i=0;i<arr.length;i++){
        if(min > arr[i]){
            min = arr[i];
        }
    }
    return min;
  }


}