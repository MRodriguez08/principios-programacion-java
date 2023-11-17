package com.cursobasicojava.agendacontactos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.*;
import javax.swing.table.JTableHeader;

import java.util.ArrayList;

public class AgendaContactos {
	
	private static ArrayList<String> listaUsuarios = new ArrayList<String>();

    public static void main(String[] args) {
    
        //Declaramos el objeto ventana
        JFrame frame = new JFrame("Agenda de Contactos :: Curso Basico de Programacion");
        
        //Declaramos los componentes a utilizar
        JMenuItem menuPrincipal, salir, 
            menuContactos, buscarContacto, crearContacto;
			
		//Definimos el menu bar
        JMenuBar mbar = new JMenuBar();
        
		//Creamos los items del menu
		menuPrincipal = new JMenu("Archivo");
		menuContactos = new JMenu("Gesion de Contactos");
			
        // Initialize the JMenuItem objects
        salir = new JMenuItem(new AbstractAction("Salir") {
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                frame.dispose();
            }
        });
        
		buscarContacto = new JMenuItem("Buscar Contacto");              
        crearContacto = new JMenuItem(new AbstractAction("Crear Nuevo Contacto") {
            public void actionPerformed(ActionEvent e) {
                //Declaramos la ventana de Crear Contacto
                JFrame frameCrearContacto = new JFrame("Gestion de Contactos :: Crear Nuevo Contacto");
                frameCrearContacto.getContentPane().setLayout(new BorderLayout());
                JLabel tblCaption = new JLabel("Contactos");
                frameCrearContacto.getContentPane().add(tblCaption, BorderLayout.PAGE_START);
                
                //Seteamos dimensiones
                frameCrearContacto.setSize(500, 300);
                
				//creamos la etiqueta para nombre
                JLabel etiquetaNombre = new JLabel("Nombre:", JLabel.LEFT);
                etiquetaNombre.setBounds(80,20,100,20);
                frameCrearContacto.add(etiquetaNombre);
                
				//creamos el "input" para nombre
                JTextField inputNombre = new JTextField();
                inputNombre.setBounds(200,20,200,20);
                frameCrearContacto.add(inputNombre);
                
                //creamos la etiqueta para apellido
                JLabel etiquetaApellido = new JLabel("Apellido:", JLabel.LEFT);
                etiquetaApellido.setBounds(80,50,100,20);
                frameCrearContacto.add(etiquetaApellido);
                //creamos el "input" para apellido
                JTextField inputApellido = new JTextField();
                inputApellido.setBounds(200,50,200,20);
                frameCrearContacto.add(inputApellido);
                
				//creamos la etiqueta para telefono
                JLabel etiquetaTelefono = new JLabel("Teléfono:", JLabel.LEFT);
                etiquetaTelefono.setBounds(80,80,100,20);
                frameCrearContacto.add(etiquetaTelefono);
                
				//creamos el "input" para teléfono
                JTextField inputTefono = new JTextField();
                inputTefono.setBounds(200,80,200,20);
                frameCrearContacto.add(inputTefono);
                
                // creamos el boton de Guardar y definimos "que queremos que pase cuando click"
                JButton btnGuardar = new JButton("Guardar");
                btnGuardar.setBounds(200, 110, 100, 30);
                
				btnGuardar.addActionListener((ActionEvent ev) -> {
					
					String nombre = inputNombre.getText();
					String apellido = inputApellido.getText();
					String telefono = inputTefono.getText();
					
					listaUsuarios.add(nombre + "," + apellido + "," + telefono);
					
                    frameCrearContacto.setVisible(false);
                    frameCrearContacto.dispose();
                });
                frameCrearContacto.add(btnGuardar);
                
				// creamos el boton de Cancelar y definimos "que queremos que pase cuando click"
                JButton btnSalir = new JButton("Cancelar");
                btnSalir.setBounds(320, 110, 100, 30);
                
                btnSalir.addActionListener((ActionEvent ev) -> {
                    frameCrearContacto.setVisible(false);
                    frameCrearContacto.dispose();
                });
                frameCrearContacto.add(btnSalir);
                
                frameCrearContacto.setLayout(null);
                frameCrearContacto.setResizable(false);
                
                frameCrearContacto.setLocationRelativeTo(null);
                
                frameCrearContacto.setVisible(true);
            }
        });
        
