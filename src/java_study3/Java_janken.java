package java_study3;

import java.util.Random;
import java.util.Scanner;

//------------------------------Title------------------------------
//						じゃんけんゲームをしよう！
//----------------------------------------------------------------

public class Java_janken {

	public static void main(String[] args) {
		//================変数定義================
		Scanner scan = new Scanner(System.in);		//新規スキャナークラスの作成
		Random random = new Random();				//新規ランダムクラスの作成
		String[] RPS = {"グー","チョキ","パー"};		//じゃんけん配列
		int playerWin = 0;							//プレイヤーの勝数の初期値
		int cpWin = 0;								//相手の勝数の初期値
		//=======================================
		
		//============ジャンケン処理文START==============
		//実行後初期出力
		System.out.println("☆じゃんけんゲーム開始！☆");
		System.out.println("あなたの名前を入力してください。");
		
		//ユーザーが任意で名前入力したら、playerNameに格納する
		String playerName = scan.nextLine();
		System.out.println(playerName + "さんですね！");
		while(playerWin>3&&cpWin>3) {
			System.out.println(playerName + "さん、半角数字で『0』『1』『2』を入力してください。");
			System.out.println("※『0』→グー、『1』→チョキ、『2』→パー");	//0~2=>じゃんけんの配列のインデックス番号のこと
			//プレイヤーがじゃんけんの値を入力したらスキャンをしてplayerRPSに格納する	
			int playerRPS = scan.nextInt();	
			//相手（cp）のじゃんけんの値をランダムで選びcpRPSに格納
			int cpRPS = random.nextInt(3);	
			//ユーザーと相手のそれぞれのじゃんけん配列インデックス番号より、じゃんけんの値を表示
			System.out.println(playerName + "："+RPS[playerRPS]);	
			System.out.println("相手："+RPS[cpRPS]);
			//-------判定処理-------
			//プレイヤーが勝つ場合(playerWinに勝ち数を入れる）
			if((playerRPS == 0 && cpRPS == 1) ||(playerRPS == 1 && cpRPS == 2)||(playerRPS == 2 && cpRPS == 0)) {
				System.out.println(playerName + "さんの勝ち！やったね！( ＾∀＾)");
				playerWin ++;
			//プレイヤーが負ける場合(cpWinに勝ち数を入れる）			
			}else if((playerRPS == 0 && cpRPS == 2) ||(playerRPS == 1 && cpRPS == 0)||(playerRPS == 2 && cpRPS == 1)) {
				System.out.println("残念・・・負けちゃった(´；ω；`)");
				cpWin ++;
			//あいこの場合	
			}else if((playerRPS == 0 && cpRPS == 0) ||(playerRPS == 1 && cpRPS == 1)||(playerRPS == 2 && cpRPS == 2)) {
				System.out.println("あいこ！いい勝負だな！(　ﾟдﾟ)");
			}
		}	
	}
		//============ジャンケン処理文END==============		

	
}
