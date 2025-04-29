class Roundoff{
    public static void main(String[] args) {
        double d=1234.56;
        double rn= Math.round(d*1000.0/1000.0);
        System.out.println(rn);
    }
}