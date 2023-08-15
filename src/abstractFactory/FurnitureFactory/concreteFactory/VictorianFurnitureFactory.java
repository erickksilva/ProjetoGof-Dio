/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractFactory.FurnitureFactory.concreteFactory;

import abstractFactory.FurnitureFactory.FurnitureFactory;
import abstractFactory.chair.VictorianChair;
import abstractFactory.interfaceProdutos.Chair;
import abstractFactory.interfaceProdutos.Sofa;
import abstractFactory.sofa.VictorianSofa;

/**
 * @author eric
 */
public class VictorianFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }

}
