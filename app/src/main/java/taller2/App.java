/*
 * Este es el segundo taller de lógica de programación. En este taller deben comenzar a prácticar hacer las validaciones
 * de los datos que va a recibir la función usando los condicionales if. 
 * 
 * Como en el anterior, tenga en cuenta la siguiente rúbrica para cada ejercicio la cual, 
 * se basa en los mandamientos del programador. El taller es una herramienta para comenzar a preparar la evaluación 
 * donde los descuentos si van a ser tenidos en cuenta. 
 * Con este taller, usted irá aprendiendo a aplicar buenas prácticas en la programación.
 * 
 * La siguiente rúbrica se descuenta en cada ejercicio y es acumulativa:
 * Descuento por quemar valores en el código y no usar constantes: -0.5
 * Descuento por no implementar control de errores con trycatch: -0.8
 * Descuento por no escribir el código ordenado, identado: -0.4
 * 
 * RÉTESE, PÓNGASE A PRUEBA!!!
 * 
 */
package taller2;

public class App {

    public static void main(String[] args) {
        try {
    
        } 
        
        catch (Exception e) {
            System.out.println(e);
        }


    }


    /*
     * 1. Diseñe un algoritmo e implemente la función Calcular_saldo que reciba
     * tres enteros: la base de dinero en la taquilla, el total de recaudos y
     * el total de retiros, y retorne un entero que represente el saldo final
     * en la taquilla.
     * 
     * Valide que la base sea igual a 2.000.000. Si no es así, retorne -1.
     * 
     * saldo_taquilla = base + total recaudos - total_retiros
     * Si hay algún error, retorne -1.
     */
        public static int Calcular_saldo(int base_dinero, int tot_recaudos, int tot_retiros){
        try {
            int saldo_taquilla=0;
            final int base = 2000000;
        
            if (base_dinero == base) {
               saldo_taquilla = base_dinero + tot_recaudos - tot_retiros;
               
            } else {
                return -1; 
            }

            return saldo_taquilla;

        } catch (Exception e) {
            return -1;
        }
    }

    /*
     * 2. Diseñe un algoritmo e implemente la función Calcular_tip que reciba
     * un float representando el valor del consumo de un cliente, y devuelva
     * un string que contenga el valor de la propina (10%), el impuesto al
     * consumo (8%) y el valor total a pagar.
     * 
     * MUY IMPORTANTE:
     * 
     * El formato del string debe ser: valor comida: $### - valor propina $### -
     * valor impoconsumo $### - total a pagar $###.
     * 
     * Si hay algún error, retorne "Error en la función Calcular_tip".
     * 
     * Ademas de esto, primero valide que el valor del consumo sea mayor a 0. Si no
     * es así, retorne "Error calculando consumo".
     * 
     */
        public static String Calcular_tip(float val_consumo){
        try {
            String consumo="";
            float val_propina=0, imp_consumo=0, tot_pagar=0;
            final float propina=0.1f, impuesto=0.08f;

            if (val_consumo > 0) {
                val_propina= val_consumo * propina;
                imp_consumo= val_consumo * impuesto;
                tot_pagar= val_consumo + val_propina + imp_consumo;
                consumo = "valor comida: $" +val_consumo + " - " + "valor propina $" +val_propina + " - "+"valor impoconsumo $"+imp_consumo+ " - "+ "total a pagar $"+ tot_pagar ;
                return consumo;
            } else {
                return "Error calculando consumo";
            }
            
        } catch (Exception e) {
            return "Error en la funcion Calcular_tip";
        }
    }


