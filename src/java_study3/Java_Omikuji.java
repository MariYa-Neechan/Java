package java_study3;
//------------------------------Title------------------------------
//おみくじを引いて今日の運勢をだしてみよう・・・！
//----------------------------------------------------------------

//Class Import
import java.util.Random;
import java.util.Scanner;

public class Java_Omikuji {

	public static void main(String[] args) {
		//================変数定義================
		Scanner scan = new Scanner(System.in);						//新規スキャナークラスの作成
		Random random = new Random();								//新規ランダムクラスの作成
		String[] OMIKUJI = {"大吉","吉","中吉","小吉","半吉","凶"};		//おみくじの配列
		int OMIKUJIran = random.nextInt(6);							//randomClassによるインデックス番号
		//=======================================

		//============おみくじ処理文START==============
		System.out.println("おみくじ引いて、今日の運勢を見てみよう！( ✌︎'ω')✌︎");
		System.out.println("まずは、きみの名前を入力してね！");
		//ユーザーが任意で名前入力したら、playerNameに格納する
		String playerName = scan.nextLine();
		System.out.println(playerName+"さんの今日の運勢は・・・・・！");
		System.out.println(OMIKUJI[OMIKUJIran]+"です！");
		
		
	}

}
