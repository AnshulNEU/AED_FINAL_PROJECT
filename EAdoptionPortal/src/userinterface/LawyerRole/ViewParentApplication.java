/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.LawyerRole;

import userinterface.LawyerRole.*;
import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAcc;
import Business.WorkQueue.LawyerToAdmin;
import Business.WorkQueue.CounsellorsToLawyer;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author anshulsingh
 */
public class ViewParentApplication extends javax.swing.JPanel {

    /**
     * Creates new form ViewParentApplication
     */
    JPanel userProcessContainer;
    CounsellorsToLawyer request;
    private UserAcc account;
    private Enterprise enterprise;
    
    public ViewParentApplication(JPanel userProcessContainer, CounsellorsToLawyer request, UserAcc account, Enterprise e) {
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        this.account = account;
        this.enterprise = e;
        
        initComponents();
        fillComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAccept = new javax.swing.JButton();
        notGuilty = new javax.swing.JRadioButton();
        isGuilty = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        notComfortable = new javax.swing.JRadioButton();
        isComfortable = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        isBigChange = new javax.swing.JRadioButton();
        notBigChange = new javax.swing.JRadioButton();
        isPromise = new javax.swing.JRadioButton();
        notPromise = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        isFinance = new javax.swing.JRadioButton();
        notSelectFinance = new javax.swing.JRadioButton();
        isEducated = new javax.swing.JRadioButton();
        notEducated = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        notPrepared = new javax.swing.JRadioButton();
        isPrepared = new javax.swing.JRadioButton();
        isChildrenOnBoard = new javax.swing.JRadioButton();
        notOnBoardChildren = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();
        messageTxt = new javax.swing.JTextField();
        patientID1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(26, 26, 29));
        setForeground(new java.awt.Color(237, 245, 225));

