package com.ch1.sort;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/12/5 14:39
 */
public class SelectionSort<T extends Comparable>  {
    public   Comparable[] sort(T [] arry){

        int lengh = arry.length;
        for (int i = 0; i <lengh ; i++) {
            int min = i;
            System.out.println("i"+i+" :  "+arry[i]);
            for (int j = i+1; j <lengh ; j++) {

                if(arry[min].compareTo(arry[j])==1){
                    System.out.println("j"+j+" :  "+arry[j]);
                       min=j;
                }

            }
            System.out.println("min"+min+" :  "+arry[min]);
            if(min!=i){
                T tmp  ;
                tmp= arry[i];
                arry[i]=arry[min];
                arry[min]=tmp;

            }

          //  System.out.println("i"+i+" :  "+arry[i]);
        }
        return  arry;
    }


    public static void main(String[] args) {
        Integer[] arry = {4,5,2,2,4,1,4,6,8,5};
       SelectionSort<Integer> selectionSort = new SelectionSort<>();

       arry=(Integer[])selectionSort.sort(arry);

        for (int i = 0; i < arry.length; i++) {
            System.out.print (arry[i]+" " );
        }


    }
}
