package pegandoresolucaodatela;

import java.awt.Dimension;
import java.awt.Toolkit;

public class PegandoResolucaoDaTela {

    public static void main(String[] args) {
        // TODO code application logic here
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("Screen width = " + d.width);
        System.out.println("Screen height = " + d.height);
    }
    
}
