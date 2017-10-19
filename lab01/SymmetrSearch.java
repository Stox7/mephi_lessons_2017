class SymmetrSearch {

    double function(double x, int i) {
        switch (i) {
            case 1:
                return Math.pow(x, 1);
            case 2:
                return Math.pow(x, 2);
            case 3:
                return Math.exp(x);
            case 4:
                return Math.pow(x, 2) - Math.pow(x, 1);
            case 5:
                return Math.pow(x, 3) + Math.pow(x, 2);
            case 6:
                return Math.sin(x);
            case 7:
                return Math.cos(x);
            case 8:
                return Math.abs(Math.sin(x));
            case 9:
                return Math.pow(x, 3) + 1;
            case 10:
                return Math.pow(x, 3) + Math.sin(x);
            default:
                return x;
        }


    }

    double Bisect(double a, double b, double e, double d, int i) {

        {
            while ((b - a) / 2 >= e) {
                double x1 = (a + b - d) / 2;
                double x2 = (a + b + d) / 2;

                if (function(x1, i) > function(x2, i)) {
                    a = x1;
                } else {
                    b = x2;
                }
            }
            return (a + b) / 2;
        }
    }

    double GoldenSection(double a, double b, double e, int i) {
        double phi = (1 + Math.sqrt(5)) / 2;

        double x1 = b - (b - a) / phi;

        double x2 = a + (b - a) / phi;

        while ((b - a) / 2 >= e) {
            if (function(x1, i) > function(x2, i)) {
                a = x1;
                x1 = x2;
                x2 = b - (x1 - a);
            } else {
                b = x2;
                x2 = x1;
                x1 = a + (b - x2);
            }
        }

        return (a + b) / 2;
    }
}