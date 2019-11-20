package lesson1.Homework.Participants;

public class Person implements Participant {

    String name;
    int maxRunLength;
    int maxJumpHeight;

    boolean active;

    public Person(String name, int maxRunLength, int maxJumpHeight) {
        this.name = name;
        this.maxRunLength = maxRunLength;
        this.maxJumpHeight = maxJumpHeight;
        this.active = true;
    }

    public Person(String name) {
//        this.name = name;
        this(name, 30, 3);
    }


    @Override
    public void run(int length) {
        if(length <= maxRunLength){
            System.out.println(name + " успешно преодолел расстояние");
        }else {
            System.out.println(name + " не справился с дисанцией");
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
        System.out.println(name + " " + (active ? " продолжает соревнование" : " выбыл из соревнования"));
    }
}
