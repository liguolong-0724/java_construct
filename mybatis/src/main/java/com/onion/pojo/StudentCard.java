package com.onion.pojo;

public class StudentCard {
    private int cardId;
    private String cardName;

    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    @Override
    public String toString() {
        return "StudentCard{" +
                "cardId=" + cardId +
                ", cardName='" + cardName + '\'' +
                '}';
    }
}
