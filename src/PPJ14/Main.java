package PPJ14;

//2021-11-16 - PPJ14
public class Main{
    public static void main(String[] args){
        //zad1();
        //zad2();
        zad3();
    }

    public static void zad1(){
        int[] arrayX = new int[(int)(Math.random()*100)];
        int[] arrayY = new int[(int)(Math.random()*100)];

        for(int i=0; i<arrayX.length; i++)
            arrayX[i] = (int)(Math.random()*100);
        for(int i=0; i<arrayY.length; i++)
            arrayY[i] = (int)(Math.random()*100);

        int maxValueOfX = arrayX[0];
        int maxValueOfY = arrayY[0];
        int minValueOfX = arrayX[0];
        int minValueOfY = arrayY[0];
        int maxIndexOfX = 0;
        int maxIndexOfY = 0;
        int minIndexOfX = 0;
        int minIndexOfY = 0;
        for(int i = 1; i<arrayX.length; i++){
            if(maxValueOfX<arrayX[i]) {
                maxValueOfX = arrayX[i];
                maxIndexOfX = i;
            }
            if(minIndexOfY>arrayX[i]) {
                minValueOfX = arrayX[i];
                minIndexOfX = i;
            }
        }
        for(int i=1; i<arrayY.length; i++){
            if(maxValueOfY<arrayY[i]) {
                maxValueOfY = arrayY[i];
                maxIndexOfY = i;
            }
            if(minIndexOfY>arrayX[i]) {
                minValueOfY = arrayY[i];
                minIndexOfY = i;
            }
        }
        int dlX = maxValueOfX-minValueOfX;
        int dlY = maxIndexOfY-minIndexOfY;
        System.out.println("Środek naszego okręgu to x: "+(double)(dlX/2+minValueOfX)+" y:"+ (double)(dlY/2+minValueOfY));
        System.out.println("Dlugosci boku to : "+ dlX +" " + dlY);
    }

    public static void zad2(){
        int[] A = {1,3,5,7,9};
        int[] B = {8,6,4,2};
        int[] C = new int[A.length+B.length];

        for(int i = 0, indexA=0, indexB=B.length-1; i < C.length; i++){
            if(indexA == A.length) {
                while(indexB!=-1)
                    C[i++] = B[indexB--];
                break;
            }
            else if(indexB == -1) {
                while(indexA!=A.length)
                    C[i++] = A[indexA++];
                break;
            }
            if(A[indexA]>B[indexB])
                C[i] = B[indexB--];
            else
                C[i] = A[indexA++];
            System.out.print(" "+ C[i]);
        }
    }

    public static void zad3(){
        int tab[ ] [ ]  = {
                {  1 ,  2 ,  3 ,  4},
                {  5 ,  6 ,  7 ,  8},
                {  9 ,  10 , 11 , 12},
                {  13 , 14 , 15 , 16}
        };

        int minusczyplus = 1;
        int ileOdjac = 0;
        for(int i=0; i<tab.length; i++){
            for(int j=0; j<tab[i].length; j++){
                System.out.print(tab[i][j]);
            }
        }

        /*
        int i=0;
        while(i != 9){
            if(i==3 || i==7 || i==11){
                System.out.print(tab[i]);
                index1 += 4;
            }
            else if(i <= 15 && i >= 13){
                System.out.print(tab[i]);
                i--;
            }
            else if(i == 12 || i == 9){
                System.out.print(tab[i]);
                i-=4;
            }
            else if(i == 4 || i == 5){
                System.out.print(tab[i]);
                i++;
            }
            else if(i==6){
                System.out.print(tab[i]);
                i+=4;
            }
            else if(i == 10){
                System.out.print(tab[i]);
                i--;
                System.out.print(tab[i]);
            }
            else
                i++;
        }
        */
    }
}

