package TechGIGCodingChallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class BeybladeWorldChampionship {

    private static int maxWinningCount(int[] teamG,int[] teamS) {
       int count = 0;
        Arrays.sort(teamG);
        Arrays.sort(teamS);
       for (int i = 0; i < teamG.length; ) {
            for (int j = 0; j < teamS.length; ) {
                if (teamG[i] > teamS[j]) {
                    count++;
                }
                else {
               for (int k=0;k<teamG.length;k++)
               { if(teamG[i]<teamG[k])
               {
                   int temp=teamG[i];
                   teamG[i]=teamG[k];
                   teamG[k]=temp;
                   if (teamG[k]>teamS[j]){count++;}

               }}}

                j++;
                i++;
            }
        }
        for (int i = 0; i < teamG.length; ) {
            for (int j = 0; j < teamS.length; ) {
            if (teamG[i]>teamS[j])
            {count++; }
                i++;j++;

            }}


                return count;
    }


    public static void main(String[] args) throws IOException {


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of test cases ");
        int Testcases=sc.nextInt();

        System.out.println("Enter the number of team members");
        int teamStrength=sc.nextInt();

        int[] teamG=new int[teamStrength];
        int[] teamS=new int[teamStrength];


        while(Testcases-->0)
        {

            System.out.println("Enter all "+teamStrength+" members values for TeamG-Revolution");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String  lines = br.readLine();

            String[] strs = lines.trim().split("\\s+");


            for (int i = 0; i < strs.length; i++) {
                teamG[i] = Integer.parseInt(strs[i]);
            }

            System.out.println("Enter all "+teamStrength+" members values for Team All-Starz");
            BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
            String  lines1 = br1.readLine();

            String[] strs1 = lines1.trim().split("\\s+");


            for (int i = 0; i < strs1.length; i++) {
                teamS[i] = Integer.parseInt(strs1[i]);
            }


        }

        System.out.println("Maximum Number of Winnigs for Team-G-revolution Is/Are: "+maxWinningCount(teamG,teamS));

    }
}
