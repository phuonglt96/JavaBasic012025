package Bai1_Static;

public class TestCases {

    public void testAddNewProject(){
        System.out.println(DataConstants.brower);
    }

    public static void testLoginSuccess(){
        System.out.println("Open browser " + DataConstants.brower);
        System.out.println("Navigate to url " + DataConstants.url);
        System.out.println("Enter your username and password...");
        System.out.println("Click login button");
        System.out.println("Verify...");
    }

    public static void testAddNewCustomer(){
        testLoginSuccess();
        System.out.println("Open browser Chrome");
        System.out.println("Click button Add New Customer");
        System.out.println("Input data on form add new customer");
        System.out.println("Click Save button");
        System.out.println("Verify...");
    }

    public static void testAddNewTask(){
        testLoginSuccess();
        //Không thể gọi biến hoặc hàm
        System.out.println("Input data on form add new task");
        DataConstants.clickElement("Button Save Task");
        System.out.println("Verify...");
    }

    public static void main(String[] args) {
        TestCases testCase = new TestCases();
        testCase.testAddNewProject();

        testLoginSuccess();
        System.out.println("===============");
        testAddNewCustomer();
        System.out.println(DataConstants.brower);

        System.out.println("===============");
        testAddNewTask();

        System.out.println("===============");
        KhoiStatic.getInfo();

    }
}
