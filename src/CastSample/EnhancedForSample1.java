package CastSample;

public class EnhancedForSample1 {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        int[] scores = {47,55,88,100,74};
        int sum = 0;
        double average = 0.0;

        for(int i = 0; i < scores.length; i++) {
            sum = sum + scores[i];
        }

        average = (double) sum / scores.length;

        System.out.println("合格点は、　" + sum + "点、平均点は、" + average + "点です。");

    }

}
