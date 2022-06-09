import java.util.Random;//クラスパス（パッケージ　自分が所属する場所）
public class Randam_sample {
    public static void main(String[] args) {
        System.out.println("ゴールを目指しましょう！！");
        int goal = 50;
        int saikoro = 6;
        int localSum = 0;
        System.out.println("さっそくサイコロを振ってください");
        Random rand = new Random();//乱数生成オブジェクトを最初に一回だけ作っておく
        while (localSum < goal) {
        //for (int i = 0; i < goal; i++) {
            int num = rand.nextInt(saikoro) + 1;
            localSum += num;
            System.out.println("サイコロの結果," + num + "合計" + localSum);
        }

        System.out.println("おめでとうございます！ゴールです！");
        System.out.println("終了です");

    }
    
}
