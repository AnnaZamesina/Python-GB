package FINAL_jAVA;

public class Notebook {
    private String model;
    private Integer ram;
    private Integer hard_drive_volume;
    private String operating_system;
    private String color;
    private Integer price;

    @Override
    public String toString() {
        return String.format(
                "Модель: %s, Количество оперативной памяти: %d, Жесткий диск: %d, Операционная система: %s, Цвет: %s, Цена: %d",
                model, ram, hard_drive_volume, operating_system, color, price);
    }

    public Notebook(String model, Integer ram, Integer hard_drive_volume, String operating_system, String color,
            Integer price) {
        this.model = model;
        this.ram = ram;
        this.hard_drive_volume = hard_drive_volume;
        this.operating_system = operating_system;
        this.color = color;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRAM() {
        return ram;
    }

    public void setRAM(int ram) {
        this.ram = ram;
    }
    public int getHDV() {
        return hard_drive_volume;
    }

    public void setHDV(int hard_drive_volume) {
        this.hard_drive_volume = hard_drive_volume;
    }

    public String getOperatingSystem() {
        return operating_system;
    }

    public void setOperatingSystem(String operating_system) {
        this.operating_system = operating_system;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean contains(String secondFilter) {
        return false;
    }

}


