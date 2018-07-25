# OceanWorld
Тестовое приложение на вакансию Junior Android Developer

ЗАДАЧА: написать приложение “Морской мир”
- Приложение содержит один экран в портретной ориентации.
- Смены ориентации экрана не предполагается, соответственно, портретный режим
экрана должен быть жестко установлен.
- На экране расположена таблица размера 15x10 (высота х ширина) с ячейками
равными по размеру между собой, размер таблицы должен задаваться
переменными в коде, чтобы можно было быстро поменять размер.
- Каждая ячейка может: быть свободна, либо занята одной особью организма
какого-либо вида.
- В нижней части экрана располагается кнопка “Рестарт”, при нажатии на которую
происходит перезагрузка мира на начальное состояние (что подразумевается под
начальным состоянием поясняется ниже).
- Все остальное пространство экрана должна занимать таблица. Соответственно,
размер одной ячейки зависит от размера предоставленного для таблицы
пространства.
- При клике по таблице должен совершаться один такт симуляции мира. В течение
одного такта каждая особь совершает один ход (если может). Особи совершают
ходы в течение одного такта по очереди, в порядке обхода таблицы.

ПРАВИЛА ЖИЗНИ В “МИРЕ”

Для всех организмов:
- Окрестностью клетки считаются соседние 8 клеток.
- Все организмы могут перемещаться на одну клетку в пределах окрестности (то есть вверх, вниз, вправо, влево и по диагонали).
- Есть два вида организмов: пингвины и касатки.

ПИНГВИНЫ:

Перемещение:
- На каждом ходе пытается плавать.
- Для движения выбирает случайное направление.
- Если в выбранном направлении располагается пустая клетка, то перемещается
туда, иначе остается на месте.

Размножение:
- Если живет 3 хода, то на третий ход пробует произвести потомство.
- Размножение происходит путем создания нового пингвина на произвольном
свободном месте в окрестности около пингвина.
- Если рядом свободных мест нет, то ничего не делает и следующего
размножения ждёт ещё 3 хода.

КАСАТКИ

Перемещение:
- На каждом ходе пытается плавать.
- На каждом ходе проверяет все направления и если встречается пингвин, то
перемещается на его место и съедает его.
- Если рядом нет пингвинов, то двигается так же, как пингвин.
- Есть других касаток нельзя.

Размножение:
- Если живет 8 ходов то на 8ой ход пробует произвести потомство.
- Процесс размножения происходит так же, как у пингвинов.

Гибель:
- Если не съест ни одного пингвина в течение 3 ходов, то умирает (исчезает из
мира, оставляя клетку свободной).

Начальное состояние: в начальном состоянии мир должен быть заполнен пингвинами
на 50% и касатками на 5%.
