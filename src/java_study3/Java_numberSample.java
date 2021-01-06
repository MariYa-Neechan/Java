package java_study3;
//-----素数判定-----
import java.util.Scanner;
public class Java_numberSample {

	public static void main(String[] args) {
		//変数定義
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		
		//入力した値が1より大きい整数は素数ではない
		if(number<2) {
			System.out.println(number + "は素数ではない。");
			return;
		}
		
		//1と自分自身でしか割り切れる数が存在する場合、素数ではない。
		for(int i = 2; i < number; i++ ) {
			if(number % i == 0) {
				System.out.println(number + "は素数ではない。");
				return;
			}
		}
		
		//割り切れる数がない場合、素数である。
		System.out.println(number + "は素数である！");
		
	}

}
