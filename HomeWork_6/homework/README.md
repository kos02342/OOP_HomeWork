Принципы SOLID:

В классе User нарушен принцип единой ответственности, а также в методе save() класса User нарушается принцип инверсии зависимостей.

Класс User отвечает за создание отчета и сохранение данных пользователя.

Для решения данной задачи:
1. Создал отделный класс UserReporter и добавил метод report() для составления отчетов.
2. Создал отделный класс UserSaver и добавил метод save() для сохранения данных пользователя.
3. В классе User убрал все не нужные методы, оставил толко получение имени.
4. В классе Main для составления отчетов и сохранения данных теперь нужно вызвать методы report() класса UserReporter и метод save() класса UserSaver.


