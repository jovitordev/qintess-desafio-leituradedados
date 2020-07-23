package io.github.jovitordev.controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import io.github.jovitordev.model.Dados;
import io.github.jovitordev.model.Produto;
import io.github.jovitordev.model.Resultado;

public class GeraArquivo {
	public static void main(String[] args) throws IOException {

		Long inicio = System.currentTimeMillis();
		System.out.println("Começou");

		List<Dados> list = new ArrayList<>();
		List<Produto> list2 = new ArrayList<>();
		List<Resultado> list3 = new ArrayList<>();

		String arquivo1 = "C:\\Users\\re039856\\Desktop\\desafio\\DadosMercado.csv";
		String arquivo2 = "C:\\Users\\re039856\\Desktop\\desafio\\Operacoes.csv";

		try (BufferedReader arq3 = new BufferedReader(new FileReader(arquivo1))) {
			String linha;
			// id PRECO
			arq3.readLine();
			while ((linha = arq3.readLine()) != null) {
				String coluna[] = linha.split(";");
				int idpreco = Integer.parseInt(coluna[0]);
				long nu_prazo = Long.parseLong(coluna[1]);
				double preco = Double.parseDouble(coluna[2].replace(",", "."));
				list.add(new Dados(preco, idpreco, nu_prazo));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		try (BufferedReader arq4 = new BufferedReader(new FileReader(arquivo2))) {
			String linha;
			arq4.readLine();
			while ((linha = arq4.readLine()) != null) {
				String colunas[] = linha.split(";");
				String data[] = colunas[1].split("/");

				int ano = Integer.parseInt(data[2]);
				int mes = Integer.parseInt(data[1]);
				int dia = Integer.parseInt(data[0]);

				LocalDate datainicio = LocalDate.of(ano, mes, dia);

				String data2[] = colunas[2].split("/");

				int ano2 = Integer.parseInt(data2[2]);
				int mes2 = Integer.parseInt(data2[1]);
				int dia2 = Integer.parseInt(data2[0]);

				LocalDate datafim = LocalDate.of(ano2, mes2, dia2);

				long dataresultado = ChronoUnit.DAYS.between(datainicio, datafim);
				// tela
				Produto datas = new Produto();

				datas.setPrazo(dataresultado);
				datas.setSubProduto(colunas[9]);
				Integer idPreco = (int) Double.parseDouble(colunas[13].replace(",", "."));
				Double quantidade = Double.parseDouble(colunas[12].replace(",", "."));
				datas.setQuantidade(quantidade);
				datas.setIdPreco(idPreco);
				list2.add(datas);
				// tela
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		for (Produto p : list2) {
			for (Dados d : list) {
				// arrumar abaixo
				if (d.getIdPreco() == p.getIdPreco() && d.getNu_Prazo() == p.getPrazo()) {
					list3.add(new Resultado((p.getQuantidade() * d.getPreco()), p.getSubProduto()));
					break;
				}
			}
		}
		List<Resultado> listResultadoFinal = new ArrayList<>();

		listResultadoFinal.add(new Resultado());

		for (Resultado r : list3) {
			int i = 0;
			for (Resultado rfinal : listResultadoFinal) {
				if (r.getNmsubproduto().equals(rfinal.getNmsubproduto())) {
					rfinal.setResultado((r.getResultado() + rfinal.getResultado()));
					break;
				} else {
					i++;
					if (listResultadoFinal.size() == i) {
						listResultadoFinal.add(r);
						break;
					}
				}
			}
			if (listResultadoFinal.get(0).getNmsubproduto() == null) {
				listResultadoFinal.remove(0);
			}
		}

		BufferedWriter re = new BufferedWriter(new FileWriter(new File("resultados3.csv")));

		for (Resultado resultado : listResultadoFinal) {

			re.newLine();
			re.write(resultado.getNmsubproduto() + ";" + resultado.getResultado());

		}
		re.close();

		// leitura em milisegundos
		long fim = System.currentTimeMillis();
		// tela
		System.out.println("tempo de execução: " + (fim - inicio) / 1000d + " Segundos");
	}
}
