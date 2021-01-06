package java_study2;

public class java_study2_HW2 {

	public static void main(String[] args) {
		//【10/18】1-1　2の1乗から8乗までを表示させる
		
		int i = 3;			//底
		int result = 3;		//結果初期値
				
		for(int n = 1; n <= 8 ;n ++)
		{	
			System.out.println(i +"の"+ n +"乗は" + result );
			result *= i;								//出力した結果に底の値をかける
		}

	}

}
