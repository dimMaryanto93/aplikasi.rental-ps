/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalps;

import java.awt.Dimension;
import java.awt.Toolkit;
import rentalps.GUI.MainMenu;

/**Creator by Kelompok 1
 * nama                         NIM 
 * 1.Dimas Maryanto             10511148
 * 2.Riansyah Perpamana Putra   10511150
 * 3.William Paskal             10511150
 * 4.Muhamad Hanif Muhsin       10511173
 *
 * @author DIMAS MARYANTO
 */

public class RentalPS {
    private Dimension layarUtama;

    public RentalPS() {
        MainMenu utama = new MainMenu();
        utama.setSize(getLayarUtama().width, getLayarUtama().height-30);
        utama.setVisible(true);        
    }
    
    public Dimension getLayarUtama(){
        layarUtama = Toolkit.getDefaultToolkit().getScreenSize();
        return layarUtama;
        
    }   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new RentalPS();        
    }
}
