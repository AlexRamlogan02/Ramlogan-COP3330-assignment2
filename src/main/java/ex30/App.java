package ex30;
/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        int answer;
        for (int i = 1; i < 12; i++) {
            for (int j = 1; j < 12; j++) {
                answer = i * j;
                System.out.print(answer + " ");
            }
            System.out.print("\n");
        }
    }
}