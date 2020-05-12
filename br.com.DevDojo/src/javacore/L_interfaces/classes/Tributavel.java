package javacore.L_interfaces.classes;

public interface Tributavel {
	
	//atributos em interfaces sao por padrao, sao public, static e final, portanto devem ser inicializadas
	public static final double IMPOSTO = 0.2;
	//double IMPOSTO = 0.2; seria o suficiente
	
	//todas os metodos em interfaces ja sao por padrao, public e abstrac,
	public abstract void calculaImposto();
	//proteced void calcularImposto(); seria o suficiente
	 

}
