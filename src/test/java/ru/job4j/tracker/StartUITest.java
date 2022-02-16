package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUITest {

    @Test
    public void whenCreateItem() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0", "Item name", "1"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findAll()[0].getName(), is("Item name"));
    }

    @Test
    public void whenReplaceItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Replaced item"));
        String replacedName = "New item name";
        Input in = new StubInput(
                new String[]{"0", String.valueOf(item.getId()), replacedName, "1"}
        );
        UserAction[] actions = {
                new ReplaceAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName(), is(replacedName));
    }

    @Test
    public void whenDeleteItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Deleted item"));
        Input in = new StubInput(
                new String[]{"0", String.valueOf(item.getId()), "1"}
        );
        UserAction[] actions = {
                new DeleteAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }

    @Test
    public void whenFindItemByIDNot() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Input in = new StubInput(
                new String[]{"0", "1", "1"});
        UserAction[] actions = new UserAction[]{
                new FindAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu:" + ln
                        + "0. ===Find Item by Id===" + ln
                        + "1. ==== Exit===" + ln
                        + "Заявка с введенным id: " + "1" + " не найдена." + ln
                        + "Menu:" + ln
                        + "0. ===Find Item by Id===" + ln
                        + "1. ==== Exit===" + ln

        ));
    }

    @Test
    public void whenFindNActontestNo() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test1"));
        Input in = new StubInput(
                new String[]{"0", String.valueOf(one.getId()), "1"}
        );
        UserAction[] actions = new UserAction[]{
                new FindNActon(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu:" + ln
                        + "0. === Find items by name ===" + ln
                        + "1. ==== Exit===" + ln
                        + "=== Find items by name ===" + ln
                        + "Заявки с именем: " + String.valueOf(one.getId()) + " не найдены." + ln
                        + "Menu:" + ln
                        + "0. === Find items by name ===" + ln
                        + "1. ==== Exit===" + ln
        ));
    }

    @Test
    public void whenFindAllaction() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test1"));
        Input in = new StubInput(
                new String[]{"0", "1"}
        );
        UserAction[] actions = new UserAction[]{
                new FindAllAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu:" + ln
                        + "0. === Show all items ===" + ln
                        + "1. ==== Exit===" + ln
                        + "=== Show all items ===" + ln
                        + one + ln
                        + "Menu:" + ln
                        + "0. === Show all items ===" + ln
                        + "1. ==== Exit===" + ln
        ));
    }

    @Test
    public void whenFindItemByIDYes() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item1 = new Item("test");
        tracker.add(item1);
        Input in = new StubInput(
                new String[]{"0", "1", "1"});
        UserAction[] actions = new UserAction[]{
                new FindAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu:" + ln
                        + "0. ===Find Item by Id===" + ln
                        + "1. ==== Exit===" + ln
                        +  item1 + ln
                        + "Menu:" + ln
                        + "0. ===Find Item by Id===" + ln
                        + "1. ==== Exit===" + ln

        ));
    }

    @Test
    public void whenFindNActontestYes() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test1"));
        Input in = new StubInput(
                new String[]{"0", "test1", "1"}
        );
        UserAction[] actions = new UserAction[]{
                new FindNActon(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu:" + ln
                        + "0. === Find items by name ===" + ln
                        + "1. ==== Exit===" + ln
                        + "=== Find items by name ===" + ln
                        + one  + ln
                        + "Menu:" + ln
                        + "0. === Find items by name ===" + ln
                        + "1. ==== Exit===" + ln
        ));
    }

    @Test
    public void whenInvalidExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"8", "0"}
                );
        Tracker tracker = new Tracker();
        UserAction[] actions = new UserAction[]{
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                        "Menu:" + ln
                                + "0. ==== Exit===" + ln
                                + "Wrong input, you can select: 0 .. 0" + ln
                                + "Menu:" + ln
                                + "0. ==== Exit===" + ln
                )
        );
    }
}