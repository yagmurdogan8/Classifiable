public class RationalNumber implements Classifiable {

    private Number numerator, denominator;

    // Do not change anything in this method.
    RationalNumber(Number x, Number y) {

        numerator = x;
        denominator = y;

    }

    // Erase the content. Fill in the blanks.
    // Return fraction's value as double.
    double getValue() {

        return numerator.getValue() * 1.0 / denominator.getValue() * 1.0;

    }

    // Fill in the blanks.
    // Determine fraction's type (proper (basit) , compound (bilesik)  or integer) and print to the console.
    @Override
    public void classify() {
        if (denominator.getValue() != 0) {

            if (numerator.getValue() > denominator.getValue() && numerator.getValue() % denominator.getValue() != 0) {

                System.out.println("Number is compound.");

            }
            else if (numerator.getValue() < denominator.getValue()) {

                System.out.println("Number is proper.");

            }
            else {

                System.out.println("Number is integer.");

            }
        }
        else {
            System.out.print("Denominator can't be 0!");
        }

    }
}