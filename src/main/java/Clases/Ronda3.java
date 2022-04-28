package Clases;

public class Ronda3 extends Ronda{
    int aleatorio;
    String matriz[][];
    public Ronda3() {
        aleatorio=(int)(Math.random()*4);

        matriz = new String[5][6];

        matriz[0][0] = "¿Cuál es el resultado de 2*3?";
        matriz[0][1] = "6";
        matriz[0][2] = "4";
        matriz[0][3] = "5";
        matriz[0][4] = "3";
        matriz[0][5] = "1";

        matriz[1][0] = "¿Cuál es el resultado de 3*3?";
        matriz[1][1] = "1";
        matriz[1][2] = "5";
        matriz[1][3] = "9";
        matriz[1][4] = "2";
        matriz[1][5] = "3";

        matriz[2][0] = "¿Cuál es el resultado de 5*6?";
        matriz[2][1] = "11";
        matriz[2][2] = "14";
        matriz[2][3] = "15";
        matriz[2][4] = "30";
        matriz[2][5] = "4";

        matriz[3][0] = "¿Cuál es el resultado de 7*8?";
        matriz[3][1] = "52";
        matriz[3][2] = "54";
        matriz[3][3] = "56";
        matriz[3][4] = "22";
        matriz[3][5] = "3";

        matriz[4][0] = "¿Cuál es el resultado de 8*8?";
        matriz[4][1] = "64";
        matriz[4][2] = "67";
        matriz[4][3] = "63";
        matriz[4][4] = "65";
        matriz[4][5] = "1";
    }

    @Override
    public String nronda() {
        return "Tercera ronda";
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
