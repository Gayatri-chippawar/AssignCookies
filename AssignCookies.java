package Greedy_Algo;
import java.util.Arrays;

public class AssignCookies {
    public static int findContentChildren(int[] g, int[] s) {

            // Sort greed array and cookie array
            Arrays.sort(g);
            Arrays.sort(s);

            int child = 0;
            int cookie = 0;

            // Assign cookies greedily
            while (child < g.length && cookie < s.length) {

                if (s[cookie] >= g[child]) {
                    child++;   // child satisfied
                }

                cookie++;      // move to next cookie
            }

            return child;
        }

        public static void main(String[] args) {

            int[] g = {1, 2, 3};   // greed factors
            int[] s = {1, 1};      // cookie sizes

            int result = findContentChildren(g, s);

            System.out.println("Maximum satisfied children: " + result);
        }
    }


