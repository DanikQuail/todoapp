package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("                                                         \n" +
                ",--------.         ,--.           ,--.,--.        ,--.   \n" +
                "'--.  .--',---.  ,-|  | ,---.     |  |`--' ,---.,-'  '-. \n" +
                "   |  |  | .-. |' .-. || .-. |    |  |,--.(  .-''-.  .-' \n" +
                "   |  |  ' '-' '\\ `-' |' '-' '    |  ||  |.-'  `) |  |   \n" +
                "   `--'   `---'  `---'  `---'     `--'`--'`----'  `--'   \n" +
                "                                                        ");
        System.out.println("-------------------------------------------------------------------------");
        int numberoftasks = 0;
        System.out.println("You can add up to 10 tasks");
        String [] tasks = new String[10];
        while (true) {
            System.out.println("You have" + " " + numberoftasks + " " + "/ 10 tasks");
            for (int a = 0; a < numberoftasks; a++){
                System.out.println("#" + (a+1)+ " - " + tasks [a] );
            }
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("1) Manage tasks");
            System.out.println("2) Exit app");
            System.out.println("-------------------------------------------------------------------------");
            int select = 0;
            select = sc.nextInt();
            if (select == 2){
                return;
            }
            if (select >= 3){
                System.out.println("Invalid action, enter valid option");
            }



            if (select == 1){
                if (numberoftasks >= 10){
                    System.out.println("-------------------------------------------------------------------------");
                    System.out.println("You currently have 10 tasks, edit or delete the task to create a new one");
                    System.out.println("-------------------------------------------------------------------------");
                    System.out.println("1) Edit a task");
                    System.out.println("2) Delete a task");
                    System.out.println("3) Return to main menu");
                    System.out.println("-------------------------------------------------------------------------");
                    select = sc.nextInt();
                    if (select == 1)  {
                        for (int a = 0; a < numberoftasks; a++) {
                            System.out.println("#" + (a+1) + " - " + tasks[a]);
                        }
                        System.out.println("Which task you want to change ?");
                        int aha = sc.nextInt();
                        int finalchangenumber = (aha - 1);
                        sc.nextLine();
                        if (finalchangenumber < numberoftasks){
                            System.out.println("Enter new name for task #" + aha + " " + tasks[finalchangenumber]);
                            String updatedtask = sc.nextLine();
                            tasks[finalchangenumber] = updatedtask;
                        }
                        System.out.println("-------------------------------------------------------------------------");
                    }

                    if (select == 2)  {
                        for (int a = 0; a < numberoftasks; a++) {
                            System.out.println("#" + (a+1) + " - " + tasks[a]);
                        }
                        System.out.println("Which task do you want to delete ?");
                        int aha = sc.nextInt();
                        int deletetask = (aha - 1);
                        sc.nextLine();
                        if(deletetask < numberoftasks){
                            System.out.println("Deleting task #" + aha + " " + tasks[deletetask]);
                            for (int a = deletetask; a < numberoftasks - 1; a++) {
                                tasks[a] = tasks[a+1];
                                numberoftasks--;
                            }
                            System.out.println("-------------------------------------------------------------------------");
                        }
                    }
                    if (select == 3)  {
                        System.out.println("Returning to the main menu");
                        System.out.println("-------------------------------------------------------------------------");
                    }
                    if (select >= 4){
                        System.out.println("Invalid action, enter valid option");
                    }

                }
                    }else
                System.out.println("-------------------------------------------------------------------------");
                System.out.println("1) Create a new task");
                System.out.println("2) Edit a task");
                System.out.println("3) Delete a task");
                System.out.println("4) Return to main menu");
                System.out.println("-------------------------------------------------------------------------");
                select = sc.nextInt();
                if (select == 1)  {
                        System.out.println("Enter name of the task");
                    sc.nextLine();
                    String newtask = sc.nextLine();
                    tasks[numberoftasks] = newtask;

                    numberoftasks++;
                    System.out.println("-------------------------------------------------------------------------");
                }

                if (select == 2)  {
                    for (int a = 0; a < numberoftasks; a++) {
                        System.out.println("#" + (a+1) + " - " + tasks[a]);
                    }
                    System.out.println("Which task you want to change ?");
                    int aha = sc.nextInt();
                    int finalchangenumber = (aha - 1);
                    sc.nextLine();
                    if (finalchangenumber < numberoftasks){
                        System.out.println("Enter new name for task #" + aha + " " + tasks[finalchangenumber]);
                        String updatedtask = sc.nextLine();
                        tasks[finalchangenumber] = updatedtask;
                    }
                    System.out.println("-------------------------------------------------------------------------");
                }
                if (select == 3)  {
                    for (int a = 0; a < numberoftasks; a++) {
                        System.out.println("#" + (a+1) + " - " + tasks[a]);
                    }
                    System.out.println("Which task do you want to delete ?");
                    int aha = sc.nextInt();
                    int deletetask = (aha - 1);
                    sc.nextLine();
                    if(deletetask < numberoftasks){
                        System.out.println("Deleting task #" + aha + " " + tasks[deletetask]);
                        for (int a = deletetask; a < numberoftasks - 1; a++) {
                            tasks[a] = tasks[a+1];
                            numberoftasks--;
                        }
                        System.out.println("-------------------------------------------------------------------------");
                    }
                }
                if (select == 4)  {
                    System.out.println("Returning to the main menu");
                    System.out.println("-------------------------------------------------------------------------");
                }
                if (select >= 5){
                    System.out.println("Invalid action, enter valid option");
                }



            }

        }
    }







