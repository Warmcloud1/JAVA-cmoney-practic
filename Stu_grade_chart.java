import java.util.*;

class Stu implements Comparable<Stu>{
    int number,grade;
    
    Stu(int number,int grade){
        this.number=number;
        this.grade=grade;
    }
    
    public int get_N(){
        return number;
    }
    
    public int get_G(){
        return grade;
    }
    
    @Override
    public String toString(){
        return String.format("%d.%d\n",number,grade);
    }
    
    @Override
    public int compareTo(Stu st){
        return this.grade-st.grade;
    }
}


public class Stu_grade_chart {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=1,grade,sort_by,move;
        List<Stu> students=new ArrayList<Stu>();
        while(true){
            grade=sc.nextInt();
            if(grade!=-1)
                students.add(new Stu(number++,grade));
            else
                break;
        }
        
        sort_by=sc.nextInt();
        Collections.sort(students);
        
        switch(sort_by){
            case 1 :                   
                students.forEach((s) -> {
                    System.out.format("%d.%d\n",s.get_N(),s.get_G());
                });
                break;
            
            case 2 :      
                Collections.reverse(students);
                for(int i=0;i<students.size();i++){ 
                    Stu tmp1=students.get(i);
                    move=0;
                    for(int j=students.size()-1;j>i;j--){   
                        Stu tmp2=students.get(j);
                        if(tmp1.get_G()==tmp2.get_G()){
                            move+=1;
                            System.out.format("%d.%d\n",tmp2.get_N(),tmp2.get_G());
                        }                        
                    }    
                    System.out.format("%d.%d\n",tmp1.get_N(),tmp1.get_G());
                    i+=move;
                }
                break;        
        }            
    }
}
