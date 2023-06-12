 package visao;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import controle.*;
import modelo.*;

public class TelaCadastro implements ActionListener {
    private JFrame janelaCadastro;
    private JPanel painelCadastro = new JPanel();

    private JButton salvar = new JButton("salvar");
    private JButton excluir = new JButton("excluir");
    private JButton patrimonios = new JButton("Patrimônios");
    private JButton imobiliario = new JButton("Imobiliário");
    private JButton utilitario = new JButton("Utilitário");
    private JButton veiculo = new JButton("Veículo");
    
    private Font arial = new Font("Arial", Font.BOLD, 14);
    private Color cinzinha = new Color(230, 230, 230);

    private JLabel textoNome = new JLabel("Nome:");
    private JLabel textoValor = new JLabel("Valor: R$");
    private JLabel textoQuantidade = new JLabel("Quantidade:");
    private JLabel textoDescricao = new JLabel("Descrição:");
    private JLabel textoFuncao = new JLabel("Função:");
    private JLabel textoCor = new JLabel("Cor:");
    private JLabel textoModelo = new JLabel("Modelo:");
    private JLabel textoFabricante = new JLabel("Fabricante:");
    private JLabel textoArea = new JLabel("Área:                     m²");
    private JLabel textoEndereco = new JLabel("Endereço:");
    private JLabel textoTipo = new JLabel("Tipo:");
    private JLabel textoCnpj = new JLabel("CNPJ:");
    private JLabel textoEmail = new JLabel("Email:");
    private JLabel textoTelefone = new JLabel("Telefone:");
    
    private JTextField nome = new JTextField();
    private JTextField valor = new JTextField();
    private JTextField quantidade = new JTextField();
    private JTextField descricao = new JTextField(), funcao = new JTextField(), cor = new JTextField(),
    		modelo = new JTextField(), fabricante = new JTextField(), area = new JTextField(),
            endereco = new JTextField(), tipo = new JTextField(),cnpj = new JTextField(),
            email = new JTextField(), telefone = new JTextField();
    
    Filial filial = new Filial(null, 0, null, 0, null);
    
    int telaSelecionada;
    public TelaCadastro(int tela) {
        //tela de cadastro de filial
        if(tela == 1) {
        	telaSelecionada = 1;
            janelaCadastro = new JFrame("Cadastro Filial");
            janelaCadastro.setBounds(10, 450, 500, 300);

            textoNome.setBounds(40, 30, 60, 20);
            textoCnpj.setBounds(40, 60, 60, 20);
            textoEmail.setBounds(40, 90, 60, 20);
            textoTelefone.setBounds(40, 120, 80, 20);
            textoEndereco.setBounds(40, 150, 80, 20);
            nome.setBounds(120, 30, 250, 23);
            cnpj.setBounds(120, 60, 250, 23);
            email.setBounds(120, 90, 250, 23);
            telefone.setBounds(120, 120, 250, 23);
            endereco.setBounds(120, 150, 250, 23);
            patrimonios.setBounds(185, 220, 105, 30);

            patrimonios.setBackground(cinzinha);

            textoNome.setFont(arial);
            textoCnpj.setFont(arial);
            textoEmail.setFont(arial);
            textoTelefone.setFont(arial);
            textoEndereco.setFont(arial);

            janelaCadastro.add(patrimonios);

            janelaCadastro.add(textoNome);
            janelaCadastro.add(textoCnpj);
            janelaCadastro.add(textoEmail);
            janelaCadastro.add(textoTelefone);
            janelaCadastro.add(textoEndereco);

            janelaCadastro.add(nome);
            janelaCadastro.add(cnpj);
            janelaCadastro.add(email);
            janelaCadastro.add(telefone);
            janelaCadastro.add(endereco);
            
            patrimonios.addActionListener(this);
        }

        //tela de cadastro de patrimonio
        else if(tela == 2) {
        	telaSelecionada = 2;
            janelaCadastro = new JFrame("Cadastro Patrimônio");
            janelaCadastro.setBounds(1025, 450, 500, 300);

            imobiliario.setBounds(10, 15, 100, 20);
            utilitario.setBounds(185, 15, 100, 20);
            veiculo.setBounds(365, 15, 100, 20);

            imobiliario.setBackground(cinzinha);
            utilitario.setBackground(cinzinha);
            veiculo.setBackground(cinzinha);

            janelaCadastro.add(imobiliario);
            janelaCadastro.add(utilitario);
            janelaCadastro.add(veiculo);

            imobiliario.addActionListener(this);
            utilitario.addActionListener(this);
            veiculo.addActionListener(this);
        }

        //configuracoes basicas para ambas as telas
        janelaCadastro.setLayout(null);
        painelCadastro.setLayout(null);

        salvar.setBounds(20, 220, 100, 30);
        excluir.setBounds(360, 220, 100, 30);

        salvar.setBackground(cinzinha);
        excluir.setBackground(cinzinha);

        janelaCadastro.add(salvar);
        janelaCadastro.add(excluir);

        janelaCadastro.add(painelCadastro);
        janelaCadastro.setVisible(true);

        salvar.addActionListener(this);
        excluir.addActionListener(this);
    }
    
