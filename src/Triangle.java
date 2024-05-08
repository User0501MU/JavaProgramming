// If　ElseSample練習問題 if文を用いての多分岐（if~else, else if文）

//この3辺の長さから「正三角形」か「二等辺三角形」、あるいは「不等辺三角形」を判定するプログラムを作ってください。

//３つの角が等しい三角形=正三角形
//2辺の長さが等しい三角形(頂角の二等分線は，底辺を垂直に二等分)=二等辺三角形
//どの辺の長さも等しくない三角形=不等辺三角形
public class Triangle {

    public static void main(String[] args) {
        int a = 4;
        int b = 4;
        int c = 9; //三角形の条件は？

        if(a==c && c==b && b==a) {
            System.out.println("60度の３つの角が等しい三角形");
        } else if (a==b || b==c || c==a){
            System.out.println("2辺の長さが等しい三角形");
        }else {
            System.out.println("どの辺の長さも等しくない三角形");
        }

    }

}
