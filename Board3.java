// Board3.java

import javax.swing.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class  Board3 extends JFrame {

  private final int tate = 8;
  private final int yoko = 8;
  private final int size = 60;
  private final int padding = 30;

  private JButton buttonArray[][] = new JButton[ tate ][ yoko ];
  private Container c;

  Board3() {
    this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    this.setTitle( "Board3" );
//    this.setSize( ( size * yoko ) + ( padding * 2 ), ( size * tate ) + ( padding * 2 ) );
    this.setLocationRelativeTo( null );
    c = this.getContentPane();
    c.setPreferredSize( new Dimension( ( size * yoko ) + ( padding * 2 ), ( size * tate ) + ( padding * 2 ) ) );
    this.pack();
    c.setLayout( null );

    for ( int i = 0 ; i < tate ; i++ ) {
      for ( int j = 0 ; j < yoko ; j++ ) {
        buttonArray[ i ][ j ] = new JButton( Integer.toString( ( yoko  * i  ) + j ) );
        c.add( buttonArray[ i ][ j ] );
        buttonArray[ i ][ j ].setBounds( size * j + padding, size * i + padding, size, size );
      }
    }
  }

  public static void main( String[] args ) {
    Board3 gui = new Board3();
    gui.setVisible( true );
  }

}