        btnAccept.setBackground(new java.awt.Color(252, 68, 69));
        btnAccept.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnAccept.setForeground(new java.awt.Color(237, 245, 225));
        btnAccept.setText("ACCEPT");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });

        notGuilty.setForeground(new java.awt.Color(237, 245, 225));
        notGuilty.setText("No");
        notGuilty.setEnabled(false);

        isGuilty.setForeground(new java.awt.Color(237, 245, 225));
        isGuilty.setText("Yes");
        isGuilty.setEnabled(false);

        jLabel12.setForeground(new java.awt.Color(237, 245, 225));
        jLabel12.setText("Are you making this decision out of guilt");

        notComfortable.setForeground(new java.awt.Color(237, 245, 225));
        notComfortable.setText("No");
        notComfortable.setEnabled(false);

        isComfortable.setForeground(new java.awt.Color(237, 245, 225));
        isComfortable.setText("Yes");
        isComfortable.setEnabled(false);

        jLabel8.setForeground(new java.awt.Color(237, 245, 225));
        jLabel8.setText("Your partner is comfortable with the situation.");

        isBigChange.setForeground(new java.awt.Color(237, 245, 225));
        isBigChange.setText("Yes");
        isBigChange.setEnabled(false);

        notBigChange.setForeground(new java.awt.Color(237, 245, 225));
        notBigChange.setText("No");
        notBigChange.setEnabled(false);

        isPromise.setForeground(new java.awt.Color(237, 245, 225));
        isPromise.setText("Yes");
        isPromise.setEnabled(false);

        notPromise.setForeground(new java.awt.Color(237, 245, 225));
        notPromise.setText("No");
        notPromise.setEnabled(false);

        jLabel11.setForeground(new java.awt.Color(237, 245, 225));
        jLabel11.setText("You plan to make promises or commitments you actually can or will keep");

        jLabel7.setForeground(new java.awt.Color(237, 245, 225));
        jLabel7.setText("You are able or willing to make BIG changes.");

        isFinance.setForeground(new java.awt.Color(237, 245, 225));
        isFinance.setText("Yes");
        isFinance.setEnabled(false);

        notSelectFinance.setForeground(new java.awt.Color(237, 245, 225));
        notSelectFinance.setText("No");
        notSelectFinance.setEnabled(false);

        isEducated.setForeground(new java.awt.Color(237, 245, 225));
        isEducated.setText("Yes");
        isEducated.setEnabled(false);

        notEducated.setForeground(new java.awt.Color(237, 245, 225));
        notEducated.setText("No");
        notEducated.setEnabled(false);

        jLabel10.setForeground(new java.awt.Color(237, 245, 225));
        jLabel10.setText("Are you educated about the realities of the type of adoption you are pursuing.");

        jLabel6.setForeground(new java.awt.Color(237, 245, 225));
        jLabel6.setText("Are you financially prepared for the child.");

        notPrepared.setForeground(new java.awt.Color(237, 245, 225));
        notPrepared.setText("No");
        notPrepared.setEnabled(false);

        isPrepared.setForeground(new java.awt.Color(237, 245, 225));
        isPrepared.setText("Yes");
        isPrepared.setEnabled(false);

        isChildrenOnBoard.setForeground(new java.awt.Color(237, 245, 225));
        isChildrenOnBoard.setText("Yes");
        isChildrenOnBoard.setEnabled(false);

        notOnBoardChildren.setForeground(new java.awt.Color(237, 245, 225));
        notOnBoardChildren.setText("No");
        notOnBoardChildren.setEnabled(false);

        jLabel9.setForeground(new java.awt.Color(237, 245, 225));
        jLabel9.setText("Currently do you have any kids");

        jLabel5.setForeground(new java.awt.Color(237, 245, 225));
        jLabel5.setText("Are you prepared for the “worst case scenario.”");

        jLabel4.setForeground(new java.awt.Color(237, 245, 225));
        jLabel4.setText("Email*:");

        txtEmail.setEnabled(false);

        txtUsername.setEnabled(false);

        jLabel1.setForeground(new java.awt.Color(237, 245, 225));
        jLabel1.setText("Username*:");

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/left-arrow-in-circular-button-black-symbol-2.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnReject.setBackground(new java.awt.Color(252, 68, 69));
        btnReject.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnReject.setForeground(new java.awt.Color(237, 245, 225));
        btnReject.setText("REJECT");
        btnReject.setBorder(null);
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });

        messageTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messageTxtActionPerformed(evt);
            }
        });

        patientID1.setForeground(new java.awt.Color(237, 245, 225));
        patientID1.setText("Message:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(patientID1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(messageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(isComfortable)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(notComfortable))
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(isBigChange)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(notBigChange))
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(isFinance)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(notSelectFinance))
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(isPrepared)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(notPrepared))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(isEducated)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(notEducated))
                            .addComponent(jLabel10)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(isGuilty)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(notGuilty))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(isPromise)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(notPromise))
                            .addComponent(jLabel11)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(isChildrenOnBoard)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(notOnBoardChildren))
                            .addComponent(jLabel9)
                            .addComponent(jLabel12)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnReject, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(isPrepared)
                                    .addComponent(notPrepared))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(isFinance)
                                    .addComponent(notSelectFinance))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(isBigChange)
                                    .addComponent(notBigChange))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(isComfortable)
                                    .addComponent(notComfortable)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(isChildrenOnBoard)
                                    .addComponent(notOnBoardChildren))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(isEducated)
                                    .addComponent(notEducated))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(isPromise)
                                    .addComponent(notPromise))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(isGuilty)
                                    .addComponent(notGuilty))))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(messageTxt)
                    .addComponent(patientID1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReject, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(107, 107, 107))
        );
    }// </editor-fold>//GEN-END:initComponents
    private void fillComponents(){
        txtUsername.setText(request.getParent().getUsername());
        txtEmail.setText(request.getParent().getEmailID());
        
        if(this.request.getParent().isWorstCaseScenario() == true){
            isPrepared.setSelected(true);
        }
        else
           notPrepared.setSelected(true); 
        
        if(this.request.getParent().isFinChild() == true){
            isFinance.setSelected(true);
        }
        else
           notSelectFinance.setSelected(true);
        
        if(this.request.getParent().isBigChanges() == true){
            isBigChange.setSelected(true);
        }
        else
           notBigChange.setSelected(true);
        
        if(this.request.getParent().isComSituation() == true){
            isComfortable.setSelected(true);
        }
        else
           notComfortable.setSelected(true);
        
        if(this.request.getParent().isCurrentChildrenOnBoard() == true){
            isChildrenOnBoard.setSelected(true);
        }
        else
           notOnBoardChildren.setSelected(true);
        
        if(this.request.getParent().isEduRealities() == true){
            isEducated.setSelected(true);
        }
        else
           notEducated.setSelected(true);
        
        if(this.request.getParent().isPromise() == true){
            isPromise.setSelected(true);
        }
        else
           notPromise.setSelected(true);
        
        if(this.request.getParent().isGuilt() == true){
            isGuilty.setSelected(true);
        }
        else
           notGuilty.setSelected(true);
    
    
    }
    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        request.setReceiver(account);
        request.setMessage("Accepted");
        request.setResolveDate(new Date());
        request.setStatus("Completed");
        request.getParent().setLawyer(account.getLawyer().getEmpName());
        request.setReqResult("Completed");
        String msg = messageTxt.getText();
        if(msg.equals("")){
              JOptionPane.showMessageDialog(null, "Please input your message for the parent to be reviewed by admin ");
              throw new NullPointerException("Enter message");
        }
        
        LawyerToAdmin lawyerReq = new LawyerToAdmin(messageTxt.getText(), request.getParent());
        lawyerReq.setStatus("Processing");
        lawyerReq.setSender(account);
        
        enterprise.getWorkQueue().getLawyerAdmin().add(lawyerReq);
        
        
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ParentsRequestWorkAreaJPanel parentRequestWorkArea = (ParentsRequestWorkAreaJPanel) component;
        parentRequestWorkArea.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer); 

    }//GEN-LAST:event_btnAcceptActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout cardlayout = (CardLayout) userProcessContainer.getLayout();
        cardlayout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        // TODO add your handling code here:
