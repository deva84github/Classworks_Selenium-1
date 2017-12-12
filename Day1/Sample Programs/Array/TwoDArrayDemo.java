public class TwoDArrayDemo
{

 public static void main(String[] args)
 {
  int[] single1 = {4,7,9};
  int[] single2 = {12,16};
  int[][] arr = new int[2][4];
  System.out.println(java.util.Arrays.deepToString(arr));

  arr[0] = single1;//these assignment overrides 4 column initialization
  arr[1] = single2;
  System.out.println(java.util.Arrays.deepToString(arr));
  //another way of declaration
  int[]  vals[] = new int[2][];
   vals[0] = new int[]{7,6,5};
   vals[1] = new int[]{6,5,4,3,9};
   System.out.println(java.util.Arrays.deepToString(vals));
  
   int[]  other[] = {
		             {7,6,5},
		             {6,5,4,3,9}
                    };
   System.out.println(java.util.Arrays.deepEquals(vals, other));
   for(int[] first : other){
	   for(int content : first) {
		   System.out.print(" "+content);
	   }
	   System.out.println();
   }
 
 }

}