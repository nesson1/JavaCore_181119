package lesson1.Homework.Participants;

public class Cat implements Participant {

    String name;
    int maxRunLength;
    int maxJumpHeight;

    boolean active;

    public Cat(String name, int maxRunLength, int maxJumpHeight) {
        this.name = name;
        this.maxRunLength = maxRunLength;
        this.maxJumpHeight = maxJumpHeight;
        this.active = true;
    }

    public Cat(String name) {
//        this.name = name;
        this(name, 300, 500);
    }

    @Override
    public void run(int length) {
        if(length <= maxRunLength){
            System.out.println(name + " успешно преодолел расстояние");
        }else {
            System.out.println(name + " не справился с дистанцией");
            active = false;
        }
    }

    @Override
    public void jump(int height) {
        if(height <= maxJumpHeight){
            System.out.println(name + " успешно преодолел высоту");
        }else {
            System.out.println(name + " не справился с высотой");
            active = false;
        }
    }

    @Override
    public boolean isOnDistance() {
        return active;
    }

    @Override
    public void info() {
        System.out.println(name + " " + (active ? " продолжает борьбу" : " выбыл из соревнования"));

    }
}
