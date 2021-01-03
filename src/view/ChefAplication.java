/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Connector.ServerConnector;
import Controller.ChefController;
import java.awt.print.PrinterException;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Orders;
import observer.ChefObserver;
import observerImpl.ChefObserverImpl;

/**
 *
 * @author kushantha
 */
public class ChefAplication extends javax.swing.JFrame implements SuperChef {

    private String chefId;
    private ChefObserver chefObserver;
    private int orders;
    private Orders order;
    private LocalDateTime dateTime;

    /**
     * Creates new form ChefAplication
     */
    public ChefAplication() throws NotBoundException, MalformedURLException, RemoteException {
        initComponents();
        this.chefId = JOptionPane.showInputDialog(this, "Enter Chef Id :");

        ChefController chefController = ServerConnector.getInstance().getChefController();
        this.chefObserver = new ChefObserverImpl(this);
        chefController.addChef(this.chefObserver);
        chefController.getNoOfOrders();
//        chefController.getOrder();
        lblChefID.setText(this.chefId);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtPrint = new javax.swing.JTextArea();
        btnFinished = new javax.swing.JButton();
        btnTakeOrders = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        txtOrderID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCustName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtTelephoneNumber = new javax.swing.JTextField();
        txtQty = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        lblOrders = new javax.swing.JLabel();
        lblChefID = new javax.swing.JLabel();
        lblOrders2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPrint.setColumns(20);
        txtPrint.setRows(5);
        jScrollPane2.setViewportView(txtPrint);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 280, 300));

        btnFinished.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnFinished.setText("Finished Orders");
        btnFinished.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinishedActionPerformed(evt);
            }
        });
        jPanel1.add(btnFinished, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 150, 40));

        btnTakeOrders.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnTakeOrders.setText("Take Orders");
        btnTakeOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTakeOrdersActionPerformed(evt);
            }
        });
        jPanel1.add(btnTakeOrders, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 120, 40));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 870, 10));

        txtOrderID.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPanel1.add(txtOrderID, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 230, 40));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Order ID :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        txtCustName.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPanel1.add(txtCustName, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 230, 40));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Customer Name");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("Telephone No");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        txtTelephoneNumber.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPanel1.add(txtTelephoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 230, 40));

        txtQty.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPanel1.add(txtQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 230, 40));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setText("Qty");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        lblOrders.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblOrders.setText("Pending Orders : 0 ");
        jPanel1.add(lblOrders, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, -1, -1));

        lblChefID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblChefID.setText("C001");
        jPanel1.add(lblChefID, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        lblOrders2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblOrders2.setText("Chef ID :");
        jPanel1.add(lblOrders2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton1.setText("Print Bill");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 410, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 1, 870, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTakeOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTakeOrdersActionPerformed
//        btnFinished.setEnabled(true);
//        btnTakeOrders.setEnabled(true);
        try {
            if (btnTakeOrders.isEnabled()) {
                if (order == null) {
                    clearTxt();
                } else {

                    txtOrderID.setText(order.getOrderId());
                    txtCustName.setText(order.getCustomerName());
                    txtTelephoneNumber.setText(String.valueOf(order.getCustomerNumber()));
                    txtQty.setText(String.valueOf(order.getQuantity()));
                    if (this.orders == 0) {
                        clearTxt();
                    }
                    System.out.println("");
                    this.dateTime = LocalDateTime.now();

                    btnTakeOrders.setEnabled(false);
                    btnFinished.setEnabled(true);

                    ChefController chefController = ServerConnector.getInstance().getChefController();
                    chefController.takeOrder(this.order);
                }
            }
        } catch (RemoteException ex) {
            Logger.getLogger(ChefAplication.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(ChefAplication.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ChefAplication.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnTakeOrdersActionPerformed

    private void btnFinishedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinishedActionPerformed
//        btnFinished.setEnabled(false);
//        btnTakeOrders.setEnabled(true);
        try {

            ChefController chefController = ServerConnector.getInstance().getChefController();
            order.setChefId(chefId);
            order.setProcessingTime(calculateTime(LocalDateTime.now()));
//            order.setTicket("Customer");
            printBill();
            clearTxt();
            chefController.finishOrder(chefObserver, order);
            btnTakeOrders.setEnabled(true);

        } catch (RemoteException ex) {
            Logger.getLogger(ChefAplication.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(ChefAplication.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ChefAplication.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnFinishedActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

        try {
            ChefController chefController = ServerConnector.getInstance().getChefController();
            chefController.removeChef(this.chefObserver);
        } catch (NotBoundException ex) {
            Logger.getLogger(ChefAplication.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ChefAplication.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(ChefAplication.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_formWindowClosing

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            txtPrint.print();
            txtPrint.setText("");
        } catch (PrinterException ex) {
            Logger.getLogger(ChefAplication.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ChefAplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChefAplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChefAplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChefAplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ChefAplication().setVisible(true);
                } catch (NotBoundException ex) {
                    Logger.getLogger(ChefAplication.class.getName()).log(Level.SEVERE, null, ex);
                } catch (MalformedURLException ex) {
                    Logger.getLogger(ChefAplication.class.getName()).log(Level.SEVERE, null, ex);
                } catch (RemoteException ex) {
                    Logger.getLogger(ChefAplication.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFinished;
    private javax.swing.JButton btnTakeOrders;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblChefID;
    private javax.swing.JLabel lblOrders;
    private javax.swing.JLabel lblOrders2;
    private javax.swing.JTextField txtCustName;
    private javax.swing.JTextField txtOrderID;
    private javax.swing.JTextArea txtPrint;
    private javax.swing.JTextField txtQty;
    private javax.swing.JTextField txtTelephoneNumber;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setOrders(int orders) {
        this.orders = orders;
        lblOrders.setText("Pending Orders : " + this.orders);
    }

    @Override
    public void order(Orders order) {
        if (btnTakeOrders.isEnabled()) {
            if (order == null) {
                clearTxt();
            } else {
                this.order = order;
//                txtOrderID.setText(order.getOrderId());
//                txtCustName.setText(order.getCustomerName());
//                txtTelephoneNumber.setText(String.valueOf(order.getCustomerNumber()));
//                txtQty.setText(String.valueOf(order.getQuantity()));
                if (this.orders == 0) {
                    clearTxt();
                }
                this.order = order;
            }
        }
    }

    private void clearTxt() {
        txtOrderID.setText("");
        txtCustName.setText("");
        txtTelephoneNumber.setText("");
        txtQty.setText("");
    }

    private String calculateTime(LocalDateTime dateTime) {

        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            Date date1 = format.parse(dtf.format(this.dateTime));
            Date date2 = format.parse(dtf.format(dateTime));
            long difference = date2.getTime() - date1.getTime();
            long seconds = difference / 1000 % 60;
            long minutes = difference / (60 * 1000) % 60;
            long hours = difference / (60 * 60 * 1000) % 24;
            long days = difference / (24 * 60 * 60 * 1000);
            return hours + " hours " + minutes + (minutes < 2 ? " minute " : " minutes ") + seconds + (seconds < 2 ? " second " : " seconds");
        } catch (ParseException ex) {
            Logger.getLogger(ChefAplication.class.getName()).log(Level.SEVERE, null, ex);
            return "Error";
        }
    }

    private void printBill() {
//        String time = calculateTime(dateTime);
        String time = order.getProcessingTime();
        txtPrint.setText(txtPrint.getText() + "Kithceh Order Ticket: Customer\n");
        txtPrint.setText(txtPrint.getText() + "Name: " + txtCustName.getText() + "\n");
        txtPrint.setText(txtPrint.getText() + "Contact: " + txtTelephoneNumber.getText() + "\n");
        txtPrint.setText(txtPrint.getText() + "Processing Time: " + time + "\n");
        txtPrint.setText(txtPrint.getText() + "Telephone Operator: " + order.getOperatorId() + "\n");
        txtPrint.setText(txtPrint.getText() + "Chef ID: " + lblChefID.getText() + "\n");
        txtPrint.setText(txtPrint.getText() + "Quantity: " + txtQty.getText() + "\n");
    }

}