		//Agregamos los items del menu
        menuContactos.add(crearContacto);
        menuContactos.add(buscarContacto);
        menuPrincipal.add(menuContactos);
        menuPrincipal.add(salir);
		
        mbar.add(menuPrincipal);
        
		//agregamos el menu a la ventana
        frame.setJMenuBar(mbar);
        
        //Declaramos los datos a mostrar en la tabla
        Object[][] contactos = new String[][]{
            {"Pedro", "Gonzales", "093556688"},
            {"Ana", "Perez", "093556688"},
            {"Alejandra", "Fernandez", "093556688"},
            {"Juan", "Rodriguez", "093556688"},
            {"Agustina", "Batista", "093556688"},
			{"Pedro", "Gonzales", "093556688"},
            {"Ana", "Perez", "093556688"},
            {"Alejandra", "Fernandez", "093556688"},
            {"Juan", "Rodriguez", "093556688"},
            {"Agustina", "Batista", "093556688"},
			{"Pedro", "Gonzales", "093556688"},
            {"Ana", "Perez", "093556688"},
            {"Alejandra", "Fernandez", "093556688"},
            {"Juan", "Rodriguez", "093556688"},
            {"Agustina", "Batista", "093556688"},
			{"Pedro", "Gonzales", "093556688"},
            {"Ana", "Perez", "093556688"},
            {"Alejandra", "Fernandez", "093556688"},
            {"Juan", "Rodriguez", "093556688"},
            {"Agustina", "Batista", "093556688"},
			{"Pedro", "Gonzales", "093556688"},
            {"Ana", "Perez", "093556688"},
            {"Alejandra", "Fernandez", "093556688"},
            {"Juan", "Rodriguez", "093556688"},
            {"Agustina", "Batista", "093556688"},
			{"Pedro", "Gonzales", "093556688"},
            {"Ana", "Perez", "093556688"},
            {"Alejandra", "Fernandez", "093556688"},
            {"Juan", "Rodriguez", "093556688"},
            {"Agustina", "Batista", "093556688"},
        };
        
		//Declaramos los elementos del cabezal de tabla
        String[] cabezalTabla = {"Nombre", "Apellido", "Telefono" };
        
		//Declaramos el objeto tabla
        JTable tablaContactos = new JTable(contactos, cabezalTabla);
        		
        //Set the table viewpoint height
        tablaContactos.setFillsViewportHeight(true);
        
		//Declaramos cabezal de tabla
        JTableHeader tableHeader = tablaContactos.getTableHeader();
        
		//Seteamos color de fondo de cabezal de tabla
        tableHeader.setBackground(Color.CYAN);
        
        //Seteamos color de fondo de cabezal de tabla
        tableHeader.setForeground(Color.blue);
        
        //Creamos un "label" o "etiqueta" para titulo de tabla
        JLabel tblCaption = new JLabel("Contactos");
        
        //Seteamos la fuente de letra para titulo de tabla
        tblCaption.setFont(new Font("Times New Roman", Font.TRUETYPE_FONT,40));
        tblCaption.setForeground(Color.darkGray);
        
        //Panel Scroll
        JScrollPane scrollPane = new JScrollPane(tablaContactos);
        
        //Seteamos el "Layout" o "disposicion" en la ventana
        frame.getContentPane().setLayout(new BorderLayout());
        frame.getContentPane().add(tblCaption, BorderLayout.PAGE_START);
        frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
        
        //Seteamos las dimensiones de la ventana
        frame.setSize(600, 400);
        
        //Deshabilitar resize
        frame.setResizable(false);
        
        //Posicionar la posicion de ventana
        frame.setLocationRelativeTo(null);
        
        //Hacemos la ventana visible
        frame.setVisible(true);
    }

}