import com.cabincoicegenerator.CabInvoiceGenerator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CabInvoiceGeneratorTest {

    CabInvoiceGenerator invoiceGenerator = new CabInvoiceGenerator();

    @Test
    public void givenDistance_shouldReturnFare() {
        double distance = 2.0;
        int time = 5;
        double result = invoiceGenerator.calculateFare(distance, time);
        Assertions.assertEquals(25, result);
    }

    @Test
    public void givenRides_shouldReturnTotalFare() {
        double [] distanceCovered={20.5,40.8,100.3};
        int [] timeTaken = {10,15,20};
        double result = invoiceGenerator.calculateFareOfMultipleRides(distanceCovered,timeTaken);
        Assertions.assertEquals(1661.0,result);

    }
}