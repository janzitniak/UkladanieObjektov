import sk.tmconsulting.model.Kniha;

import java.io.*;
import java.util.ArrayList;

public class UkladanieNacitanieObjektu {

            public static void main(String[] args) throws IOException, ClassNotFoundException {

                Kniha knihaObjekt1 = new Kniha();
                knihaObjekt1.setNazov("Motýľ");
                knihaObjekt1.setAutor("Anna Schonn");
                knihaObjekt1.setZaner("Ženský román");

                Kniha knihaObjekt2 = new Kniha();
                knihaObjekt2.setNazov("Duna");
                knihaObjekt2.setAutor("Frank Herbert");
                knihaObjekt2.setZaner("SCI-FI");

                ArrayList<Kniha> kniznica = new ArrayList<Kniha>();
                kniznica.add(knihaObjekt1); // ukladame knihaObjekt1, cize prvu knihu
                kniznica.add(knihaObjekt2); // ukladame knihaObejkt2, cize druhu knihu

                FileOutputStream fileOutputStream = new FileOutputStream("kniznica.databaza"); // vytvorime subor s nazvom kniha.ser
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream); // vytvorime Object stream pre ukladanie objektov
                objectOutputStream.writeObject(kniznica); // zapiseme objekt
                objectOutputStream.flush(); // realne uskutocnime operaciu zapisu
                objectOutputStream.close(); // zatvorime object output stream
                fileOutputStream.close(); // zatvorime file output stream, cize subor


                // nacitanie ArrayList
                FileInputStream fileInputStream = new FileInputStream("kniznica.databaza");
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                ArrayList<Kniha> kniznicaZoSuboru = (ArrayList) objectInputStream.readObject();
                objectInputStream.close();
                fileInputStream.close();

                // vypisanie obsahu ArrayList cez foreach
                for(Kniha vystup:kniznicaZoSuboru) {
                    System.out.println("Názov knihy: " + vystup.getNazov());
                    System.out.println("Meno autora: " + vystup.getAutor());
                    System.out.println("Žáner knihy: " + vystup.getZaner());
                }

                //ArrayList, do ArrayList vkladame objekty cez metodu (prikaz) add
                //ArrayList je tiez objekt, ktory moze byt serializovany, cize ulozeny aj do suboru
                //Serializácia ArrayList:
                //V Jave trieda ArrayList štandardne implementuje Serializovateľné rozhranie,
                //tj ArrayList je štandardne serializovaný. Na serializáciu môžeme priamo použiť ObjectOutputStream

                //TODO Vytvorte databazu napr. 2, 3 knih, ktore ulozime do ArrayList. Nasledne ArrayList ulozime do suboru s nazvom kniznica.ser
                //TODO Subor kniznica.ser nasledne mi preposlite cez chat


    }
}
