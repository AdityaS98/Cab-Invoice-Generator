import com.cabincoicegenerator.CabInvoiceGenerator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CabInvoiceGeneratorTest {

    CabInvoiceGenerator invoiceGenerator = new CabInvoiceGenerator();
    @Test
    public void givenDistance_shouldReturnFare(){
        double distance = 2.0;
        int time = 5;
        double result = invoiceGenerator.calculateFare(distance,time);
        Assertions.assertEquals(25,result);
    }
}