//        request.setReceiver(account);
//        request.setMessage("Rejected");
//        request.setResolveDate(new Date());
//        request.setStatus("Rejected");
//        request.getParent().setLawyer(account.getLawyer().getEmpName());
//        request.setReqResult("Completed");
//        String msg = messageTxt.getText();
//        if(msg.equals("")){
//              JOptionPane.showMessageDialog(null, "Please input your message for the parent to be reviewed by admin ");
//              throw new NullPointerException("Enter message");
//        }
//        
//        LawyerToAdmin lawyerReq = new LawyerToAdmin(messageTxt.getText(), request.getParent());
//        lawyerReq.setStatus("Processing");
//        lawyerReq.setSender(account);
//        
//        enterprise.getWorkQueue().getLawyerAdmin().add(lawyerReq);
        
        request.setReceiver(account);
        request.setReqResult("Rejected by " + account.getLawyer().getEmpName());
        request.setResolveDate(new Date());
		
        request.setStatus("Rejected");
        request.getParent().setLawyer(account.getLawyer().getEmpName());
        String msg = messageTxt.getText();
        if(msg.equals("")){
              JOptionPane.showMessageDialog(null, "Please input your message for the parent to be reviewed by parent ");
              throw new NullPointerException("Enter message");
        }
	//request.setCounsellorFeedback(msg);
        request.setMessage(msg);
	request.setSender(account);
        
        
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ParentsRequestWorkAreaJPanel parentRequestWorkArea = (ParentsRequestWorkAreaJPanel) component;
        parentRequestWorkArea.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_btnRejectActionPerformed

    private void messageTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messageTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_messageTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnReject;
    private javax.swing.JRadioButton isBigChange;
    private javax.swing.JRadioButton isChildrenOnBoard;
    private javax.swing.JRadioButton isComfortable;
    private javax.swing.JRadioButton isEducated;
    private javax.swing.JRadioButton isFinance;
    private javax.swing.JRadioButton isGuilty;
    private javax.swing.JRadioButton isPrepared;
    private javax.swing.JRadioButton isPromise;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField messageTxt;
    private javax.swing.JRadioButton notBigChange;
    private javax.swing.JRadioButton notComfortable;
    private javax.swing.JRadioButton notEducated;
    private javax.swing.JRadioButton notGuilty;
    private javax.swing.JRadioButton notOnBoardChildren;
    private javax.swing.JRadioButton notPrepared;
    private javax.swing.JRadioButton notPromise;
    private javax.swing.JRadioButton notSelectFinance;
    private javax.swing.JLabel patientID1;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}