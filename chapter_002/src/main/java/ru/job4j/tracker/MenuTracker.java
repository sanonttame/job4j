package ru.job4j.tracker;

 class Exit implements UserAction {
    private final StartUI ui;

     Exit(StartUI ui) {
         this.ui = ui;
     }

     public int key() {
         return 0;
     }

     @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("Exit");
        this.ui.stop();
    }

     @Override
     public String info() {
         return "6 : Удаление заявки.";
     }
 }

public class MenuTracker {
    //получаем экземпляры объектов
    private Input input;
    private Tracker tracker;
    //создание действий которые описаны в системе
    private UserAction[] actions = new UserAction[7];

    /**
     * Конструктор класса MenuTracker.
     * @param input
     * @param tracker
     */
    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * Действия.
     */
    public void fillActions(StartUI ui) {
        this.actions[0] = new AddItem(0, "Добавление новой заявки");
        this.actions[1] = new FindAll(1, "Поиск всех заявок.");
        this.actions[2] = new DeleteItem(2,"Удаление заявки.");
        this.actions[3] = new FindById(3, "Поиск по идентификатору.");
        this.actions[4] = new FindByName(4, "Поиск по имени.");
        this.actions[5] = new ReplaceItem(5, "Замена заявки.");
        this.actions[6] = new Exit(ui);
    }

    /**
     * Печать меню.
     */
    public void show() {
        for (UserAction action : this.actions) {
            if (action != null) {
                System.out.println((action.info()));
            }
        }
    }

    /**
     * Выбор действи.
     * @param key
     */
    public void select(int key) {
        this.actions[key].execute(this.input, this.tracker);
    }

    public int getActionsLentgh() {
        return actions.length;
    }
}
