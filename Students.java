class Students {
     String   name;
     String   branch;
     String    rollNo;
     String     section;
     String     city;
     String      gender;
     String    state;
     String     email;
     String    hosteler;
     String    semester; 
     String    collegeName;
                                        
           public String studentName(){
           String studentName="Name of the student ";
           return studentName;
        }
          public static void main(String[] args) {
           
          Students stu= new Students();
          
          stu.name= "Ritoshree Roy";
          stu.branch = "CSE";
          stu.rollNo= "27";
          stu.section= "A";
          stu.city= "Durgapur";
          stu.gender= "F";
          stu.state= "West Bengal";
          stu.email= "ritashree2001.roy@gmail.com";
          stu.hosteler= "No";
          stu.semester= "Fifth";
          stu.collegeName= "Bengal College Of Engineering";

 System.out.println(stu.studentName()+stu.name);
 System.out.println("Branch is: "  +stu.branch);
System.out.println("Rollno is: "  +stu.rollNo);
System.out.println("Section is: "  +stu.section);
System.out.println("City is: "  +stu.city);
System.out.println("Gender is: "  +stu.gender);
System.out.println("State is: "  +stu.state);
System.out.println("Email is: "  +stu.email);
System.out.println("Hosteler is: "  +stu.hosteler);
System.out.println("Semester is: "  +stu.semester);
System.out.println("College Name is: "  +stu.collegeName);
  
  }
                                      
}                   

