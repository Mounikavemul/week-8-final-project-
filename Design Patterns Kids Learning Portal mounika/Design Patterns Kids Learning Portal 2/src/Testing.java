import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Testing {

  

    @Test
    public void strategyTestAddition(){

        Subject subject=new Math();
        Context context=new Context(new AdditionDecorator(subject));
        int result=context.executeStrategy(3,4);

        assertEquals(result,7);
    }


    @Test
    public void strategyTestMultiplication(){

        Subject subject=new Math();
        Context context=new Context(new MultiplicationDecorator(subject));
        int result=context.executeStrategy(3,4);

        assertEquals(result,12);
    }

    @Test
    public void strategyTestSubtraction(){

        Subject subject=new Math();
        Context context=new Context(new SubtractionDecorator(subject));
        int result=context.executeStrategy(13,4);

        assertEquals(result,9);
    }

    @Test
    public void strategyTestDivision(){

        Subject subject=new Math();
        Context context=new Context(new DivisionDecorator(subject));
        int result=context.executeStrategy(20,5);

        assertEquals(result,4);
    }
}
