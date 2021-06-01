import ij.*;
import ij.gui.Plot;
import ij.process.*;
import java.awt.*;
import ij.plugin.*;
import ij.plugin.filter.PlugInFilter;
import ij.plugin.frame.*;
import javax.swing.*;

public class negative extends javax.swing.JFrame implements PlugInFilter {

    /**
     * Creates new form negative
     */
    public negative() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        jButton1.setText("Threshold");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        jButton2.setText("Flip");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        jButton3.setText("Negative");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        jButton4.setText("Histogram");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        jButton5.setText("Filter_Arbitrary");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        jButton6.setText("Filter_Smooth_3x3");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        jButton7.setText("Histogram_Equalization");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        jLabel1.setText("Image Processing Algorithms");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton7)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton6)
                            .addComponent(jLabel1))
                        .addGap(0, 62, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       imp = IJ.getImage();
        ip = imp.getProcessor();
        int w = ip.getWidth();
        int h = ip.getHeight();
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int pixel = ip.getPixel(i, j);
                ip.putPixel(i, j, 255 - pixel);

            }
        }
        IJ.showMessage("DONE !");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     imp = IJ.getImage();
        ip = imp.getProcessor();
        int w = ip.getWidth();
        int h = ip.getHeight();
        for (int i = 0; i < w / 2; i++) {
            for (int j = 0; j < h; j++) {
                int pixel = ip.getPixel(i, j);
                int p2 = ip.getPixel(w - 1 - i, j);
                ip.putPixel(i, j, p2);
                ip.putPixel(w - 1 - i, j, pixel);
            }
        }
        IJ.showMessage("DONE !");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        imp = IJ.getImage();
        ip = imp.getProcessor();
        int w = ip.getWidth();
        int h = ip.getHeight();

        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int pixel = ip.getPixel(i, j);
                ip.putPixel(i, j, pixel - 100);
            }
        }

        IJ.showMessage("DONE !");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    imp = IJ.getImage();
        ip = imp.getProcessor();
        int w=ip.getWidth();
        int h=ip.getHeight();
        double[]hstgrm=new double[256];
        for(int i=0;i<w;i++)
        for(int j=0;j<h;j++)
        {       
            int index =ip.getPixel(i,j);
            hstgrm[index]=hstgrm[index]+1;
        }
        double mx=0;
        double[]clrs=new double[256];
        for(int i=0;i<256;i++)
        {
            clrs[i]=(double)i;
            if(hstgrm[i]>mx)
            mx=hstgrm[i];
        }
        Plot p=new Plot("hstgrm","x_color","y_occ") ;
        p.addPoints(clrs,hstgrm,Plot.LINE);
        p.setLimits(0,255,0,mx);
        p.draw();
        p.show();
        IJ.showMessage("DONE !");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         imp = IJ.getImage();
        ip = imp.getProcessor();
        int M = ip.getWidth();
        int N = ip.getHeight();

        // filter matrix H of size (2K + 1) ? (2L + 1)
        int[][] H = {
            {0, 0, 1, 1, 1, 0, 0},
            {0, 1, 1, 1, 1, 1, 0},
            {1, 1, 1, 1, 1, 1, 1},
            {0, 1, 1, 1, 1, 1, 0},
            {0, 0, 1, 1, 1, 0, 0}};

        double s = 1.0 / 23; // sum of filter coefficients is 23

        // H[L][K] is the center element of H:
        int K = H[0].length / 2; // K = 3
        int L = H.length / 2; // L = 2

        ImageProcessor copy = ip.duplicate();

        for (int u = K; u <= M - K - 1; u++) {
            for (int v = L; v <= N - L - 1; v++) {
                // compute filter result for position (u, v):
                int sum = 0;
                for (int i = -K; i <= K; i++) {
                    for (int j = -L; j <= L; j++) {
                        int p = copy.getPixel(u + i, v + j);
                        int c = H[j + L][i + K];
                        sum = sum + c * p;
                    }
                }
                int q = (int) Math.round(s * sum);
                // clamp result:
                if (q < 0) {
                    q = 0;
                }
                if (q > 255) {
                    q = 255;
                }
                ip.putPixel(u, v, q);
            }
        }

        IJ.showMessage("DONE !");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         imp = IJ.getImage();
        ip = imp.getProcessor();
        int M = ip.getWidth();
        int N = ip.getHeight();

        //3x3 filter matrix:
        double[][] H = {
            {0.075, 0.125, 0.075},
            {0.125, 0.200, 0.125},
            {0.075, 0.125, 0.075}};

        ImageProcessor copy = ip.duplicate();

        for (int u = 1; u <= M - 2; u++) {
            for (int v = 1; v <= N - 2; v++) {
                // compute filter result for position (u,v):
                double sum = 0;
                for (int i = -1; i <= 1; i++) {
                    for (int j = -1; j <= 1; j++) {
                        int p = copy.getPixel(u + i, v + j);
                        // get the corresponding filter coefficient:
                        double c = H[j + 1][i + 1];
                        sum = sum + c * p;
                    }
                }
                int q = (int) Math.round(sum);
                ip.putPixel(u, v, q);
            }
        }

        IJ.showMessage("DONE !");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
     imp = IJ.getImage();
        ip = imp.getProcessor();
        int width = ip.getWidth();
        int height = ip.getHeight();
        int anzpixel = width * height;
        int[] histogram = new int[255];
        int[] iarray = new int[1];
        int i = 0;

        //read pixel intensities into histogram
        for (int x = 1; x < width; x++) {
            for (int y = 1; y < height; y++) {
                int valueBefore = ip.getPixel(x, y, iarray)[0];
                histogram[valueBefore]++;
            }
        }

        int sum = 0;
        // build a Lookup table LUT containing scale factor
        float[] lut = new float[anzpixel];
        for (i = 0; i < 255; ++i) {
            sum += histogram[i];
            lut[i] = sum * 255 / anzpixel;
        }

        // transform image using sum histogram as a Lookup table
        for (int x = 1; x < width; x++) {
            for (int y = 1; y < height; y++) {
                int valueBefore = ip.getPixel(x, y, iarray)[0];
                int valueAfter = (int) lut[valueBefore];
                iarray[0] = valueAfter;
                ip.putPixel(x, y, iarray);
            }
        }

        IJ.showMessage("DONE !");
    
    }//GEN-LAST:event_jButton7ActionPerformed

    /**
     * @param args the command line arguments
     */
    
        ImagePlus imp;
     ImageProcessor ip;

    public int setup(String arg, ImagePlus imp) {
        this.imp = imp;
        return DOES_ALL;
    }

    public void run(ImageProcessor ip) {
        new negative().setVisible(true);
    }

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(negative.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(negative.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(negative.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(negative.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new negative().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
