package testProjectGroup.testArti;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public  class JavaPrograms  {
	
	public static void main(String args[]) {
	
		// rev of string
		/*
		 * String s="naren"; char ch[]=s.toCharArray(); 
		 * String rev="";
		 *  for(int i=s.length()-1;i>=0;i--) {
		 * 
		 * rev= rev+ch[i]; } System.out.println(rev);
		 */
		//check if prime or not
		/*
		 * int n=8; int ct=0;
		 *  for(int i=2;i<n;i++) {
		 *  if(n%i==0) {
		 *   ct++; 
		 *   } 
		 *   else {
		 * 
		 * }
		 *  } 
		 *  if(ct>=1) { System.out.println("not prime"); }else {
		 * System.out.println(" prime"); }
		 */
		// print prime numbers
		
		/*
		 * int n = 80;
		 * 
		 * for (int i = 1; i <= n; i++) { int ct = 0; for (int j = 1; j <=i; j++) { if
		 * (i % j == 0) { ct++; }
		 * 
		 * } if(ct==2) { System.out.println(i); } }
		 */
		
		// sorting
		/*
		 * int a[]= {3,3,2,3,1,4};
		 * 
		 * for(int i=0;i<a.length;i++) {
		 *  for(int j=i+1;j<i;j++) {
		 *   if(a[i]>a[j]) { 
		 *   int
		 * temp=a[i]; a[i]=a[j]; a[j]=temp;
		 * 
		 * } } }
		 * 
		 * for(int i=0;i<a.length;i++) { System.out.println(a[i]); }
		 */
		
		/*
		 * List<String> a=new ArrayList<String>(); a.add("nren"); a.add("venku");
		 * a.add("3");
		 * 
		 * 
		 * 
		 * // Collections.synchronizedList(a); Iterator<String> itr=a.iterator();
		 * while(itr.hasNext()) { String str=itr.next(); if(str.equals("3")) {
		 * a.remove(2); } }
		 */
		
		// removing duplicates from a string and print
		//input : nareen op : nare   2) ip: aaad op: ad
		
		/*
		 * String s="aaaddddaaadb"; char ch[]=s.toCharArray();
		 * 
		 * for(int i=0;i<s.length();i++) {
		 *  int count = 0;
		 *   for(int j=i+1;j<s.length();j++) { 
		 *   if(ch[i]==ch[j]) { 
		 *   count++; 
		 *   } 
		 *   } if(count==0) {
		 * System.out.println(ch[i]); 
		 * } }
		 */
		
		//identify duplicate and print them ex : ip:aadddb op : ad
		
		/*
		 * String s="aaaddddaaadb"; char ch[]=s.toCharArray(); ArrayList<Character>
		 * a=new ArrayList<Character>();
		 * 
		 * for(int i=0;i<s.length();i++) 
		 * { 
		 * int count = 0;
		 *  for(int j=i+1;j<s.length();j++) { 
		 *  if(ch[i]==ch[j]) {
		 *   count++; 
		 *   } 
		 *   } if(count>0) {
		 * if(!a.contains(ch[i])) { 
		 * a.add(ch[i]); }
		 * 
		 * } }
		 * 
		 * System.out.println(a);
		 */
		
		//print non repeated chars ip : aaabbbeddc op : ec
		/*
		 * String s="aaaeeerrrbrrrccck"; char ch[]=s.toCharArray(); ArrayList<Character>
		 * a=new ArrayList<Character>();
		 * 
		 * for (int i = 0; i < s.length(); i++) { int count = 0; for (int j = 0; j <
		 * s.length(); j++) { if (i != j) { if (ch[i] == ch[j]) { count++; } } }
		 * 
		 * if (count == 0) { System.out.println(ch[i]); } }
		 */
		
	//print fib seriess
		/*
		 * int a=0,b=0,c=1,n=10; for(int i=0;i<n;i++) { a=b; b=c; c=a+b;
		 * System.out.println(a); }
		 */
		
		//swapping without 3rd variable
		/*
		 * int a=2,b=3;
		 * 
		 * b=a+b; a=b-a; b=b-a; System.out.println(a); System.out.println(b);
		 */
		
		//subarray
		int val=0;
		int a[] = { 3, 2, 6, 1, 9, 10 };
		int arrSize = a.length;
		// start point
		for (int i = 0; i < arrSize; i++) {
			// group sizes
			for (int j = i; j <= arrSize; j++) {
				int temp = 1;
				for (int k = i; k < j; k++) {
					System.out.print(a[k] + " ");
					temp = temp * a[k];
				}
				System.out.println("Answer is:" + temp);
				
				
				if(temp>val) {
					 val=temp;
				}
			}
		}
		System.out.println("largest is"+val);
		
	}
}
