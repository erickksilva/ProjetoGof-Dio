/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package abstractFactory.FurnitureFactory;

import abstractFactory.interfaceProdutos.Chair;
import abstractFactory.interfaceProdutos.Sofa;

/**
 * @author eric
 */
public interface FurnitureFactory {

    Chair createChair();

    Sofa createSofa();
}
