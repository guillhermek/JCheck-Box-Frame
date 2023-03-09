import javax.swing.JFrame;
/* Atividade feito em sala de aula- IFMT 
 * Guilherme Vinicius da Silva 3°A 
 * PDF usado https://www.docdroid.net/RkUnGtG/capitulo-14-componentes-gui-parte-3-compressed-pdf
 * 09/03/2023
 */
    public class CheckBoxTest
    {
        public static void main(String[] args)
        {
        CheckBoxFrame checkBoxFrame = new CheckBoxFrame();
        checkBoxFrame.setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE); 
        checkBoxFrame.setSize( 275, 100 ); 
        checkBoxFrame.setVisible(true); // exibe o frame
    } // fim de main
} 
