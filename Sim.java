class Sim {




    ///State 
    //Constructer
    // Behaviour

//state 


 String sname;
String type;
long Contact_No;



//no Argument constructure 

public  Sim() {
    // Load instruction
}



public Sim(String sname, String type, long contact_No) {
    this.sname = sname;
    this.type = type;
    Contact_No = contact_No;
}


public void detailsofSim() {

    System.out.println("Sim Name is" + sname);
    System.out.println("Sim Type is + " + type);
    System.out.println("Sim Number is "+ Contact_No);
    System.out.println("=======================================================");
}


}