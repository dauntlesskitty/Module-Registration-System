
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Driver {
    public static Scanner  numInput = new Scanner(System.in);
    public static Scanner input = new Scanner(System.in);
    public static Module[][] sem = new Module[7][6];
    public static Student[] StudentList = new Student[100];
    
    public static void main(String[] args) {
        //Module list
        //semester 1
        sem[0][0] = new Module("ITS60404", "Computer Systems", "none", 4, 0);
        sem[0][1] = new Module("ITS60304", "C Programming", "none", 4, 0);
        sem[0][2] = new Module("ITS60103", "System Analysis and Design", "none", 3, 0);
        sem[0][3] = new Module("MTH60104", "Mathematics for Computing 1", "none", 4, 0);
        sem[0][4] = new Module("MPU3143", "Bahasa Melayu Komunikasi 2", "none", 3, 2);
        sem[0][5] = new Module("MPU3123", "Tamadun Islam dan Tamadun Asia", "none", 3, 1);
        
        //semester 2
        sem[1][0] = new Module("MPU3173", "Malaysian Studies 3", "none", 3, 2);
        sem[1][1] = new Module("MPU3113", "Hubungan Etnik", "none", 3, 1);
        sem[1][2] = new Module("COM60303", "Communication Practice for IT Professionals", "none", 3, 0);
        sem[1][3] = new Module("ITS61104", "Web Systems and Technologies", "none", 4, 0);
        sem[1][4] = new Module("CSC60204", "Internet Fundamentals", "none", 4, 0);
        sem[1][5] = new Module("ITS60704", "Fundamentals of Software Engineering", "none", 4, 0);
    
        //semester 3
        sem[2][0] = new Module("ITS60804", "Introduction to Object-Oriented Programming", "none", 4, 0);
        sem[2][1] = new Module("ITS60604", "Fundamentals of Database Systems", "none", 4, 0);
        sem[2][2] = new Module("ITS60203", "Fundamentals of Data Communications", "none", 3, 0);
        sem[2][3] = new Module("CSC60104", "E-Commerce", "none", 4, 0);
        sem[2][4] = new Module("UCM60503U2", "Personal Development", "none", 3, 0);
        sem[2][5] = new Module("UCM60402U3", "Malaysian Indigenous Cultures", "none", 2, 0);
        
        //semester 4
        sem[3][0] = new Module("ITS61004", "Object-Oriented Programming using Java", "ITS60804", 4, 0);
        sem[3][1] = new Module("ITS60503", "Operating Systems", "none", 3, 0);
        sem[3][2] = new Module("CSC60103", "Online Presence Management**", "none", 3, 0);
        sem[3][3] = new Module("CSC60703", "Project Management", "ITS60704", 3, 0);
        sem[3][4] = new Module("ITS62304", "Web Database Applications", "ITS61104", 4, 0);
        sem[3][5] = new Module("UCM60102U4", "Community Service Initiative", "none", 2, 0);
    
        //semester 5
        sem[4][0] = new Module ("IND60206", "Industrial Training", "**", 6, 0);
        
        //semester 6
        sem[5][0] = new Module("PRJ60207", "Final Year Project (Semester I)", "**", 3, 0);
        sem[5][1] = new Module("ITS61703", "Enterprise Computing", "none", 3, 0);
        sem[5][2] = new Module("ITS62204", "Mobile Applications Development", "ITS60804", 4, 0);
        sem[5][3] = new Module("CSC60304", "Multimedia Systems", "ITS62304", 4, 0);
        sem[5][4] = new Module("CSC60403", "Technopreneurship", "none", 3, 0);
        sem[5][5] = new Module("CSC60303", "Professional Computing Practice", "none", 3, 0);
    
        //semeseter 7
        sem[6][0] = new Module("PRJ60207", "Final Year Project (Semester II)", "Complete Part I", 4, 0);
        sem[6][1] = new Module("ITS62504", "XML Technologies", "ITS61104", 4, 0);
        sem[6][2] = new Module("ITS61704", "Windows Application using .NET Technologies", "ITS60804", 4, 0);
        sem[6][3] = new Module("ITS61404", "Web Applications using .NET Technologies", "ITS60804", 4, 0);
        sem[6][4] = new Module("ITS60504", "Data Structures and Algorithms", "ITS60304", 4, 0);
        //End of Module List

        //Demo Student List
        StudentList[0] = new Student("Alex", "STD001", 1, 1, true);
        StudentList[1] = new Student("Brandon", "STD002", 2, 1, true);
        StudentList[1].setModule("ITS60404", 4);
        sem[0][0].setStudent("STD002");
        StudentList[2] = new Student("Catherine", "STD003", 3, 2, true);
        StudentList[3] = new Student("Douglas", "STD004", 4, 2, true);
        StudentList[4] = new Student("Elizabeth", "STD005", 5, 2, true);
        StudentList[5] = new Student("Felicia", "STD006", 6, 3, true);
        StudentList[6] = new Student("Gabriel", "STD007", 7, 3, true);
        StudentList[7] = new Student("Harry", "STD008", 1, 1, false);
        StudentList[8] = new Student("Isabelle", "STD009", 2, 1, false);
        StudentList[9] = new Student("Jacky", "STD010", 3, 2, false);
       
        mainMenu();
    }
    
    public static void mainMenu(){
        System.out.println("Please select a function:");
        System.out.println("1. Register a student.");
        System.out.println("2. Register modules for a student.");
        System.out.println("3. Display all modules registered by a student.");
        System.out.println("4. Display all modules completed by a student.");
        System.out.println("5. Display all registered students of a module.");
        System.out.println("6. Display all students that have done the module registration.");
        System.out.println("7. Display all students that have not performed the module registration.");
        System.out.println("8. Move to next semester.");
        System.out.println("9: Drop a module.");
        System.out.println("10: Exit");
        System.out.print("Input: ");
        
        int selection = numInput.nextInt();
        
        switch(selection){
            case 1:
                registerStudent();
                break;
            case 2:
                registerModules();
                break;
            case 3:
                displayRegisteredModules();
                break;
            case 4:
                displayCompletedModules();
                break;
            case 5:
                displayRegisteredStudents();
                break;
            case 6:
                displayStudentComplete();
                break;
            case 7:
                displayStudentPending();
                break;
            case 8:
                flushModules();
                break;
            case 9:
                dropModule();
                break;
            case 10:
                System.out.println("End of program.");
                break;
            default:
                System.out.println("Invalid input.");
                System.out.println("");
                mainMenu();
                break;
        }
    }
    
    public static void registerStudent(){
        //Temporary Data
        String tmpName, tmpID, tmpLocalYN;
        int tmpSem, tmpYear=3;
        boolean tmpLocal=true, flag;
       //End of Temporary Data
       
       //Registering Student Data
        System.out.print("Student Name: "); //Student Name
        tmpName = input.nextLine();
        
        do{ //Student ID
            flag = true;
            System.out.print("Student ID: ");
            tmpID = input.nextLine();
            
            for(int i = 0; i<Student.totalStudent; i++){    //Checks if ID exists
                if (tmpID.equals(StudentList[i].getID())){
                    flag = false;
                    System.out.println("Student ID is already taken.");
                }
            }
        }while (flag == false); //if flag is false, repeat 
        
        do{ //Semester                                
            flag = true;
            System.out.print("Semester: ");
            tmpSem = numInput.nextInt();
            if (tmpSem<1 || tmpSem>7){
                System.out.println("Invalid input.");
                flag = false;
            }
        }while (flag == false); 
        
        if (tmpSem < 3){
            tmpYear = 1;
        }else if (tmpSem<6){
            tmpYear = 2;
        }
        System.out.println("Year: "+ tmpYear);
        
        do{ //Locaility
            flag = true;
            System.out.print("Local Student (Y/N): ");
            tmpLocalYN = input.nextLine();
            if(tmpLocalYN.equalsIgnoreCase("Y") || tmpLocalYN.equalsIgnoreCase("YES")){
                tmpLocal = true;   
            }else if (tmpLocalYN.equalsIgnoreCase("N") || tmpLocalYN.equalsIgnoreCase("NO")){
                tmpLocal = false;
            }else{
                System.out.println("Invalid selection.");
                flag = false;
            }
        }while (flag == false);
        
        StudentList[Student.totalStudent] = new Student(tmpName, tmpID, tmpSem, tmpYear, tmpLocal);
        
        do{ 
            flag = true;
            String newRegistry;
            System.out.print("Register another student? (Y/N): ");
            newRegistry = input.nextLine();
            if(newRegistry.equalsIgnoreCase("Yes") || newRegistry.equalsIgnoreCase("Y")){
                registerStudent();
            }else if(newRegistry.equalsIgnoreCase("No")||newRegistry.equalsIgnoreCase("N")){
                System.out.println("");
                mainMenu();
            }else{
                System.out.println("Invalid input.");
                flag = false;
            }
        }while(flag == false);
        
    }
    
    public static void registerModules(){
        System.out.print("Student ID (Exit to return): ");
        String IDCheck = input.nextLine();
        if(!IDCheck.equalsIgnoreCase("exit")){
            int student = -1;
            for(int i = 0; i<Student.totalStudent; i++){
                if (IDCheck.equalsIgnoreCase(StudentList[i].getID())){
                    student = i;
                    //Student number in array [tester]
                    System.out.println(student);
                    break;
                }
            }
            if (student == -1){
                System.out.println("\nStudent not found.\n");
                mainMenu();
            }else{
                listModules(student);
            }
        }else{
            mainMenu();
        }
    }
    
    public static void listModules(int x){
        int semNo = StudentList[x].getSem()-1;
        
        System.out.println(String.format("%-3s\t%-10s\t%-50s\t%-10s\t%s", "No.", "Code", "Module Title", "Pre-requisites", "Credit Hours"));
        
        //get year
        int year = 3, y = 2;
        if (semNo < 2){
            year = 1;
            semNo = 0;
        }else if (semNo<5){
            year = 2;
            y = 3;
            semNo = 2;
        }else if(semNo>4){
            semNo = 5;
        }
        
        for (int z = 0; z<y; z++){  //for all sems in the year
            System.out.println("------------------------------------------------------------------------------------------------------------");
            System.out.println("YEAR "+ year + " SEMESTER " + (semNo+1+z));
            System.out.println("------------------------------------------------------------------------------------------------------------");
            int c = 1;
            for (int i = 0; i<sem[semNo+z].length; i++){    //for each modules
                if((sem[semNo+z][i].getLocal() == 0) ||
                        (sem[semNo+z][i].getLocal() == 1 && StudentList[x].getLocal() == true) ||
                        (sem[semNo+z][i].getLocal()== 2 && StudentList[x].getLocal()==false)){

                    System.out.println(String.format("%-3s\t%-10s\t%-50s\t%-10s\t%s",
                            c, 
                            sem[semNo+z][i].getCode(), 
                            sem[semNo+z][i].getName(), 
                            sem[semNo+z][i].getPreReq(), 
                            sem[semNo+z][i].getHours()));

                    c++;
                }
                if(semNo+z == 4 || (semNo+z == 6 && i==4)){
                    break;
                }
            }
        }
        
        System.out.println("Current total credit hours for the semester: " + StudentList[x].getHours()+"/"+Student.hourSemLimit);
        System.out.println("Current total credit hours for the year: " + StudentList[x].getYearHours()+"/"+Student.hourYearLimit);
        
        //List modules [tester]
        for (int j = 0; j<StudentList[x].getMCount(); j++){
            System.out.println(StudentList[x].getModList(j));
        }
        System.out.print("Please key in subject code you wish to register (Exit to return): ");
        String tmpRegister = input.nextLine();
        if(!tmpRegister.equalsIgnoreCase("exit")){
            boolean flag = false, found = false, requirementCheck = true, errorMsg = false;
            int m1=0, m2=0;
            for (int z = 0; z<y; z++){  //for all sems in the year
                for (int i = 0; i<sem[semNo+z].length; i++){    //for each modules
                    if((sem[semNo+z][i].getLocal() == 0) ||     //if module is in their list
                            (sem[semNo+z][i].getLocal() == 1 && StudentList[x].getLocal() == true) ||
                            (sem[semNo+z][i].getLocal()== 2 && StudentList[x].getLocal()==false)){

                        //verifies if subject is in available list and stores location
                        if (sem[semNo+z][i].getCode().equalsIgnoreCase(tmpRegister)){
                            flag = true;
                            m1 = semNo+z;   //finds subject row and column
                            m2 = i;
                            found = true;
                            break;          //break from searching each module
                        }
                    }
                    if(semNo+z == 4 || (semNo+z == 6 && i==4)){ //Psuedo fix
                        break;
                    }
                }
                
                if (found == true){
                    //if student limit for module is not reached
                    if(sem[m1][m2].getStuCount()<Module.stuLimit){
                        //Checks if credit hour exceeded year limit
                        if(StudentList[x].getYearHours()+sem[m1][m2].getHours()<=Student.hourYearLimit){
                            //Checks if credit hour exeeded semester limit
                            if((StudentList[x].getHours()+sem[m1][m2].getHours())<=Student.hourSemLimit){
                                
                                //Checks if subject has not been already completed
                                for (int a = 0; a<StudentList[x].getCModCount(); a++){
                                    if (tmpRegister.equalsIgnoreCase(StudentList[x].getModList(a)) &&   //if subject is already completed
                                            !tmpRegister.equalsIgnoreCase("FYP60207")){                 //Not including fyp1
                                        flag = false;
                                        System.out.println("\n#####Subject has already been completed.#####\n");
                                        errorMsg = true;
                                        break;
                                    }
                                }                                
                                
                                //If subject is not completed
                                if (flag == true){
                                    //Checks if subject has not been already registered
                                    for (int a = 0; a<StudentList[x].getMCount(); a++){
                                        if (tmpRegister.equalsIgnoreCase(StudentList[x].getModList(a))){    //if subject is already registered
                                            flag = false;
                                            System.out.println("\n#####Subject has already been registered.#####\n");
                                            errorMsg = true;
                                            break;
                                        }
                                    }
                                }     
                            }else{
                                System.out.println("\n#####Credit hour limit for the semester has been exceeded!#####\n");
                                flag = false;
                                errorMsg=true;
                            }
                        }else{
                            System.out.println("\n#####Credit hour limit for the year has been exceeded!#####\n");
                            flag = false;
                            errorMsg=true;
                        }

                        //Checks if subject requirements are met
                        if (flag == true&&(!sem[m1][m2].getPreReq().equalsIgnoreCase("None"))){  //If subject has a requirement
                            requirementCheck = false;
                            
                            if(sem[m1][m2].getPreReq().equalsIgnoreCase("**")){ //If subject requires 85% of completion 
                                if(StudentList[x].getCModCount()<((Module.totalModuleYear1+Module.totalModuleYear2)/100*85)){
                                    System.out.println("\n#####Cannot register subject: Have not completed 85% of Year 1 and Year 2 modules.#####");
                                    errorMsg=true;
                                }
                            }else{  //Other requirements
                                for (int b = 0; b<StudentList[x].getMCount(); b++){
                                    if(StudentList[x].getModList(b).equalsIgnoreCase(sem[m1][m2].getPreReq())){
                                        requirementCheck = true;
                                        break;
                                    }
                                }
                            }
                        }
                    }else{
                        System.out.println("\n#####Student limit for subject reached!#####");
                        flag = false;
                        errorMsg=true;
                    }
                    break;  //Break from checking each semester
                }
            }
            if (flag == false || requirementCheck == false){
                if(errorMsg == false){
                    if(flag == false){
                        System.out.println("\n#####Error: Invalid code.#####\n");
                    }else if(requirementCheck == false){
                        System.out.println("\n#####Error: Module requirements not met.#####\n");
                    }
                }
                listModules(x);
            }else{
                //Register Student
                if(tmpRegister.equalsIgnoreCase("FYP60207")){
                    StudentList[x].setFYP(true);
                }
                StudentList[x].setModule(tmpRegister, sem[m1][m2].getHours());
                sem[m1][m2].setStudent(StudentList[x].getID());
                
                System.out.print("\nSuccess! Register another subject? (Y/N): ");
                String YNinput = input.nextLine();
                
                if(YNinput.equalsIgnoreCase("Yes")||YNinput.equalsIgnoreCase("Y")){
                    listModules(x);
                }else{
                    mainMenu();
                }
            }
        }else{
            mainMenu();
        }
    }
    
    public static void displayRegisteredModules(){
        System.out.print("Student ID (Exit to return): ");
        String IDCheck = input.nextLine();
        if (!IDCheck.equalsIgnoreCase("exit")){
            int student = -1;
            for(int i = 0; i<Student.totalStudent; i++){
                if (IDCheck.equalsIgnoreCase(StudentList[i].getID())){
                    student = i;
                    break;
                }
            }
            if (student == -1){
                System.out.println("\nStudent not found.\n");
                mainMenu();
            }else{
                if(StudentList[student].getMCount()<1){
                    System.out.println("\nNo subjects registered!\n");
                    returnMM();
                }else{
                   int curYear = StudentList[student].getYear(), curSem;  //Identifies current year

                   for(int i=0; i<StudentList[student].getMCount(); i++){   //For each subject registered
                       System.out.print((i+1)+".\t");
                       int semPerYear=2;
                       //Sets which semester to scan
                       if(curYear==1){
                           curSem =0;
                       }else if(curYear==2){
                           curSem =2;
                           semPerYear=3;
                       }else{
                           curSem = 5;
                       }
                       
                       boolean fypPrint=false;
                       //For each semester
                        for (int c = 0; c<semPerYear; c++){
                           //Finds subjects based on semester
                            for(int x = 0; x<sem[curSem].length; x++){
                                if(StudentList[student].getModList(i).equalsIgnoreCase(sem[curSem+c][x].getCode())){
                                    if(sem[curSem+c][x].getCode().equalsIgnoreCase("FYP60207")&&fypPrint==false){   //If subject is fyp, prints the right fyp w/o duplicates
                                        if(StudentList[x].getFYP()==true){
                                            System.out.println(sem[6][0].getName());
                                        }else{
                                            System.out.println(sem[5][0].getName());
                                        }
                                    }else{                                                                          //If subject is not fyp
                                        System.out.println(sem[curSem+c][x].getName());
                                        break;
                                    }
                                }
                                if(curSem+c == 4 || (curSem+c == 6 && x==4)){ //Psuedo fix
                                    break;
                                }
                            } 
                        }
                   }
                   returnMM();
                }
            }
        }else{
            mainMenu();
        }
    }
    public static void displayCompletedModules(){
        System.out.print("Student ID (Exit to return): ");
        String IDCheck = input.nextLine();
        if (!IDCheck.equalsIgnoreCase("exit")){
            int student = -1;
            for(int i = 0; i<Student.totalStudent; i++){
                if (IDCheck.equalsIgnoreCase(StudentList[i].getID())){
                    student = i;
                    break;
                }
            }
            if (student == -1){
                System.out.println("\nStudent not found.\n");
                mainMenu();
            }else{
                if(StudentList[student].getCModCount()<1){
                    System.out.println("\nNo subjects completed!\n");
                }else{
                    int count = 1;
                    for(int sub=0; sub<StudentList[student].getCModCount(); sub++){
                        boolean printed = false;
                        for(int m1 = 0; m1<sem.length && printed == false;m1++){
                            for(int m2 = 0; m2<sem[0].length && printed == false; m2++){
                                if((StudentList[student].getCModList(sub).equalsIgnoreCase(sem[m1][m2].getCode()))){
                                    if(!(m1==6 && m2==0)){
                                       System.out.println(count+". "+sem[m1][m2].getName());
                                       count++;
                                       printed = true;   
                                    }
                                }
                                if(m1 == 4 || (m1 == 6 && m2==4)){ //Psuedo fix
                                            break;
                                        }
                            }
                        }
                    }
                }
                returnMM();
            }
        }else{
            mainMenu();
        }
    }
    
    public static void displayRegisteredStudents(){
        System.out.println("Module ID (Exit to return): ");
        String IDCheck = input.nextLine();
        
        if(IDCheck.equalsIgnoreCase("exit")){
            mainMenu();
        }else{
            boolean found = false;
            int m1=-1,m2=-1;
            
            //Find Module
            for(int semester = 0; semester<sem.length; semester++){
                for(int subject = 0; subject<sem[0].length; subject++){
                    if(IDCheck.equalsIgnoreCase(sem[semester][subject].getCode())){
                        m1 = semester;
                        m2 = subject;
                        found = true;
                        break;
                    }
                    if(semester == 4 || (semester == 6 && subject==4)){ //Psuedo fix
                        break;
                    }
                }
                if (found ==true){
                    break;
                }
            }
            if (found == false){
                System.out.println("\nInvalid code.\n");
                mainMenu();
            }else{
                String name = "ERROR";
                if (m1==5 && m2==0){                //fyp modules
                    if(sem[m1][m2].getStuCount()>0 || sem[m1+1][m2].getStuCount()>0){
                        System.out.println(sem[m1][m2].getName());
                        for(int i = 0; i<sem[m1][m2].getStuCount(); i++){
                            //get student name based on ID
                            for (int c = 0; c<Student.totalStudent; c++){
                                if(sem[m1][m2].getStudent(i).equalsIgnoreCase(StudentList[c].getID())){
                                    name = StudentList[c].getName();
                                    break;
                                }
                            }
                            System.out.println((i+1)+". "+name+" - "+sem[m1][m2].getStudent(i));
                        }
                        m1++;
                        System.out.println(sem[m1][m2].getName());
                        for(int i = 0; i<sem[m1][m2].getStuCount(); i++){
                            //get student name based on ID
                            for (int c = 0; c<Student.totalStudent; c++){
                                if(sem[m1][m2].getStudent(i).equalsIgnoreCase(StudentList[c].getID())){
                                    name = StudentList[c].getName();
                                    break;
                                }
                            }
                            System.out.println((i+1)+". "+name+" - "+sem[m1][m2].getStudent(i));
                        }
                    }else{
                        System.out.println("\nNo students registered.\n");
                    }
                }else if (sem[m1][m2].getStuCount()>0){   //non-fyp modules
                    for(int i = 0; i<sem[m1][m2].getStuCount(); i++){
                        //get student name based on ID
                        for (int c = 0; c<Student.totalStudent; c++){
                            if(sem[m1][m2].getStudent(i).equalsIgnoreCase(StudentList[c].getID())){
                                name = StudentList[c].getName();
                                break;
                            }
                        }
                        System.out.println((i+1)+". "+name+" - "+sem[m1][m2].getStudent(i));
                    }
                }else{
                    System.out.println("\nNo students registered.\n");
                }
            }
            returnMM();
        }
    }
    
    public static void displayStudentComplete(){
        boolean flag = false;
        
        //checks if all student have not registered
        for (int i = 0; i<Student.totalStudent; i++){
            if(StudentList[i].getMCount()!=0){
                flag = true;
            }
        }
        
        //If NO students have registered a module
        if(flag == false){
            System.out.println("No student with any registered module found.");
            returnMM();
        }else{  //If at least one student have NOT registered a module
            System.out.println("No\tStudent Name\t\tStudent ID");
            System.out.println("-------------------------------------------------");
            int numb=1;
            for(int i=0; i<Student.totalStudent; i++){
                if(StudentList[i].getMCount()!=0){
                    System.out.println((numb)+".\t" + StudentList[i].getName() +"\t\t"+ StudentList[i].getID());
                    numb++;
                }
            }
            returnMM();
        }   
    }
    
    public static void displayStudentPending(){
         boolean flag = false;
        
        //checks if all student have not registered
        for (int i = 0; i<Student.totalStudent; i++){
            if(StudentList[i].getMCount()==0){
                flag = true;
            }
        }
        
        //If ALL students have registered a module
        if(flag == false){
            System.out.println("All students have completed at least one module registration!");
            returnMM();
        }else{  //If at least one student have registered a module
            System.out.println(String.format("%3s\t%-25s\t%-10s","No","Student Name","Student ID"));
            System.out.println("-------------------------------------------------");
            int numb=1;
            for(int i=0; i<Student.totalStudent; i++){
                if(StudentList[i].getMCount()==0){
                    System.out.println(String.format("%3s.\t%-25s\t%-10s",(numb), StudentList[i].getName(), StudentList[i].getID()));
                    //System.out.println((numb)+".\t" + StudentList[i].getName() +" \t\t"+ StudentList[i].getID());
                    numb++;
                }
            }
            returnMM();
        }
    }
    
    public static void flushModules(){
        System.out.print("Student ID (Exit to return): ");
        String IDCheck = input.nextLine();
        if (!IDCheck.equalsIgnoreCase("exit")){
            int student = -1;
            for(int i = 0; i<Student.totalStudent; i++){
                if (IDCheck.equalsIgnoreCase(StudentList[i].getID())){
                    student = i;
                    break;
                }
            }
            if (student == -1){
                System.out.println("\nStudent not found.\n");
                mainMenu();
            }else{
                boolean done = false;
                for (int i=0; i<StudentList[student].getMCount(); i++){
                    for (int m1 = 0; m1<sem.length && done == false; m1++){
                        for(int m2 = 0; m2<sem[0].length;m2++){
                            if (sem[m1][m2].getCode().equalsIgnoreCase(StudentList[student].getModList(i))){
                                sem[m1][m2].removeStudent(StudentList[student].getID());
                                done = true;
                            }
                            if(m1 == 4 || (m1 == 6 && m2==4)){ //Psuedo fix
                                break;
                            }
                        }
                    }
                }
                StudentList[student].nextSem(student);
                returnMM();
            }
        }else{
            mainMenu();
        }
    }
    
    public static void dropModule(){
        System.out.print("Student ID (Exit to return): ");
        String IDCheck = input.nextLine();
        if (!IDCheck.equalsIgnoreCase("exit")){
            int student = -1;
            for(int i = 0; i<Student.totalStudent; i++){
                if (IDCheck.equalsIgnoreCase(StudentList[i].getID())){
                    student = i;
                    break;
                }
            }
            if (student == -1){
                System.out.println("\nStudent not found.\n");
                mainMenu();
            }else{
                if(StudentList[student].getMCount()<1){
                    System.out.println("No modules to drop.");
                    returnMM();
                }else{
                    String tmpID;
                    boolean registered = false, dropped = false;
                    do{
                        System.out.print("Key in Module ID you wish to drop (Exit to return): ");
                        tmpID = input.nextLine();
                        for(int i = 0; i<StudentList[student].getMCount()&&dropped == false; i++){  //for each registered module
                            if(StudentList[student].getModList(i).equalsIgnoreCase(tmpID)){        //if module is registered
                                for(int m1 = 0; m1<sem.length; m1++){                               //find the module details
                                    for(int m2 = 0; m2<sem[0].length; m2++){
                                        if(tmpID.equalsIgnoreCase(sem[m1][m2].getCode())){
                                            int credit = sem[m1][m2].getHours();
                                            sem[m1][m2].removeStudent(StudentList[student].getID());
                                            StudentList[student].dropModule(i, credit);
                                            dropped = true;
                                            System.out.println("Drop successful.");
                                            tmpID = "exit";
                                            break;
                                        }
                                        if(m1 == 4 || (m1 == 6 && m2==4)){ //Psuedo fix
                                            break;
                                        }
                                    }
                                }
                                registered = true;
                                break;
                            }
                        }
                        
                        if(registered == false){
                            System.out.println("Invalid input");
                        }else{
                            
                        }
                    }while(!tmpID.equalsIgnoreCase("exit"));
                    
                    returnMM();
                }
            }
        }else{
            mainMenu();
        }
    }
    
    public static void returnMM(){
        System.out.print("\nReturn to main menu? (Y/N): ");
        String YNCheck = input.nextLine();
        if(YNCheck.equalsIgnoreCase("YES")||(YNCheck.equalsIgnoreCase("Y"))){
            System.out.println("");
            mainMenu();
        }else{
            System.out.println("\nEnd of program.");
        }
    }
}
