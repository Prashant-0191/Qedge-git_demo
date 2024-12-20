import java.util.List;
import java.util.ArrayList;

public class Reports {

    // Define a basic data class to represent a report item
    static class ReportItem {
        String name;
        int value;

        ReportItem(String name, int value) {
            this.name = name;
            this.value = value;
        }

        @Override
        public String toString() {
            return "Name: " + name + ", Value: " + value;
        }
    }

    // Method to generate a simple report based on a list of ReportItems
    public static void generateReport(List<ReportItem> items) {
        System.out.println("Report Generated: ");
        for (ReportItem item : items) {
            System.out.println(item);
        }
    }

    // Method to generate a summary of the report
    public static void generateSummary(List<ReportItem> items) {
        int totalValue = 0;
        for (ReportItem item : items) {
            totalValue += item.value;
        }
        System.out.println("Report Summary: ");
        System.out.println("Total Value: " + totalValue);
        System.out.println("Average Value: " + (items.size() > 0 ? (double) totalValue / items.size() : 0));
    }

    public static void main(String[] args) {
        // Sample data
        List<ReportItem> reportItems = new ArrayList<>();
        reportItems.add(new ReportItem("Item 1", 10));
        reportItems.add(new ReportItem("Item 2", 20));
        reportItems.add(new ReportItem("Item 3", 30));

        // Generate report and summary
        generateReport(reportItems);
        generateSummary(reportItems);
    }
}
