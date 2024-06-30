public class RegularPentagon {
    Point A;
    Point B;
    Point C;
    Point D;
    Point E;

    public RegularPentagon(Point A, Point B, Point C, Point D, Point E) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
        this.E = E;
    }

    public double perimeter() {
        return A.distance(B) + B.distance(C) + C.distance(D) + D.distance(E) + E.distance(A);
    }

    public boolean checkRegularity() {
        double accuracy = 0.01;  // allow some floating point error

        double AB = A.distance(B);
        double BC = B.distance(C);
        double CD = C.distance(D);
        double DE = D.distance(E);
        double EA = E.distance(A);

        return Math.abs(AB - BC) < accuracy &&
               Math.abs(BC - CD) < accuracy &&
               Math.abs(CD - DE) < accuracy &&
               Math.abs(DE - EA) < accuracy &&
               Math.abs(EA - AB) < accuracy;
    }
    
    public double area() {
        if (!this.checkRegularity()) {
            throw new IllegalArgumentException("Polynomial isn't a regular pentagon");
        }
        double sideLength = A.distance(B);
        return (1.0 / 4.0) * Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * Math.pow(sideLength, 2);
    }
