/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractFactory;

import abstractFactory.FurnitureFactory.FurnitureFactory;
import abstractFactory.FurnitureFactory.concreteFactory.ModernFurnitureFactory;
import abstractFactory.FurnitureFactory.concreteFactory.VictorianFurnitureFactory;
import abstractFactory.interfaceProdutos.Chair;
import abstractFactory.interfaceProdutos.Sofa;

/**
 * @author eric
 */
public class AppMainAbstractFactory {

    public static void main(String[] args) {

        /**
         * A maneira correta seria utilizar a mesma instância da fábrica para
         * criar os produtos, em vez de criar novas instâncias a cada chamada.
         * Portanto, você pode fazer da seguinte forma: Ao criar uma nova
         * instância de ModernFurnitureFactory() em cada chamada, você estaria
         * criando fábricas distintas, o que não é necessário nesse caso. Ao
         * utilizar a mesma instância da fábrica, você garante que os produtos
         * criados sejam coerentes entre si, pois pertencem à mesma família de
         * produtos.
         *
         * Obs: Isso é errado Chair modernChair = modernFactory.createChair();
         * Sofa modernSofa = modernFactory.createSofa(); // Ao criar uma nova
         * instância de ModernFurnitureFactory() em cada chamada, você estaria
         * criando fábricas distintas, o que não é necessário nesse caso. Ao
         * utilizar a mesma instância da fábrica, você garante que os produtos
         * criados sejam coerentes entre si, pois pertencem à mesma família de
         * produtos.
         */


        FurnitureFactory factory = new ModernFurnitureFactory();

        System.out.println("Produtos Modernos\n");
        Chair modernChair = factory.createChair();
        Sofa modernSofa = factory.createSofa();

        modernChair.sitOn();
        modernSofa.lieOn();

        System.out.println();
        System.out.println("Produtos Victoriano\n");
        factory = new VictorianFurnitureFactory();

        Chair victorianChair = factory.createChair();
        Sofa victorianSofa = factory.createSofa();

        victorianChair.sitOn();
        victorianSofa.lieOn();

    }
}