    public void CadastroPatrimonio(String patri) {
        painelCadastro.removeAll();
        painelCadastro.setBounds(5, 30, 475, 190);

        textoNome.setFont(arial);
        textoNome.setBounds(67, 35, 100, 15);
        nome.setBounds(120, 35, 250, 20);
        
        painelCadastro.add(textoNome);
        painelCadastro.add(nome);
        
        if (patri.equals("Imobiliário")) {
        	textoTipo.setFont(arial);
        	textoValor.setFont(arial);
        	textoArea.setFont(arial);
        	textoEndereco.setFont(arial);
        	
        	textoTipo.setBounds(80, 65, 100, 20);
            tipo.setBounds(120, 65, 250, 20);
            textoValor.setBounds(50, 95, 100, 20);
            valor.setBounds(120, 95, 100, 20);
            textoArea.setBounds(230, 95, 200, 20);
            area.setBounds(275, 95, 75, 20);
            textoEndereco.setBounds(45, 125, 100, 20);
            endereco.setBounds(120, 125, 250, 20);
            
            painelCadastro.add(textoTipo);
            painelCadastro.add(tipo);
            painelCadastro.add(textoValor);
            painelCadastro.add(valor);
            painelCadastro.add(textoArea);
            painelCadastro.add(area);
            painelCadastro.add(textoEndereco);
            painelCadastro.add(endereco);
        }
        
        else if (patri.equals("Utilitario")) {
        	textoDescricao.setFont(arial);
        	textoFuncao.setFont(arial);
        	textoValor.setFont(arial);
        	textoQuantidade.setFont(arial);
        	
        	textoDescricao.setBounds(40, 65, 100, 20);
            descricao.setBounds(120, 65, 250, 20);
            textoFuncao.setBounds(60, 95, 100, 20);
            funcao.setBounds(120, 95, 250, 20);
            textoValor.setBounds(50, 125, 100, 20);
            valor.setBounds(120, 125, 95, 20);
            textoQuantidade.setBounds(220, 125, 200, 20);
            quantidade.setBounds(310, 125, 60, 20);
            
            painelCadastro.add(textoDescricao);
            painelCadastro.add(descricao);
            painelCadastro.add(textoFuncao);
            painelCadastro.add(funcao);
            painelCadastro.add(textoValor);
            painelCadastro.add(valor);
            painelCadastro.add(textoQuantidade);
            painelCadastro.add(quantidade);
        }
        
        else if (patri.equals("Veiculo")) {
        	textoCor.setFont(arial);
        	textoModelo.setFont(arial);
        	textoFabricante.setFont(arial);
        	textoValor.setFont(arial);
        	textoQuantidade.setFont(arial);
        	
        	nome.setBounds(120, 35, 270, 20);
        	
            textoModelo.setBounds(60, 65, 100, 15);
            modelo.setBounds(120, 65, 270, 20);
            textoCor.setBounds(85, 95, 100, 20);
            cor.setBounds(120, 95, 80, 20);
            textoFabricante.setBounds(205, 95, 100, 20);
            fabricante.setBounds(290, 95, 100, 20);
            textoValor.setBounds(220, 125, 100, 20);
            valor.setBounds(290, 125, 100, 20);
            textoQuantidade.setBounds(30, 125, 200, 20);
            quantidade.setBounds(120, 125, 80, 20);
            
            painelCadastro.add(textoCor);
            painelCadastro.add(cor);
            painelCadastro.add(textoModelo);
            painelCadastro.add(modelo);
            painelCadastro.add(textoFabricante);
            painelCadastro.add(fabricante);
            painelCadastro.add(textoValor);
            painelCadastro.add(valor);
            painelCadastro.add(textoQuantidade);
            painelCadastro.add(quantidade); 
        }
        
        janelaCadastro.revalidate();
        janelaCadastro.repaint();
    }
    
    public Filial inserirEditar() {
    	return filial;
    }
    
    public void actionPerformed(ActionEvent event) {
        if(event.getSource() == salvar) {
        	if(telaSelecionada == 1) {
        		
        		// Filial filial = new Filial(null, 0, null, 0, null);
        		boolean sucesso;
        		
        			filial.setNome(nome.getText());
        			filial.setCnpj(Long.parseLong(cnpj.getText()));
        			filial.setEmail(email.getText());
        			filial.setTelefone(Long.parseLong(telefone.getText()));
        			filial.setEndereco(endereco.getText());
        		
        			System.out.printf(filial.getTelefone() + "\n");
        			System.out.printf(filial.getEmail() + "\n");
        			System.out.printf(filial.getEndereco() + "\n");

        			sucesso = filial.verificacaoCadastro(filial);
        			
        			if(sucesso == true) {
        				sucessoCadastro();
        				
        			}
        			else {
        				erroCadastro();
        			}
        	}
        	if(telaSelecionada == 2) {
        		
        	}
        }

        else if(event.getSource() == excluir) {

        }

        else if(event.getSource() == patrimonios) {
            new TelaPatrimonio();
        }

        else if(event.getSource() == imobiliario) {
            CadastroPatrimonio("Imobiliário");
        }

        else if(event.getSource() == utilitario) {
        	CadastroPatrimonio("Utilitario");
        }

        else if(event.getSource() == veiculo) {
        	CadastroPatrimonio("Veiculo");
        }
    }
    public void sucessoCadastro() {
    	JOptionPane.showMessageDialog(null, "Filial Cadastrada",null, JOptionPane.INFORMATION_MESSAGE);
    }
    public void erroCadastro() {
    	JOptionPane.showMessageDialog(null, "Erro ao cadastrar filial", null, JOptionPane.ERROR_MESSAGE);
    }
}