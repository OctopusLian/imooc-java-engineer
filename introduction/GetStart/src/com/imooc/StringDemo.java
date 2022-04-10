/*
 * @Description: 
 * @Author: neozhang
 * @Date: 2022-04-09 22:57:07
 * @LastEditors: neozhang
 * @LastEditTime: 2022-04-09 23:03:34
 */
package com.imooc;

public class StringDemo {

	public static void main(String[] args) {
		String s1="";
		System.out.println("s1="+s1);  //s1=
		String s2="Hello"; 
		System.out.println("s2="+s2);  //s2=Hello
		String s3="A\u005d\u005fB";
		System.out.println("s3="+s3);  //s3=A]_B
		String s4="Hello   imooc!";
		System.out.println("s4="+s4);  //s4=Hello   imooc!
	}

}
