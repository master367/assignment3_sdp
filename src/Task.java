class Task {
    private String name;
    private TaskPriority priority;

    public Task(String name, TaskPriority priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public TaskPriority getPriority() {
        return priority;
    }
}