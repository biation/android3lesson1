package com.example.android3lesson1;

public class CounterPresenter implements CountersContracts.Presenter  {



    CounterModel counterModel;
    CountersContracts.CounterView counterView;

    public CounterPresenter() {
        counterModel = new CounterModel();
    }

    @Override
    public void increment() {
        counterModel.increment();
        counterView.updateCounter(counterModel.getCount());
    }

    @Override
    public void attachView(CountersContracts.CounterView counterView) {
        this.counterView = counterView;
    }

    @Override
    public void decrease() {
        counterModel.decrease();
        counterView.updateCounter(counterModel.getCount());
    }

    @Override
    public void change() {
        if (counterModel.getCount() == 10) {
            counterView.greenText();
        }
    }
}
