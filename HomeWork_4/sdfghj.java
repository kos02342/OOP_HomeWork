package HomeWork_4;

import HomeWork_4.gb.list.GBLinkedList;


public class Main {
    public static void main(String[] args) {
        GBLinkedList<Integer> gblist = new GBLinkedList<>();
        gblist.add(2)
                .add(3)
                .add(4)
                .add(5)
                .add(1,6); // ����������� ����������� ������������� ���������
        System.out.println(gblist);
        
        gblist.addFirst(1); // добавление в начало јпијка
        gblist.addLast(6); // добавление в конец јпијка
        System.out.println(gblist);

        gblist.remove(2); // јдаление элемента из јпијка по индекјј
        System.out.println(gblist);