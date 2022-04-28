package Clases;

public class Ronda2 extends Ronda {
    int aleatorio;
    String matriz[][];

    public Ronda2() {
        aleatorio = (int) (Math.random() * 4);

        matriz = new String[5][6];

        matriz[0][0] = "¿Cuál es el resultado de 3+2-1?";
        matriz[0][1] = "1";
        matriz[0][2] = "4";
        matriz[0][3] = "5";
        matriz[0][4] = "3";
        matriz[0][5] = "2";

        matriz[1][0] = "¿Cuál es el resultado de 1+2-1?";
        matriz[1][1] = "1";
        matriz[1][2] = "5";
        matriz[1][3] = "3";
        matriz[1][4] = "2";
        matriz[1][5] = "4";

        matriz[2][0] = "¿Cuál es el resultado de 3-1+2?";
        matriz[2][1] = "1";
        matriz[2][2] = "4";
        matriz[2][3] = "5";
        matriz[2][4] = "3";
        matriz[2][5] = "2";

        matriz[3][0] = "¿Cuál es el resultado de 4+2-3?";
        matriz[3][1] = "3";
        matriz[3][2] = "4";
        matriz[3][3] = "6";
        matriz[3][4] = "2";
        matriz[3][5] = "1";

        matriz[4][0] = "¿Cuál es el resultado de 5+2-4?";
        matriz[4][1] = "6";
        matriz[4][2] = "7";
        matriz[4][3] = "3";
        matriz[4][4] = "5";
        matriz[4][5] = "3";
    }

    @Override
    public String nronda() {
        return "Segunda ronda";
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
