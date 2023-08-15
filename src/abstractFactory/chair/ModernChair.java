/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractFactory.chair;

import abstractFactory.interfaceProdutos.Chair;

/**
 * @author eric
 */
public class ModernChair implements Chair {

    @Override
    public void sitOn() {
        System.out.println("Sentando em uma cadeira de cadeira Moderna muito agradavel.");
    }

}
