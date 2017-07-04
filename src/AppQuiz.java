import java.util.Scanner;

public class AppQuiz {
	public static void main(String[] args) {

		int a = toi1();
		int b = toi2();
		int c = toi3();
		int d = toi4();
		int e = toi5();
		int f = toi6();
	}
	public static int toi1(){
		//裕	耶担当
	}
	public static int toi2(){
		//中里
	}
	public static int toi3(){
		//佐藤PDT大地@ダイブレッドマン
	}
	public static int toi4(){
		//ヒロキ
	}
	public static int toi5(){
		//マルチャン
		Scanner sc = new Scanner(System.in);
		System.out.println("一度あなに入ると、なかなか出てこない「虫」って何？：");
		System.out.println("1:でんでんむし、２：かぶとむし、３：くわがたむし");
		System.out.print("数字で答えてください：");
		int z = sc.nextInt();
		switch ( z ){
		case 1 : System.out.println("でんでんむしが選択されました");
				break ;
		case 2 : System.out.println("かぶとむしが選択されました");
				break ;

		case 3 : System.out.println("くわがたむしが選択されました");
				break ;

		default : System.out.println("1～３の数字を選択してください");
				toi5();
		}
		 return z ;
	}
	public static int toi6(){
		//カサイクン
		Scanner sc = new Scanner(System.in);
		System.out.println("入口１つ、出口３つってなんだ：");
		System.out.println("1：服、２：ズボン");
		System.out.print("数字で答えてください：");
		int z = sc.nextInt();
		switch ( z ){
		case 1 : System.out.println("服が選択されました");
				break ;
		case 2 : System.out.println("ズボンが選択されました");
				break ;

		default : System.out.println("1～３の数字を選択してください");
				toi6();
		}
		 return z ;
	}
}
