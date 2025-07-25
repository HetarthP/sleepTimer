
//Description: This is a program of a sleep timer which tells you approxiametly 
// how many hours you have slept through the day you were born till now



package ovs.u1l8.sleeptimer;

import javax.swing.JOptionPane;//Imports the option to create windows

/**
 *
 * @author user
 */
public class JavaSleepTimer extends javax.swing.JFrame {

    /**
     * Creates new form JavaSleepTimer
     */
    public JavaSleepTimer() {
        initComponents();
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
        textDay = new javax.swing.JTextField();
        textMonth = new javax.swing.JTextField();
        textYear = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        textDay2 = new javax.swing.JTextField();
        textMonth2 = new javax.swing.JTextField();
        textYear2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnRecommend = new javax.swing.JButton();
        textResult = new javax.swing.JTextField();
        textAge = new javax.swing.JTextField();
        textAgeInput = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnCalculate = new javax.swing.JButton();
        btnSleep = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sleep Timer");

        textMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textMonthActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textMonth2, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(textDay2)
                    .addComponent(textYear2))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(textDay2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(textMonth2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(textYear2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jLabel9.setText("Day");

        jLabel10.setText("Month");

        jLabel11.setText("Year");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(textYear, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(textDay, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textMonth, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(textMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel10)))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 51, Short.MAX_VALUE))
        );

