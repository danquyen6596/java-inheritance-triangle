package vn.codegym.QuyenLeSy;

public class Triangle extends Shape {
    private double slide1 = 1;
    private double slide2 = 1;
    private double slide3 = 1;

    public Triangle(){
        this.slide1 = 1;
        this.slide2 = 1;
        this.slide3 = 1;
    }

    public Triangle(String color, boolean filled, double slide1, double slide2, double slide3){
        super(color, filled);
        this.slide1 = slide1;
        this.slide2 = slide2;
        this.slide3 = slide3;
    }

    public void setSlide1(double slide1) {
        this.slide1 = slide1;
    }

    public double getSlide1() {
        return slide1;
    }

    public void setSlide2(double slide2) {
        this.slide2 = slide2;
    }

    public double getSlide2() {
        return slide2;
    }

    public void setSlide3(double slide3) {
        this.slide3 = slide3;
    }

    public double getSlide3() {
        return slide3;
    }

    public double getArea(){
        double p = (this.getSlide1() + this.getSlide2() + this.getSlide3())/2;
        return Math.sqrt(p*(p - this.getSlide1())*(p-this.getSlide2())*(p-this.getSlide3()));
    }

    public double getParameter(){
        return this.getSlide1() + this.getSlide2() + this.getSlide3();
    }

    @Override
    public String toString() {
        return "Triangle ("
                + this.getSlide1()+", "
                + this.getSlide2() + ", "
                + this.getSlide3() + ")"
                + " color = " + super.getColor();
    }
}
