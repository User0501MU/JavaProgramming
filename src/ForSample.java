//for文
//++    a++ , ++a   インクリメント。1加算。カウントアップ
//--    a-- , --a   デクリメント。1減算。カウントダウ
//前置演算「++i;」計算してから代入
//後置演算「i++;」代入してから計算
public class ForSample {

    public static void main(String[] args) {

        // iの値を0から10より小さい間、1ずつカウントアップして繰り返す
        for (int i = 0; i < 10; i++) {
            // iの値を表示
            System.out.println("i = " + i);
        }

//入れ子、ネスト
        // iの値が0から21より小さい間、処理を繰り返す
        for (int i = 0; i < 21; i++) {
            // iの値が2で割り切れるとき
            if (i % 2 == 0) {
                // iの値を表示する
                System.out.println("i = " + i);
            }
        }




    }

}
