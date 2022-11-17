package aaa;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;



public class Reserveticket implements ReserveMovie{

    int row, col, selectNum;
    Scanner scan = new Scanner(System.in);
//    String[][] seat = new String[5][5];
    CinemaPersonalInfo cpi = new CinemaPersonalInfo();


//    public void start() throws InterruptedException, IOException {
////        System.out.println("---------------------------------");
////        System.out.println("|     MOVIE RESERVATION SYSTEM   |");
////        System.out.println("|                                |");
////        System.out.println("---------------------------------");
//        resetSeat();
////        controller();
////        selectNum();
////        select();
//        reserveTicket();
////      controller();
////      selectNum();
////      select();			
//    }
    public void resetSeat(String[][] seat) {
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){               
            	   seat[i][j] = "___";               
            }
        }
    }
    public void resetSeat2(String[][] seat) {
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
               if(!(seat[i][j].equals(("___")))) {
            	   seat[i][j]="reserved";            	   
               }else {
            	   seat[i][j] = "___";            	               	   
               }
            }
        }
    }
//    public void controller(){
//        System.out.println("\n1.�¼����� | 2.���� Ȯ��  | 3.�α������� ���ư���  | 4.����  | 5.���� ���");
//        System.out.print("��ȣ �Է�>>\r\n");
//    }
    public void selectNum(){
        while(true){
            while(true){
                try{
                    selectNum=scan.nextInt();
                    break;
                }
                catch(InputMismatchException e){
                    e.printStackTrace();
                    scan = new Scanner(System.in);
                    System.out.println("�߸��Է��ϼ̽��ϴ�. ���ڸ� �Է��ϼ���");
//                    controller();
                }
            }
            if( !(this.selectNum >= 6) && !(this.selectNum<=0)){
                break;

            } else{
                System.out.println("�߸��Է��ϼ̽��ϴ�. 1������ 5�������� ���ڸ� �Է��ϼ���.");
//                controller();
            }
        }
    }
//    public void select() throws InterruptedException, IOException {
//        switch(selectNum){
//            case 1:
//            	reserveTicket();
//                controller();
//                selectNum();
//                select();
//                break;
//            case 2:                
//                checkSeat();
//                controller();
//                selectNum();
//                select();
//                break;
//            case 3:
//                LogIn login = new LogIn();
//        		login.logIn();
//				break;
//            case 4:
//            	close();
//                break;            	
//            case 5:                
//                cinemaCancel();
//                controller();
//                selectNum();
//                select();
//                break;
//            default:
//        }
//   
//    }

    public String[][] reserveTicket(String[][] seat) throws IOException, InterruptedException {
        while(true) {
            while (true) {
                try {
                    System.out.println("���� �Է��ϼ���(max:5)");
                    row = scan.nextInt();
                } catch (InputMismatchException | ArrayIndexOutOfBoundsException e) {
                    e.printStackTrace();
                    scan = new Scanner(System.in);
                    System.out.println("�ִ� 5���� �Է��Ͻñ� �ٶ��ϴ�.");
                }
                if ((this.row <= 5 && this.row > 0)) {
                    break;
                } else {
                    System.out.println("����: ��� ���� �ִ� 5�����Դϴ�.");
                }
            }
            while (true) {
                try {
                    System.out.println("���� �Է��ϼ���(max:5)");
                    col = scan.nextInt();
                } catch (InputMismatchException | ArrayIndexOutOfBoundsException f) {
                    f.printStackTrace();
                    scan = new Scanner(System.in);
                    System.out.println("�ִ� 5���� �Է��Ͻñ� �ٶ��ϴ�.");
                }
                if ((this.col <= 5 && this.col > 0)) {
                    break;
                } else {
                    System.out.println("����: ��� ���� �ִ� 5�����Դϴ�.");
                }
            }
            if ((seat[row - 1][col - 1]).equals("___")) {
                //            seat[row-1][col-1] = pi.getUserID();
                seat[row - 1][col - 1] = "reserved";
                setReservationNumber();
                System.out.println("Reservation Number: " + cpi.getReservationNumber() + "\r\n" + (row) + "��" + (col) + "�� �¼��� ����Ǿ����ϴ�.");
                cinemaPrint();
                break;
            } else {
                System.out.println("�̹� ����� �¼��Դϴ�");
                checkSeat(seat);
            }
            
        }
        return seat;
    }
    @Override
    public void checkSeat(String[][] seat) throws InterruptedException, IOException {
        char row = 'A';
        for(int i=0; i<5; i++){
            System.out.print(row +" Line: ");row++;
            for(int j=0; j<5; j++){            	
                String seat2 = (seat[i][j].equals("___"))? "X": "O";
                System.out.print((j+1)+seat2 +"  ");
            }
            System.out.print(System.lineSeparator());
        }
        TimeUnit.SECONDS.sleep(2);
    }
    public void cinemaCancel(String[][] seat) {
        while(true){
            try{
                System.out.println("���� ��ȣ�� �Է��ϼ���.");
                cpi.setReservationNumber(scan.nextInt());
                seat[row-1][col-1] = "___";
                System.out.print(System.lineSeparator());
                System.out.println("���Ű� ��ҵǾ����ϴ�.");
            } catch (InputMismatchException e){
                scan = new Scanner(System.in);
                System.out.println("���� ���Ź�ȣ�Դϴ�. �ٽ� �Է����ּ���.");
            }
            if(!(cpi.getReservationNumber()<100000 | cpi.getReservationNumber()>=1000000)){
                break;
            } else{
                System.out.println("���� ���Ź�ȣ�Դϴ�. �ٽ� �Է����ּ���(6�ڸ�).");
            }
        }

    }
    public void cinemaPrint() throws IOException, InterruptedException {
        System.out.println("���೻���� ����Ͻ÷��� yes�� �Է��ϼ���");
        String printCheck = scan.next();
        if (printCheck.equals("yes")) {
            LocalDateTime curDateTime = LocalDateTime.now();
            LocalDate now = LocalDate.now();
            File file = new File("C:/Users/user/Desktop/" + cpi.getUserID() + cpi.getReservationNumber() + "cinemaPrint.txt");
            FileWriter fw = new FileWriter(file, true);
            fw.write("=================================================\r\n");
            fw.write("<Movie Ticket >\r\n");
            fw.write(" Moive : " + "XXX" + "\r\n");
            fw.write(" ID : " + cpi.getUserID() + "\r\n");
            fw.write(" PW : " + cpi.getUserPW() + "\r\n");
            fw.write(" Reservation Number : " + cpi.getReservationNumber() + "\r\n");
            fw.write(" Seat : " + (row) + "��" + (col) + "��" + "\r\n");
            fw.write("=================================================\r\n");
            fw.flush();
            fw.close();
            System.out.println(System.lineSeparator() + "������ ����Ǿ����ϴ�@@");

        }
    }
    public void setReservationNumber() {
        cpi.setReservationNumber((int) (Math.random() * 899999) + 100000);
    }
    public void cinemaQuit() {
    }
	@Override
	public void logIn() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void selectMovie() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void cancleTicket(String[][] seat) {
		// TODO Auto-generated method stub
		
	}
	
	
		
	
	@Override
	public void close() {
		System.out.println("�ý����� �����մϴ�.");
		 System.exit(0);
	}
}
