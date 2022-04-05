import java.util.Scanner;

/*
 * @Description: 从键盘接收整型数据存到数组中，并对数组中的数据进行管理
 * @Author: neozhang
 * @Date: 2022-04-05 17:57:53
 * @LastEditors: neozhang
 * @LastEditTime: 2022-04-05 18:23:23
 */

public class DataManage {
/**
 * 从键盘接收数据
 * @return 接收数据的数组
 */
    public int[] insertData() {
        int[] a = new int[10];
        Scanner sc = new Scanner(System.in);
        //少接收一个数据，为在指定位置处插入数据做准备
        for (int i = 0;i < a.length-1;i++) {
            System.out.println("请输入第"+(i+1)+"个数据:");
            a[i] = sc.nextInt();
        }
        return a;
    }
    public static void main(String[] args) {
        DataManage dm = new DataManage();
        int[] a = dm.insertData();
        for(int n:a) {
            System.out.println(n+" ");
        }
    }
}
