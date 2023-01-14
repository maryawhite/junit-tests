public class StringUtilities {

    private StringBuilder sBuilder = new StringBuilder();
    private int charsAdded = 0;

    public void addChar(StringBuilder sBuilder, char c) {
//        this.sBuilder.append(c);  //The error is in this line, you don't want to use this.sBuilder because this refers to this particular instance of the variable...
        sBuilder.append(c);
        charsAdded++;
    }
}
