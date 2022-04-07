package com.wipro.television;

public class Main {

    public static void main(String[] args) {
	    TelevisionAbstrat television = new Television();
        TelevisionAbstrat remoteControl = new RemoteControl();

        System.out.println("\n=======================TESTE TELEVISÃO===================================");
        for(int i = 0; i< 110; i++) {
            System.out.println("Estado da Televisão: " + television);
            television.increaseChannel();
            television.increaseVolume();
        }
        System.out.println("\n=======================TESTE TELEVISÃO COM CONTROLE REMOTO===================================");
        for(int i = 0; i< 110; i++) {
            System.out.println("Estado da Televisão usando o controle: " + remoteControl);
            remoteControl.increaseChannel();
            remoteControl.increaseVolume();
        }
    }
}
