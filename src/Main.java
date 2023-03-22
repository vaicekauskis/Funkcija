import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        /*Sukurkite Funkciją kuri priima du int tipo kintamuosius. Juos susumuoja ir atspausdina.*/


        int min = 10;
        int nim = 15;
        sum(min, nim);
        sum(14, 20);
        System.out.println(PISq()); // 2 uzduotis
        System.out.println(skaiciuSandauga(10, 15));   // 3 uzduotis
        int[] arr1 = {5, 10, 15, 20, 25};
        System.out.println("--------------------------");
        printArr(randomArr(10, 22));
//        System.out.println(arrSum1(randomArr())); //6 uzduotis

        System.out.println("---------9-------------");
        String text2 = "Šiandien labai graži diena";
        System.out.println(text2);
        lettersAndSpaces(text2);

        System.out.println("-----------10---------------");
        String text3 = "Naglis";
        sentenceAround(text3);
        System.out.println(sentenceAround(text3));

        System.out.println("-------------1 sunkus----------");

        String words = "Linas";
        printMinus(words);

        System.out.println("-------------2 sunki------------");
        String rnd = "abcdefghijklmnopqrstuvwxyz0123456789";

        System.out.println("---------3 sunki------");
        int number = 12;
       integers(number);
        System.out.println(integers(number));

        System.out.println("---------------------4 sunkus-----------------");

        int[] arr3 = {8,4,5,9,100,3,6,128,7,2,1};
        System.out.println("halooooooooo");
        int[] sortedArray = sortTheArray(arr3);
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + " ");
        }


        System.out.println("-------------- 5 sunkus------------");

        int[] rndArr = generateRndInArr(100 ,333,777);
        countPrimeNumInArr(rndArr);
        System.out.println(countPrimeNumInArr(rndArr));



    }

    public static void sum(int min, int nim) {
        System.out.println(min + nim);
    }
//Sukurkite Funkciją kuri vadinasi PISq.
// Funkcija gražina double tipo reikšmę. Reikšmė yra : 9.8596; Gautą reikšmę atspausdinkite.


    public static double PISq() {
        return 9.8596;
    }
//    Sukurkite Funkciją kuri priima du int tipo kintamuosius.
//    Funkcija gražina skaičių sandaugą.; Gautą reikšmę atspausdinkite.

    public static int skaiciuSandauga(int a, int b) {
        return (a * b);

    }


    //Sukurkite Funkciją kuri priima int[] tipo kintamąį, prasuka ciklą ir atspausdina kiekvieną skaičių.


    public static void printArr(int[] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

    }


    //Sukurkite Funkciją kuri sugeneruotų 5-ių random int skaičių masyvą ir jį gražintų.
    // intervalą(min, max sugalvokite patys)


    public static int[] randomArr(int min, int max) {
        int[] arr2 = new int[5];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = min + (int) (Math.random() * (max - min + 1));

        }
        return arr2;
    }
    public static int[] generateRndInArr(int length  ,int min, int max) {
        int[] arr2 = new int[length];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = min + (int) (Math.random() * (max - min ));

        }
        return arr2;
    }


    //Sukurkite Funkciją kuri panaudotų 5tos užduoties masyvą (priimtų kaip kintamąjį), susumuotų ir gražintų reikšmę.


    public static int arrSum1(int[] arr2) {
        int sumArr2 = 0;
        for (int i = 0; i < arr2.length; i++) {
            sumArr2 += arr2[i];

        }
        return sumArr2;
    }

    // 7 .Sukurkite Funkciją kuri priimtų 5tos užduoties masyvą ir gražintų jos skaičių vidurkį (double).

    public static double averageArr(int[] arr2) {
        int sumArr3 = 0;
        for (int i = 0; i < arr2.length; i++) {
            sumArr3 = sumArr3 + arr2[i];
        }
        double avg = sumArr3 / arr2.length;
        return avg;
    }


    // 8. Sukurkite Funkciją kuri priimtų du int skaičius ir atspausdintų stačiakampį
    // užpildytą žvaigždutėmis. Pirmas int - išoriniam ciklui, antras vidiniam.

    public static void square(int star, int star2) {
        for (int k = 1; k <= 10; k++) {
            String zvai = "*";
            for (int i = 1; i < 10; i++)
                zvai += "*";
        }


    }


    //Sukurkite Funkciją kuri priimtų sakinį kaip kintamąjį ir atspausdintų kiek jame yra raidžių ir tarpų.
    // Sakinys - “Šiandien labai graži diena”. (kodas turi veikti padavus bet kokį sakinį)


    public static void lettersAndSpaces(String text2) {
        System.out.println(text2.length());
        //  System.out.println(text2.replaceAll("[a-zA-ZŠ]","").length());
        System.out.println(text2.replaceAll("[^ ]", "").length()); //teksta panaikina
        System.out.println(text2.replaceAll(" ", "").length());  // tarpus panaikina

    }

    //Sukurkite Funkciją kuri priimtų sakinį, jį užkoduotų ir grąžintų. Kodavimas - sakinį apsukame iš kitos pusės.
    // Pvz “Naglis” turi gautis “silgaN”.

    public static String sentenceAround(String text3) {

        String result = "";
        for (int i = text3.length() - 1; i >= 0; i--) {
            result += text3.charAt(i);

        }
        return result;


    }

    //Parašykite funkciją, kurios argumentas būtų tekstas, kuris būtų atspausdinamas konsolėje
    // pridedant “---” pradžioje ir gale. PVZ (---labas---)

    public static void printMinus(String words) {
        String start = "----";
        String end = "----";
        System.out.println(start + words + end);
    }

    //Sugeneruokite atsitiktinį stringą iš raidžių ir skaičių (10 simbolių). Atspausdinkite simbolius stulpeliu.
    // Jei tai skaičius apgaubkite “ [ 7 ]”. Jei skaičiai eina keli iš eilės, apgaubkite juos kartu. [75].


//   3 sunkus   Parašykite funkciją, kuri skaičiuotų, ir gražintų iš kiek sveikų skaičių jos argumentas dalijasi
//    be liekanos (išskyrus vienetą ir patį save).

    public static int integers(int Number) {
        int count = 0;
        for (int i = 2; i < Number/2; i++) {  //Porinis skaicius kita pusre buna blogi masyvo optimizavimas ( /2 )
            if (Number % i == 0) {
                count++;
            }
        }
        return count;
    }

//4 sunkus Sugeneruokite masyvą iš 100 elementų, kurio reikšmės atsitiktiniai skaičiai nuo 33 iki 77.
// Išrūšiuokite masyvą pagal daliklių be liekanos kiekį mažėjimo tvarka, panaudodami trečio uždavinio funkciją.

    public static int[] sortTheArray (int[] arr3){
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3.length; j++) {
                if (integers(arr3[i]) > integers(arr3[j])) {
                    int temp = arr3[i];
                    arr3[i] = arr3[j];
                    arr3[j] = temp ;

                }
            }
        }
        return arr3;
    }





// 5 sunkus  Sugeneruokite masyvą iš 100 elementų, kurio reikšmės atsitiktiniai skaičiai nuo 333 iki 777.
// Naudodami 3 uždavinio funkciją iš masyvo suskaičiuokite kiek yra pirminių skaičių.

    public static int countPrimeNumInArr (int[] num){

        int primeNu = 0;
        for (int i = 0; i <num.length; i++) {
            if (integers(num[i]) == 0) {
                primeNu++;
            }

        }
        return primeNu;
    }




















}













