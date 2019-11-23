package Module5;

public class StringPrac {

    public static void main(String[] args) {
        arrStr();
        arrInt();
        arrStore();
        highArray();
        arrOdd();
        arrSum();
        printArray(new int[] {1,2,3,4,5});
       int x[]= passingArray(new int[]{5,6,7,8});
      //int m[]={34,35,36};
        get(new int[]{34,35,36});
    }

   public static void get(int a[]) {
       for (int g = 0; g < a.length; g++) {
           System.out.println(a[g]);
       }

   }
    public static int[] passingArray(int a[])
   {

       return new int[]{1,2,3,4,5};

   }




    public static void printArray( int[] a)
    {

        for(int i=0;i<a.length;i++)
            System.out.println(a[i]);
    }


    public static void arrSum()
    {
        int sum=0;
        int[] m={10,20,30,40,50,60,70};
        for(int i=0;i<m.length;i++)
        {
           sum=sum+m[i];

        }
        System.out.println("sum of the numbers are  " +sum);
    }

    public static void arrOdd()
     {
         int[] a={ 20,10,11,34,75,89};
         for(int i=0;i<a.length;i++)
         {
             if(a[i]%2!=0)
             {
                 System.out.println("odd numbers are " +a[i]);
             }
         }
     }

    public static void arrStr() {
        int i;
        String[] s = {"abc", "xyz", "mnb", "jhg", "ghd", "fgtr", "yuio", "cvbw", "asd", "poi"};
        for (i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }

    }

    public static void arrInt() {

        int i = 0;
        int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        while (i < x.length) {
            System.out.print(x[i]);
            System.out.print(" ");
            i++;
        }

    }

    public static void arrStore() {
        int[] a = new int[6];
        a[0] = 23;
        a[1] = 6;
        a[2] = 47;
        a[3] = 35;
        a[4] = 2;
        a[5] = 14;
        int sum = 0;
        float average;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        average = sum / a.length;
        System.out.println(" ");
        System.out.println("average of numbers is  " + average);

    }

    public static void highArray() {
        int a[] = {23, 6, 47, 35, 2, 14};
        int max=a[0];
        for (int i = 1; i < a.length; i++)
        {
          if(a[i]>max)
          {
              max=a[i];
              System.out.println("highest number is  "+max);
          }


                    }

                }
            }



