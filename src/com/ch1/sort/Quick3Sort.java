package com.ch1.sort;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/12/12 15:01
 */
public class Quick3Sort {


   private static  void  exchange( int[]a ,int i,int j )
 {
             int tmp=a[i];
              a[i]=a[j];
             a[j]=tmp;
          }


       public static   void qsort3way (int[]a, int lo,int hi )
  {

             if( lo>=hi ) return;  //单个元素或者没有元素的情况
             int lt=lo;
           int i=lo+1;  //第一个元素是切分元素，所以指针i可以从lo+1开始
             int gt=hi;
               int v=a[lo];
           while( i<=gt )
                 {
                    if( a[i]<v )  //小于切分元素的放在lt左边，因此指针lt和指针i整体右移
                            exchange( a,lt++,i++ );
                    else if ( a[i]>v )  //大于切分元素的放在gt右边，因此指针gt需要左移
                            exchange( a,i,gt-- );
                    else
                         i++;
                }
      for (int j = 0; j <a.length ; j++) {
          System.out.print(a[j]+" ");

      }
      System.out.println("  lt: "+lt+"   "+"gt: "+gt +"   "+"i: "+i);
            //lt-gt的元素已经排定，只需对it左边和gt右边的元素进行递归求解
              qsort3way( a,lo,lt-1 );
              qsort3way( a,gt+1,hi );
          }

    public static void main(String[] args) {
        int[] arry = { 4,1,3,4,1,2,5,8,5,9,5};
        qsort3way(arry,0,arry.length-1);

        for (int i = 0; i <arry.length ; i++) {
            System.out.print(arry[i]+" ");

        }
    }
}
