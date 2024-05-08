//JavaProgrammingBasicSummary Javaプログラミング基本概要
//オーバーロード　同じメソッド名でも）引数の数や型・順番に応じて異なる処理を実行できる
public class JavaProgrammingBasicSummary {

    public static void main (String[] args) {
        //：mainメソッド内処理、int型２つの引数を持つaddメソッドを呼び出す
        add(45,13);

        //：mainメソッド内処理、double型２つの引数を持つaddメソッドを呼び出し、処理結果をdouble型で代入
        double result = add(12.3,4.8);
        System.out.println("doubule型の加算:"+result);//処理結果
    }


    //：addメソッド内の処理、int型引数を２つ受け取るaddメソッドの定義（戻り値なし）
    public static void add (int num1, int num2) {//★addメソッドでmainメソッドの引数を受け取り定義
        int result = num1 + num2;
        System.out.println("int型の加算："+result);//returnなし
    }



    //：addメソッド内の処理、double型引数を２つ受け取るaddメソッドの定義（戻り値あり）
    public static double add(double num1, double num2) {
        double result = num1 + num2;//★resultがmainメソッドとaddメソッド内で任意のメソッド名
        return result;//★mainメソッドのresultに戻る
    }

}
