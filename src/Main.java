public class Main {
    public static void main(String[] args) {
        Area rectangle = new Area();
        rectangle.setBreadth(20);
        rectangle.setLength(60);

        System.out.println("The area of this rectangle is "+rectangle.getArea());

        Encapsulate encapsulate = new Encapsulate();

        // setting values of the variables
        encapsulate.setName("Anonymous");
        encapsulate.setAge(24);
        encapsulate.setRoll(51);

        // Displaying values of the variables
        System.out.println("Anonymous' name: " + encapsulate.getName());
        System.out.println("Anonymous' age: " + encapsulate.getAge());
        System.out.println("Anonymous' roll: " + encapsulate.getRoll());

        /* Direct access of anonymousRole is not possible
         due to encapsulation
         System.out.println("Anonymous' roll: " +
         encapsulate.anonymousName); */

    }
}