package project1.os;
import java.awt.Color;
import java.awt.Graphics;
import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mina
 */

/*

me7tagin ne7seb el waiting time , start wel end 




*/
public class Window extends javax.swing.JFrame {
    
    GrantPanel p = new GrantPanel();
    /**
     * Creates new form Window
     */
    public Window() {
        initComponents();
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        quantumTextField = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        addProcessButton = new javax.swing.JButton();
        runButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setText("Name");
        jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField1MousePressed(evt);
            }
        });

        jTextField2.setText("Burst");
        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField2MousePressed(evt);
            }
        });

        jTextField3.setText("Arrive");
        jTextField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField3MousePressed(evt);
            }
        });

        jTextField4.setText("Priority");
        jTextField4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField4MousePressed(evt);
            }
        });

        quantumTextField.setText("Quantum Time");
        quantumTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantumTextFieldActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FCFS", "SJF (Non-preemtive)", "Priority (Non-preemtive)", "RR", "SJF (Preemtive)", "Priority (Preemtive)", " " }));

        addProcessButton.setText("Add process");
        addProcessButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addProcessButtonMouseClicked(evt);
            }
        });

        runButton.setText("Run");
        runButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                runButtonMouseClicked(evt);
            }
        });
        runButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runButtonActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("The Processes in the ready queue are :      ");
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(addProcessButton)
                            .addComponent(jButton1)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(quantumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(runButton))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 815, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(addProcessButton)
                        .addGap(68, 68, 68)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(runButton)
                            .addComponent(quantumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(22, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MousePressed
       jTextField1.setText("");
    }//GEN-LAST:event_jTextField1MousePressed

    private void jTextField2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MousePressed
        jTextField2.setText("");
    }//GEN-LAST:event_jTextField2MousePressed

    private void jTextField3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField3MousePressed
        jTextField3.setText("");
    }//GEN-LAST:event_jTextField3MousePressed

    private void jTextField4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField4MousePressed
        jTextField4.setText("");
    }//GEN-LAST:event_jTextField4MousePressed

    private void runButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_runButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_runButtonMouseClicked

    private void runButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runButtonActionPerformed
        try
        {
            quantum=Integer.parseInt(quantumTextField.getText());
        }
        catch(Exception e)
        {}
        finally{
            SortingProcesses();
            if(jComboBox1.getSelectedIndex()==0)
            {
                jTextArea1.append("Scheduling is as the Following:");
                jTextArea1.append("\n");
                jTextArea1.append("\n");
                float waitingTime=0;
                int EndTime=0;
                for(int i = 0 ; i<processes.size();i++)
                {
                    Process p = (Process)processes.get(i);
                    if(p.arrivalTime>EndTime)
                    {
                        jTextArea1.append("GAP from TIME:  "+time+"  TO:  "+p.arrivalTime) ;
                        jTextArea1.append("\n");
                        jTextArea1.append("\n");
                        time=p.arrivalTime;
                    }
                    EndTime = time+p.burst;
                    
                    p.waitingTime=time-p.arrivalTime;
                    waitingTime+=p.waitingTime;
                    jTextArea1.append("Name:  "+p.name+"  Start Time:  "+time+" End Time:  "+EndTime+"  Waiting Time:  "+p.waitingTime);
                    jTextArea1.append("\n");
                    jTextArea1.append("\n");
                    time+=p.burst;
                }
                avgWaitingTime=waitingTime/processes.size();
                jTextArea1.append("Average Waiting Time"+avgWaitingTime);
            }
            else if (jComboBox1.getSelectedIndex()==1||jComboBox1.getSelectedIndex()==2)
             {
                 int Size=processesSorted.size();
                 time=0;
                 jTextArea1.append("Scheduling is as the Following:");
                 jTextArea1.append("\n");
                 jTextArea1.append("\n");
                 float waitingTime=0;
                 int EndTime=0;
                 for(int i = 0 ; i<processesSorted.size();i++)
                {
                    Process p = (Process)processesSorted.get(i);
                    if(p.arrivalTime>EndTime)
                    {
                        jTextArea1.append("GAP from TIME:  "+time+"  TO:  "+p.arrivalTime) ;
                        jTextArea1.append("\n");
                        jTextArea1.append("\n");
                        time=p.arrivalTime;
                    }
                    EndTime = time+p.burst;
                    p.waitingTime=time-p.arrivalTime;
                    waitingTime+=p.waitingTime;
                    jTextArea1.append("Name:  "+p.name+"  Start Time:  "+time+" End Time:  "+EndTime+"  Waiting Time:  "+p.waitingTime);
                    jTextArea1.append("\n");
                    jTextArea1.append("\n");
                     time+=p.burst;
                }
                System.out.println("WAITING TIME "+waitingTime);
                System.out.println(processes.size());
                avgWaitingTime=waitingTime/Size;
                jTextArea1.append("Average Waiting Time"+avgWaitingTime);
             }
            /*else if (jComboBox.getSelectedIndex()==3)
            kolo fel Sorting Processes already
            */
            
            resetVariables();
    }
        
    }//GEN-LAST:event_runButtonActionPerformed

    private void addProcessButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addProcessButtonMouseClicked
        
        
        Addprocess();        
    }//GEN-LAST:event_addProcessButtonMouseClicked

    private void quantumTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantumTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantumTextFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTextArea1.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addProcessButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField quantumTextField;
    private javax.swing.JButton runButton;
    // End of variables declaration//GEN-END:variables
    
    LinkedList <Process>processes = new LinkedList();
    LinkedList processesSorted = new LinkedList();
    int time = 0 ;
    int quantum = 0 ; 
    float avgWaitingTime;
    Graphics grr;
    int r , g , b ; 
    //int quantum = Integer.parseInt(quantumTextField.getText());
    
    void drawGrant(Graphics gr , int width)
    {
        gr=jPanel1.getGraphics();
        System.out.println(jPanel1.getAlignmentX());
        gr.setColor(new Color(r,g,b));
        gr.fillRect(0, 0, width*10, jPanel1.getHeight());
        
    }
    
   
    void Addprocess() {
        Process p = new Process(jTextField1.getText(), Integer.parseInt(jTextField2.getText()), Integer.parseInt(jTextField3.getText()),
                                    Integer.parseInt(jTextField4.getText()));
        processes.add(p);
        jTextArea1.append("\n");
        jTextArea1.append("Process:  "+p.name+"  Burst:  "+p.burst+"  Arrival Time:  "+p.arrivalTime+"  Priority:  "+p.priority);
        jTextArea1.append("\n");
        
    }
    
    void SortingProcesses()
    {
        if(jComboBox1.getSelectedIndex()==0)
        {
            FCFS();
        }
        else if (jComboBox1.getSelectedIndex()==1)
        {
            FCFS();
            time = processes.get(0).arrivalTime;
            SJF();
        }
        else if (jComboBox1.getSelectedIndex()==2)
        {
            Priority();
        }
        else if (jComboBox1.getSelectedIndex()==3)
        {
            RR();
        }
        else if(jComboBox1.getSelectedIndex()==4)
        {
            FCFS();
            time = processes.get(0).arrivalTime;
            SJFPreemptive();
        }
        else if(jComboBox1.getSelectedIndex()==5)
        {
            FCFS();
            time = processes.get(0).arrivalTime;
            PriorityPreemptive();
        }
            
    }
    //el function eli gaya di betratebhom men as3'ar le akbar arrival time 
    public void FCFS()
    {
        System.out.println("processes Size is : "+processes.size());
        for ( int i=0;i<=processes.size()-2;i++)
        {
            System.out.println("weselna gowa el for Loop beta3et el FCFS");
            int min =i; 
            Process pMin =(Process)processes.get(min);
            for ( int j = i+1 ; j<=(processes.size()-1);j++)
            {
                Process pTrial2=(Process)processes.get(j);
                if(pTrial2.arrivalTime<pMin.arrivalTime)
                {
                    min=j;
                    pMin=(Process)processes.get(min);
                }
            }
//            
              processes=swapProcesses(processes ,i , min);
        }
    }
    
    
    LinkedList swapProcesses(LinkedList a , int i , int j)
    {
        Process pTemp = (Process)a.get(i);
        a.add(i, a.get(j));
        a.remove(i+1);
        a.add(j,pTemp);
        a.remove(j+1);
        return a;
    }
    
    void resetVariables()
    {
        processes.clear();
        processesSorted.clear();
        time = 0;
        quantum=0;
        avgWaitingTime=0;
    }
    //bet7ot el readyProcesses f arrayList , mainly mosta5adama fel SJF
    ArrayList getReadyProcesses()
    {
        ArrayList readyProcesses = new ArrayList();
        int i =0 ;
        while(i<processes.size())
        {
            if((((Process)processes.get(i)).arrivalTime)<=time)
            {
                //System.out.println(((Process)processes.get(i)).arrivalTime);
                readyProcesses.add(((Process)processes.get(i)));
            }
            i++;
        }
        return readyProcesses;
    }
    
    
    public void SJF() {
        FCFS();
       int IndexOfMinBurst;
        int minBurst; 
        while(true)
       {
        System.out.println("ana geet hena");
        ArrayList <Process>readyProcesses = new ArrayList();
        readyProcesses=getReadyProcesses();
        while(readyProcesses.isEmpty()&&!processes.isEmpty())
        {
            time++;
            readyProcesses=getReadyProcesses();
        }
        if(readyProcesses.isEmpty()&&processes.isEmpty())
            break;
        IndexOfMinBurst=-1;
        minBurst=10000 ; 
        
        for(int i = 0 ; i<readyProcesses.size();i++)
        {
            Process p = new Process();
            p =(Process)readyProcesses.get(i);
            if(p.burst<minBurst)
            {
                System.out.println("weselna le gowa el if condition ");
                IndexOfMinBurst=i;
                
                minBurst=p.burst;
            }
        }
        System.out.println("Index of Minimum Burst is:"+IndexOfMinBurst);
        processesSorted.add((readyProcesses.get(IndexOfMinBurst)));
        processes.remove((readyProcesses.get(IndexOfMinBurst)));
        time+=minBurst;
        System.out.println("time is:"+time);
       }
        //SJF();
    }
    
    
    void Priority()
    {
        FCFS();
        int BiggestPriority = 1000000;
        int IndexOfBiggestPriority=-1;
        while(true)
        {
        ArrayList <Process>readyProcesses = new ArrayList();
        readyProcesses=getReadyProcesses();
        while(readyProcesses.isEmpty()&&!processes.isEmpty())
        {
            time++;
            readyProcesses=getReadyProcesses();
        }
        if(readyProcesses.isEmpty()&&processes.isEmpty())
            break;
        BiggestPriority = 1000000;
        IndexOfBiggestPriority=-1;
        Process p = new Process();
        for (int i = 0 ; i<readyProcesses.size();i++)
        {
            p=readyProcesses.get(i);
            if(p.priority<BiggestPriority)
            {
                BiggestPriority=p.priority;
                IndexOfBiggestPriority=i;
            }
        }
        processesSorted.add(readyProcesses.get(IndexOfBiggestPriority));
        processes.remove(readyProcesses.get(IndexOfBiggestPriority));
        time+=readyProcesses.get(IndexOfBiggestPriority).burst;
        }
    }
    int FindElementIndex(LinkedList a , Process p)
    {
        for(int i = 0 ; i<a.size();i++)
        {
            if(a.get(i).equals(p))
                return i;
        }
        return -1;
    }
    // el gaps et3amalet foll :D
    void RR()
    {
        FCFS();
        ArrayList readyProcesses=getReadyProcesses();
        int Size = processes.size();
        int EndTime=0;
        while(!processes.isEmpty())
        {   
            if(readyProcesses.size()==0)
            {
                jTextArea1.append("GAP FROM:  "+time+"  TO:  "+processes.get(0).arrivalTime);
                jTextArea1.append("\n");
                jTextArea1.append("\n");
                time=processes.get(0).arrivalTime;
                EndTime=time;
                readyProcesses=getReadyProcesses();
            }
            else{
            System.out.println(quantum);
            for(int i=0;i<readyProcesses.size();i++)
            {
//                System.out.println("time is"+time);
//                System.out.println(((Process)readyProcesses.get(i)).name);
//                System.out.println("readyProcesses.size()="+readyProcesses.size());
                int j = FindElementIndex(processes, (Process)readyProcesses.get(i));
                if(((Process)readyProcesses.get(i)).TimeRemaining<quantum)
                {
                    EndTime+=((Process)readyProcesses.get(i)).TimeRemaining;
                    processes.get(j).TimeRemaining=0;
                }
                else 
                {
                    processes.get(j).TimeRemaining-=quantum;
                    EndTime+=quantum;
                    System.out.println("TimeRemaining of the process ="+((Process)readyProcesses.get(i)).TimeRemaining);
                }
                
                Process p=processes.get(j);
                jTextArea1.append("Name:  "+p.name+"  Start Time:  "+time+" End Time:  "+EndTime+"  Waiting Time:  "+p.waitingTime);
                jTextArea1.append("\n");
                jTextArea1.append("\n");
                time=EndTime;
                System.out.println("EndTime:  "+EndTime);
                if(p.TimeRemaining<=0)
                {
                    p.EndTime=time;
                    avgWaitingTime+=(p.EndTime-p.arrivalTime-p.burst);
                    System.out.println("hello from ifffff");
                    processes.remove(j);
                    readyProcesses.remove(i);
                    i--;
                }
                readyProcesses=getReadyProcesses();
            }
            }
        }
        avgWaitingTime/=Size;
        jTextArea1.append("Average Waiting Time:  "+avgWaitingTime);
    }


    void SJFPreemptive()
    {
        jTextArea1.append("\n");
        jTextArea1.append("The scheduling will be as the following : ");
        jTextArea1.append("\n");
        
        FCFS();
        ArrayList readyProcesses = getReadyProcesses();
        Process LastProcess=new Process() ;
        int Size = processes.size();
        boolean outOfGAP=false;
        boolean firstIteration=true ;
        System.out.println("da5el el while LOOP now ");
        while(processes.isEmpty()==false)
        {
        if(readyProcesses.isEmpty()&&!processes.isEmpty())
        {
                outOfGAP=true;
                jTextArea1.append("  End Time:  "+time);
                jTextArea1.append("\n");
                jTextArea1.append("\n");
                jTextArea1.append("GAP FROM:  "+time);
                time=processes.get(0).arrivalTime;
                //EndTime=time;
                readyProcesses=getReadyProcesses();
        }
        // batala3 el index beta3 as3'ar timeRemaining bel readyProcesses
        while(!readyProcesses.isEmpty())
        {
            int timeRemaining=1000;
            int indexOfLowestTimeRemaining=-1;
            // find the lowest remaining time in the readyProcesses arrayList
            System.out.println(readyProcesses.size());
            for(int i = 0 ; i<readyProcesses.size();i++)
            {
                if(((Process)readyProcesses.get(i)).TimeRemaining<timeRemaining)
                {
                    timeRemaining=((Process)readyProcesses.get(i)).TimeRemaining;
                    indexOfLowestTimeRemaining=i;
                    System.out.println("lowesttttt "+((Process)readyProcesses.get(i)).name+" "+timeRemaining);
                }
                
            }
            //System.out.println("the LOWEST after the for loop is "+((Process)readyProcesses.get(indexOfLowestTimeRemaining)).name+" "+timeRemaining);
            // hena 3andi as3'ar timeRemaining wel index beta3 as3'ar timeRemaning element ;
            Process p=((Process)readyProcesses.get(indexOfLowestTimeRemaining));
            
           
            if(p!=LastProcess){
                System.out.println("p!=LastProcess");
                LastProcess = p ;    
                System.out.println(p.burst+"  "+p.TimeRemaining);
                //int EndTime = time+(p.burst-p.TimeRemaining);
                if(outOfGAP==false&&!firstIteration)
                    jTextArea1.append("  End Time:  "+time);
                else if(!firstIteration)
                    jTextArea1.append(  "TO:  "+time);
                jTextArea1.append("\n");
                jTextArea1.append("\n");
                jTextArea1.append("Name:  "+p.name+"  Start Time:  "+time);
            }
            
            for(int i = 0 ; i<processes.size();i++)
            {
                if(((Process)(processes.get(i))).equals(((Process)readyProcesses.get(indexOfLowestTimeRemaining))))
                {
                    (processes.get(i)).TimeRemaining--;
                    //((Process)readyProcesses.get(indexOfLowestTimeRemaining)).TimeRemaining--;
                    //System.out.println((processes.get(i)).name+" "+(processes.get(i)).TimeRemaining+"after decrementing");
                    if((processes.get(i)).TimeRemaining<=0)
                    {
                        p.EndTime=time+1;
                        avgWaitingTime+=(p.EndTime-p.arrivalTime-p.burst);
                        processes.remove(p);
                        readyProcesses.remove(p);
                    }
                    break ;  
                }
            }
            
            time++;
            outOfGAP=false;
            readyProcesses=getReadyProcesses();
            firstIteration=false;
            
            
        }
        }
        jTextArea1.append("  End Time:  "+time);
        jTextArea1.append("\n") ;
        jTextArea1.append("\n");
        avgWaitingTime/=Size;
        jTextArea1.append("Average Waiting Time:  "+avgWaitingTime);
        
   }

    
    
    void PriorityPreemptive()
    {
        jTextArea1.append("\n");
                jTextArea1.append("\n");
        jTextArea1.append("The Scheduling is as following: ");
        jTextArea1.append("\n");
                jTextArea1.append("\n");
        
        FCFS();
        ArrayList readyProcesses = getReadyProcesses();
        int Size = processes.size();
        Process LastProcess=new Process() ;
        boolean outOfGAP=false;
        boolean firstIteration=true ;
        
        while(processes.isEmpty()==false)
        {
            if(readyProcesses.isEmpty()&&!processes.isEmpty())
            {
                outOfGAP=true;
                jTextArea1.append("  End Time:  "+time);
                jTextArea1.append("\n");
                jTextArea1.append("\n");
                jTextArea1.append("GAP FROM:  "+time);
                time=processes.get(0).arrivalTime;
                //EndTime=time;
                readyProcesses=getReadyProcesses();
            }
        System.out.println("da5el el while LOOP now ");
        while(!readyProcesses.isEmpty())
        {
            int biggestPriority=1000;
            int indexOfBiggestPriority=-1;
            // find the priority in the readyProcesses arrayList
            System.out.println(readyProcesses.size());
            for(int i = 0 ; i<readyProcesses.size();i++)
            {
                if(((Process)readyProcesses.get(i)).priority<biggestPriority)
                {
                    biggestPriority=((Process)readyProcesses.get(i)).priority;
                    indexOfBiggestPriority=i;
                    System.out.println("lowesttttt "+((Process)readyProcesses.get(i)).name+" "+biggestPriority);
                    
                }
                
            }
            System.out.println("the LOWEST after the for loop is "+((Process)readyProcesses.get(indexOfBiggestPriority)).name+" "+biggestPriority);
            // hena 3andi as3'ar timeRemaining wel index beta3 as3'ar timeRemaning element ;
            Process p=((Process)readyProcesses.get(indexOfBiggestPriority));
            if(p!=LastProcess){
                System.out.println("p!=LastProcess");
                LastProcess = p ;        
                 if(outOfGAP==false&&!firstIteration)
                    jTextArea1.append("  End Time:  "+time);
                else if(!firstIteration)
                    jTextArea1.append("  TO:  "+time);
                jTextArea1.append("\n");
                jTextArea1.append("\n");
                jTextArea1.append("Name:  "+p.name+"  Start Time:  "+time);
                
                //System.out.println("Name:"+p.name+" Burst Time"+p.burst+"Remaining Time:"+(p.TimeRemaining)+"    TIME IS : "+time);
            }   
            //decrement 1 from the time reminaing of the lowest TimeRemaining process men  
            //list el processes w men list el readyProcesses
            for(int i = 0 ; i<processes.size();i++)
            {
                if(((Process)(processes.get(i))).equals(((Process)readyProcesses.get(indexOfBiggestPriority))))
                {
                    (processes.get(i)).TimeRemaining--;
                    //((Process)readyProcesses.get(indexOfLowestTimeRemaining)).TimeRemaining--;
                    System.out.println((processes.get(i)).name+" "+(processes.get(i)).TimeRemaining+"after decrementing");
                    if((processes.get(i)).TimeRemaining<=0)
                    {p.EndTime=time+1;
                        avgWaitingTime+=(p.EndTime=p.arrivalTime-p.burst);
                        processes.remove(p);
                        readyProcesses.remove(p);
                    }
                    break ;   
                }
            }
            System.out.println(LastProcess);
            time++;
            System.out.println("\n\n\n");
            readyProcesses=getReadyProcesses();
            outOfGAP=false;
            firstIteration=false;
        }
        }
        jTextArea1.append("  End Time:  "+time);
        jTextArea1.append("\n") ;
        jTextArea1.append("\n") ;
        avgWaitingTime/=Size;
        jTextArea1.append("Average Waiting Time:  "+avgWaitingTime);
        
    }











}


