import javax.swing.SwingUtilities;
import java.awt.Component;
import javax.swing.JFrame;

// 
// Decompiled by Procyon v0.5.36
// 

public class TitlesFrame extends JFrame
{
    public TitlesFrame() {
        this.initUI();
    }

    /**
     * Method used to initialise UI. Window title and figure style can be set inside
     */
    enum SHAPE {
        HEX,
        FIVESTAR,
        SQUARE,
        TRIANGLE,
        PACMAN
    }

    enum STYLE {
        DEFAULT,
        THINSTROKE,
        THICKSTROKE,
        GRADIENT,
        RED
    }

    private void initUI() {
        this.setTitle("\u041a\u0440\u0438\u0432\u044b\u0435 \u0444\u0438\u0433\u0443\u0440\u044b");
        this.setDefaultCloseOperation(3);
        this.add(new TitlesPanel(SHAPE.HEX,STYLE.DEFAULT));
        this.setSize(350, 350);
        this.setLocationRelativeTo(null);
    }

    /**
     * Main method of the program.
     * @param args
     */
    public static void main(final String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                final TitlesFrame ps = new TitlesFrame();
                ps.setVisible(true);
            }
        });
    }
}