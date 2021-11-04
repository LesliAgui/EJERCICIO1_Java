public class Test {

    public static void main (String [] args){
        //Lllamar metodos
         Account  a = new Account( 0);
        Account   a2 = new Account( 0);
         Customer c = new Customer ( "Leslie", "Aguilera", a);
        Customer c2 = new Customer ( "Hugo", "Aldape", a2);

            a.deposit(1500);
            a.withdraw(1200);

            System.out.println("Mi nombre completo es"+ c.getFirstName() + c.getLastname() + "y mi balance es "+ a.getBalance());

            a2.withdraw(1700);
            a2.deposit(1500);

        System.out.println("Mi nombre completo es"+ c2.getFirstName() + c2.getLastname() + "y mi balance es "+ a2.getBalance());



    }
}
