package interactivegame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class FrequencyFinder extends JFrame
{
    JFrame frame;

    private JTextArea chatArea = new JTextArea();
    private JTextField chatBox = new JTextField();
    Font myfont = new Font("Sans Serif",Font.BOLD,14);
    boolean firstSearch = true; // track if it's first search


    public FrequencyFinder()
    {
        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(230, 230, 250));
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(true);
        frame.setLayout(null);
        frame.setSize(520,900);
        frame.setTitle("Frequency Finder");
        frame.setFont(myfont);
        frame.add(chatArea);
        frame.add(chatBox);

        // Add scroll pane for chatArea
        JScrollPane scrollPane = new JScrollPane(chatArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        frame.add(scrollPane);

        scrollPane.setBounds(2, 40, 500, 720); // Adjust bounds as needed
        //for display.
        chatArea.append("Enter the Name of the Channel you're looking for \n");
        chatArea.setSize(500,800);
        chatArea.setLocation(2,40);
        chatArea.setEditable(false);
        chatArea.setFont(myfont);
        chatArea.setBackground(new Color(230, 230, 250));
        //for input box.
        chatBox.setSize(500, 38);
        chatBox.setLocation(2, 2);
        chatBox.setFont(myfont);
        chatBox.setBackground(new Color(229, 245, 250));


        chatBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String want = chatBox.getText().toUpperCase();
                chatArea.append("\n");
                chatBox.setText("");

                if (firstSearch) {
                    firstSearch = false; // Disable flag after first search
                } else {
                    chatArea.setText(""); // Clear chat area for subsequent searches
                }

                if(want.equalsIgnoreCase("ERI TV"))
                {
                    bot("This is the Frequency For " + want + ":\n");
                    System.out.println();
                    chatArea.append(" Nilesat : Eri Tv \n Frequency :  11746\n Polarisation : Vertical \n Symbol Rate : 27500 \n");
                }
                else if(want.equalsIgnoreCase("ebs"))
                {
                    bot("This is the Frequency For " + want + ":\n");
                    System.out.println();
                    chatArea.append(" Eutelsat : Ebs \n Frequency :  11546\n Polarisation : Vertical \n Symbol Rate : 27500 \n");
                }
                else if(want.equalsIgnoreCase("ebs cinema"))
                {
                    bot("This is the Frequency For " + want + ":\n");
                    System.out.println();
                    chatArea.append(" Eutelsat : Ebs Cinema \n Frequency :  11546\n Polarisation : Vertical \n Symbol Rate : 27500 \n");
                }
                else if(want.equalsIgnoreCase("ebs musika"))
                {
                    bot("This is the Frequency For " + want + ":\n");
                    System.out.println();
                    chatArea.append(" Eutelsat : Ebs Musika \n Frequency :  11546\n Polarisation : Vertical \n Symbol Rate : 27500 \n");
                }
                else if(want.equalsIgnoreCase("addis tv"))
                {
                    bot("This is the Frequency For " + want + ":\n");
                    System.out.println();
                    chatArea.append(" Hot Bird : Addis Tv \n Frequency :  11796\n Polarisation : Vertical \n Symbol Rate : 27500 \n");
                }
                else if(want.equalsIgnoreCase("arts tv"))
                {
                    bot("This is the Frequency For " + want + ":\n");
                    System.out.println();
                    chatArea.append(" Eutelsat : Arts Tv \n Frequency :  11326\n Polarisation : Horizontal \n Symbol Rate : 27500 \n");
                }
                else if(want.equalsIgnoreCase("balageru"))
                {
                    bot("This is the Frequency For " + want + ":\n");
                    System.out.println();
                    chatArea.append(" Eutelsat : Balageru \n Frequency :  11216\n Polarisation : Vertical \n Symbol Rate : 27500 \n");
                }
                else if(want.equalsIgnoreCase("eotc"))
                {
                    bot("This is the Frequency For " + want + ":\n");
                    System.out.println();
                    chatArea.append(" Nilesat : EOTC \n Frequency :  11346\n Polarisation : Horizontal \n Symbol Rate : 27500 \n");
                }
                else if(want.equalsIgnoreCase("etv"))
                {
                    bot("This is the Frequency For " + want + ":\n");
                    System.out.println();
                    chatArea.append(" Nilesat : ETV \n Frequency :  11736\n Polarisation : Horizontal \n Symbol Rate : 27500 \n");
                }
                else if(want.equalsIgnoreCase("etv news"))
                {
                    bot("This is the Frequency For " + want + ":\n");
                    System.out.println();
                    chatArea.append(" Nilesat : ETV NEWS \n Frequency :  11711\n Polarisation : Vertical \n Symbol Rate : 27500 \n");
                }
                else if(want.equalsIgnoreCase("nahoo tv"))
                {
                    bot("This is the Frequency For " + want + ":\n");
                    System.out.println();
                    chatArea.append(" Hot Bird : Nahoo Tv \n Frequency :  11756\n Polarisation : Vertical \n Symbol Rate : 27500 \n");
                }
                else if(want.equalsIgnoreCase("kana"))
                {
                    bot("This is the Frequency For " + want + ":\n");
                    System.out.println();
                    chatArea.append(" Hot Bird : Kana \n Frequency :  12746\n Polarisation : Vertical \n Symbol Rate : 27500 \n");
                }
                else if(want.equalsIgnoreCase("al jazzera"))
                {
                    bot("This is the Frequency For " + want + ":\n");
                    System.out.println();
                    chatArea.append(" Nilesat : Al-Jazzera \n Frequency :  11456\n Polarisation : Horizontal \n Symbol Rate : 27500 \n");
                }
                else if(want.equalsIgnoreCase("bbc"))
                {
                    bot("This is the Frequency For " + want + ":\n");
                    System.out.println();
                    chatArea.append(" Nilesat : BBC \n Frequency :  11456\n Polarisation : Vertical \n Symbol Rate : 27500 \n");
                }
                else if(want.equalsIgnoreCase("dubai one"))
                {
                    bot("This is the Frequency For " + want + ":\n");
                    System.out.println();
                    chatArea.append(" Nilesat : Dubai One \n Frequency :  11656\n Polarisation : Horizontal \n Symbol Rate : 27500 \n");
                }
                else if(want.equalsIgnoreCase("mbc 3"))
                {
                    bot("This is the Frequency For " + want + ":\n");
                    System.out.println();
                    chatArea.append(" Nilesat : MBC 3 \n Frequency :  11722\n Polarisation : Vertical \n Symbol Rate : 27500 \n");
                }
                else if(want.equalsIgnoreCase("cartoon network"))
                {
                    bot("This is the Frequency For " + want + ":\n");
                    System.out.println();
                    chatArea.append(" Nilesat : CARTOON_NETWORK \n Frequency :  11477\n Polarisation : Horizontal \n Symbol Rate : 27500 \n");
                }
                else if(want.equalsIgnoreCase("mbc 2"))
                {
                    bot("This is the Frequency For " + want + ":\n");
                    System.out.println();
                    chatArea.append(" Nilesat : MBC 2 \n Frequency :  12746\n Polarisation : Vertical \n Symbol Rate : 27500 \n");
                }
                else if(want.equalsIgnoreCase("mbc 4"))
                {
                    bot("This is the Frequency For " + want + ":\n");
                    System.out.println();
                    chatArea.append(" Nilesat : MBC 4\n Frequency :  11776\n Polarisation : Vertical \n Symbol Rate : 27500 \n");
                }
                else if(want.equalsIgnoreCase("mbc action"))
                {
                    bot("This is the Frequency For " + want + ":\n");
                    System.out.println();
                    chatArea.append(" Nilesat : MBC ACTION \n Frequency :  11786\n Polarisation : Vertical \n Symbol Rate : 27500 \n");
                }
                else if(want.equalsIgnoreCase("mbc bollywood"))
                {
                    bot("This is the Frequency For " + want + ":\n");
                    System.out.println();
                    chatArea.append(" Nilesat : MBC BOLLYWOOD \n Frequency :  11711\n Polarisation : Horizontal \n Symbol Rate : 27500 \n");
                }
                else {
                    bot("Sorry i don't know this Channel.\n");
                }
            }
        });
     }
        private void bot(String string)
        {
            chatArea.append(string + "\n");
        }
    public static void main(String[] args)
    {
        new FrequencyFinder();
    }
}

