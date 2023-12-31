package pro.Sky.EmployeeBook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//      Ваше задание на сегодня:
//
//        1. Перенести проект с EmployeeBook на Map в качестве хранилища сотрудников, реализовав методы добавления,
//            удаления и поиска.
//        2. Продумать контракт для ключей, чтобы сотрудник с одним ФИО существовал только в одном экземпляре,
//           корректно добавлялся и удалялся.
//        3. Избавиться от циклов в методах по поиску сотрудника, заменив на методы Map.
//        4. Переработать все методы по работе с хранилищем на работу с методами Map.
//
//        Задание может быть выполнено по-разному. Главное, чтобы были выполнены критерии. Если какой-то информации
//        в задании не хватает, действуйте на свое усмотрение.
//        - **Критерии оценки**
//        - Все сотрудники существуют только в одном экземпляре
//        - Поиск сотрудников осуществляется с помощью метода
//        - Все методы по работе с хранилищем заменены на мапы
//        - Любого сотрудника можно удалить
//        - Можно добавить нового сотрудника
//        - Проект перенесен на map

@SpringBootApplication
public class EmployeeBookApplication {
    public static void main(String[] args) {
        SpringApplication.run(EmployeeBookApplication.class, args);
    }

}
