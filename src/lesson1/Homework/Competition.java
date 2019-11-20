package lesson1.Homework;

import lesson1.Homework.Obstacles.Obstacle;
import lesson1.Homework.Obstacles.RunningTrack;
import lesson1.Homework.Obstacles.Wall;
import lesson1.Homework.Participants.Cat;
import lesson1.Homework.Participants.Participant;
import lesson1.Homework.Participants.Person;
import lesson1.Homework.Participants.Robot;

public class Competition {

    public static void main(String[] args) {
        Participant[] Participants = {
                new Cat("Tom"),
                new Person("Norris"),
                new Robot("Chappie")
        };

        Obstacle[] Obstacles = {
                new RunningTrack(50),
                new Wall(5),
        };

        for (Participant c : Participants ) {
            for (Obstacle o : Obstacles) {
                o.doIt(c);
                if (!c.isOnDistance()){
                    break;
                }
            }
        }

        for (Participant c : Participants) {
            c.info();
        }
    }
}
