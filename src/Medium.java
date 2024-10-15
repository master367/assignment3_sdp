class Medium extends TaskHandler {
    @Override
    public void handleTask(Task task) {
        if (task.getPriority() == TaskPriority.MEDIUM) {
            System.out.println("Processing medium priority task: " + task.getName());
        } else if (nextHandler != null) {
            nextHandler.handleTask(task);
        }
    }
}
