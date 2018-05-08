package cc.forever16.lambda;

import java.util.function.Consumer;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;
import java.awt.*;
import java.awt.event.*;
public class LambdaTest
{
	public static void main(String[] args)
	{
		String[] planets = new String[] { "Mercury" , "Venus", "Earth" , "Mars" ,"Jupiter" , "Saturn", "Uranus", "Neptune" };
		System.out.println(Arrays.toString(planets));
		System.out.println("Sorted in dictionary order:");
		Arrays.sort(planets);
		System.out.println(Arrays.toString(planets));
		System.out.println("Sorted by length:");
		Arrays.sort(planets,(first,second)->first.length()-second.length());
		System.out.println(Arrays.toString(planets));
		Timer t = new Timer(1000,event -> {
			//System.out.println("The time is " + new Date());
			Consumer<Object> stdout = System.out::println;
			stdout.accept("The time is " + new Date());
			Toolkit.getDefaultToolkit().beep();
		});
		t.start();
		JOptionPane.showMessageDialog(null, "Quit program?");
		System.exit(0) ;
	}
	public static void repeat(int n,Runnable action)
	{
		for(int i = 0;i < n;i++) action.run();
	}
}