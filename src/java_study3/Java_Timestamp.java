package java_study3;

//timestampクラスをimportする必要がある
import java.sql.Timestamp;

//Timestampで現在日時を取得する
public class Java_Timestamp {

	public static void main(String[] args) {
		// timestampコントラスタ作成
		Timestamp timeStmp = new Timestamp(System.currentTimeMillis());
		//出力
		System.out.println(timeStmp);
	}

}
