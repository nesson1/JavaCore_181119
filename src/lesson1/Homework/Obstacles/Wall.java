package lesson1.Homework.Obstacles;

import lesson1.Homework.Participants.Participant;

public class Wall extends Obstacle {

    int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Participant participants) {
        participants.jump(height);
    }
}
