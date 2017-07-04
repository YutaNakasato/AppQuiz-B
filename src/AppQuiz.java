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
		System.out.println("ハゲはハゲでも食べられないハゲは？");
		System.out.print("1: 大地 2: 大地 3: 大地");
		int i = sc.nextInt();
		do{
			if(i == 1){
				System.out.print("正解！");
			}else if(i ==2){
				System.out.print("正解！");
			}else if(i == 3){
				System.out.print("正解！");
			}else{
				System.out.print("１，２，３のどれかの大地を入力してください。");
				int i = sc.nextInt();
			}
		}while(i == 1 || i ==2 || i== 3);
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
	}
	public static int toi6(){
		//カサイクン
	}
}
