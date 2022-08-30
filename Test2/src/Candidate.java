public class Candidate implements Comparable<Candidate> {
    public String name;
    public String vacancy;
    public int solvedTasks;
    public int penaltyValue;

    public Candidate(String name, String vacancy, int solvedTasks, int penaltyValue) {
        this.name = name;
        this.vacancy = vacancy;
        this.solvedTasks = solvedTasks;
        this.penaltyValue = penaltyValue;
    }

    @Override
    public int compareTo(Candidate o) {
        if (this.solvedTasks < o.solvedTasks) return 1;
        if (this.solvedTasks == o.solvedTasks) {
            if (this.penaltyValue > o.penaltyValue) return 1;
            if (this.penaltyValue == o.penaltyValue) return 0;
        }
        return -1;
    }

    @Override
    public String toString() {
        return name;
    }
}