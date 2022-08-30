## **2. Поздравляю, вы прошли**
| | |
|:---|---:|
| Ограничения времени |  3 секунды |
| Ограничения памяти| 512 Mb |
| Ввод | Стандартный ввод или input.txt |
| Вывод |Стандартный вывод или output.txt |

Известная IT-компания Тындекс собирается открыть новый офис на Марсе. Так как подготовка к полету займет достаточно большое время, отбор кандидатов на вакансии было решено начать уже сейчас.

Так как желающих оказалось очень много, первая часть отбора прошла в виде соревнования по решению задач — на каждую вакансию было предложено 6 задач одинаковой ценности. Приоритет отдаётся кандидатам, решившим больше задач.

При равенстве количества решенных задач кандидаты сравниваются по целочисленному штрафу - — чем он меньше, тем выше приоритет у кандидата. Штраф определяется по особой формуле, что гарантирует отсутствие двух кандидатов с одинаковым количеством задач и одинаковым штрафом. 

Так как отбор в марсианский офис проходит «чуть сложнее», чем в любой земной, для каждой вакансии определено максимальное количество приглашенных кандидатов — больше данной величины приглашать нельзя ни при каком условии.

На вас возложена очень важная задача — по информации о вакансиях и о результатах отборочного соревнования вывести всех кандидатов, прошедших в следующую часть отбора.

## ***Формат ввода:***
В первой строке содержится целое число n (1≤n≤104) — число открытых вакансий в новом офисе.

Следующие n строк имеют вид si,mi (1≤|si|≤30, 1≤mi≤104) — название и максимальное число кандидатов на i-ю вакансию. Название вакансии содержит только строчные латинские буквы и знак подчеркивания ‘_’.

Далее следует строка, содержащая целое число k (1≤k≤105) — число участвовавших в отборочном соревновании кандидатов.

Последующие k строк имеют вид cj,qj,rj,pj (1≤∣∣cj∣∣≤30, 0≤rj≤6, 0≤pj≤109) — строковый идентификатор j-го кандидата, название интересующей его вакансии, количество решенных кандидатом задач и начисленный ему штраф соответственно. Идентификатор кандидата содержит только строчные латинские буквы и знак подчеркивания ‘_’.

***Гарантируется, что:***

- Интересующие кандидатов вакансии qj обязательно представлены во входных данных;
- Названия всех вакансий si попарно различны между собой;
- Идентификаторы кандидатов cj попарно различны между собой;
- Не существует двух кандидатов a и b, что ra=rb и pa=pb (или различаются количества решенных задач, или различается начисленный кандидатам штраф).
- Все строки используют разделитель ‘,’ (запятая).
## ***Формат вывода***
Выведите список идентификаторов всех кандидатов, прошедших в следующий этап отбора на интересующие их вакансии в лексикографическом (алфавитном) порядке.

Кандидат считается прошедшим по вакансии i, если существует строго менее mi кандидатов на i-ю вакансию с большим, чем у данного кандидата, приоритетом 
(см. условие про сравнение кандидатов). 

**Пример 1:**
|Ввод:     |Вывод:
|:---|:--- 
|2| arcady_volozh
|ceo,1| ilya_segalovich
|co_founder,1|
|3|
|arcady_volozh,ceo,6,100|
|elon_musk,ceo,5,0|
|ilya_segalovich,co_founder,6,1 0|

***Пример 2***

|Ввод:     |Вывод:
|:---|:--- 
|1|ilya_segalovich
|co_founder,1|
|2|
|elon_musk,co_founder,6,200|
|ilya_segalovich,co_founder,6,100|

***Пример 3***
|Ввод:     |Вывод:
|:---|:--- 
|2|anonymous
|developer,2| bill_gates
|hacker,3|bjarne_stroustrup
|5|guccifer
|anonymous,hacker,6,0| julian_assange
|bjarne_stroustrup,developer,6,1
|julian_assange,hacker,5,100500
|bill_gates,developer,3,1
|guccifer,hacker,2,0

***Пример 4***

|Ввод:     |Вывод:
|:---|:--- 
|2|cactus
|plant,2|demeter
|gardener,1|palm
|5
|demeter,gardener,4,12
|acacia,plant,0,5
|cactus,plant,0,1
|ficus,plant,0,4
|palm,plant,0,3

##  ***Примечания***
### **Пояснение к тестовому примеру 1.** 
В первом тестовом примере на вакансию «ceo» претендуют два кандидата — у ‘arcady_volozh’ решено 6 задач и 100 штрафа,  ‘elon_musk’ — решено 5 задач и 0
 штрафа. В первую очередь сравнение идет по задачам: 6>5, поэтому в следующий этап проходит именно ‘arcady_volozh’.
### **Пояснение к тестовому примеру 2.** 
Во втором тестовом примере у обоих претендентов одинаковое количество решенных задач, но у ‘ilya_segalovich’ штраф 100, что меньше штрафа 200 у ‘elon_musk’. Поэтому в следующий этап проходит ‘ilya_segalovich’.
### **Пояснение к тестовому примеру 3.** 
В третьем тестовом примере важно отметить, что в ответе прошедшие кандидаты идут в объединенном списке отсортированные в лексикографическом порядке независимо от своего приоритета при отборе и выбранной ими вакансии.
### **Пояснение к тестовому примеру 4.** 
В четвертом тестовом примере развернулась борьба за должность офисного растения. Хотя все кандидаты решили 0 задач на соревновании, ‘cactus’ и ‘palm’ набрали меньше всего штрафа, поэтому именно их приглашают в следующий этап отбора.