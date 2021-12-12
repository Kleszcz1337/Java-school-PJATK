package PPJ16;

//2021-11-26 - PPJ16
public class Main{
    public static void main(String[] args) {

        //zad1
        int testArray[] = splitToDigits(2375);
        for(int i : testArray)
            System.out.print(" " + i);
        System.out.println();

        //zad2
        System.out.println(isArmstrongNumber(371));
        System.out.println(isArmstrongNumber(1));
        System.out.println(isArmstrongNumber(11));

        //zad3
        int[][] test1 = calculateSquares(40, 39, 10);
        for(int i = 0; i<test1.length; i++){
            System.out.print(test1[i][0] + " " + test1[i][1]);
            System.out.println();
        }

        //zad4
        char[] charArraytest = "kajak".toCharArray();
        System.out.println(czyPalindrom(charArraytest, 0));

        //zad5

    }

    public static int[] splitToDigits(int a){
        //Musimy rozbić nasza liczbe dopoki nie bedziemy miec a/10 = 0

        //Obliczanie jak dluga ma byc tablica
        int licznik1 = 0;
        int tmpA = a;
        while(tmpA != 0){
            licznik1++;
            tmpA /= 10;
        }
        int[] intArray = new int[licznik1];

        //Wyciaganie pojedynczych liczb do tablicy
        int licznik2 = 0;
        while((a%10) > 0){
            int addToArray = a%10;
            a /= 10;
            intArray[licznik2] = addToArray;
            licznik2++;
        }
        return intArray;
    }

    //np. 371 = 3^3 + 7^3 + 1^3
    public static boolean isArmstrongNumber(int a){
        //Obliczanie jak dluga jest liczba
        int licznik1 = 0;
        int tmpA = a;
        while(tmpA != 0){
            licznik1++;
            tmpA /= 10;
        }

        int suma = 0;
        int tempA = a;
        //wyciaganie pojedynczych liczb
        while((tempA%10)>0){
            int addToSum = tempA%10;
            tempA /= 10;
            suma += (Math.pow(addToSum, licznik1));
        }
        return a == suma;
    }

    public static int[][] calculateSquares(int screenWidth, int screenHeight, int side){

        int licznikWidth = screenWidth/side;
        int licznikHeight = screenHeight/side;
        int x=0,y=0;

        int[][] returnArray = new int[licznikHeight*licznikWidth][2];
        if(licznikHeight>0 && licznikWidth>0){
            for(int i=0; i< returnArray.length; i++){
                returnArray[i] = new int[]{x,y};
                x+=side;
                if(x>screenWidth-side){
                    x=0;
                    y+=side;
                }
            }
        }
        return returnArray;
    }

    public static boolean czyPalindrom(char[] charArray, int i){
        if(charArray[i] != charArray[charArray.length-1-i])
            return false;
        if(i > (charArray.length/2))
            return true;
        return czyPalindrom(charArray, i+1);
    }

    public static char[] zad5(char[] arr, int i){
        // kajak --> akka  || adam --> dama
        if(i == arr.length/2)
            return arr;
        return zad5(arr, i+1);
    }

    public static void fillArray(int[][] tab, int min){
        if(min == (tab.length)/2)
            return;
        int max = tab.length - min - 1;
        for(int i = min; i <= max; i ++){
            tab[i][min] = min + 1;
            tab[i][max] = min + 1;
            tab[min][i] = min + 1;
            tab[max][i] = min + 1;
        }
        fillArray(tab, min + 1);
    }
}