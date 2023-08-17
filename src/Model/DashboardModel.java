package Model;

public class DashboardModel {
    private int totalVehicles;
    private int totalBookings;
    private int onRentBookings;
    private int availableVehicles;
    private int overdueBookings;

    // Getter and Setter methods for all fields

    public int getTotalVehicles() {
        return totalVehicles;
    }

    public void setTotalVehicles(int totalVehicles) {
        this.totalVehicles = totalVehicles;
    }

    public int getTotalBookings() {
        return totalBookings;
    }

    public void setTotalBookings(int totalBookings) {
        this.totalBookings = totalBookings;
    }

    public int getOnRentBookings() {
        return onRentBookings;
    }

    public void setOnRentBookings(int onRentBookings) {
        this.onRentBookings = onRentBookings;
    }

    public int getAvailableVehicles() {
        return availableVehicles;
    }

    public void setAvailableVehicles(int availableVehicles) {
        this.availableVehicles = availableVehicles;
    }

    public int getOverdueBookings() {
        return overdueBookings;
    }

    public void setOverdueBookings(int overdueBookings) {
        this.overdueBookings = overdueBookings;
    }
}
