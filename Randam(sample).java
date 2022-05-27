public class Main {
    public static void main(String[] args) {
        System.out.println("ゴールを目指しましょう！！");
        int goal = 50;
        int saikoro = 6;
        int localSum = 0;
        System.out.println("さっそくサイコロを振ってください");
        for (int i = 0; i < goal; i++) {
            Random rand = new Random();
            int num = rand.nextInt(saikoro);
            System.out.println(num);
            localSum += num;
                if (localSum <= goal) {
                    System.out.println("サイコロを振りましょう");

                } else {
                    System.out.println("おめでとうございます！ゴールです！");
                    break;
                }
                System.out.println("終了です");

        }
        

    }
    
}