    /*
     * 3. Diseñe un algoritmo e implemente la función Obtener_puntos que reciba
     * tres enteros representando el número de partidos ganados, perdidos y
     * empatados de un equipo de fútbol, y devuelva un entero que represente
     * los puntos totales del equipo. La puntuación sigue los lineamientos
     * de la FIFA: 3 puntos por partido ganado, 1 punto por partido empatado y
     * 0 puntos por partido perdido. Si hay algún error, retorne -1.
     * 
     * Valide ademas que los partidos ganados, perdidos y empatados sean mayores o
     * iguales a 0. Si no es así, retorne -1.
     * 
     */
        public static int Obtener_puntos(int part_win, int part_lose, int part_igual){
        try {
           int tot_puntos=0, puntos_win=0, puntos_lose=0, puntos_igual=0;
           final int win=3, lose=0, igual=1; 
           
           if (part_win >=0 && part_lose >=0 && part_igual >=0 ) {
            puntos_win= part_win*win;
            puntos_lose= part_lose*lose;
            puntos_igual= part_igual*igual;
            tot_puntos= puntos_win + puntos_lose + puntos_igual;
            return tot_puntos;

           } else {
                return -1;
           }

        } catch (Exception e) {
            return -1;
        }
    }

    /*
     * 4. Diseñe un algoritmo e implemente la función Calcular_definitiva que
     * reciba cinco floats representando las notas (entre 0 y 5) y cinco floats
     * representando los porcentajes (que entre todos deberán sumar 1 y cada uno
     * estar entre 0 y 1),
     * y devuelva un float que represente la nota definitiva. Si algo está mal
     * con los porcentajes o con las notas, retorne -1.
     */
        public static float Calcular_definitiva(float n1, float n2, float n3, float n4, float n5, float p1, float p2, float p3, float p4, float p5){
        try {
            float tot_nota=0, tot_porcentaje=0;
            tot_porcentaje= p1+p2+p3+p4+p5;

            if (n1>0 && n1<5 && n2>0 && n2<5 && n3>0 && n3<5 && n4>0 && n4<5 && n5>0 && n5<5 
            && p1>0 && p1<1 && p2>0 && p2<1 && p3>0 && p3<1 && p4>0 && p4<1 && p5>0 && p5<1 
            && tot_porcentaje==1) {

                tot_nota=(n1*p1 + n2*p2 + n3*p3 + n4*p4 + n5*p5);
                return tot_nota;

            } else {
               return -1; 
            }

        } catch (Exception e) {
            return -1;
        }
    }

    /*
     * 5. Diseñe un algoritmo e implemente la función Calcular_para_ganar que
     * reciba cinco floats representando los porcentajes de una materia (que
     * deberán sumar 1 y estar entre 0 y 1) y cuatro floats representando las
     * primeras notas (entre 0 y 5), y devuelva un float que represente la
     * nota que deberá sacar para ganar si el puntaje mínimo es 3. Si algo
     * está mal con los porcentajes o con las notas, retorne -1.
     */
        public static float Calcular_para_ganar(float n1, float n2, float n3, float n4, float p1, float p2, float p3, float p4, float p5){
        try {
            float tot_nota=0, tot_porcentaje=0, nota_necesaria=0;
            final float puntaje_minimo=3;
            tot_porcentaje= p1+p2+p3+p4+p5;

            if (tot_porcentaje==1 
            && p1>0 && p1<1 && p2>0 && p2<1 && p3>0 && p3<1 && p4>0 && p4<1 && p5>0 && p5<1
            && n1>0 && n1<5 && n2>0 && n2<5 && n3>0 && n3<5 && n4>0 && n4<5) {
                
                tot_nota=(n1*p1 + n2*p2 + n3*p3 + n4*p4);
                nota_necesaria=(puntaje_minimo-tot_nota)/p5;
                return nota_necesaria;

            } else {
                return -1; 
            }

        } catch (Exception e) {
            return -1;
        }
    }

    /*
     * 6. Diseñe un algoritmo e implemente la función Calcular_salario que
     * reciba cuatro enteros: cantidad de horas normales laboradas, cantidad
     * de horas extras diurnas laboradas, cantidad de horas extras nocturnas
     * laboradas, y el valor de la hora normal como un float. La función debe
     * retornar un float con el salario total. Las horas extras diurnas tienen
     * un recargo adicional del 15% sobre la hora normal, y las horas extras
     * nocturnas tienen un recargo adicional del 35% sobre la hora normal.
     * 
     * Valide que el valor de la hora normal sea mayor a 0. Si no es así, retorne
     * -1.
     * 
     * Si hay algún error, retorne -1.
     */
        public static float Calcular_salario(int horas_laboradas, int horas_diurnas, int horas_nocturnas, float valor_hora){
        try {
            float salario_total=0, valor_diurnas=0, valor_nocturnas=0;
            final float porcen_diurnas=0.15f, porcen_nocturnas=0.35f;

            if (valor_hora > 0) {
                valor_diurnas= (valor_hora*horas_diurnas)*porcen_diurnas;
                valor_nocturnas= (valor_hora*horas_nocturnas)*porcen_nocturnas;
                salario_total= (float)(horas_laboradas*valor_hora)+valor_diurnas+valor_nocturnas;
                return salario_total;
                
            } else {
                return -1;
            }
        } catch (Exception e) {
            return -1;
        }
    }

