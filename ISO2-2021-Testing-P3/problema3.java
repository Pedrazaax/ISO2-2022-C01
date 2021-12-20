
public class problema3{
    public static void main(String[] args) {
        int[][] tabla_adecuacion = { { 0, 0, 0 }, { 1, 1, 2 }, { 2, 1, 2 }, { 2, 2, 3 }, { 3, 3, 4 }, { 4, 5, 5 } };
        int[][] tabla_mantenibilidad = { { 0, 0, 0, 0, 0 }, { 1, 1, 0, 1 , 1}, { 2, 2, 1, 2, 1}, { 2, 2, 2, 3,2 }, { 3, 3, 3, 4, 4}, { 4, 5, 5, 5, 4}};
        int[][] tabla_global = { { 1, 1, 1, 1, 1}, { 1, 2, 2, 2, 2 }, { 2, 2, 3, 3, 3 }, { 3, 3, 3, 3, 4 },{ 3, 3, 4, 4, 5 }};
        int[] datos_adecuacion = {71,74,79};
        int[] datos_mantenibilidad = {14,72,73,74,75};
        int adecuacion = calculo_minimo(calculo_certificacion(datos_adecuacion,tabla_adecuacion));
        int mantenibilidad = calculo_minimo(calculo_certificacion(datos_mantenibilidad,tabla_mantenibilidad));

        if(adecuacion != 0 && mantenibilidad !=0){
            int certificacion = tabla_global[(adecuacion-1)][(mantenibilidad-1)];
            if(certificacion >= 3) System.out.println("La certificacion es "+ certificacion +", se concede");
            else System.out.println("La certificacion es " + certificacion + ", no se concede");
        }
        
    }

    private static int[] calculo_certificacion(int[] datos, int[][] tabla) {
        int[]resultados=new int[datos.length];
        int j=0;
        for(int i=0; i< datos.length;i++){
            if(datos[i]>=0 && datos[i]<10)
                j=0;
            else if(datos[i]>=10 && datos[i]<35)
                j=1;
            else if(datos[i]>=35 && datos[i]<50)
                j=2;
            else if(datos[i]>=50 && datos[i]<70)
                j=3;
            else if(datos[i]>=70 && datos[i]<90)
                j=4;
            else if(datos[i]>=90 && datos[i]<100)
                j=5;
            resultados[i]=tabla[j][i];
        }
            return resultados;
    }

    private static int calculo_minimo(int[] datos) {
        int aux=datos[0];
        for(int i=1; i<datos.length;i++){
            if(aux>datos[i]){
                aux=datos[i];
            }
        }
        return aux;
    }


}