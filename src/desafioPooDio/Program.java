package desafioPooDio;

import java.time.LocalDate;

public class Program {

	public static void main(String[] args) {
		
		
		
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescrição("Descrição curso java");
		curso1.setCargaHoraria(8);
		
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso delph");
		curso2.setDescrição("Descrição curso delph");
		curso2.setCargaHoraria(8);
		
		Mentoria mentoria  = new Mentoria();
		mentoria.setTitulo("Mentoria de java");
		mentoria.setDescrição("Descrição curso java");
		mentoria.setData(LocalDate.now());
		
		
		BootCamp bootcamp = new BootCamp();
		bootcamp.setNome("Bootcamp java develop");
		bootcamp.setDescricao("Descrição java develop");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devMarcilio = new Dev();
		devMarcilio.setNome("Marcilio");
		devMarcilio.inscreverBootCamp(bootcamp);
		System.out.println("Conteudo Inscrito Marcilio : " + devMarcilio.getConteudosInscritos());
		devMarcilio.progredi();
		devMarcilio.progredi();
		System.out.println("-");
		System.out.println("Conteudo concluido de  Marcilio : " + devMarcilio.getConteudosConcluidos());
		System.out.println("XP -> " + devMarcilio.calcularTotalXp());
	
		
		System.out.println("------");
			
		
		Dev devJose = new Dev();
		devJose.setNome("Jose");
		devJose.inscreverBootCamp(bootcamp);
		System.out.println("Conteudo Inscrito Jose : " + devJose.getConteudosInscritos());
		devJose.progredi();
		devJose.progredi();
		devJose.progredi();
		System.out.println("-");
		System.out.println("Conteudo concluido de Jose : " + devJose.getConteudosConcluidos());
		System.out.println("XP -> " + devJose.calcularTotalXp());
		
		
		/*
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);
		*/
	
		
		
	}

}
