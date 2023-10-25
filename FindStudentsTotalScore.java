import java.util.Scanner;

public class FindStudentsTotalScore{
    public static void main(String[] args) throws Exception {
        Student student = new Student();
        System.out.print("Input your name : ");
        Scanner scanner = new Scanner(System.in);
        String studentName = scanner.nextLine();
        student.setStudentName(studentName);
        System.out.print("Input your ID : ");
        int studentID = scanner.nextInt();
        student.setStudentID(studentID);
        System.out.print("Input your English score : ");
        double english = scanner.nextDouble();
        student.setEnglish(english);
        System.out.print("Input your Maths score : ");
        double maths = scanner.nextDouble();
        student.setMaths(maths);

        SOL_Student sol_Student = new SOL_Student();
        SOCIE_Student socie_Student = new SOCIE_Student();

        boolean isRunning = true;

        int department = -1;
        while (isRunning) {
            System.out.print("\n1 - for SOL\n2 - for SOCIE\nChoose your department  : ");
            department = scanner.nextInt();

            if (department == 1) {
                System.out.print("Input your Intro To Economics score : ");
                double intro_to_Eco = scanner.nextDouble();
                sol_Student.setIntro_to_Eco(intro_to_Eco);
                System.out.print("Input your Computer Programming score : ");
                double computerProgramming = scanner.nextDouble();
                sol_Student.setComputerProgramming(computerProgramming);
                sol_Student.setEnglish(student.getEnglish());
                sol_Student.setMaths(student.getMaths());
                break;
            } else if (department == 2) {
                System.out.print("Input your OOP1 score : ");
                double oop1 = scanner.nextDouble();
                socie_Student.setOOP1(oop1);
                System.out.print("Input your Intro To IT score : ");
                double intro_to_IT = scanner.nextDouble();
                socie_Student.setIntro_to_IT(intro_to_IT);
                socie_Student.setEnglish(student.getEnglish());
                socie_Student.setMaths(student.getMaths());
                break;
            } else {
                System.out.println("Wrong input!");
            }
        }

        System.out.println("\nStudent Name : " + student.getStudentName());
        System.out.println("Student ID : " + student.getStudentID());
        System.out.println("English Score : " + student.getEnglish());
        System.out.println("Maths Score : " + student.getMaths());
        if (department == 1) {
            System.out.println("Intro To Economics Score : " + sol_Student.getIntro_to_Eco());
            System.out.println("Computer Programming Score : " + sol_Student.getComputerProgramming());
            System.out.println("Total Score : " + sol_Student.total_Score());
        } else if (department == 2) {
            System.out.println("OOP1 Score : " + socie_Student.getOOP1());
            System.out.println("Intro To IT Score : " + socie_Student.getIntro_to_IT());
            System.out.println("Total Score : " + socie_Student.total_Score());
        }
        scanner.close();
    }
}

class Student {
    private String studentName;
    private int studentID;
    private double english;
    private double maths;

    public Student() {
    }

    public Student(String studentName, int studentID, double english, double maths) {
        this.studentName = studentName;
        this.studentID = studentID;
        this.english = english;
        this.maths = maths;
    }

    public String getStudentName() {
        return this.studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentID() {
        return this.studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public double getEnglish() {
        return this.english;
    }

    public void setEnglish(double english) {
        this.english = english;
    }

    public double getMaths() {
        return maths;
    }

    public void setMaths(double maths) {
        this.maths = maths;
    }

    public double total_Score() {
        return this.english + this.maths;
    }
}

class SOL_Student extends Student {
    private double intro_to_Eco;
    private double computerProgramming;

    public SOL_Student() {
        intro_to_Eco = 0;
        computerProgramming = 0;
    }

    public SOL_Student(String studentName, int studentID, double english, double maths, double computerProgramming,
            double intro_to_Eco) {
        super(studentName, studentID, english, maths);
        this.intro_to_Eco = intro_to_Eco;
        this.computerProgramming = computerProgramming;
    }

    public double getComputerProgramming() {
        return this.computerProgramming;
    }

    public void setComputerProgramming(double computerProgramming) {
        this.computerProgramming = computerProgramming;
    }

    public double getIntro_to_Eco() {
        return this.intro_to_Eco;
    }

    public void setIntro_to_Eco(double intro_to_Eco) {
        this.intro_to_Eco = intro_to_Eco;
    }

    @Override
    public double total_Score() {
        return super.total_Score() + this.getIntro_to_Eco() + this.getComputerProgramming();
    }
}

class SOCIE_Student extends Student {
    private double oop1;
    private double intro_to_IT;

    public SOCIE_Student() {
    }

    public SOCIE_Student(String studentName, int studentID, double english, double maths, double oop1,
            double intro_to_IT) {
        super(studentName, studentID, english, maths);
        this.oop1 = oop1;
        this.intro_to_IT = intro_to_IT;
    }

    public double getOOP1() {
        return this.oop1;
    }

    public void setOOP1(double oop1) {
        this.oop1 = oop1;
    }

    public double getIntro_to_IT() {
        return this.intro_to_IT;
    }

    public void setIntro_to_IT(double intro_to_IT) {
        this.intro_to_IT = intro_to_IT;
    }

    @Override
    public double total_Score() {
        return super.total_Score() + this.getOOP1() + this.getIntro_to_IT();
    }
}
