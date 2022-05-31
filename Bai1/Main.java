package Bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ManageOfficer ManageOfficer = new ManageOfficer();

        while(true){
            System.out.println("Application Management Officer");
            System.out.println("Enter 1: To insert officer");
            System.out.println("Enter 2: To search officer by name");
            System.out.println("Enter 3: To show information officers");
            System.out.println("Enter 4: To exit");
            String line = scanner.nextLine();
            switch(line){
                case "1":{
                    System.out.println("Enter a: To insert Engineer");
                    System.out.println("Enter b: To insert Worker");
                    System.out.println("Enter c: To insert Staff");
                    String type = scanner.nextLine();
                    switch(type){
                        case "a":{
                            System.out.print("Enter name: ");
                            String name = scanner.nextLine();
                            System.out.print("Enter age: ");
                            int age = scanner.nextInt();
                            System.out.print("Enter gender: ");
                            scanner.nextLine();
                            String gender = scanner.nextLine();
                            System.out.print("Enter address: ");
                            String address = scanner.nextLine();
                            System.out.print("Enter branch: ");
                            String branch = scanner.nextLine();
                            Officer engineer = new Engineer(name, age, gender, address, branch);
                            ManageOfficer.addOfficer(engineer);
                            System.out.println(engineer.toString());
                            break;
                        }
                        case "b":{
                            System.out.print("Enter name: ");
                            String name = scanner.nextLine();
                            System.out.print("Enter age: ");
                            int age = scanner.nextInt();
                            System.out.print("Enter gender: ");
                            scanner.nextLine();
                            String gender = scanner.nextLine();
                            System.out.print("Enter address: ");
                            String address = scanner.nextLine();
                            System.out.print("Enter level: ");
                            int level = scanner.nextInt();
                            Officer worker = new Worker(name, age, gender, address, level);
                            ManageOfficer.addOfficer(worker);
                            System.out.println(worker.toString());
                            scanner.nextLine();
                            break;
                        }
                        case "c":{
                            System.out.print("Enter name: ");
                            String name = scanner.nextLine();
                            System.out.print("Enter age: ");
                            int age = scanner.nextInt();
                            System.out.print("Enter gender: ");
                            scanner.nextLine();
                            //scanner.next();
                            String gender = scanner.nextLine();
                            //scanner.nextLine();
                            System.out.print("Enter address: ");
                            String address = scanner.nextLine();
                            System.out.print("Enter task: ");
                            String task = scanner.nextLine();
                            Officer staff = new Staff(name, age, gender, address, task);
                            ManageOfficer.addOfficer(staff);
                            System.out.println(staff.toString());
                            break;
                        }
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    scanner.close();
                    break;
                }
                case "2":{
                    System.out.print("Enter name to search: ");
                    String name = scanner.nextLine();
                    ManageOfficer.searchOfficerByName(name).forEach(officer->{
                        System.out.println(officer.toString());
                    });
                    scanner.close();
                    break;
                }
                case "3":{
                    ManageOfficer.showListInforOfficer();
                    break;
                }
                case "4":{
                    return;
                }
                default:
                    System.out.println("Invalid");
                    continue;
            }


        }   
    }

}
