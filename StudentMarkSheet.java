public class StudentMarkSheet {
//Calculate Total marks
// Method created with Parameters
    public static void calculatemarks(int subject1,int subject2,int subject3){
        System.out.println("Total Marks"+(subject1+subject2+subject3));

    }
    public static void main(String[]args){

        //Marks declaration
        calculatemarks(23,45,76);
        calculatemarks(45,65,78);
        calculatemarks(56,80,65);

    }
    //Calculate percentage
    public static void calculatePercentage(int subject1,int subject2,int subject3 ){
        System.out.println("Total Percentage "+( subject1+subject2+subject3));

    }
}
