package tugas;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GuestRecord {
    static Scanner input = new Scanner(System.in);
    static BufferedReader Guestrecord = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) {
        char loop;
        boolean cekk1 = true;
        int inputTamu;

        EventOrganiser[] Guestrecord = new EventOrganiser[2];

        while (cekk1){
            System.out.println("1. input identitas");
            System.out.println("2. hasil yang datang");

            System.out.print("pilih : ");

            inputTamu = input.next().charAt(0);

            switch (inputTamu){
                case '1' :
                    tamuUndangan(Guestrecord);
                    break;

                case  '2' :
                    ArrayList<EventOrganiser> tamuTamu = new ArrayList<>(Arrays.asList(Guestrecord));
                    EventOrganiser.PrintGuest(tamuTamu);
                    break;
            }
        }
    }
    public static void tamuUndangan(EventOrganiser[] GuestReocrd){
        System.out.println("masukan data");
        for (int i = 0; i< GuestReocrd.length; i++){
            EventOrganiser tamuUndangan = new EventOrganiser();
            System.out.println("ID : ");
            tamuUndangan.setCustId(input.nextInt());
            System.out.println("NAME : ");
            tamuUndangan.setCustName(input.next());
            System.out.println("ADDERS : ");
            tamuUndangan.setCustAddr(input.next());
            System.out.println("EMAIL : ");
            tamuUndangan.setCustEmail(input.next());
            System.out.println("PHONE : ");
            tamuUndangan.setCustPhone(input.nextInt());
        }
    }
}
