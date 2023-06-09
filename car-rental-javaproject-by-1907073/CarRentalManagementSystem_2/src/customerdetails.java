
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.sql.ResultSet;
import javaswingdev.GradientDropdownMenu;
import javaswingdev.MenuEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import project.select;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class customerdetails extends javax.swing.JFrame {

    /**
     * Creates new form customerdetails
     */
    public customerdetails() {
        initComponents();
           rSTableMetro2.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,15)) ;
        rSTableMetro2.getTableHeader().setOpaque(false);
        rSTableMetro2.getTableHeader().setBackground(new Color(120,136,203));
       rSTableMetro2.getTableHeader().setForeground(new Color(0,0,0));
        rSTableMetro2.setRowHeight(25);
             GradientDropdownMenu menu = new GradientDropdownMenu();
        
        menu.addItem("ADMIN");
        menu.addItem("Employee", "Add Employee", "Edit Employee Info", "Terminate Employee");
        menu.addItem("Approval ", "Approve Employee");
        
        menu.addItem("                                                                                                                                                                                                                     ");
        menu.addItem("Jump To", "Back", "Customer Details", "Car Details");
        menu.addItem("Logout","Logout","Exit");
        menu.applay(this);
       
     
       menu.addEvent(new MenuEvent() {
    @Override
    public void selected(int index, int subIndex, boolean menuItem) {
        if (menuItem) {
            if(menu.getMenuNameAt(index, subIndex).equals("Exit") )
               {
                    System.exit(0);
               }
            
           else if(menu.getMenuNameAt(index, subIndex).equals("Logout") )
               {
                   int a =0;
        if(a==0)
        {

            setVisible(false);
            new Login().setVisible(true);
        } 
               }
            
            
            else if(menu.getMenuNameAt(index, subIndex).equals("Add Employee") )
               {
                        setVisible(false);
        new addemployee().setVisible(true); 
               }
           
            else if(menu.getMenuNameAt(index, subIndex).equals("Edit Employee Info") )
               {
                     setVisible(false);
        new Updateemployee().setVisible(true);  
               }
            else if(menu.getMenuNameAt(index, subIndex).equals("Terminate Employee") )
               {
                         setVisible(false);
        new deleteemployee().setVisible(true);
               }
            else if(menu.getMenuNameAt(index, subIndex).equals("Approve Employee") )
               {
                    setVisible(false);
                   new ApproveEmployee().setVisible(true);
                   
               }
            
            else if(menu.getMenuNameAt(index, subIndex).equals("Customer Details") )
               {  setVisible(false);
                  new customerdetails().setVisible(true);
               }
            
           else if(menu.getMenuNameAt(index, subIndex).equals("Car Details") )
               {  setVisible(false);
                  new cardetails().setVisible(true);
               }
            else if(menu.getMenuNameAt(index, subIndex).equals("Back") )
               {
                     setVisible(false);
        new adminhome().setVisible(true);
               }
            
            
            
            
            }
    }
});
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel2 = new keeptoo.KGradientPanel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        rSTableMetro2 = new rojeru_san.complementos.RSTableMetro();
        kGradientPanel3 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        kGradientPanel1.setBackground(new java.awt.Color(241, 172, 136));
        kGradientPanel1.setkEndColor(new java.awt.Color(241, 172, 136));
        kGradientPanel1.setkStartColor(new java.awt.Color(241, 172, 136));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSTableMetro2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Mobile No.", "Nationality", "Gender", "Id Proof", "Address", "Check In Date", "CheckOut Date", "Car Reg No", "Price"
            }
        ));
        rSTableMetro2.setColorBackgoundHead(new java.awt.Color(255, 204, 204));
        rSTableMetro2.setColorFilasBackgound1(new java.awt.Color(255, 153, 153));
        rSTableMetro2.setColorFilasBackgound2(new java.awt.Color(255, 204, 204));
        rSTableMetro2.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        rSTableMetro2.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        rSTableMetro2.setColorForegroundHead(new java.awt.Color(0, 0, 0));
        rSTableMetro2.setColorSelBackgound(new java.awt.Color(255, 102, 102));
        rSTableMetro2.setColorSelForeground(new java.awt.Color(255, 204, 204));
        rSTableMetro2.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        rSTableMetro2.setFuenteFilas(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        rSTableMetro2.setFuenteFilasSelect(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        rSTableMetro2.setFuenteHead(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        rSTableMetro2.setGridColor(new java.awt.Color(255, 255, 255));
        rSTableMetro2.setSelectionBackground(new java.awt.Color(71, 200, 200));
        rSTableMetro2.setSelectionForeground(new java.awt.Color(55, 179, 169));
        rSTableMetro2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSTableMetro2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(rSTableMetro2);

        kGradientPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, 860, 440));

        kGradientPanel3.setkEndColor(new java.awt.Color(120, 57, 55));
        kGradientPanel3.setkStartColor(new java.awt.Color(120, 57, 55));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sport-car.png"))); // NOI18N

        javax.swing.GroupLayout kGradientPanel3Layout = new javax.swing.GroupLayout(kGradientPanel3);
        kGradientPanel3.setLayout(kGradientPanel3Layout);
        kGradientPanel3Layout.setHorizontalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel3Layout.setVerticalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(162, Short.MAX_VALUE))
        );

        kGradientPanel1.add(kGradientPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 786));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Customer Details Bill");
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 180, 260, 80));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/money.png"))); // NOI18N
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 90, 170, 130));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rSTableMetro2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSTableMetro2MouseClicked
        // TODO add your handling code here:
        int index=rSTableMetro2.getSelectedRow();
        TableModel model=rSTableMetro2.getModel();
        String id =model.getValueAt(index, 0).toString();
        try
        {
            if(new File("F:\\"+id+".pdf").exists())
                {
                    Process p=Runtime
                    .getRuntime()
                    .exec("rundll32 url.dll,FileProtocolHandler F:\\"+id+".pdf");

                    }

                    else
                    {
                        JOptionPane.showMessageDialog(null, "File does not exists" );
                    }
                }

                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, e);
                }

    }//GEN-LAST:event_rSTableMetro2MouseClicked

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
             ResultSet rs=select.getData("select *from customer where checkout is not NULL");
        DefaultTableModel model =(DefaultTableModel) rSTableMetro2.getModel();
       
        try
        {
           while(rs.next())
           {
               model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(16),rs.getString(12),rs.getString(13)});
           }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_formComponentShown

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(customerdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(customerdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(customerdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customerdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new customerdetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private keeptoo.KGradientPanel kGradientPanel3;
    private rojeru_san.complementos.RSTableMetro rSTableMetro2;
    // End of variables declaration//GEN-END:variables
}
