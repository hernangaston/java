package Ejercicios789;

public class ArrBidi {
    public static void arrBidi() {
        int[][] miArrayBidi = {
                {1,2,3,4},
                {100,200,300,400}
        };

        for(int i = 0; i< miArrayBidi.length; i++){
            for(int j = 0; j<miArrayBidi[i].length; j++){
                System.out.println(miArrayBidi[i][j]);
            }
        }

    }
}
