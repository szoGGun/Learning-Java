package com.przemyslawrutkowski;

public class Button {

    private String title;
    private onClickListener onClickListener;

    public Button(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setOnClickListener(onClickListener onclickListener){
        this.onClickListener = onclickListener;
    }

    public void onClick() {
        this.onClickListener.onClick(this.title);
    }

    public interface onClickListener {
        public void onClick(String title);
    }

}
