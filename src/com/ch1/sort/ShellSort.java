package com.ch1.sort;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/12/9 10:37
 */
public class ShellSort {
    public static int[] sort(int[] arry){
        int length = arry.length;
        int gap ;
        //增量控制
        for (gap = length / 2; gap > 0; gap /= 2){
            //控制起点
            for (int i = 0; i <gap ; i++) {
            //插入排序
                for (int j = i+gap; j <length ; j=j+gap ) {

                    if(arry[j]<arry[j-gap]){

                        int tmp = arry[j];
                        for (int k = j; k >=j-gap ;k=k-gap  ) {
                            if(k>j-gap&&tmp<arry[k-gap]){
                                arry[k]=arry[k-gap];//右移

                            }else {
                                arry[k]=tmp;
                                break;
                            }

                        }  
                    }

                }
            }

        }

           return arry;
    }

    public static void main(String[] args) {
        int[] arry = {4,5,2,2,4,1,4,6,8,5,9};


        arry= sort(arry);

        for (int i = 0; i < arry.length; i++) {
            System.out.print (arry[i]+" " );
        }

    }
}
