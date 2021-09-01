import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ex extends JPanel{
	private String lanche_s, acomp_s, beb_s, sobre_s, pagamento;
	private double valor_total;
	private JLabel lanche, acomp, beb, sobre, fundo, img, txt1, txt2, txt3;
	private JLabel title, lanche_nom, pag_nom;
	private ImageIcon img1, img2;
	private JButton btVerificar, next;
	private JRadioButton lanche1, lanche2, lanche3, lanche4;
	private JRadioButton acomp1, acomp2, acomp3;
	private JRadioButton beb1, beb2, beb3;	
	private JRadioButton sobre1, sobre2;
	private JRadioButton vr, r$, cartao;		
	private ButtonGroup lanches, acompanhamentos, bebidas, sobremesas, pagamentos;
	
	public ex(){
		inicializarComponentes();
		definirEventos();
		
		
	}
	
		//=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
	
	private void inicializarComponentes(){
		setLayout(null);
		
		txt1 = new JLabel("Fast Food M&M");
		txt2 = new JLabel("Menu:");
		txt3 = new JLabel("Formas de Pagamento:");
		
		btVerificar = new JButton("Verificar");
		img1 = new ImageIcon("C:\\Users\\Miguel\\Desktop\\Cardápio\\lanche.png");
		img2 = new ImageIcon("C:\\Users\\Miguel\\Desktop\\Cardápio\\Seta.png");
		next = new JButton("");
		next.setIcon(img2);
		next.setBorder(null);
		title = new JLabel("Fast Food M&M");
		lanche_nom = new JLabel("Cardápio");
		pag_nom = new JLabel("Formas de pagamentos");
		
		lanche = new JLabel("Lanches");
		acomp = new JLabel("Acompanhamentos");
		beb = new JLabel("Bebidas");
		sobre = new JLabel("Sobremesas");
		
		img = new JLabel(img1);
		img.setBounds(937, 0,472,700);
		fundo = new JLabel("");
		fundo.setBackground(Color.red);
		
		//=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		
		txt1.setFont(new Font("Arial",1, 38));
		txt2.setFont(new Font("Arial",1, 30));
		txt3.setFont(new Font("Arial",1, 30));
		
		//=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		
		lanche1 = new JRadioButton("Hambúrguer de Frango - R$7,50");
		lanche2 = new JRadioButton("Hambúrguer de Carne - R$7,50");
		lanche3 = new JRadioButton("Hot-dog - R$6,00");
		lanche4 = new JRadioButton("X-tudo - R$7,50");
		
		acomp1 = new JRadioButton("Batata Frita - R$7,50");
		acomp2 = new JRadioButton("Onion Rings - R$9,00");
		acomp3 = new JRadioButton("Batata Rústica - R$9,00");
		
		beb1 = new JRadioButton("Coca-cola - R$5,00");
		beb2 = new JRadioButton("Guaraná - R$5,00");
		beb3 = new JRadioButton("Sprite - R$5,00");
		
		sobre1 = new JRadioButton("Pudim - R$5,00");
		sobre2 = new JRadioButton("Mousse de Maracujá - R$5,00");
		
		vr = new JRadioButton("Vale-Refeição");
		r$ = new JRadioButton("Dinheiro");
		cartao = new JRadioButton("Cartão de Crédito");
		
		//=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		
		lanches = new ButtonGroup();
		lanches.add(lanche1);
		lanches.add(lanche2);
		lanches.add(lanche3);
		lanches.add(lanche4);
		
		acompanhamentos = new ButtonGroup();
		acompanhamentos.add(acomp1);
		acompanhamentos.add(acomp2);
		acompanhamentos.add(acomp3);
		
		bebidas = new ButtonGroup();
		bebidas.add(beb1);
		bebidas.add(beb2);
		bebidas.add(beb3);
		
		sobremesas = new ButtonGroup();
		sobremesas.add(sobre1);
		sobremesas.add(sobre2);
		
		pagamentos = new ButtonGroup();
		pagamentos.add(vr);
		pagamentos.add(r$);
		pagamentos.add(cartao);
		
		//=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		
		btVerificar.setBounds(55,105,100,20);
		fundo.setBounds(0,0,1400,800);
	
		txt1.setBounds(50, 70, 300, 30);
		txt2.setBounds(100, 150, 300, 30);
		
		lanche1.setBounds(100,200,220,30);
		lanche2.setBounds(100,250,200,30);
		lanche3.setBounds(100,300,170,30);
		lanche4.setBounds(100,350,170,30);
		
		acomp1.setBounds(320,200,170,30);
		acomp2.setBounds(320,250,170,30);
		acomp3.setBounds(320,300,170,30);
		
		beb1.setBounds(490,200,170,30);
		beb2.setBounds(490,250,170,30);
		beb3.setBounds(490,300,170,30);
		
		sobre1.setBounds(660,200,170,30);
		sobre2.setBounds(660,250,200,30);
		
		txt3.setBounds(100, 400, 700, 50);
		
		vr.setBounds(100,450,170,30);
		r$.setBounds(100,500,170,30);
		cartao.setBounds(100,550,170,30);
		
		next.setBounds(800, 525, 100, 75);
		
		//=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		
		txt1.setBackground(null);
		txt2.setBackground(null);
		txt3.setBackground(null);
		lanche1.setBackground(null);
		lanche2.setBackground(null);
		lanche3.setBackground(null);
		lanche4.setBackground(null);
		acomp1.setBackground(null);
		acomp2.setBackground(null);
		acomp3.setBackground(null);
		beb1.setBackground(null);
		beb2.setBackground(null);
		beb3.setBackground(null);
		sobre1.setBackground(null);
		sobre2.setBackground(null);
		vr.setBackground(null);		
		r$.setBackground(null);
		cartao.setBackground(null);
		
		txt1.setForeground(Color.BLACK);
		txt2.setForeground(Color.BLACK);
		txt3.setForeground(Color.BLACK);
		lanche1.setForeground(Color.WHITE);
		lanche2.setForeground(Color.WHITE);
		lanche3.setForeground(Color.WHITE);
		lanche4.setForeground(Color.WHITE);
		acomp1.setForeground(Color.WHITE);
		acomp2.setForeground(Color.WHITE);
		acomp3.setForeground(Color.WHITE);
		beb1.setForeground(Color.WHITE);
		beb2.setForeground(Color.WHITE);
		beb3.setForeground(Color.WHITE);
		sobre1.setForeground(Color.WHITE);
		sobre2.setForeground(Color.WHITE);
		vr.setForeground(Color.WHITE);
		r$.setForeground(Color.WHITE);
		cartao.setForeground(Color.WHITE);
			
		//=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
	
		add(txt1);
		add(txt2);
		
		add(lanche1);
		add(lanche2);
		add(lanche3);
		add(lanche4); 
		
		add(acomp1);
		add(acomp2);
		add(acomp3);
		
		add(beb1);
		add(beb2);
		add(beb3);
		
		add(sobre1);
		add(sobre2);
		
		add(txt3);
		
		add(vr);
		add(r$);
		add(cartao);
		
		add(next);
		
		add(fundo);
		add(img);
		fundo.setIcon(null);	
		setBackground(new Color(178, 34, 34));
		
	}
	
		//=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
	
		private void definirEventos(){
			next.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent arg0){
					if(lanche1.isSelected()){
	                    valor_total = valor_total+7.50;
	                    lanche_s = "Hambúrguer de Frango";
	                }
					if(lanche2.isSelected()){
	                    valor_total = valor_total+7.50;
	                    lanche_s = "Hambúrguer de Carne";
	                }
					if(lanche3.isSelected()){
	                    valor_total = valor_total+6.00;
	                    lanche_s = "Hot-dog";
	                }
					if(lanche4.isSelected()){
	                    valor_total = valor_total+7.50;
	                    lanche_s = "X-tudo";
	                }
					
		//=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
					
					if(acomp1.isSelected()){
	                    valor_total = valor_total+7.50;
	                    acomp_s = "Batata Frita";
	                }
					if(acomp2.isSelected()){
	                    valor_total = valor_total+9.00;
	                    acomp_s = "Onion Rings";
	                }
					if(acomp3.isSelected()){
	                    valor_total = valor_total+9.00;
	                    acomp_s = "Batata Rústica";
	                }
					
		//=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
					
					if(beb1.isSelected()){
	                    valor_total = valor_total+5.00;
	                    beb_s = "Coca-cola";
	                }
					if(beb2.isSelected()){
	                    valor_total = valor_total+5.00;
	                    beb_s = "Guaraná";
	                }
					if(beb3.isSelected()){
	                    valor_total = valor_total+5.00;
	                    beb_s = "Sprite";
	                }
					
		//=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
					
					if(sobre1.isSelected()){
	                    valor_total = valor_total+5.00;
	                    sobre_s = "Pudim";
	                }
					if(sobre2.isSelected()){
	                    valor_total = valor_total+5.00;
	                    sobre_s = "Mousse de Maracujá";
	                }
		
		//=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		
					if(vr.isSelected()){
						pagamento = "Vale-Refeição";
					}
					if(r$.isSelected()){	
						pagamento = "Dinheiro";
					}
					if(cartao.isSelected()){
						pagamento = "Cartão";
					}
					
					JOptionPane.showMessageDialog(null,"~ Nota Fiscal\n\nSeus Pedidos foram:\n- "+lanche_s+"\n- "+acomp_s+"\n- "+beb_s+"\n- "+sobre_s+"\n\nO valor total será de: R$"+valor_total+"\n A forma de pagamento será: "+pagamento);
					JOptionPane.showMessageDialog(null,"Obrigado pelo pedido! Volte Sempre!");
					valor_total = 0;
					System.exit(0);
				}
				
			});

		}
		
		//=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
	
		 public static void main(String args[]){
			 JFrame frame = new JFrame("Botões de Radio");
			 	 
			 	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			 	frame.getContentPane().add(new ex());
			 	frame.setBounds(0,0,1400,700);
			 	frame.setVisible(true);
			 	
				}
			
		//=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
	
} 