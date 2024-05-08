//if文sample
public class IfElseSample {

    public static void main(String[] args) {
        int score = 80;//成績

        //if (score >= 60)  //scoreが60以上ならば
          if(!(score< 20)) {//scoreが20未満でない、ならば
            System.out.println("合格です！");//合格と表示
          }

//if-else文sample
          // scoreが60以上ならば
          if (score >= 60) {
              // 合格です！と表示
              System.out.println("合格です！");
          } else {
              // 赤点です...と表示
              System.out.println("赤点です...");
          }


//if~else, else if文sample
          if (score == 100) {
              System.out.println("満点です!ご褒美をあげます!");
          } else if (score >= 80) {
              System.out.println("よくできました!");
          } else if (score >= 60) {//（1つ上、80以上もないが）スコアが60以上ならば”合格”
              System.out.println("合格です!");
          } else {//それ以下
              System.out.println("赤点です...補講を行ないます");
          }


//論理演算（OR）sample
          int scoreSansu = 80;// 算数の成績
          int scoreKokugo = 80;// 国語の成績

          if (scoreSansu >= 60 && scoreKokugo >= 60) {
              System.out.println("合格してます！");
          } else if (scoreSansu >= 60 || scoreKokugo >= 60) {
              System.out.println("算数か国語どちらかが補講対象です");
          } else {
              System.out.println("赤点です...補講を行ないます");
          }


    }

}


