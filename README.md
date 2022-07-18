
### 0.Приветствие.
Добрый день. Сегодня я проведу вебинар на тему "Работы с виджетами и составными командами в Тезис версии 5.1.+"

С версии 5.1:
> • У всех пользователей по умолчанию на главном экране применен стандартный шаблон панелей виджетов "Базовый шаблон" (содержит виджеты "События" и "Календарь")
>    
   • Всем пользователям доступны созданные по умолчанию 12 шаблонов панелей виджетов с разным набором виджетов и для разных размеров экрана

Добавить виджеты можно 2 способами:
>• по кнопке "Добавить виджет" ("+") в правом верхнем углу на строке с приветствием пользователя
>    
  • по пункту "Добавить виджет" контекстного меню вызванного к главному экрану

При добавлении виджета - открывается окно "Добавить виджет", в котором мы можем выбрать какой виджет будет добавлен на экран.
У каждого виджета есть иконка и описание.

Если выбран виджет без параметров (например - Дни рождения), то после добавления **сразу же включается возможность перемещать видежт**.

>Примечание: 
>
  Виджеты могут накладываться друг на друга при добавлении (сделано для того, что если виджет не помещается, то он не будет уходить полностью за экран чтобы его не потерять)

Удалить можно 2 способами:

> по пункту "Удалить все" контекстного меню вызванного к главному экрану удалить все виджеты пользователя с главного экрана
  по кнопке "Корзина" у каждого виджета в режиме перемещения виджетов
  При удалении виджета требуется подтвердить действие

Переключиться в режим перемещения и выйти из него можно 2 способами:

 >   по кнопке "Переместить" в правом верхнем углу на строке с приветствием пользователя
 >   
   по пункту "Переместить"/"Не перемещать" контекстного меню вызванного к главному экрану
   >
   >При добавлении виджета режим перемещения включается автоматически, границы виджетов выделены пунктиром


**Что можно делать в режиме перемещения?**
  >  1. **Изменить размер** виджета растянув/сузив границы. Минимум - это размер по умолчанию устанавливаемый при добавлении виджета, а максимум - весь экран
>2. **Удалить** виджет. После удаления не происходит автоматическое перемещение, все виджеты остаются на своих местах  
>3. **Редактировать** виджет. Кнопка "карандаш" есть только у тех виджетов, при добавлении которых необходим был ввод параметров. 
>4. **Перемещать** виджеты по экрану захватив их мышкой. Если на экране не хватает места, то виджеты могут накладываться друг на друга
 >5. **Изменять масштаб отображаемых внутри виджета элементов**. По соответствующим кнопкам с лупой увеличивается или уменьшается масштаб всех элементов включая кнопку "Обновить" данные виджета

## 1.ВИДЖЕТЫ
### 1.1.Ссылка
Виджет представляет собой **область содержащую ссылку** с соответствующим значком ссылки
При выборе этого виджета открывается окно ввода обязательных параметров:

>Имя - указывается текст, который будет отображаться в виджете 
>
>Ссылка - указывается ссылка https://yandex.ru/
>
>Ссылка может быть как внешней, так и внутренней (например, ссылка на карточку в системе)

>Примечание, особенности:  
   если указать любой набор символов, то при переходе по такой ссылке будет открываться главный экран ТЕЗИС от текущего пользователя в новом окне браузера


### 1.2 Диаграмма
Добавление виджета Диаграммы аналогично формированию соответствующих отчётов в экране Администрирование - Отчёты

>При выборе этого виджета открывается окно ввода параметров, в котором по умолчанию доступны для выбора один из 3 отчётов:
>
  >• Отчет по входящей корреспонденции
  >• Отчет по журналам канцелярии
  >• Отчет по загруженности сотрудников
  >
  >В виджете также могут быть доступны для выбора созданные пользователем отчёты (тип шаблона и тип вывода должны быть Диаграмма)


### 1.3 Директория виджетов (кейс - шаблон с директориями) ПОЯСНИТЬ ВОЗМОЖНОСТЬ РАЗБИТИЯ НА НЕСКОЛЬКО ЭКРАНОВ
Виджет отображает иконку папки и снизу название директории

>При выборе этого виджета открывается окно ввода названия директории (ограничение 50 символов)

>После добавления виджета при клике на него открывается новый пустой экран, на котором также можно размещать виджеты и добавлять новые директории

>Переход в директорию отображается в навигационной цепочке. Вернуться на главный экран можно по навигационной цепочке или перезайдя в систему

### 1.4 Дни рождения (Подготовить пользователей)
Виджет отображает список сотрудников с аватаром, ФИО, числом и месяцем рождения

