package com.example.android3lesson1;

public class CountersContracts {
    interface CounterView {
        void updateCounter(int count);


        void greenText();
    }

    interface Presenter {
        void increment();

        void attachView(CounterView counterView);

        void decrease();

        void change();
    }
}
