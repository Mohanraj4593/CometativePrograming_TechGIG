package TechGIGCodingChallenge;
/*package TechGIGCodingChallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class The_PowerPuffGirls_Problem {

    public static int maxPowerPuffGirls(int length,int[] req,int[] present)
    {   int resultElements[]=new int[length];

        for (int i=0;i<req.length;)
        {
            for (int j=0;j<present.length;)
            { resultElements[i]= present[j] / req[i];
            i++;
            j++;
            }
        }

        Arrays.sort(resultElements);

        return resultElements[0];
    }

    public static void main(String[] args) throws IOException {

        Scanner sc=new Scanner(System.in);

        System.out.println("ENTER TOTAL NUMBER OF INGRIDIENTS");
        int N=sc.nextInt();

        System.out.println("ENTER EACH QUANTITY REQUIRED TO CREATE POWERPUFF GIRL");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String  lines = br.readLine();

        String[] strs = lines.trim().split("\\s+");
        int req[]=new int[N];

        for (int i = 0; i < strs.length; i++) {
            req[i] = Integer.parseInt(strs[i]);
        System.out.print(req[i]+" ");
        }

        System.out.println("ENTER TOTAL QUANTITY PRSESNT TO CREATE POWERPUFF GIRL");
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        String  lines1 = br1.readLine();

        String[] strs1 = lines1.trim().split("\\s+");
        int present[]=new int[N];

        for (int i = 0; i < strs1.length; i++) {
            present[i] = Integer.parseInt(strs1[i]);
            System.out.print(present[i]+" ");
        }

        System.out.println("Maximum Number Of PowerPuffGirls Could Be Done Is/Are: "+The_PowerPuffGirls_Problem.maxPowerPuffGirls(N,req,present));


    }
}*/




import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

class The_PowerPuffGirls_Problem {

    public static int maxPowerPuffGirls(int length,int[] req,int[] present)
    {   int resultElements[]=new int[length];

        for (int i=0;i<req.length;)
        {
            for (int j=0;j<present.length;)
            { resultElements[i]= present[j] / req[i];
                i++;
                j++;
            }
        }

        int min=resultElements[0];
        for(int j=1;j<resultElements.length;j++)
        {
            if(resultElements[j]<min)
            {
                min=resultElements[j];
            }
        }
return min;

    }

    public static void main(String[] args) throws IOException {

        Scanner sc=new Scanner(System.in);

        int N=sc.nextInt();


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String  lines = br.readLine();

        String[] strs = lines.trim().split("\\s+");
        int req[]=new int[N];

        for (int i = 0; i < strs.length; i++) {
            req[i] = Integer.parseInt(strs[i]);
        }


        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        String  lines1 = br1.readLine();

        String[] strs1 = lines1.trim().split("\\s+");
        int present[]=new int[N];

        for (int i = 0; i < strs1.length; i++) {
            present[i] = Integer.parseInt(strs1[i]);
        }
        int result=The_PowerPuffGirls_Problem.maxPowerPuffGirls(N,req,present);
        System.out.println(result);


    }
}

