package java_study2;

//------------------------------Title------------------------------
//  国語と数学のテストで、４段階判定をする（if文）
//----------------------------------------------------------------

public class java_study2_examResult {

	public static void main(String[] args) {
		// ------　変数定義　------
		int japaneseScore = 50;						//国語の点数
		int mathScore = 50;							//数学の点数
		int totalScore = japaneseScore + mathScore;	//２科目の合計点数
		
		//-----------------------
		
		//------　条件式　---------
		//１科目でも４０点未満であれば『追試』
		if (japaneseScore < 40 || mathScore <40) {
			System.out.println("１科目でも４０点未満のため追試");
		//合計点数が１６０点以上であれば『優』
		}else if(totalScore>=160){
			System.out.println("優");
			System.out.println("よくできました！");
		//合計点数が１６０点未満〜１４０点以上であれば『良』	
		}else if(totalScore<160 && totalScore>=140){
			System.out.println("良");
			System.out.println("いいですね！でもまだいけるはず！");
		//合計点数が１４０点未満〜１００点以上であれば『可』	
		}else if(totalScore<140 && totalScore>=100){
			System.out.println("可");
			System.out.println("ギリギリセーフ・・・！次はもっとがんばりましょう！");
		//合計点数が１００点未満であれば『追試』				
		}else if(totalScore<100){
			System.out.println("追試");
			System.out.println("残念・・・。勉強もっとがんばりましょう・・・。");			
		}
		
		
	}

}
