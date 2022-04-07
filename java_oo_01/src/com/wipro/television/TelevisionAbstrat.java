package com.wipro.television;

public abstract class TelevisionAbstrat {
    private Integer channel = 1;
    private Integer volume = 0;
    private boolean isConnect = false;

    public TelevisionAbstrat() {
        this.isConnect = true;
    }

    public void increaseVolume() {
        this.volume = this.volume < 100 ? this.volume +=1 : 100;
    }

    public void decreaseVolume() {
        this.volume = this.volume > 1 ? this.volume -=1 : 0;
    }

    public void increaseChannel() {
        this.channel = this.channel <= 100 ? this.channel += 1 : 1;
    }

    public void decreaseChannel() {
        this.channel = this.channel > 2 ? this.channel -=1 : 100;
    }

    public void chooseChannel(Integer channel) {
        this.channel = channel;
    }

    public Integer consultChannel() {
        return this.channel;
    }

    public Integer consultVolume() {
        return this.volume;
    }

    @Override
    public String toString() {
        return "Televisão => {" +
                "está no canal " + channel +
                ", com volume " + volume +
                '}';
    }
}
