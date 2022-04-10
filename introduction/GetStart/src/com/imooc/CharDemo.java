/*
 * @Description: 
 * @Author: neozhang
 * @Date: 2022-04-09 22:57:07
 * @LastEditors: neozhang
 * @LastEditTime: 2022-04-09 23:02:56
 */
package com.imooc;

public class CharDemo {
	public static void main(String[] args) {
		char a='a';
		System.out.println("a="+a);  //a=a
		char ch=65535;
		char ch1=(char)65536;
		System.out.println("ch="+ch);  //ch=￿
		char c='\u005d';
		System.out.println("c="+c);  //c=]
	}
}
