
package NumberDeduplicating;

import java.util.Scanner;
import utils.deleting;


/**
 *
 * @author D00251715
 */
public class NumberDeduplication {
    public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//        
      int [] arr = new int[]{10, 20, 10, 20, 60, 10, 5, 60, 5, 60,10};
//        
//        for(int i = 0; i<nums.length;i++){
//        
//            System.out.println("Enter a number for an array");
//            nums[i] = sc.nextInt();   
//        }
      // deleting.print(utils.dedupArray.dedupArr(arr));
//        
      //  System.out.println("************");
    //deleting.print(deleting.resizeDeletePositionAll(arr, 10));
//        System.out.println("*************");
//    deleting.print(deleting.resizeDeletePositionLast(arr, 10));
deleting.shiftDel(arr, 10);
    }
    
}
