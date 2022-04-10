/*
 * @Description: 
 * @Author: neozhang
 * @Date: 2022-04-09 23:21:05
 * @LastEditors: neozhang
 * @LastEditTime: 2022-04-09 23:21:14
 */
package com.imooc.flow;

public class IntCompare {

	public static void main(String[] args) {
		// 定义两个整型变量并初始化
		int x=5,y=15;
		//判断x和y是否相等
		if(x!=y){
			if(x>y){
				System.out.println(x+"大于"+y);
			}else{
				System.out.println(x+"小于"+y);
			}
		}else{
			System.out.println(x+"和"+y+"相等");
		}
		if(x!=y)
			if(x>y)
				System.out.println(x+"大于"+y);
		else
			System.out.println(x+"和"+y+"相等");

	}

}
