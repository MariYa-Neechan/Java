
package java_study2;

import java.util.Scanner;
import java.util.Random;

public class java_study2_rockpaperGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		String[] rps = {"グー","チョキ","パー"};		//*じゃんけん配列
		String[] names = {"大吉","中吉","小吉","吉","凶","大凶"};		//おみくじ配列
		int r = 0;
		int y = 0;								//変数　「あなた」
		int c = 0;								//変数　「相手」
		
		while(y<3 && c<3) {
			System.out.println("『0』『1』『2』を入力してください。（0→グー，1→チョキ，2→パー)");
			int n = sc.nextInt();	
			r = random.nextInt(3); 
			System.out.println("あなた："+ rps[n]);		//*コンソール入力後、『グー』『チョキ』『パー』をランダムで出力
			System.out.println("相手："+ rps[r]);		//*コンソール入力後、『グー』『チョキ』『パー』をランダムで出力

			//勝ちパターン
			if((n == 0 && r == 1) ||(n == 1 && r == 2)||(n == 2 && r == 0)) {
				 y ++;
				System.out.println("あなたの勝ちです。（" + y + "勝" + c + "敗）");		
			}
			//負けパターン
			if((n == 0 && r == 2) ||(n == 1 && r == 0)||(n == 2 && r == 1)) {
				c ++;
				System.out.println("あなたの負けです。（" + y + "勝" + c + "敗）");		
			}
			//あいこパターン
			if((n == 0 && r == 0) ||(n == 1 && r == 1)||(n == 2 && r == 2)) {
				System.out.println("あいこです。(現在の勝数　あなた:" + y +"勝　相手:" + c +"勝)" );		
			}
		}

		
		//どちらかが3勝したらおみくじを引く
		if(y == 3) {
			System.out.println("あなたがおみくじを引きます。");
			r = random.nextInt(6); 		//おみくじ配列数
			System.out.println("あなたのおみくじの結果: " + names[r]);		//おみくじの結果を表示		
		}else if(c == 3){
			System.out.println("相手がおみくじを引きます。");
			r = random.nextInt(6); 		//おみくじ配列数
			System.out.println("相手のおみくじの結果: " + names[r]);		//おみくじの結果を表示		
		}


	}

}
