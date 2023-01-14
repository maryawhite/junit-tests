public class InterviewPrep {
    //your task is to provide a suite of tests for an invert method of Inverter class
    //invert method accepts a string and returns a string

    //when the string is empty, it returns an empty string

    //
    public static String invert(String input){
        if(input.equals("")) {
            return "";
        }
        String[] stringSplit = input.split("");
        for(int i = 0; i < stringSplit.length; i++){

        }
        return "enter your return here";
    }
}

///import org.junit.Assert;
//import static org.junit.Assert.*;
//import org.junit.Test;
//
//public class InverterTest {
//
//    @Test
//    public void shouldInvert() {
//        String inverted = Inverter.invert(null);
//
//        Assert.fail();
//    }
//
//    @Test
//    public void emptyStringReturnsEmptyString(){
//        assertEquals("", Inverter.invert(""));
//    }
//
//}
