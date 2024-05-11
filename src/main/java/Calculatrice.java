import javax.swing.JButton;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elias
 */
public class Calculatrice extends JFrame{
    JTextPane txtp=new JTextPane();
    Boutons b0=new Boutons("0");
    Boutons b1=new Boutons("1");
    Boutons b2=new Boutons("2");
    Boutons b3=new Boutons("3");
    Boutons b4=new Boutons("4");
    Boutons b5=new Boutons("5");
    Boutons b6=new Boutons("6");
    Boutons b7=new Boutons("7");
    Boutons b8=new Boutons("8");
    Boutons b9=new Boutons("9");
    Boutons plus=new Boutons("+");
    Boutons minus=new Boutons("-");
    Boutons mul=new Boutons("x");
    Boutons div=new Boutons("/");
    Boutons dot=new Boutons(".");
    Boutons clear=new Boutons("C");
    Boutons res=new Boutons("=");
    Boutons par1=new Boutons("(");
    Boutons par2=new Boutons(")");
    Boutons sup=new Boutons("<");
    JPanel main=new JPanel();
    JPanel pan1=new JPanel();
    JPanel pan2=new JPanel();
    JPanel pan3=new JPanel();
    ArrayList<ActionEvent> events=new ArrayList<>();
    Calculatrice(){
        construire_calculatrice();
        construire_panel();
        ajouter_actions();
        this.setVisible(true);
    }
    private void construire_calculatrice(){
        this.setTitle("Ma calculatrice !");
        this.setSize(500,600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private void construire_panel(){
        main.setLayout(new BoxLayout(main,BoxLayout.Y_AXIS));
        main.setBackground(new Color(178,178,178));
        pan1.setLayout(new BoxLayout(pan1,BoxLayout.Y_AXIS));
        pan1.setPreferredSize(new Dimension(this.getWidth()-10,this.getHeight()/5));
        pan1.setBackground(new Color(178,178,178));
        pan1.add(Box.createVerticalStrut(20));
        pan2.add(txtp);
        pan2.setBackground(new Color(178,178,178));
        pan1.add(pan2);
        txtp.setPreferredSize(new Dimension(this.getWidth()-50,60));
        txtp.setFont(new Font(Font.SERIF,Font.BOLD,40));
        txtp.setBorder(BorderFactory.createLineBorder(Color.black,5,true));
        pan1.add(Box.createVerticalStrut(50));
        txtp.setBackground(new Color(73,156,240));
        main.add(pan1);
        main.add(pan3);
        pan3.setBackground(new Color(178,178,178));
        pan3.setLayout(new GridLayout(5,4,10,10));
        pan3.add(div);pan3.add(par1);pan3.add(par2);pan3.add(sup);
        pan3.add(b9);pan3.add(plus);pan3.add(minus);pan3.add(mul);
        pan3.add(b5);pan3.add(b6);pan3.add(b7);pan3.add(b8);
        pan3.add(b1);pan3.add(b2);pan3.add(b3);pan3.add(b4);
        pan3.add(b0);pan3.add(dot);pan3.add(clear);pan3.add(res);
        pan3.setPreferredSize(new Dimension(this.getWidth()-100,this.getHeight()/2+this.getHeight()/5));
        pan3.setBorder(BorderFactory.createLineBorder(new Color(0,0,0,0),10,true));
        main.add(Box.createVerticalStrut(20));
        main.setBorder(BorderFactory.createLineBorder(Color.black,10,true));
        this.setContentPane(main);
    }
    private void ajouter_actions(){
        b0.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if(txtp.getFont().getSize()!=40)
                    txtp.setFont(new Font(Font.SERIF,Font.BOLD,40));
                if(events.size()>0 && events.getLast().getSource()!=clear){
                    txtp.setText(txtp.getText()+"0");
                }
                else{
                    txtp.setText("0");}
                events.add(e);
            }});
        
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
               if(txtp.getFont().getSize()!=40)
                    txtp.setFont(new Font(Font.SERIF,Font.BOLD,40));
                if(events.size()>0 && events.getLast().getSource()!=res){
                    txtp.setText(txtp.getText()+"1");
                }
                else{
                    txtp.setText("1");}
                events.add(e);
            }});
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if(txtp.getFont().getSize()!=40)
                    txtp.setFont(new Font(Font.SERIF,Font.BOLD,40));
                if(events.size()>0 && events.getLast().getSource()!=res){
                    txtp.setText(txtp.getText()+"2");
                }
                else{
                    txtp.setText("2");}
                events.add(e);
            }});
        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if(txtp.getFont().getSize()!=40)
                    txtp.setFont(new Font(Font.SERIF,Font.BOLD,40));
                if(events.size()>0 && events.getLast().getSource()!=res){
                    txtp.setText(txtp.getText()+"3");
                }
                else{
                    txtp.setText("3");}
                events.add(e);
            }});
        b4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if(txtp.getFont().getSize()!=40)
                    txtp.setFont(new Font(Font.SERIF,Font.BOLD,40));
                if(events.size()>0 && events.getLast().getSource()!=res){
                    txtp.setText(txtp.getText()+"4");
                }
                else{
                    txtp.setText("4");}
                events.add(e);
            }});
        b5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if(txtp.getFont().getSize()!=40)
                    txtp.setFont(new Font(Font.SERIF,Font.BOLD,40));
                if(events.size()>0 && events.getLast().getSource()!=res){
                    txtp.setText(txtp.getText()+"5");
                }
                else{
                    txtp.setText("5");}
                events.add(e);
            }});
        b6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if(txtp.getFont().getSize()!=40)
                    txtp.setFont(new Font(Font.SERIF,Font.BOLD,40));
                if(events.size()>0 && events.getLast().getSource()!=res){
                    txtp.setText(txtp.getText()+"6");
                }
                else{
                    txtp.setText("6");}
                events.add(e);
            }});
        b7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if(txtp.getFont().getSize()!=40)
                    txtp.setFont(new Font(Font.SERIF,Font.BOLD,40));
                if(events.size()>0 && events.getLast().getSource()!=res){
                    txtp.setText(txtp.getText()+"7");
                }
                else{
                    txtp.setText("7");}
                events.add(e);
            }});
        b8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if(txtp.getFont().getSize()!=40)
                    txtp.setFont(new Font(Font.SERIF,Font.BOLD,40));
                if(events.size()>0 && events.getLast().getSource()!=res){
                    txtp.setText(txtp.getText()+"8");
                }
                else{
                    txtp.setText("8");}
                events.add(e);
            }});
        b9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if(txtp.getFont().getSize()!=40)
                    txtp.setFont(new Font(Font.SERIF,Font.BOLD,40));
                if(events.size()>0 && events.getLast().getSource()!=res){
                    txtp.setText(txtp.getText()+"9");
                }
                else{
                    txtp.setText("9");}
                events.add(e);
            }});
        plus.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if(events.getLast().getSource()==res){
                    txtp.setText("");
                }
                else{
                    txtp.setText(txtp.getText()+"+");}
                events.add(e);
            }});
        minus.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if(events.getLast().getSource()==res){
                    txtp.setText("");
                }
                else{
                    txtp.setText(txtp.getText()+"-");}
                events.add(e);
            }});
        mul.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if(events.getLast().getSource()==res){
                    txtp.setText("");
                }
                else{
                    txtp.setText(txtp.getText()+"x");}
                events.add(e);
            }});
        div.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if(events.getLast().getSource()==res){
                    txtp.setText("");
                }
                else{
                    txtp.setText(txtp.getText()+"/");}
                events.add(e);
            }});
        dot.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if(events.size()>0 && events.getLast().getSource()!=res){
                    txtp.setText(txtp.getText()+".");
                }
                else{
                    txtp.setText("");}
                events.add(e);
            }});
        clear.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                txtp.setText("");
                events.add(e);
            }});
        res.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                try {
                    String rep=calculSimple(txtp.getText());
                    txtp.setText(rep);
                    events.add(e);
                } catch (NoEnoughParameters ex) {
                    txtp.setFont(new Font(Font.SERIF,Font.BOLD,18));
                    txtp.setText(ex.toString().substring(19));
                }
            }});
        par1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if(events.getLast().getSource()==res){
                    txtp.setText("");
                }
                else{
                    txtp.setText(txtp.getText()+"(");}
                events.add(e);
            }});
        par2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if(events.getLast().getSource()==res){
                    txtp.setText("");
                }
                else{
                    txtp.setText(txtp.getText()+")");}
                events.add(e);
            }});
        sup.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if(events.size()==0);   
                else if(events.size()>0 && events.getLast().getSource()==res){
                    txtp.setText("");
                }
                else{
                    if(txtp.getText().length()>0){
                        txtp.setText(txtp.getText().substring(0,txtp.getText().length()-1));}
                    else;
                }
                events.add(e);
            }});
    }
    public String calculSimple(String s)throws NoEnoughParameters{
       Scanner sc=new Scanner(s);
       double op1 =0, op2 =0;
       
        String op="";
       if(s.contains("+"))
           op="\\+";
       else if(s.contains("-"))
           op="-";
       else if(s.contains("*"))
           op="\\*";
       else if(s.contains("/"))
           op="/";
       else{
           throw new NoEnoughParameters("opérateur non valide");
       }
       sc.useDelimiter(op);
       if(sc.hasNext()){
            op1=Double.parseDouble(sc.next());
       }
       else{
           throw new NoEnoughParameters("entrez le 1èr paramètre");
       }
       if(sc.hasNext()){
            op2=Double.parseDouble(sc.next());
       }
       else{
           throw new NoEnoughParameters("entrez le 2ème paramètre");
       }
       double res=0;
       switch(op){
           case "\\+" :res=op1+op2;
                    break;
           case "-" :res=op1-op2;break;
           case "\\*" :res=op1*op2;break;
           case "/" :if(op2==0){
                        throw new NoEnoughParameters("la division par 0 est impossible");
                    }
                    else
                    res=op1/op2;break;
           default :throw new NoEnoughParameters("opérateur non valide");
       }
                return String.valueOf(res);
    }
    

}
