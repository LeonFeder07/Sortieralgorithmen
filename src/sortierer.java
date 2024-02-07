import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class sortierer {
    private JTextField textField1;
    private JButton hinzufügenButton;
    private JButton sortierenButton;
    private JLabel wdawd;
    private JPanel wda;
    private JButton insertionSortierenButton;
    private JButton bubbleSortierenButton;
    List<Integer> sortiert;
    List<Integer> unsortiert;
    int[] zahlen;

    public sortierer() {
        sortiert = new List<Integer>();
        unsortiert = new List<Integer>();
        hinzufügenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 10; i >0; i--) {
                    unsortiert.append((int) (Math.random() * 10));

                }
                unsortiert.toFirst();
                while (unsortiert.hasAccess()) {
                    System.out.println(unsortiert.getContent());
                    unsortiert.next();
                }
                System.out.println("-------einfügen ends--------\n");
            }
        });
        sortierenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                unsortiert.toFirst();
                while (unsortiert.hasAccess()) {
                    System.out.println(unsortiert.getContent());
                    unsortiert.next();
                }
                System.out.println("------selection begins------\n");
             //   if (!unsortiert.isEmpty()) {
                    while (!unsortiert.isEmpty()) {
                    unsortiert.toFirst();
                    int lokalezeit = unsortiert.getContent();

                        while (unsortiert.hasAccess()) {
                            unsortiert.next();
                            if (unsortiert.hasAccess() && unsortiert.getContent() <= lokalezeit) {
                                lokalezeit = unsortiert.getContent();


                            }

                        }
                        sortiert.append(lokalezeit);
                        unsortiert.toFirst();
                        boolean schongelöscht=false;
                        while (unsortiert.hasAccess()) {

                            if (unsortiert.hasAccess()&& schongelöscht==false && unsortiert.getContent() == lokalezeit) {
                                unsortiert.remove();
                                schongelöscht=true;
                            }
                            unsortiert.next();
                        }

                    }

                sortiert.toFirst();
                while (sortiert.hasAccess()) {
                    System.out.println(sortiert.getContent());
                    sortiert.next();
                }
                System.out.println("---------selection ends-------\n");
            }
        });
        insertionSortierenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                unsortiert.toFirst();
                while (unsortiert.hasAccess()) {
                    System.out.println(unsortiert.getContent());
                    unsortiert.next();
                }
                System.out.println("-------insertion begins-------\n");
                while (!unsortiert.isEmpty()) {
                    boolean isteingefuegt=false;
                    unsortiert.toFirst();
                    if (unsortiert.hasAccess()) {
                        int lokalezeit1 = unsortiert.getContent();
                        unsortiert.remove();

                        if(sortiert.isEmpty()){
                            sortiert.append(lokalezeit1);
                            isteingefuegt=true;
                        }
                        if (!sortiert.isEmpty()) {
                            sortiert.toFirst();
                            while (sortiert.hasAccess()) {
                                if (sortiert.getContent() > lokalezeit1 && isteingefuegt==false) {
                                    sortiert.insert(lokalezeit1);
                                    isteingefuegt=true;

                                }
                                sortiert.next();

                            }
                            if (!sortiert.hasAccess() && isteingefuegt==false){
                                sortiert.append(lokalezeit1);

                            }


                        }



                    }
                }
                sortiert.toFirst();
                while (sortiert.hasAccess()) {
                    System.out.println(sortiert.getContent());
                    sortiert.next();
                }
                System.out.println("-------insertion ends--------\n");
                unsortiert.toFirst();
                while (unsortiert.hasAccess()) {
                    System.out.println(unsortiert.getContent());
                    unsortiert.next();
                }
            }
        });
        bubbleSortierenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int zahlausgabe=0;
                int k= 0;
               for(int i=0;i<10;i++){
                   zahlen[i]=((int)Math.random()*10);
               }
               for(int j=0;j< zahlen.length;j++){
                  zahlausgabe=zahlen[j];
                   System.out.println(zahlausgabe);
               }
               for(int o=0;o<zahlen.length;){


               }
            }
        });
    }
//2hoch n -1 Züge für den Turm
    public static void main(String[] args) {
        JFrame frame = new JFrame("sortierer");
        frame.setContentPane(new sortierer().wda);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
