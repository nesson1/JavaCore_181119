package lesson1.Homework.Obstacles;

import lesson1.Homework.Participants.Participant;

public class RunningTrack extends Obstacle {

    int length;

    public RunningTrack(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Participant participant) {
        participant.run(length);
    }
}
