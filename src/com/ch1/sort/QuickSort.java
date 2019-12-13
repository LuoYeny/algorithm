package com.ch1.sort;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/12/12 10:34
 */
public class QuickSort {
    private static int sort(int[]arry,int low, int high) {
        int tmp = arry[low];

        while(low<high){
            while (tmp<=arry[high]&&low< high){//右边
                high--;
            }
             arry[low]=arry[high];
            while(tmp>=arry[low]&&low< high){//左边
                low++;

            }
            arry[high]=arry[low];
        }
        for (int i = 0; i <arry.length ; i++) {
            System.out.print(arry[i]+" ");

        }
        System.out.println();
        arry[high]=tmp;


        return high;

    }

    public static int[] quicksort(int[] arry,int low,int high){
        if (low < high){ //边界条件 结束递归
            int index = sort(arry,low,high);

            quicksort(arry,0,index-1);
            quicksort(arry,index+1,high);
        }


        return arry;

    }

    public static void main(String[] args) {
        int[] arry={5,7,4,2,9,1};
        arry =quicksort(arry,0,arry.length-1);
        for (int i = 0; i <arry.length ; i++) {
            System.out.print(arry[i]+" ");

        }
    }
}
