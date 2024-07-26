package org.example.Behavioral.Memento;

public class Game {

    private int level;
    private int score;
    private String checkpoint;

    public void setLevel(int level) {
        this.level = level;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setCheckpoint(String checkpoint) {
        this.checkpoint = checkpoint;
    }

    public LevelMemento save(){
        return new LevelMemento(level, score, checkpoint);
    }

    public void restore(LevelMemento memento){
        level = memento.getLevel();
        score = memento.getScore();
        checkpoint = memento.getCheckpoint();
    }

    @Override
    public String toString() {
        return "Game{" +
                "level=" + level +
                ", score=" + score +
                ", checkpoint='" + checkpoint + '\'' +
                '}';
    }
    public static class LevelMemento {

        private final int level;
        private final int score;
        private final String checkpoint;

        private LevelMemento(int level, int score, String checkpoint) {
            this.level = level;
            this.score = score;
            this.checkpoint = checkpoint;
        }

        public int getLevel() {
            return level;
        }

        public int getScore() {
            return score;
        }

        public String getCheckpoint() {
            return checkpoint;
        }
    }
}
