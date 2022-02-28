public class StringCalculator {

    static int add(String numbers) {
        String[] numbersArray = numbers.split(",");
        //providing an empty string should return 0
        if (numbers.equals("")) {
            return 0;
        }
        if (numbers.length() == 1) {
            return Integer.parseInt(numbers);
        }
        if(numbersArray.length == 1) {
            return Integer.parseInt(numbers);
        }

        int sum = 0;

        for(int i = 0; i < numbersArray.length; i++) {
            sum = sum + Integer.parseInt(numbersArray[i]);  //remember to use parseInt because the parameter is a String, but you're returning an int
        }
        return sum;

    }

    public static void main(String[] args) {
        System.out.println(add("2,3,4"));
        System.out.println(add("90,10"));
        System.out.println(add("1"));
        System.out.println(add(""));
    }

}
