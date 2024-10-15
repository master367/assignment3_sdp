class Low extends TaskHandler {
    @Override
    public void handleTask(Task task) {
        if (task.getPriority() == TaskPriority.LOW) {
            System.out.println("Processing low priority task: " + task.getName());
        } else if (nextHandler != null) {
            nextHandler.handleTask(task);
        }
    }
}
