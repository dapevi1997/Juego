package Clases;

public class RondaFinal extends Ronda{
    int aleatorio;
    String matriz[][];
    public RondaFinal() {
        aleatorio=(int)(Math.random()*4);

        matriz = new String[5][6];

        matriz[0][0] = "¿Cuál es el resultado de (12/3)*2+1?";
        matriz[0][1] = "10";
        matriz[0][2] = "9";
        matriz[0][3] = "11";
        matriz[0][4] = "12";
        matriz[0][5] = "2";

        matriz[1][0] = "¿Cuál es el resultado de (8/2)*3-2?";
        matriz[1][1] = "20";
        matriz[1][2] = "14";
        matriz[1][3] = "12";
        matriz[1][4] = "10";
        matriz[1][5] = "4";

        matriz[2][0] = "¿Cuál es el resultado de (16/4)*4-1?";
        matriz[2][1] = "11";
        matriz[2][2] = "14";
        matriz[2][3] = "15";
        matriz[2][4] = "12";
        matriz[2][5] = "3";

        matriz[3][0] = "¿Cuál es el resultado de (30/5)*4+1?";
        matriz[3][1] = "23";
        matriz[3][2] = "21";
        matriz[3][3] = "26";
        matriz[3][4] = "25";
        matriz[3][5] = "4";

        matriz[4][0] = "¿Cuál es el resultado de (36/6)*1-1?";
        matriz[4][1] = "12";
        matriz[4][2] = "17";
        matriz[4][3] = "8";
        matriz[4][4] = "5";
        matriz[4][5] = "4";
    }

    @Override
    public String nronda() {
        return "Ronda final";
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
