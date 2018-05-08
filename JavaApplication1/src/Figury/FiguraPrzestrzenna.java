package Figury;

abstract class FiguraPrzestrzenna extends FiguraGeometryczna {

    public abstract double obliczObjetosc();

    @Override
    public String toString() {
        return "\nObliczanie parametrow figury przestrzennej.\n";
    }
}
