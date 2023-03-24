import java.util.Scanner;

public class A1113331_0317_1 {
public static void main(String[] args)
    {
        System.out.println("請輸入n&m:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();

        int [][]paper =new int [n][m];

        for (int row =0; row < paper.length;row++){
            for(int colum =0 ; colum < paper[row].length;colum++){
                paper [row][colum] =row * colum ;
                System.out.println(paper[row][colum]+"\t");

            }
            System.out.println();

        }

    }
}
