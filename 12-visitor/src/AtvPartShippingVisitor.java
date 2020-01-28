import java.util.List;

public class AtvPartShippingVisitor implements AtvPartVisitor {

    double shippingAmount = 0;

    @Override
    public void visit(Wheel wheel) {
        shippingAmount += 15;
        System.out.println("Wheels are bulky and expensive to ship");
    }

    @Override
    public void visit(Fender fender) {
        shippingAmount += 3;
        System.out.println("Fenders are light and cheap to ship");
    }

    @Override
    public void visit(Oil oil) {
        shippingAmount += 9;
        System.out.println("Oil is hazard and has a fee to ship");
    }

    @Override
    public void visit(PartsOrder partsOrder) {
        System.out.println("If they bought more then 3 things we give them discounts on shipping");
        List<AtvPart> atvParts = partsOrder.getAtvParts();
        if (atvParts.size() > 3) {
            shippingAmount -= 5;
        }
        System.out.println("Shiping amount is: " + shippingAmount);
    }
}
