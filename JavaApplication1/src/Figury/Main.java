package Figury;


public class Main {
    public static void main(String[] args) {


        FiguraGeometryczna[] figury = new FiguraGeometryczna[15];

        figury[0] = new Kwadrat(6);
        figury[1] = new Szescian(6.6);
        figury[2] = new Prostokat(4, 6);
        figury[3] = new Prostopadloscian(3, 5, 7.5);
        figury[4] = new Trojkat(4, 6);
        figury[5] = new Stozek(3, 4, 5);
        figury[6] = new Trapez(12, 4, 5, 5, 6);
        figury[7] = new Romb(5, 4.3);
        figury[8] = new Kolo(3.9);
        figury[9] = new Kula(5.2);
        figury[10] = new Rownoleglobok(2, 4, 3);
        figury[11] = new Walec(5,8);
        figury[12] = new Prostokat(2,6);
        figury[13] = new Szescian(4);
        figury[14] = new Kwadrat(11.2);

        int i=0;
        while (i < 15){
            System.out.println(figury[i].toString());
            i++;
        }
    }
}