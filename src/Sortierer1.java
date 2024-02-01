import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Sortierer1 {
    List <Integer> sortiert;
    List <Integer> unsortiert;

    public Sortierer1(){
    sortiert= new List<Integer>();
    unsortiert=new List<Integer>();
    hinzufuegen();
    }
    public void hinzufuegen(){
        for (int i=0;i<10;i++){
            unsortiert.append((int)(Math.random()*10));
        }
    }
    public void selection() {
        while(unsortiert.hasAccess()){
        System.out.println(unsortiert.getContent() );
        unsortiert.next();}
        System.out.println("\n");
        if (!unsortiert.isEmpty()) {
            unsortiert.toFirst();
            int lokalezeit = unsortiert.getContent();

            while (unsortiert.hasAccess()) {
                unsortiert.next();
                if (unsortiert.getContent() < lokalezeit && unsortiert.hasAccess()) {
                    lokalezeit = unsortiert.getContent();


                }

            }
            sortiert.append(lokalezeit);
            unsortiert.toFirst();
            while (unsortiert.hasAccess()) {
                unsortiert.next();
                if (unsortiert.getContent() == lokalezeit && unsortiert.hasAccess()) {
                    unsortiert.remove();
                }
            }
        }
    }
    public void insertion(){
        if (!unsortiert.isEmpty()) {
            unsortiert.toFirst();
            while(unsortiert.hasAccess()){
                if(!sortiert.isEmpty()) {
                    sortiert.toFirst();

                    while (sortiert.hasAccess()) {
                        double lokalezeit =unsortiert.getContent();

                        if (sortiert.getContent() <lokalezeit && sortiert.hasAccess()) {
                           lokalezeit = sortiert.getContent();


                        }
                        sortiert.next();

                    }
                    sortiert.append(unsortiert.getContent());
                }
                unsortiert.remove();
                unsortiert.next();
            }
        }
    }
}