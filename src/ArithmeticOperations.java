//ArithmeticOperations 算術演算
public class ArithmeticOperations {

    public static void main(String[] args) {
        //変数の初期化宣言
        int num1 = 100;//int型変数にnum1を宣言し、100を代入
        int num2 = 10;
        int result1 = num1 + num2;

        //文字列＋加算結果を出力
        System.out.println("num1 + num2 = " + result1);

        //文字列＋減算結果を出力
        int result2 = num1 - num2;
        System.out.println("num1 - num2 = " + result2);

        //乗算結果を出力（じょうざん）
        int result3 = num1 * num2;
        System.out.println("num1 * num2 = " +result3);

        //除算結果の出力（じょざん）
        int result4 = num1 / num2;
        System.out.println("num1 / num2 = " +result4);

        //int型変数result5を宣言し、num1とnum2の剰余算（じょうよえんざん）余りの結果を代入
        int result5 = num1 % num2;
        //剰余算（じょうよえんざん）余りの結果
        System.out.println("num1 % num2 = " + result5);


        //ミニ課題　result1~5 を 1つの変数resultに置き換えましょう。
        int result = num1 + num2;
        System.out.println("num1 + num2 = " + result);

        result = num1 - num2;//変数にresult再代入（上書きint不要）
        System.out.println("num1 - num2 = " + result);
        result = num1 * num2;
        System.out.println("num1 * num2 = " + result);
        result = num1 / num2;
        System.out.println("num1 / num2 = " + result);
        result = num1 % num2;
        System.out.println("num1 % num2 = " + result);
    }
}
