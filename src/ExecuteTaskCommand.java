class ExecuteTaskCommand implements TaskCommand {
    private Task task;

    public ExecuteTaskCommand(Task task) {
        this.task = task;
    }

    @Override
    public void execute() {
        System.out.println("Executing task: " + task.getName());
    }
}