        btnRecommend.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRecommend.setText("Recommend!");
        btnRecommend.setToolTipText("");
        btnRecommend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecommendActionPerformed(evt);
            }
        });

        textResult.setEditable(false);

        textAgeInput.setEditable(false);

        jLabel1.setFont(new java.awt.Font("MS PGothic", 1, 18)); // NOI18N
        jLabel1.setText("Enter Age here for sleep hour recommendations based on your age!");

        btnCalculate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCalculate.setText("Calculate");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        btnSleep.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSleep.setText("Sleep Tips!");
        btnSleep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSleepActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(51, 204, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Sleep Calculator");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Enter date of birth");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Enter today's date");

        jLabel5.setText("All dates in DD-MM-YYYY or D-M-YYYY");

        jLabel6.setText("Day");

        jLabel7.setText("Month");

        jLabel8.setText("Year");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 75, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnRecommend)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textAgeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textAge, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(textResult, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClear)
                .addGap(100, 100, 100))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCalculate)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel8))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(btnSleep)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSleep))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel6)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel7)
                        .addGap(51, 51, 51)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCalculate)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(textAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRecommend)
                    .addComponent(textAgeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnClear)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    //Not being used
    private void textMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textMonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textMonthActionPerformed
    
    
    //This is the main calculation method where everything gets calculated very
    //accurately
    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        
        //This here checks if any of the text fields are empty which will open
        //up a window telling the user they didnt enter all fields
        if (textDay.getText().isEmpty() || textMonth.getText().isEmpty() || textYear.getText().isEmpty() ||
        textDay2.getText().isEmpty() || textMonth2.getText().isEmpty() || textYear2.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "You did not enter all fields");
    } else {
        try {
            //These functions here get the birth date from the user 
            int birthDay = Integer.parseInt(textDay.getText());
            int birthMonth = Integer.parseInt(textMonth.getText());
            int birthYear = Integer.parseInt(textYear.getText());

            //These functions here get the current date from the user
            int currentDay = Integer.parseInt(textDay2.getText());
            int currentMonth = Integer.parseInt(textMonth2.getText());
            int currentYear = Integer.parseInt(textYear2.getText());
            
            //Now this function is very important as it validates both dates 
            //entered
            if (!validDate(birthDay, birthMonth, birthYear) || !validDate(currentDay, currentMonth, currentYear)) {
                return; // The return here will exit the method if any of the 
                        //dates entered are invalid
            }
            //This calculates the total years from the birth date to the current date
            int totalYears = currentYear - birthYear;
            //This calculates the total months between the current month and
            //as well as the birth month. Adds total years multiplied by 12 so
            //it accounts for the months in every year and then adds the difference
            //between the current month and the birth month to get your total!
            int totalMonths = (currentMonth - birthMonth) + totalYears * 12;
            
            // This calculates the total days between the current date and the 
            // birth date. It subtracts the birth day from the current day to get the 
            // difference in days. It then adds the total months multiplied by 30 
            //(assuming theres 30 days in a month) to approximate the total number of days. 
            int totalDays = (currentDay - birthDay) + totalMonths * 30;

            //This calculates the total hours slept assuming 8 hours per day
            int totalHoursSlept = totalDays * 8;
            
            //This calculates the age by subtracting the birth year from the 
            //current year it is
            int age= currentYear-birthYear;
            //this function is mainly for validation to ensure that the birthday hasnt
            //happened yet in the current yet so it doesn't give the user a wrong
            //date
            if (currentMonth < birthMonth || (currentMonth == birthMonth && currentDay < birthDay)) {
                age--;
            }
            //Now these commands here put restrictions on certain age groups
            //so that depending on your age it'll classify you as either a young
            //person, adult, or senior, and a little positive message at the end!
            String suggestion;
            if (age < 18) {
                //This function here checks if the average amount of sleep is atleast
                //8 hours per night and same thing for the rest of them
                suggestion = (totalHoursSlept / totalDays) >= 8 ? 
                           " As a young person, you're getting a healthy amount of sleep." :
                           "";  
            } else if (age < 65) {
                suggestion = (totalHoursSlept / totalDays) >= 8 ? 
                           " As an adult, you're getting a good amount of sleep." :
                           "";  
            } else {
                suggestion = (totalHoursSlept / totalDays) >= 8 ? 
                           " As a senior, you're getting a good amount of sleep." :
                           "";  
            }
            
            
            
            
            
               
            // This is the final function which displays the final text output
            //in the text field including all my functions and elements I want. 
            //Here it tells you the total hours slept, what you classify as (kid,
            //adult, or senior), and how old you are as well!
            textResult.setText("You slept about " + totalHoursSlept + " hours since birth!"+ suggestion+"You are currently" + age);
        } catch (NumberFormatException e) {
            //This is incase the user inputs letters in the text field instead of numbers.
            //Basically error checking to make sure the inputs are only numbers
            JOptionPane.showMessageDialog(null, "Invalid date format. Please enter numbers only.");
        }
    }  
      
      
      
    
        
    }//GEN-LAST:event_btnCalculateActionPerformed

    //Now this is a very interesting method. 
    //It is to validate whethere a given date is correct
    private boolean validDate(int day, int month, int year) {
    
    //This function here gets the current year from the system calendar. 
    int currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
    //This here validates the year range (for example, between 1500 and the current year)
    if (year < 1500 || year > currentYear) {
        //This is to ensure that the given year range is between 1500 and the current year
        //Window will pop up if the user inputs anything outside that range
        JOptionPane.showMessageDialog(null, "Invalid year entered. Year must be between 1500 and " + currentYear);
        return false;//Indicates the date is not valid and returns false
    }

    //This function here validates the month number the user inputs (1-12)
    if (month < 1 || month > 12) {
        JOptionPane.showMessageDialog(null, "Invalid month entered. Please enter a month between 1 and 12.");
        return false;//Indicates the month is not valid and returns false and
                     //opens a window if user inputs a number outside the range
                     //provided
    }

    //This here is an array with the number of days in each month so the calculator
    //can be a little more accurate instead of just the 30 day assumption
    int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    //We can also check for leap years using this function here to adjust 
    //specifically february's days
    if (month == 2 && leapYear(year)) {
        daysInMonth[1] = 29;  // February has 29 days in a leap year, that's why
    }
    //This function validates the day the user enters and is within the valid 
    //range
    if (day < 1 || day > daysInMonth[month - 1]) {
        JOptionPane.showMessageDialog(null, "Invalid day entered. Either change the day or the year in case of leap year calculations");
        return false;//Same thing as before to ensure the date is valid and 
                    //the program will show a dialog to user indicating if it isnt
                    //If the program detects that a certain year isnt a leap year
                    //as well, it will pop up the info window to let the user know
    }

    return true;//Just returns true indicating that the date entered is valid
}

