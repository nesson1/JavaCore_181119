package lesson1.Homework.Participants;

public class Robot implements Participant {

    String name;
    int maxRunLength;
    int maxJumpHeight;

    boolean active;

    public Robot(String name, int maxRunLength, int maxJumpHeight) {
        this.name = name;
        this.maxRunLength = maxRunLength;
        this.maxJumpHeight = maxJumpHeight;
        this.active = true;
    }

    public Robot(String name) {

//        this.name = name;
        this(name, 500, 1);
    }

    @Override
    public void run(int length) {
        if(length < maxRunLength) {
            System.out.println(name + " успешно преодолел дистанцию!");
        } else {
            System.out.println(name + " не сумел преодолеть дистанцию.");
            active = false;
        }
    }

    @Override
    public void jump(int height) {
        if(height < maxJumpHeight) {
            System.out.println(name + " успешно преодолел препятствие!");
        } else {
            System.out.println(name + " не сумел преодолеть препятствие.");
        }
    }

    @Override
    public boolean isOnDistance() {
        return active;
    }

    @Override
    public void info() {
        System.out.println(name + " " + ( active? " продолжает соревнование" : " выбыл из соревнования"));
    }
}
