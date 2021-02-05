package ru.netology.managers;

import ru.netology.domain.PurchaseItem;

public class CartManager {
    private int defaultLength = 10; /* Последние 10 добавленных фильмов по умолчанию */
    //    private int currentLength;      /* Фактическое количество добавленнных фильмов */
    private PurchaseItem[] items = new PurchaseItem[0];

    public CartManager() {
    }

    public CartManager(int defaultLength) {
        this.defaultLength = defaultLength;
    }

    public void add(PurchaseItem item) {

        int length = items.length + 1;
        PurchaseItem[] tmp = new PurchaseItem[length];

        System.arraycopy(items, 0, tmp, 0, items.length);

        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public PurchaseItem[] getAll(int currentLength) {
        int length;
        if (currentLength < defaultLength) {
            length = currentLength;
        } else {
            length = defaultLength;
        }
        PurchaseItem[] result = new PurchaseItem[length];
        for (int i = 0; i < items.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }

}