    /*
     * 7. Diseñe un algoritmo e implemente la función Calcular_area_triangulo
     * que reciba dos floats representando la base y la altura de un triángulo
     * rectángulo, y devuelva un float que represente el área del triángulo.
     * 
     * Valide que la base y la altura sean mayores a 0. Si no es así, retorne -1.
     * 
     * La fórmula del área es: área = 1/2 * base * altura.
     * 
     * Si hay algún error, retorne -1.
     */
        public static float Calcular_area_triangulo(float base, float altura){
        try {
            float area_triangulo=0;
            final float constante_area=(float)1/2;

            if (base >0 && altura >0) {
                area_triangulo= constante_area * base * altura;
                return area_triangulo;
            } else {
                return -1;
            }

        } catch (Exception e) {
            return -1;
        }
    }

    /*
     * 8. Diseñe un algoritmo e implemente la función Calcular_perimetro_cuadrado
     * que reciba un float representando el lado de un cuadrado, y devuelva un
     * float que represente el perímetro del cuadrado.
     * 
     * Valide que el lado sea mayor a 0. Si no es así, retorne -1.
     * 
     * La fórmula del perímetro es: perímetro = lado * 4.
     * 
     * Si hay algún error, retorne -1.
     */
        public static float Calcular_perimetro_cuadrado(float lado_cuadrado){
        try {
            float tot_perimetro=0;
            final float lados=4;
            if (lado_cuadrado > 0) {
                tot_perimetro= lado_cuadrado * lados;
                return tot_perimetro;

            } else {
                return -1;
            }

        } catch (Exception e) {
            return -1;
        }
    }

    /*
     * 9. Diseñe un algoritmo e implemente la función Calcular_volumen_cilindro
     * que reciba dos floats representando el radio de la base y la altura de
     * un cilindro, y devuelva un float que represente el volumen del cilindro.
     * 
     * Valide que el radio y la altura sean mayores a 0. Si no es así, retorne -1.
     * 
     * La fórmula del volumen es: V = pi * radio^2 * altura, usando pi con
     * precisión de 7 decimales (3.1415927).
     * 
     * Si hay algún error, retorne -1.
     */
        public static float Calcular_volumen_cilindro(float radio_base, float altura_cilindro){
        try {
            float tot_volumen=0;
            final float pi= 3.1415927f, radio= (radio_base*radio_base);
            
            if (radio_base >0 && altura_cilindro >0) {
                tot_volumen= pi * radio * altura_cilindro;
                return tot_volumen;
                
            } else {
                return -1;
            }

        } catch (Exception e) {
            return -1;
        }
    }

    /*
     * 10. Diseñe un algoritmo e implemente la función Calcular_area_circulo
     * que reciba un float representando el radio de un círculo, y devuelva un
     * float que represente el área del círculo.
     * 
     * Valide que el radio sea mayor a 0. Si no es así, retorne -1.
     * 
     * La fórmula del área es: área = pi * radio^2, usando pi con precisión
     * de 7 decimales (3.1415927).
     * 
     * Si hay algún error, retorne -1.
     */
        public static float Calcular_area_circulo(float radio_circulo){
        try {
            float tot_area=0;
            final float pi= 3.1415927f, radio= (radio_circulo*radio_circulo);
            
            if (radio_circulo >0) {
                tot_area= pi * radio;
                return tot_area;

            } else {
                return -1;
            }

        } catch (Exception e) {
            return -1;
        }
    }



}
