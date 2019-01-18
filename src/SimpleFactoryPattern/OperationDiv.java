package SimpleFactoryPattern;

public class OperationDiv extends Operation{
    @Override
    public double GetResult() {
        double result = 0;
        if(get_numberB()!=0){
            result = get_numberA()/get_numberB();
        }else{
            System.out.println("除数不能为零");
        }
        return result;
    }
}
