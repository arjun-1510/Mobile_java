 class Mobile {



    String Mname;
     double Price;
    String ram;
    String storage;

// lazy instation
     Sim slot1;
     Sim slot2;



    public Mobile(String mname, double price, String ram, String storage) {
        Mname = mname;
        Price = price;
        this.ram = ram;
        this.storage = storage;
       


    }


    // behaviour 

    // add sim

    public boolean addSim (Sim s1) {
        if(slot1==null) {
            slot1=s1;
            System.out.println("Sim  1 is Added "+ slot1.sname);
           
        }else {
            System.out.println("Its Can't insert "+ slot1.sname);
        }
        return true;
    }

    public boolean addSim2 (Sim s2) {
        if(slot2==null) {
            slot2=s2;
            System.out.println("Sim  2 is Added  "+ slot2.sname);
        }else {
            System.out.println("Its Can't insert Already Present "+ slot2.sname);
        }
        return true;
    }


    /// Remove 

    public void RemoveSim1 () {
        if(slot1!=null) {
            slot1=null;
            System.out.println("Sim 1 is  Removed ");
        }else {
            System.out.println("Its Can't Remove ");
        }
    }



    public void RemoveSim2 () {
        if(slot2!=null) {
            slot2=null;
            System.out.println("Sim 2 is Removed ");
        }else {
            System.out.println("Its Can't Remove ");
        }
    }


    /// Is present 


    public boolean Sim1_IsPresent () {
        if(slot1!=null) {
           return true;
        }
        return false;
        }
    


    public boolean Sim2_IsPresent () {
        if(slot2!=null) {
           return true;
        }
        return false;
        }


        public boolean  detailsofMobile() {

            System.out.println("Mobile name :" + Mname);
            System.out.println("Mobile Price is : " + Price);
            System.out.println("Mobile ram "+ ram);
            System.out.println("Mobile Storge : " + storage);

            return true;
        }

    


     
    
}
