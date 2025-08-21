public class CalculatingVolumeOfEarth {
    public static void main(String[] args) {
        double radius = 6378; // Earth's average radius in kilometers

        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.println("Radius of Earth: " + radius + " km");
        System.out.println("Volume of Earth: " + volume + " cubic kilometers");
    }
}
