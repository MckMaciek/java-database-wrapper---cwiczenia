package p.database.Models;

public class Hall {

    private Long id;
    private String name;
    private String hallColumns;
    private String hallRows;
    private String hasSection;
    private String addSeats;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getHallColumns() {
        return hallColumns;
    }

    public String getHallRows() {
        return hallRows;
    }

    public String getHasSection() {
        return hasSection;
    }

    public String getAddSeats() {
        return addSeats;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHallColumns(String hallColumns) {
        this.hallColumns = hallColumns;
    }

    public void setHallRows(String hallRows) {
        this.hallRows = hallRows;
    }

    public void setHasSection(String hasSection) {
        this.hasSection = hasSection;
    }

    public void setAddSeats(String addSeats) {
        this.addSeats = addSeats;
    }

    public Hall(){

    }

    public static class HallBuilder{
        private String name;
        private String hallColumns;
        private String hallRows;
        private String hasSection;
        private String addSeats;
        private Long id;

        public HallBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public HallBuilder setId(Long id) {
            this.id = id;
            return this;
        }

        public HallBuilder setHallColumns(String hallColumns) {
            this.hallColumns = hallColumns;
            return this;
        }

        public HallBuilder setHallRows(String hallRows) {
            this.hallRows = hallRows;
            return this;
        }

        public HallBuilder setHasSection(String hasSection) {
            this.hasSection = hasSection;
            return this;
        }

        public HallBuilder setAddSeats(String addSeats) {
            this.addSeats = addSeats;
            return this;
        }

        public Hall build(){
            Hall hall = new Hall();

            hall.hallColumns = this.hallColumns;
            hall.hallRows = this.hallRows;
            hall.hasSection = this.hasSection;
            hall.addSeats = this.addSeats;
            hall.name = this.name;
            hall.id = this.id;

            return hall;
        }

    }
    public static HallBuilder getInstanceOfHallBuilder(){
        return new HallBuilder();
    }

    @Override
    public String toString() {
        return "Hall{" +
                "name='" + name + '\'' +
                ", hallColumns='" + hallColumns + '\'' +
                ", hallRows='" + hallRows + '\'' +
                ", hasSection='" + hasSection + '\'' +
                ", addSeats='" + addSeats + '\'' +
                '}';
    }
}
