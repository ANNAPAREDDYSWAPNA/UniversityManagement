
package Univerist.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project extends JFrame implements ActionListener{
    
    Project()
    {
    
     setSize(1540, 850);
        
        
     ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
     Image i2 = i1.getImage().getScaledInstance(1500, 750, Image.SCALE_DEFAULT);
     ImageIcon i3 = new ImageIcon(i2);
     JLabel image = new JLabel(i3);
     add(image);
     
      JMenuBar mb = new JMenuBar();
      
        
        // New Information
        JMenu newInformation = new JMenu("New Information");
        newInformation.setFont(new Font("Arial",Font.BOLD,20));
        
        newInformation.setForeground(Color.blue);
        mb.add(newInformation);
        
        JMenuItem facultyInfo = new JMenuItem("New Faculty Information");
         facultyInfo.setFont(new Font("Arial",Font.BOLD,15));
        facultyInfo.setBackground(Color.WHITE);
        facultyInfo.addActionListener(this);
        newInformation.add(facultyInfo);
        
        JMenuItem studentInfo = new JMenuItem("New Student Information");
        studentInfo.setFont(new Font("Arial",Font.BOLD,15));
        studentInfo.setBackground(Color.WHITE);
        studentInfo.addActionListener(this);
        newInformation.add(studentInfo);
        
        // Details
        JMenu details = new JMenu("View Details");
        details.setFont(new Font("Arial",Font.BOLD,20));
        details.setBounds(40, 85, 100, 25);
        details.setForeground(Color.red);
        mb.add(details);
        
        JMenuItem facultydetails = new JMenuItem("View Faculty Details");
        facultydetails.setFont(new Font("Arial",Font.BOLD,15));
        facultydetails.setBackground(Color.WHITE);
        facultydetails.addActionListener(this);
        details.add(facultydetails);
        
        JMenuItem studentdetails = new JMenuItem("View Student Details");
        studentdetails.setFont(new Font("Arial",Font.BOLD,15));
        studentdetails.setBackground(Color.WHITE);
        studentdetails.addActionListener(this);
        details.add(studentdetails);
        
        // Leave
        JMenu leave = new JMenu("Apply Leave");
        leave.setFont(new Font("Arial",Font.BOLD,20));
        leave.setForeground(Color.blue);
        mb.add(leave);
        
        JMenuItem facultyleave = new JMenuItem("Faculty Leave");
        facultyleave.setFont(new Font("Arial",Font.BOLD,15));
        facultyleave.setBackground(Color.WHITE);
        facultyleave.addActionListener(this);
        leave.add(facultyleave);
        
        JMenuItem studentleave = new JMenuItem("Student Leave");
        studentleave.setFont(new Font("Arial",Font.BOLD,15));
        studentleave.setBackground(Color.WHITE);
        studentleave.addActionListener(this);
        leave.add(studentleave);
        
        // Leave Details
        JMenu leaveDetails = new JMenu("Leave Details");
        leaveDetails.setFont(new Font("Arial",Font.BOLD,20));
        leaveDetails.setForeground(Color.red);
        mb.add(leaveDetails);
        
        JMenuItem facultyleavedetails = new JMenuItem("Faculty Leave Details");
        facultyleavedetails.setFont(new Font("Arial",Font.BOLD,15));
        facultyleavedetails.setBackground(Color.WHITE);
        facultyleavedetails.addActionListener(this);
        leaveDetails.add(facultyleavedetails);
        
        JMenuItem studentleavedetails = new JMenuItem("Student Leave Details");
        studentleavedetails.setFont(new Font("Arial",Font.BOLD,15));
        studentleavedetails.setBackground(Color.WHITE);
        studentleavedetails.addActionListener(this);
        leaveDetails.add(studentleavedetails);
        
        // Exams
        JMenu exam = new JMenu("Examination");
        exam.setFont(new Font("Arial",Font.BOLD,20));
        exam.setForeground(Color.BLUE);
        mb.add(exam);
        
        JMenuItem examinationdetails = new JMenuItem("Examination Results");
        examinationdetails.setFont(new Font("Arial",Font.BOLD,15));
        examinationdetails.setBackground(Color.WHITE);
        examinationdetails.addActionListener(this);
        exam.add(examinationdetails);
        
        JMenuItem entermarks = new JMenuItem("Enter Marks");
        entermarks.setFont(new Font("Arial",Font.BOLD,15));
        entermarks.setBackground(Color.WHITE);
        entermarks.addActionListener(this);
        exam.add(entermarks);
        
        // UpdateInfo
        JMenu updateInfo = new JMenu("Update Details");
        updateInfo.setFont(new Font("Arial",Font.BOLD,20));
        updateInfo.setForeground(Color.RED);
        mb.add(updateInfo);
        
        JMenuItem updatefacultyinfo = new JMenuItem("Update Faculty Details");
        updatefacultyinfo.setFont(new Font("Arial",Font.BOLD,15));
        updatefacultyinfo.setBackground(Color.WHITE);
        updatefacultyinfo.addActionListener(this);
        updateInfo.add(updatefacultyinfo);
        
        JMenuItem updatestudentinfo = new JMenuItem("Update Student Details");
        updatestudentinfo.setFont(new Font("Arial",Font.BOLD,15));
        updatestudentinfo.setBackground(Color.WHITE);
        updatestudentinfo.addActionListener(this);
        updateInfo.add(updatestudentinfo);
        
        // fee
        JMenu fee = new JMenu("Fee Details");
        fee.setFont(new Font("Arial",Font.BOLD,20));
        fee.setForeground(Color.BLUE);
        mb.add(fee);
        
        JMenuItem feestructure = new JMenuItem("Fee Structure");
        feestructure.setFont(new Font("Arial",Font.BOLD,15));
        feestructure.setBackground(Color.WHITE);
        feestructure.addActionListener(this);
        fee.add(feestructure);
        
        JMenuItem feeform = new JMenuItem("Student Fee Form");
        feeform.setFont(new Font("Arial",Font.BOLD,15));
        feeform.setBackground(Color.WHITE);
        feeform.addActionListener(this);
        fee.add(feeform);
        
        JMenu utility = new JMenu("Utility");
        utility.setFont(new Font("Arial",Font.BOLD,20));
        utility.setForeground(Color.RED);
        mb.add(utility);
        
        JMenuItem notepad = new JMenuItem("Notepad");
        notepad.setFont(new Font("Arial",Font.BOLD,15));
        notepad.setBackground(Color.WHITE);
        notepad.addActionListener(this);
        utility.add(notepad);
        
        
        
        // about
        JMenu about = new JMenu("About");
        about.setFont(new Font("Arial",Font.BOLD,20));
        about.setForeground(Color.blue);
        mb.add(about);
        
        JMenuItem ab = new JMenuItem("About");
        ab.setBackground(Color.WHITE);
        ab.addActionListener(this);
        about.add(ab);
        
        // exit
        JMenu exit = new JMenu("Exit");
        exit.setFont(new Font("Arial",Font.BOLD,20));
        exit.setForeground(Color.black);
        mb.add(exit);
        
        JMenuItem ex = new JMenuItem("Exit");
        ex.setFont(new Font("Arial",Font.BOLD,15));
        ex.setBackground(Color.WHITE);
        ex.addActionListener(this);
        exit.add(ex);
        
        setJMenuBar(mb);
  
        
        
     setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        String msg = ae.getActionCommand();
         if (msg.equals("Exit")) {
            setVisible(false);
         }
          else if (msg.equals("Notepad")) {
            try {
                Runtime.getRuntime().exec("notepad.exe");
            } catch (Exception e) {
                
            }
          } else if (msg.equals("New Faculty Information")) {
            new AddTeacher();
        } else if (msg.equals("New Student Information")) {
            new AddStudent();
        } else if (msg.equals("View Faculty Details")) {
            new TeacherDetails();
        } else if (msg.equals("View Student Details")) {
            new StudentDetails();
        } else if (msg.equals("Faculty Leave")) {
            new TeacherLeave();
        } else if (msg.equals("Student Leave")) {
            new StudentLeave();
         } else if (msg.equals("Faculty Leave Details")) {
            new TeacherLeaveDetails();
        } else if (msg.equals("Student Leave Details")) {
            new StudentLeaveDetails();
        } else if (msg.equals("Update Faculty Details")) {
            new UpdateTeacher();
        } else if (msg.equals("Update Student Details")) {
            new UpdateStudent();
        } else if (msg.equals("Enter Marks")) {
            new EnterMarks();
        } else if (msg.equals("Examination Results")) {
            new ExaminationDetails();
        } else if (msg.equals("Fee Structure")) {
            new FeeStructure();
        } else if (msg.equals("About")) {
            new About();
        } else if (msg.equals("Student Fee Form")) {
            new StudentFeeForm();
        }
    }
     public static void main(String[] args) {
        new Project();
    }

   
   
}
