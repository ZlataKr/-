#lang racket
(display  "1 Задание. Описать функцию, которая находила бы сумму всех числовых элементов списка с учетом наличия подсписков. Пример: для списка
‘(1((2 3) 4) 5 6) результатом будет 21.
" )
(define (append list1 list2)
(if (null? list1)
list2
(cons (car list1) (append (cdr list1) list2))))
(define (enumerate-tree tree)
(cond ((null? tree) '())
((not (pair? tree)) (list tree))
(else (append (enumerate-tree (car tree))
(enumerate-tree (cdr tree))))))
(display "Введите список с подсписками в формате (1((2 3) 4) 5 6)")
(define spisok (read))
(enumerate-tree spisok)
(define (add spisok)
(define (count spisok sum)
(if(null? spisok)
sum
(count(cdr spisok) (+ sum (car spisok)))))
(count (enumerate-tree spisok) 0))
(display  "Сумма элементов: " )(add spisok)


(display  "\nЗадание 2. Описать функцию, которая на основе списка чисел формирует список-результат следующим образом: первый элемент есть произведение
элементов списка, второй – произведение элементов хвоста, третий –произведение элементов хвоста и так далее. Пример: для списка
‘(1 2 3 4 5 6) результатом будет : ‘(720 720 360 120 30 6).
" )
(display "Введите список в формате (1 2 3 4 5 6)")
(define spisok1 (read))
(define (mlist spisok1)
  (cond ((null? spisok1) '())
        (true (cons (apply * spisok1) (mlist (cdr spisok1))))))
(display "Ответ: ")(mlist spisok1)


(display  "\nЗадание 3. Реализовать функцию включения объекта на заданное место в списке(нумерация элементов – от начала списка).
" )
(display "Введите список в формате (1 2 3 4 5 6)")
(define lst (read))
(display "Введите объект: ")
(define x (read))
(display "Введите позицию (счет с нуля): ")
(define n (read))
(define (foo lst x n) 
  (cond 
    ((= 0 n) (cons x lst)) 
    (true (cons (car lst) (foo (cdr lst) x (- n 1))))))
(display "Ответ: ")(foo lst x n) 




 