package Adapter;

public class Main {

    public static void main(String[] args) {
        SpandexGuy spandexGuy = new SpandexGuy(new DrivingSkillAdapter());

        spandexGuy.ride();
        spandexGuy.brake();


    }
}
