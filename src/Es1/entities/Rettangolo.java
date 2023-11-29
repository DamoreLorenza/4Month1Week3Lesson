package entities;

public class Rettangolo {
    public double larghezza;
    public double lunghezza;

    public double areaUno;
    public double areaDue;
    public double perimetroUno;
    public double perimetroDue;

    public void calculatingArea(){
        double area = this.larghezza * this.lunghezza;
        System.out.println("L'area del rettangolo è: " + area);
    }
    public void calculatingPerimentro(){
        double perimetro = (this.larghezza + this.lunghezza) * 2;
        System.out.println("Il perimetro del rettangolo è: " + perimetro);
    }

    public void calculatingSommaArea(){

        double sommaArea = this.areaUno + this.areaDue;
        System.out.println("La somma dell'area dei rettangoli è: " + sommaArea);
    }

    public void calculatingSommaPerimentro(){

        double sommaPerimetro = this.perimetroUno + this.perimetroDue;
        System.out.println("La somma dei perimetri dei rettangoli è: " + sommaPerimetro);
    }


}
