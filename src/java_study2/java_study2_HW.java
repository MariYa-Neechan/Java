package java_study2;

import java.util.Random;

import java.util.Scanner;

public class java_study2_HW {

	public static void main(String[] args) {
		///BMIの計算
		double height = 1.61;
		double weight = 60.3;
		double BMI = weight / (height * height) ;


		if (BMI >= 18.5 && BMI <=25) 
			System.out.print("標準です。");
		else
			System.out.print("標準外です。");

		//スキャナーとランダムを使って問題を作ってみよう（10/14　課題）
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		int x = s.nextInt();
		int y = r.nextInt(3);
		System.out.print(y);
			}

}

