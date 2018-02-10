package zajecia_10;

public class C {
    public static void main(String[] args) {
        int next = 2;   //albo =2
        String filename = "";

        /////// napisać kod, który jeśli next=1 to zamieni na next=2,
        // jeśli next=2 to zamieni na next=1

        // jeśli na początku next=2, to filename ma być "banana.png",
        // a jeśli na początku next=1, to filename = "kiwi.png"

        //your code
        if (next==1) {
            filename = "kiwi.png";
            next = 2;
        } else {
            filename = "banana.png";
            next = 1;
        }

        System.out.println(next);

    }
}
