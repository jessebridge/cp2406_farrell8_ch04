public class FormLetterWritter {

    public void displaySalutation(String last){
        System.out.println("Dear Mr. or Ms. " + last);

    }

    public void displaySalutation(String first, String last){
        System.out.println("Dear " + first + " " + last );
    }

    public static void main(String[] args) {
        FormLetterWritter obj = new FormLetterWritter();
        obj.displaySalutation("Harrison");
        obj.displaySalutation("John", "Harrison");


    }
}
