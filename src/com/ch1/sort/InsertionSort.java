package com.ch1.sort;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/12/6 10:03
 */
public class InsertionSort {
    public static int[] sort(int[] arry){
        int length = arry.length;
        int tmp;
        for (int i = 0; i <length-1 ; i++) {
            if (arry[i] > arry[i+1]) {
                for (int j = 0; j <i+1 ; j++) {
                   if(arry[i+1]<arry[j]){
                      tmp= arry[i+1] ;
                       for (int k = i; k >=j ; k--) {
                           arry[i+1]=arry[k];

                       }
                       arry[j]=tmp;
                   }
                }
            }

        }
             return arry;
    }

    public static int[] sort2(int[] arry){
        int length = arry.length;
        for (int i = 1; i <length ; i++) {
            int tmp=arry[i]  ;

            if(arry[i-1]>arry[i]){
                for (int j = i; j >=0 ; j--) {

                          if(j>0&&tmp<arry[j-1]){
                              arry[j]=arry[j-1];
                          }else {
                              arry[j]=tmp;
                              break;
                          }

                }


            }

        }

        return arry;
    }






    public static void main(String[] args) {
            int[] arry = {3,2,4,1,5,4,6,7,8,2,3,2,3,2,2,23,1,34,11,2,3,3,22,4,66,75,44,24,5,3,6,3,7};
            int[] arry1={4,6,2,3};
        System.out.println(arry .length);
            arry = sort2(arry );
        System.out.println(arry .length);
        for (int i = 0; i <arry .length ; i++) {
            System.out.print(arry [i]+"  ");
        }
    }
}
