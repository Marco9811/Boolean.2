public class Boolean2 {
    public static void main(String[] args) {

        boolean A = (55 != 55) && (false ^ true); //La risposta è false. ( falso * falso = falso)
        System.out.println(A);

        boolean B = (!true || !false) || 2 == '2'); // La risposta è true= (true*false=true)true*false=true
        System.out.println(B);

        boolean C = false && true || false && !false; //La risposta è false= false*true=false(false*!false=false)
        System.out.println(C);

        boolean D = (false && true) || (false || true); //La risposta è true= False*true=false(false*true=true)false*true=true
        System.out.println(D);

    }
}
