//キャスト（型変換）は、ある変数に代入された値を、処理の途中で一時的に「別のデータ型」へ変換したうえで処理を行なう仕組みです。
public class CastSample {

    public static void main(String[] args) {
        //int型変数aとbの宣言初期化
        int a =3;
        int b =2;
        //int型同士の除算（じょさん）÷
        System.out.println(a/b);
        //int型変数aを一時的にdouble型に型変換し、除算（結果はdouble型）
        /*（3）を一時的に double 型（3.0）へ変換して割り算を行い、3.0 / 2 の計算結果 1.5*/

        System.out.println((double) a / b);
        //int型同士の除算した結果（int型）をdouble型に型変換
        System.out.println((double)(a / b));
    }

}
