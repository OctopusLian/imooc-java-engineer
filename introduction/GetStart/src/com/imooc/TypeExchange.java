/*
 * @Description: 
 * @Author: neozhang
 * @Date: 2022-04-09 22:57:07
 * @LastEditors: neozhang
 * @LastEditTime: 2022-04-09 23:04:04
 */
package com.imooc;

public class TypeExchange {

	public static void main(String[] args) {
		char c=(char)65536;
		int n;
		n=c;
		c=(char)n;
		int x=100;
		long y=x;
		x=(int)y;
		float f=100000000000000L;
		System.out.println("f="+f);  //f=1.0E14
		float f1=103948583923948L;
		System.out.println("f1="+f1);  //f1=1.03948585E14

	}

}
