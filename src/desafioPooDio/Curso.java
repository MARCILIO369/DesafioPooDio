package desafioPooDio;

public class Curso extends Conteudo{
		
	
	private int cargaHoraria;
	
	@Override
	public double calcularXP() {
		// TODO Auto-generated method stub
		return  XP_PADRAO * cargaHoraria;
	}
	
	
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	@Override
	public String toString() {
		return "Curso [Titulo=" + getTitulo() + ", descrição=" + getDescrição() + ", cargaHoraria=" + cargaHoraria + "]";
	}
	
	

}
