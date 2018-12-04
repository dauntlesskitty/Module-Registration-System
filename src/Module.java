/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NicholasTkr
 */
public class Module {
    private String code;
    private String name;
    private int hours;
    private String preReq;
    private String stuList[] = new String[60];
    private int stuCount;
    static int stuLimit = 60;
    private int local; //0-Both; 1-Local Only; 2-International Only
    static int totalModuleYear1 = 10;
    static int totalModuleYear2 = 11;
    static int totalModuleYear3 = 11;
    
    public Module(){}
    
    public Module(String code, String name, String preReq, int hours, int local){
        this.code = code;
        this.name = name;
        this.preReq = preReq;
        this.hours = hours;
        this.local = local; 
    }
    
    public String getCode(){
        return code;
    }
    public String getName(){
        return name;
    }
    public int getHours(){
        return hours;
    }
    public String getPreReq(){
        return preReq;
    }
    public int getLocal(){
        return local;
    }
    public int getStuCount(){
        return stuCount;
    }
    public String getStudent(int x){
        return stuList[x];
    }
    public void setStudent(String student){
        stuList[stuCount]=student;
        stuCount++;
    }
    public void removeStudent(String student){
        for(int i = 0; i<stuCount; i++){
            if (student.equalsIgnoreCase(stuList[i])){
                if(i == stuCount){
                    stuList[i]="";
                }else{
                    stuList[i]= stuList[i+1];
                }
                stuCount--;
            }
        }
    }
    @Override
    public String toString(){
        return "\nCode: " + code
              +"\nModule Title: " + name
              +"\nPre-requisites: " + preReq
              +"\nCredit Hours: " + hours;
    }
}
