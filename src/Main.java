import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Task task1 = new Task("Task 1", TaskPriority.LOW);
        Task task2 = new Task("Task 2", TaskPriority.MEDIUM);
        Task task3 = new Task("Task 3", TaskPriority.HIGH);


        TaskHandler lowPriorityHandler = new LowPriorityHandler();
        TaskHandler mediumPriorityHandler = new MediumPriorityHandler();
        TaskHandler highPriorityHandler = new HighPriorityHandler();

        lowPriorityHandler.setNextHandler(mediumPriorityHandler);
        mediumPriorityHandler.setNextHandler(highPriorityHandler);


        TaskMediator mediator = new TaskProcessingMediator(lowPriorityHandler);


        List<Task> taskList = new ArrayList<>();
        taskList.add(task1);
        taskList.add(task2);
        taskList.add(task3);

        TaskCollection taskCollection = new TaskCollection(taskList);
        Iterator<Task> taskIterator = taskCollection.iterator();


        while (taskIterator.hasNext()) {
            Task task = taskIterator.next();
            mediator.processTask(task);
        }
    }
}