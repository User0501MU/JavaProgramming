//ArithmeticExceptionSample 算術例外サンプル
//0除算と例外　割る数を0にして、整数型と整数型の0除算をしてはいけない
public class ArithmeticExceptionSample {

    public static void main(String[] args) {
        //int型10をint型0で除算
        //int a = 10 / 0;//例外発生

        //double型10.0をdouble型0.0で除算
        double a = 10.0 / 0.0;//この場合例外が発生しない

        //（整数型（int型）の0での割り算）に表示される実行時エラー
        System.out.println(a);
    }

}