>В виджете отображаются максимум **10 сотрудников**, у которых дата рождения в следующие **30 дней** включая текущий день (прошедшие не показываются)

>Сотрудники, у которых дата рождения совпадает с текущим днем выводятся под надписью **"Поздравьте сегодня!"**, если в следующие 30 дней, то под надписью "Скоро отмечают:"

### 1.5 Заметка
  Текстовый редактор для заметок, для удобства
  
  Виджет отображает область ввода текса и сверху панель редактирования введенного текста 

### 1.6 История
Виджет отображает стандартный экран, который открывается по кнопке на боковой панели или Помощь - История

### 1.7 Календарь 
    (ДОБАВИТЬ ДНИ ПЕРЕД ВЕБИНАРОМ)
Виджет отображает календарь с кнопками пролистывания по месяцам

Как и раньше на элементе календаря:

>выделяется кружком текущий день
>
>жирным выделяется день, на который назначены задачи
>
>происходит переход в календарь с событиями по нажатию на день или при выделении нескольких дней 
    

### 1.8 Панель групповых виджетов
    *Инструмент для группировки, не углубляться

Вилджет отображает выделенную область, в которую можно добавлять также любые виджеты

При добавлении этого виджета на экран добавляется область, в которой добавляемые виджеты будут ограничены в размерах и положении на экране строго этой областью

**Режим включения/отключения перемещения** и кнопка добавления виджета не будет влиять на этот виджет. Чтобы добавить в область виджет необходимо использовать контекстное меню вызванное к этому виджету

### 1.9 Папка действий или поиска
    *Показать, что могу действия с документами проводить (скрепочка)

Виджет отображает стандартный список соответствующей выбранной папке 

>При выборе виджета открывается окно с иерархией всех папок поиска и действий доступных текущему пользователю и их счётчиками

>В виджете доступны все те же действия, что и в соответствующих списках папок

### 1.10 События
Виджет отображает таблицу аналогичную ранее ленте событий

>В виджете также отображается максимум по 5 событий с кнопками пролистывания и информацией об общем кол-ве событий, если назначений нет, то отображается запись "Нет событий"

### 1.11 Составная команда (Должна быть иконка, которая совпадает по смыслу)

При добавлении виджета открывается окно с вариантами:

>кнопка "Выбрать существующую" для выбора команды из списка Помощь - Настройки - Составные команды
>
>Кнопка "Создать новую" для создания новой команды аналогично окну создания в списке  Помощь - Настройки - Составные команды, где необходимо заполнить поле "Команда" и "Шаблон"

    
После того как будет выбрана существующая команда или создана новая открывается окно настройки внешнего вида виджета (слева предпросмотр итогового виджета, справа настройки)

Настройки внешнего вида виджета: 
>чек-бокс "Отображать границы виджета", по умолчанию установлен (актуально для стиля стандартный и ссылка)
> выбор стиля кнопки: 
>>- Стандартный (в виде кнопки с названием из поля "Команда")
>>
>>- Ссылка (в виде текста с названием из поля "Команда, при наведении на который подчеркивается и меняется цвет)
>>
>>- Изображение (можно загрузить картинку, при загрузке происходит проверка на расширение файла и размер (не больше 1 МБ))

Если для виджета выбрана команда, у которой есть параметры, то соответствующие поля будут располагаться над кнопкой (кнопка/ссылка/картинка)

Если добавлен виджет с обязательными параметрами, то при нажатии на "кнопку" виджета действие не произойдет пока не будут заполнены поля, при этом уведомлений об обязательности заполнения полей не будет


### 1.11.1 Покажу, как работают пара стандартных виджетов
Создать дело
>"После указания номера тома, будет открыт экран с созданием нового Дела, при этом, сразу же будет введен необходимый номер тома для нового дела"

>После нажатия на кнопку вижета "Создать письмо", мы сразу попадаем на экран создания карточки письма в системе.
>Аналогично можно создать такой видежт для любых видов документов, которые приходится часто создавать
### 1.11.2 Так же, покажу, что эти же виджеты можно вызвать голосом
	- Создать дело
	- Создать письмо

### 1.11.3. Создание составной команды самостоятельно
Готовая команда, которая будет работать:

    Поиск юридического лица: - УБРАТЬ РЕАЛЬНЫХ КОНТРАГЕНТОВ

>Юридические лица переключить расширенный режим фильтр да переключить переключить добавить условие наименование переключить ${Наименование} переключить 1 изменить
	
>Открыть нужный бин в консоли JMX:
Консоль JMX переключить Поиск по ObjectName ClusterManager переключить 2 просмотреть MBean

### 1.11.4 Возможность использовать шорткоды (показать)
>Alt + O - свободный шорткод