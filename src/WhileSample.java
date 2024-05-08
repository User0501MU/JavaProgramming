//while文 前判定型の繰り返し　「~している間」（繰り返しを継続するための条件）
public class WhileSample {

    public static void main(String[] args) {
        int num = 1; // 初期値設定

        // 繰り返しの条件（numが1024より小さい間）
        while (num < 1024) {
            // 2の累乗を計算＞解らん！
            num = num * 2;

            // 結果を出力
            System.out.println(num);
        }

//do~while文 後判定型の繰り返し
//ポイントとして、while文では、繰り返し処理が1度も実行されない可能性があること、do～while文は、最低でも必ず1度は繰り返し処理が実行されることになります。

        do {
            // 2の倍数を計算
            num = num * 2;

            // 結果を出力
            System.out.println(num);
        } while (num < 1024); // 繰り返しの条件（numが1024より小さい間）


//for文
        
    }
}
