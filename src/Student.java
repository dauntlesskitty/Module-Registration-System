/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NicholasTkr
 */
public class Student {
        private String name;    //Student Name
        private String ID;      //Student ID
        private int sem;        //Current Semester
        private int year;       //Current Year
        private boolean local;  //Local Student check
        private String[] modList = new String[10];  //Current modules list
        private int mCount;             //to current modules
        private int hoursSemCount;      //total hours for the sem
        private int hoursYearCount;     //Total hours for the year
        static int hourSemLimit=20;     //Total hour limit for the sem
        static int hourYearLimit=50;    //Total hour limit for the year
        private String[] comModList = new String[50];   //Completed modules list
        private int cModCount;          //Total completed modules
        static int totalStudent;        //Total students in system
        private boolean fyp1 = false;   //FYP part 1
        
       public Student(){
           name = "";
           ID = "";
           year = 0;
           sem = 0;
           local = true;
           totalStudent++;
       } 
        
        public Student(String name, String ID, int sem, int year, boolean local){
            this.name = name;
            this.ID = ID;
            this.sem = sem;
            this.year = year;
            this.local = local;
            totalStudent++;
        }
        
        public String getName(){
            return name;
        }
        public String getID(){
            return ID;
        }
        public int getSem(){
            return sem;
        }
        public int getYear(){
            return year;
        }
        public boolean getLocal(){
            return local;
        }
        public int getMCount(){
            return mCount;
        }
        public int getCModCount(){
            return cModCount;
        }
        public int getHours(){
            return hoursSemCount;
        }
        public int getYearHours(){
            return hoursYearCount;
        }
        public String getModList(int x){
            return modList[x];
        }
        public String getCModList(int x){
            return comModList[x];
        }
        public boolean getFYP(){
            return fyp1;
        }
        public void setFYP(boolean fyp1){
             this.fyp1= fyp1;
        }
        public void setModule(String module, int credit){
            modList[mCount]=module;
            mCount++;
            hoursSemCount+= credit;
            hoursYearCount+= credit;
        }
        public void dropModule(int module, int credit){
            for (int i = module; i<mCount; i++){
                if(module == mCount){
                    modList[module]="";
                }else{
                    modList[module]=modList[module+1];
                }
            }
            mCount--;
            hoursSemCount-= credit;
            hoursYearCount-= credit;
        }
        public void nextSem(int student){
            if(sem==2||sem==5||sem==7){
                    hoursYearCount =0;
                }
            hoursSemCount = 0;
            
            for(int i=0; i<mCount; i++){
                comModList[cModCount]= modList[i];
                cModCount++;
                modList[i] = "";
            }
            
            mCount = 0;
            sem++;
            
            if (sem < 3){
                year = 1;
            }else if (sem<6){
                year = 2;
            }else{
                year = 3;
            }
            System.out.println("Module flush complete.");
        }
        
        @Override
        public String toString(){
        return "\nStudent Name: " + name
              +"\nStudent ID: " + ID
              +"\nSemester: " + sem
              +"\nYear: " + year
              +"\nLocal: "+ local;
    }
}
