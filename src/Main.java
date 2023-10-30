import coffee.order.CoffeeOrderBoard;

public class Main {
    public static void main(String[] args) {
        CoffeeOrderBoard orderBoard = new CoffeeOrderBoard();
        orderBoard.add("Yoda");
        orderBoard.add("Alen");
        orderBoard.add("John Snow");
        orderBoard.add("David White");
        orderBoard.add("Alice Miracle");

        orderBoard.draw();

        orderBoard.deliver();

        orderBoard.draw();

        orderBoard.deliver(4);

        orderBoard.draw();

        orderBoard.add("Katrin Bell");
        orderBoard.add("Philip Fox");
        orderBoard.add("Charlie Ben");
        orderBoard.add("David Clark");

        orderBoard.draw();
        orderBoard.deliver();
        orderBoard.draw();

        orderBoard.deliver(7);
        orderBoard.draw();

        orderBoard.deliver(55);
        orderBoard.draw();
    }
}