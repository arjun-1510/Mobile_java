import java.util.Scanner;

public class Userinterface {


    static Scanner sc = new Scanner(System.in);

    static Mobile mobile = new Mobile("Honor8X", 14000, "4gb", "165mm");

    static boolean flag=false;





    public static void main(String[] args) {


        do {

          flag= true;


            System.out.println("Welcome Arjun Mobile shop ");
            System.out.println("1. Details of Mobile \n2. Details of Sim \n3. Add Sim  \n4. Remove Sim 1 \n5. Is Present  \n6.Exit");


            System.out.println("Enter your option ");
            int user_seletect = sc.nextInt();

            switch(user_seletect) {
                case 1 : {

                     

                    ///Details of mobile

                    mobile.detailsofMobile();
                    
                    
                    
                    break;}
                case 2 : {

                   boolean b=true;

                   do {


                         b= true;

                   

                    System.out.println("1.Artel Sim \n2.Jio Sim\n3.Exit");
                    System.out.println("Enter your options");
                    int user_sim_details = sc.nextInt();
                    if(user_sim_details==1) {
                        if(mobile.Sim1_IsPresent()) {
                            mobile.slot1.detailsofSim();
                        }else {
                            System.err.println("Sim 1 is Empty"+ mobile.slot1.sname);
                        }
                       

                    }
                    
                    
                    else if(user_sim_details==2) {
                        if(mobile.Sim2_IsPresent()) {
                            mobile.slot2.detailsofSim();

                        }else {
                            System.err.println("Sim 2 is empty" + mobile.slot2.sname);
                        }
                        
                    }
                    else if(user_sim_details==3) {
                        b=false;
                    }

                    
                    
                    
                    
                }






                    while(b);
                    /// details of Sim
                }
                break;
                case 3 : {
                    // add Sim 1 
                    boolean b= true;


                    do {

                        
                        System.out.println("Welcome to Add Sim ");
                        System.out.println("1.Airtel\n2.Jio\n3.Exit");

                        int user_add = sc.nextInt();
                        if(user_add==1) {
                            mobile.addSim(new Sim("Airtel", "4g",790453625));
                            System.out.println(" Sim 1 Successfull added");
                        }
                       else if(user_add==2) {
                            mobile.addSim2(new Sim("Jio", "4g",936024666));
                            System.out.println(" Sim 2 Successfull added");
                        }
                        else if(user_add==3) {
                            b=false;
                        }






                    }while(b);
                              break;}
                case 4 : {



                      // remove 
                      boolean b= true;


                      do {
  
                          
                          System.out.println("Welcome to remove Sim ");
                          System.out.println("1.Airtel\n2.Jio\n3.Exit");
  
                          int user_Remove = sc.nextInt();
                          if(user_Remove==1) {
                             mobile.RemoveSim1();
                              System.out.println(" Sim 1 Removed ");
                          }
                         else if(user_Remove==2) {
                              mobile.RemoveSim2();
                              System.out.println(" Sim 2 Removed ");
                          }
                          else if(user_Remove==3) {
                              b=false;
                          }
  
  
  
  
  
  
                      }while(b);
  






                    
                    
                    
                    
                    
                    
                    
                    
                    break;}
                case 5 : {


                      // add Sim 1 
                      boolean b= true;


                      do {

                        // is present
                        b= true;
  
                          
                          System.out.println("Welcome Present Sim ");
                          System.out.println("1.Airtel\n2.Jio\n3.Exit");
  
                          int user_ispresent = sc.nextInt();
                          if(user_ispresent==1) {
                              if(mobile.Sim1_IsPresent())
                              System.out.println(" Sim 1 present " +mobile.slot1.sname);
                          }
                         else if(user_ispresent ==2) {
                            if(mobile.Sim2_IsPresent())
                            System.out.println(" Sim 2 present " +mobile.slot2.sname);
                          }
                          else if(user_ispresent ==3) {
                              b=false;
                          }
  
  
  
  
  
  
                      }while(b);
  
                    
                    
                    
                    
                    
                    break;}
                case 6 : {


                    flag=false;
                    
                    
                    
                    break;}
               
              
            }



         } while(flag);
        




    }
    
}
