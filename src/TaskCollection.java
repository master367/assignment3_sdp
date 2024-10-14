import java.util.Iterator;
import java.util.List;

class TaskCollection {
    private List<Task> tasks;

    public TaskCollection(List<Task> tasks) {
        this.tasks = tasks;
    }

    public Iterator<Task> iterator() {
        return new TaskIterator(tasks);
    }
}