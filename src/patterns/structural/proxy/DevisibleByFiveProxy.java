package patterns.structural.proxy;

public class DevisibleByFiveProxy implements IMath {

    private Math math;

    @Override
    public double add(double x, double y) {
        if (!areDevisibleByFive(x, y)) return 0;
        lazyInitMath();
        return math.add(x, y);
    }

    @Override
    public double sub(double x, double y) {
        if (!areDevisibleByFive(x, y)) return 0;
        lazyInitMath();
        return math.sub(x, y);
    }

    @Override
    public double mul(double x, double y) {
        if (!areDevisibleByFive(x, y)) return 0;
        lazyInitMath();
        return math.mul(x, y);
    }

    @Override
    public double div(double x, double y) {
        if (!areDevisibleByFive(x, y)) return 0;
        lazyInitMath();
        return math.div(x, y);
    }

    private void lazyInitMath() {
        if (math == null) {
            math = new Math();
        }
    }

    private boolean areDevisibleByFive(double x,double y){
        return (x % 5 == 0) && (y % 5 == 0);
    }
}
