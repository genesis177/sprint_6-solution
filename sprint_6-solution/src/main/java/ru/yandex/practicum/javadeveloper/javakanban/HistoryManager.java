package ru.yandex.practicum.javadeveloper.javakanban;

import java.util.List;

public interface HistoryManager {

    void add(Task task);

    void remove(int id); // Объединяем обе версии, оставив метод remove

    List<Task> getHistory();

}