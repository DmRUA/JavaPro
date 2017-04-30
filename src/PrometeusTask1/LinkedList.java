package PrometeusTask1;

/**
 * Created by DmRG on 06.03.2017.
 */
/*Завдання 1

(3 можливих бали)
Створіть клас що описує зв'язний список. Клас повинен мати можливість додавання елементів та вилучення елементів. Додавання елементів відбувається в кінець списку, вилучення елементів відбувається за порядковим номером.Також створіть методи, що дозволяють отримати розмір списку та елемент за його порядковим номером.

Елементи списку повинні бути типу Node

Особливості використання класу Integer Ви зможете знайти за цим посиланням або тут російською мовою, розділ Обертки. З особливостями використання обгорток ми з Вам будемо знайомитися быльш детально на наступних тижнях.

Просимо врахувати деякі особливості перевірки завдань:

Декларація package повинна залишатися незмінною (як у шаблоні), зверніть на це увагу вставляючи Ваш код у вікно перевірки.
Для перевірки використовуються (беруться до уваги) виключно методи з сигнатурою описаною в шаблоні.
Кількість та зміст полів та/або методів відмінних від наведених в шаблоні не обмежена.
В кожному класі повинен бути або конструктор за замовчанням або public безаргументний конструктор.
Не рекомендовано робити вивід на екран.*/

public class LinkedList {
    private int size = 0;
    private Node firstNode;
    private Node currentNode;


    public LinkedList() {
    }

    public void add(Integer data) {
        if (firstNode == null) {
            Node firstNode = new Node();
            firstNode.setData(data);
            this.firstNode = firstNode;
            this.size++;
        } else if (this.firstNode.getNext() == null) {
            Node nextNode = new Node();
            nextNode.setData(data);
            this.firstNode.setNext(nextNode);
            this.currentNode = nextNode;
            this.size++;
        } else {
            Node nextNode = new Node();
            nextNode.setData(data);
            currentNode.setNext(nextNode);
            currentNode = nextNode;
            this.size++;
        }
    }

    public Integer get(int index) {
        if (index >= 0 & index <= size - 1) {
            if (index == 0) {
                return this.firstNode.getData();
            } else {
                Node tempNode = firstNode.getNext();
                while (index - 1 != 0) {
                    tempNode = tempNode.getNext();
                    index--;
                }
                return tempNode.getData();
            }
        } else return null;
    }

    public boolean delete(int index) {
        if (index >= 0 & index <= size - 1) {
            int indexTemp = index + 1;
            if (index == 0) {
                this.firstNode = this.firstNode.getNext();
                size--;
                return true;
            } else {
                Node tempNodePrev = firstNode;
                while (--index > 0) {
                    tempNodePrev = tempNodePrev.getNext();
                }
                if (size != indexTemp) {
                    Node tempNodeNext = tempNodePrev.getNext();
                    tempNodePrev.setNext(tempNodeNext.getNext());
                    size--;
                    return true;
                } else {
                    tempNodePrev.setNext(null);
                    currentNode = tempNodePrev;
                    size--;
                    return true;
                }
            }
        }
        return false;
    }

    public int size() {
        return this.size;
    }
}