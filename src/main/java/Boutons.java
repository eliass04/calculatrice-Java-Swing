
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elias
 */
public class Boutons extends JButton{
    Boutons(String text){
        this.setText(text);
        this.setFont(new Font(Font.SERIF,Font.BOLD,40));       
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK,5, true));
    }
}
