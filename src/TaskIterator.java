import java.util.Iterator;
import java.util.List;

class TaskIterator implements Iterator<Task> {
    private List<Task> tasks;
    private int position = 0;

    public TaskIterator(List<Task> tasks) {
        this.tasks = tasks;
    }

    @Override
    public boolean hasNext() {
        return position < tasks.size();
    }

    @Override
    public Task next() {
        return tasks.get(position++);
    }
}
