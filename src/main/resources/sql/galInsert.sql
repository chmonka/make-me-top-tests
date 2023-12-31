
INSERT INTO galaxy(galaxy_name, galaxy_description)
VALUES ('Автоматизация тестирования', 'Автоматизированное тестирование ПО — процесс тестирования программного обеспечения, при котором основные функции и шаги теста, такие как запуск, инициализация, выполнение, анализ и выдача результата, производятся автоматически с помощью инструментов для автоматизированного тестирования.
В свою очередь, инструмент для автоматизированного тестирования — это программное обеспечение, посредством которого осуществляется создание, отладка, выполнение и анализ результатов прогона тест-скриптов (Test Scripts - это наборы инструкций для автоматической проверки определенной части программного обеспечения).
Тестирование программных систем состоит из динамической верификации поведения программ на конечном наборе тестов. При этом тесты выбираются из обычно выполняемых действий прикладной области и обеспечивают проверку соответствия ожидаемому поведению системы.'),
       ('UI Дизайн', 'string string string string string string string string string string string string string.
string string string string string string string string string.
string string string string string string string string string string string string string string string string string string string string string string string string string string string string string string string string.'),
       ('Frontend Разработка', 'string string string string string string string string string string string string string.
string string string string string string string string string.
string string string string string string string string string string string string string string string string string string string string string string string string string string string string string string string string.');

INSERT INTO orbit(orbit_level, system_count, galaxy_id)
VALUES (1, 20, 1),
       (2, 20, 1),
       (3, 20, 1),
       (4, 20, 1);

INSERT INTO star_system(system_level, system_name, orbit_id, system_position)
VALUES ('1', 'Groovy', 1, 125),
       ('1', 'JS', 1, 30),
       ('1', 'Perfomance', 1, 60),
       ('1', 'Scala', 1, 90),
       ('1', 'Docker', 1, 135),
       ('1', 'API', 1, 190),
       ('1', 'Java', 1, 225),
       ('1', 'Locators', 1, 300),
       ('1', 'Git', 1, 270),
       ('1', 'SQL', 1, 330),
       ('2', 'Jenkins', 2, 135),
       ('2', 'Mock', 2, 150),
       ('2', 'MQ', 2, 180),
       ('2', 'Maven', 2, 240),
       ('3', 'K6', 3, 30),
       ('3', 'Gatling', 3, 60),
       ('3', 'API Automation', 3, 210),
       ('3', 'UI Automation', 3, 270),
       ('4', 'Reporting Load Testing', 4, 85),
       ('4', 'Pipeline', 4, 45),
       ('4', 'Async MKS', 4, 150),
       ('4', 'JDBI', 4, 340),
       ('4', 'Autotest project', 4, 285),
       ('4', 'Reporting UI/API Test', 4, 210),
       ('4', 'test', 4, 220),
       ('4', 'test1', 4, 120);

INSERT INTO system_dependency(child_id, parent_id, is_alternative)
VALUES (1, null, false),
       (2, null, false),
       (3, null, false),
       (4, null, false),
       (5, null, false),
       (6, null, false),
       (7, null, false),
       (8, null, false),
       (9, null, false),
       (10, null, false),
       (11, 5, false),
       (12, 5, false),
       (13, 6, false),
       (14, 7, false),
       (15, 2, false),
       (15, 3, false),
       (16, 3, false),
       (16, 4, false),
       (17, 6, false),
       (17, 14, false),
       (18, 14, false),
       (18, 8, false),
       (18, 9, false),
       (19, 15, true),
       (19, 16, true),
       (19, 11, false),
       (20, 1, false),
       (20, 11, false),
       (21, 5, false),
       (21, 12, false),
       (21, 13, false),
       (21, 22, false),
       (22, 17, false),
       (22, 23, false),
       (22, 10, false),
       (23, 17, true),
       (23, 18, true),
       (24, 17, true),
       (24, 18, true),
       (25, null, false),
       (26, null, false);
