package Food2Door;

public class OrderProcessor {



    public Order takeOrder(){

        return new Order("something", 2);
    }

    public void makeOrder(Order order, Processor processor){

        if(processor.process(order)){
            System.out.println("Your food was ordered");
        }else{
            System.out.println("Your food wasn't ordered");
        }

    }

}
