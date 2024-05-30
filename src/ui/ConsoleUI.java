package ui;

import model.Entry;
import service.EntryService;
import java.util.Scanner;

public class ConsoleUI {
    private EntryService entryService;
    private Scanner scanner;

    public ConsoleUI() {
        entryService = new EntryService();
        scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("1. Add Entry");
            System.out.println("2. View Entries");
            System.out.println("3. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 1) {
                addEntry();
            } else if (choice == 2) {
                viewEntries();
            } else if (choice == 3) {
                break;
            }
        }
    }

    private void addEntry() {
        System.out.println("Enter description:");
        String description = scanner.nextLine();
        System.out.println("Enter amount:");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        System.out.println("Enter category:");
        String category = scanner.nextLine();
        System.out.println("Enter date (YYYY-MM-DD):");
        String date = scanner.nextLine();

        Entry entry = new Entry(description, amount, category, date);
        entryService.addEntry(entry);
    }

    private void viewEntries() {
        for (Entry entry : entryService.getAllEntries()) {
            System.out.println(entry);
        }
    }
}

