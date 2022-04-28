package Clases;

public class Ronda4 extends Ronda{
    int aleatorio;
    String matriz[][];

    public Ronda4() {
        aleatorio=(int)(Math.random()*4);

        matriz = new String[5][6];

        matriz[0][0] = "¿Cuál es el resultado de 36/3?";
        matriz[0][1] = "10";
        matriz[0][2] = "13";
        matriz[0][3] = "11";
        matriz[0][4] = "12";
        matriz[0][5] = "4";

        matriz[1][0] = "¿Cuál es el resultado de 42/2?";
        matriz[1][1] = "21";
        matriz[1][2] = "25";
        matriz[1][3] = "29";
        matriz[1][4] = "22";
        matriz[1][5] = "1";

        matriz[2][0] = "¿Cuál es el resultado de 48/4?";
        matriz[2][1] = "11";
        matriz[2][2] = "14";
        matriz[2][3] = "15";
        matriz[2][4] = "12";
        matriz[2][5] = "4";

        matriz[3][0] = "¿Cuál es el resultado de 55/5?";
        matriz[3][1] = "13";
        matriz[3][2] = "11";
        matriz[3][3] = "16";
        matriz[3][4] = "12";
        matriz[3][5] = "2";

        matriz[4][0] = "¿Cuál es el resultado de 72/6?";
        matriz[4][1] = "12";
        matriz[4][2] = "17";
        matriz[4][3] = "13";
        matriz[4][4] = "55";
        matriz[4][5] = "1";
    }

    @Override
    public String nronda() {
        return "Cuarta ronda";
    }

    @Override
    public String pregunta() {
        return matriz[aleatorio][0];
    }

    @Override
    public String respuesta1() {
        return matriz[aleatorio][1];
    }

    @Override
    public String respuesta2() {
        return matriz[aleatorio][2];
    }

    @Override
    public String respuesta3() {
        return matriz[aleatorio][3];
    }

    @Override
    public String respuesta4() {
        return matriz[aleatorio][4];
    }

    @Override
    public int respuestacorrecta() {
        int posResCorr;
        posResCorr = Integer.parseInt(matriz[aleatorio][5]);
        return posResCorr;
    }
}
