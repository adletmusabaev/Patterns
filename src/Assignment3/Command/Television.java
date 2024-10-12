package Assignment3.Command;

// Класс, представляющий телевизор
class Television {
    private int volume = 10; // Текущий уровень громкости
    private int channel = 1; // Текущий канал

    public void turnOn() {
        System.out.println("TV is ON");
    }

    public void turnOff() {
        System.out.println("TV is OFF");
    }

    public void volumeUp() {
        volume++;
        System.out.println("Volume is now: " + volume);
    }

    public void volumeDown() {
        volume--;
        System.out.println("Volume is now: " + volume);
    }

    public void nextChannel() {
        channel++;
        System.out.println("Channel is now: " + channel);
    }

    public void previousChannel() {
        channel--;
        System.out.println("Channel is now: " + channel);
    }
}