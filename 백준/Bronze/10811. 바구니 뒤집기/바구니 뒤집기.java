import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
   public static void main(String src[]) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());

      int n = Integer.parseInt(st.nextToken());
      int m = Integer.parseInt(st.nextToken());
      int arr[] = new int[n+1];

      for (int i = 1; i <= n; i++) {
         arr[i] = i;
      }

      for (int a = 0; a < m; a++) {
         st = new StringTokenizer(br.readLine());
         int i = Integer.parseInt(st.nextToken());
         int j = Integer.parseInt(st.nextToken());

         for (int b = i; b <= j; b++) {
            int c =j--;
            int tmp = arr[b];
            arr[b] = arr[c];
            arr[c] = tmp;
         }
      }

      for (int i = 1; i <= n; i++) {
         System.out.print(arr[i] + " ");
      }
   }
}