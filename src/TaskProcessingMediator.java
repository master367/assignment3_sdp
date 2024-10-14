class TaskProcessingMediator implements TaskMediator {
    private TaskHandler handler;

    public TaskProcessingMediator(TaskHandler handler) {
        this.handler = handler;
    }

    @Override
    public void processTask(Task task) {
        handler.handleTask(task);
        TaskCommand command = new ExecuteTaskCommand(task);
        command.execute();
    }
}
