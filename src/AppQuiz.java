import java.util.Scanner;
public class AppQuiz {
	public static void main(String[] args) {
		int a = toi1();
		int b = toi2();
		int c = toi3();
		int d = toi4();
		int e = toi5();
		int f = toi6();
		if(a == 1){
			System.out.println("正解");
		}else{
			System.out.println("不正解");
		}
		if(b == 1){
			System.out.println("正解");
		}else{
			System.out.println("不正解");
		}
		if(c == 1){
			System.out.println("正解");
		}else{
			System.out.println("不正解");
		}
		if(d == 1){
			System.out.println("正解");
		}else{
			System.out.println("不正解");
		}
		if(e == 1){
			System.out.println("正解");
		}else{
			System.out.println("不正解");
		}
		if(f == 1){
			System.out.println("正解");
		}else{
			System.out.println("不正解");
		}
	}
	public static int toi1(){
		//裕	耶担当
		return 1;
	}
	public static int toi2(){
		//中里
		Scanner sc = new Scanner(System.in);
		System.out.println("香風智乃ちゃんの誕生日は何月何日でしょう？");
		System.out.println("1:2/14  2:12/4  3:4/10 ");
		System.out.print("回答:  ");
		int ss,sss;
		for(;;){
			ss = sc.nextInt();
			if(ss == 1 || ss == 2 || ss == 3){
				break;
			}
		}
		if(ss == 2){
			System.out.println("正解です、これからもっと愛を深めていきましょう");
			sss = 1;
		}else{
			System.out.println("愛が足りませんね、不正解です");
			sss =0;
		}
		return sss;
	}
	public static int toi3(){
		//佐藤PDT大地@ダイブレッドマン
		return 1;
	}
	public static int toi4(){
		//ヒロキ
		return 1;
	}
	public static int toi5(){
		//マルチャン
		return 1;
	}
	public static int toi6(){
		//カサイクン
		return 1;
	}
}
