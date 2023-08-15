/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractFactory.sofa;

import abstractFactory.interfaceProdutos.Sofa;

/**
 *
 * @author eric
 */
public class ModernSofa implements Sofa {

    @Override
    public void lieOn() {
        System.out.println("Deitado em um sofa Moderno muito agradevel.");
    }

}