//This is the actual method to check if a year is a leap year
private boolean leapYear(int year) {
    //So first we have to ensure that the year is divisbile by 4
    if (year % 4 == 0) {
        //If the year is divisible by 100, it should also be divisible by 400 to 
        //be an actual leap year
        if (year % 100 == 0) {
            return year % 400 == 0;
        } else {
            
            return true;
        }
    } else {
        //In case the year is not divisible by 4, it is not a leap year
        return false;
    }
}
    private void btnRecommendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecommendActionPerformed
     try{  
            //This function here is a functionality I added which tells the user
            //the recommended amount of sleep based on their age
            //This parses the age from the input text field and trims any extra
            //spaces there might be
            int age = Integer.parseInt(textAge.getText().trim());
            String sleepRecommendation;
            
            //These if statement's provide the sleep recommendation based on age here
            if (age < 18) {
                sleepRecommendation = "8-10 hours of sleep each night";
            } else if (age < 65) {
                sleepRecommendation = "7-9 hours of sleep each night";
            } else {
                sleepRecommendation = "7-8 hours of sleep each night";
            }
              //This will display the recommendation in the specified text field
              textAgeInput.setText(sleepRecommendation);
    } catch (NumberFormatException e) {
        // Handle the case where input is not a valid integer
        //This is another error check to make sure the age is a number and not other
        //things

        textAgeInput.setText("Invalid format. Please enter a valid number.");
    }
       
    }//GEN-LAST:event_btnRecommendActionPerformed

    private void btnSleepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSleepActionPerformed
        
        //This here is a little window I made in case the user wants some extra tips
        //on how to sleep better at night!
        String sleepTips = "Sleep Tips:\n"
                       + "1. Maintain a regular sleep routine by going to bed and waking up at the same time every day.\n"
                       + "2. Turn off the lights and sleep in a cooler environment when going to bed.\n"
                       + "3. Make sure your sleep environment is distraction free!.\n"
                       + "4. Limit your exposure to screens and bright lights before bedtime as it can cause eye strain.\n"
                       + "5. Avoid consuming any caffeine or heavy meals close to bedtime as you have to rest, not work.\n"
                       + "6. Stay physically active during the day to promote better sleep so your body gets tired during nightime.\n"
                       + "7. Manage your stress and anxiety levels through relaxation techniques or mindfulness before sleeping.\n";

    //Displays the tips in the window
    JOptionPane.showMessageDialog(null, sleepTips, "Sleep Tips",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnSleepActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
            //These functions here clear all the text fields on display
    
    textDay.setText("");
    textMonth.setText("");
    textYear.setText("");
    textDay2.setText("");
    textMonth2.setText("");
    textYear2.setText("");
    textResult.setText(""); 
    textAge.setText("");    
    textAgeInput.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

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
            java.util.logging.Logger.getLogger(JavaSleepTimer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JavaSleepTimer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JavaSleepTimer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JavaSleepTimer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JavaSleepTimer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnRecommend;
    private javax.swing.JButton btnSleep;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField textAge;
    private javax.swing.JTextField textAgeInput;
    private javax.swing.JTextField textDay;
    private javax.swing.JTextField textDay2;
    private javax.swing.JTextField textMonth;
    private javax.swing.JTextField textMonth2;
    private javax.swing.JTextField textResult;
    private javax.swing.JTextField textYear;
    private javax.swing.JTextField textYear2;
    // End of variables declaration//GEN-END:variables
}
