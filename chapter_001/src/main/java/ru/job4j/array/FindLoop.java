package ru.job4j.array;


/**
 * Метод поиска перебором.
 * @author Anton Narayan
 * @version 0.1
 * @since 0.1
 */
public class FindLoop {
    /**
     *
     * @param data массив
     * @param el элемент
     * @return result
     */
    public int indexOf(int[] data, int el) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}