public class Triangolo extends Forma{
    public Triangolo(int base, int altezza) {
        super(base, altezza);
    }
    @Override
    public void calcolaArea() {
        int area = (this.getBase() * this.getAltezza()) / 2;
        System.out.println("L'area di questo triangolo equivale a " + area);
    }
}
