package java_study3;

import java.util.Random;
import java.util.Scanner;

public class java_study3_fortune {

	public static void main(String[] args) {
		//【変数定義】//
		 	Scanner scan = new Scanner(System.in);
			Random random = new Random(); 		
			String[] namesSign = {"おひつじ座","おうし座","ふたご座","かに座","しし座","おとめ座","てんびん座","さそり座","いて座","やぎ座","みずがめ座","うお座"};	//12星座配列
			int[] rank = {1,2,3,4,5,6,7,8,9,10,11,12}; 
			
			//【コンソール入出力】//
			System.out.println("*:..。o○☆○o。..:*゜*:..。o○ 今日の占い ○o。..:*゜*:..。o○☆○o。..:*゜*:..。"); 	//タイトル
			System.out.println("貴方の生まれた月を教えてください。（1～12までの半角数値で入力）");					//誕生月の質問
			int month = scan.nextInt();																//入力した誕生月の読込
			System.out.println("貴方の生まれた日を教えてください。（1～31までの半角数値で入力）");					//誕生日の質問		
			int day = scan.nextInt();																//入力した誕生日の読込
			int numSign = judgeSign(month,day);														//入力した月と日を【星座判別メソッド】へ値を渡し、判別した値を返す
			if (numSign >= 0 && numSign <=11) {
				System.out.println("貴方の誕生日は" + month + "月" + day + "日で、星座は" + namesSign[numSign] + "ですね。");						
				int randomRank = random.nextInt(12);			
				System.out.println("今日の"+ namesSign[numSign] +"の運勢は・・・" + rank[randomRank] + "位です！");
			}else if(numSign == 12){
				System.out.println("存在しない誕生日です。もう１度やり直してください。");
			}
			}
		
		//【星座判別メソッド】//
		private static int judgeSign(int month,int day) {

			if(3 == month && day >=21 || 4 == month && day<=19) {				//誕生日がおひつじ座の場合
				return 0; 
			}else if((4 == month && day >=20)||(5== month && day <=20)){		//誕生日がおうし座の場合
				return 1;
			}else if((5 == month && day >=21)||(6== month && day <=21)) {		//誕生日がふたご座の場合
				return 2; 
			}else if((6 == month && day >=22) ||(7== month && day <=22 )) {		//誕生日がかに座の場合
				return 3;
			}else if((7 == month && day >=23) ||(8 == month && day <=22 )) { 	//誕生日がしし座の場合    	
				return 4;
			}else if((8 == month && day >=23) ||(9 == month && day <=22 )) {	//誕生日がおとめ座の場合    	
				return 5;
			}else if((9 == month && day >=23) ||(10 == month && day <=22 )) { 	//誕生日がてんびん座の場合     	
				return 6;
			}else if((10 == month && day >=23) ||(11 == month && day <=22 )) {	//誕生日がさそり座の場合     	
				return 7;
			}else if((11 == month && day >=23) ||(12 == month && day <=21 )) {	//誕生日がいて座の場合      	
				return 8;
			}else if((12 == month && day >=22) ||(1 == month && day <=20 )) {	//誕生日がやぎ座の場合    	
				return 9;
			}else if((1 == month && day >=21) ||(2 == month && day <=18 )) {	//誕生日がみずがめ座の場合    	
				return 10;
			}else if((2 == month && day >=19) ||(3 == month && day <=20)) {		//誕生日がうお座の場合   	
				return 11;
			}
			return 12;
			
	}

}
