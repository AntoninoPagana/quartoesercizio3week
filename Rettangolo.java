public class Rettangolo extends Forma{
    public Rettangolo(int base, int altezza) {
        super(base, altezza);
    }
    @Override
    public void calcolaArea() {
        int area = this.getBase() * this.getAltezza();
        System.out.println("L'area di questo rettangolo equivale a " + area);
    }
}
