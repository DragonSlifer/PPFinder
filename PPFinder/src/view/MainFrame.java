/*
 *  
 */
package view;

import controller.Controller;
import java.util.TimerTask;

/**
 *
 * @author Jorge
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        controller = new Controller(Map);
        //Timer time = new Timer();
        //time.schedule(new UpdateMapMethod(this), 0, 20000);  ///< Crea una tarea que se encarga de actualizar el mapa
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jButton5 = new javax.swing.JButton();
        jMenuItem1 = new javax.swing.JMenuItem();
        BusquedaRápida = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ComboGenero = new javax.swing.JComboBox();
        ComboModo = new javax.swing.JComboBox();
        ComboJuego = new javax.swing.JComboBox();
        ComboBusco = new javax.swing.JComboBox();
        BusquedaRapida = new javax.swing.JButton();
        AyudaGenero = new javax.swing.JRadioButton();
        AyudaModo = new javax.swing.JRadioButton();
        AyudaJuego = new javax.swing.JRadioButton();
        AyudaBusco = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        AyudaBusqueda = new javax.swing.JTextArea();
        Herramientas = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        CrearPersonaje = new javax.swing.JButton();
        VerFichas = new javax.swing.JButton();
        AdministrarPerfil = new javax.swing.JButton();
        TirarDados = new javax.swing.JButton();
        RegistroTiradas = new javax.swing.JButton();
        Notas = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        CONSOLA = new javax.swing.JTextArea();
        Mapa = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Map = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        loadPref = new javax.swing.JMenuItem();
        savePref = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenuItem();
        menuPreferencias = new javax.swing.JMenu();
        modPrefUbi = new javax.swing.JMenuItem();
        modPerm = new javax.swing.JMenuItem();
        ccfDebug = new javax.swing.JMenuItem();
        addGame = new javax.swing.JMenuItem();
        menuAyuda = new javax.swing.JMenu();
        helpManual = new javax.swing.JMenuItem();
        helpInstrucciones = new javax.swing.JMenuItem();
        helpCreditos = new javax.swing.JMenuItem();
        changelog = new javax.swing.JMenuItem();

        jButton5.setText("jButton5");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("P&P Finder 0.1");

        BusquedaRápida.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Busqueda Rápida");

        jLabel2.setText("Género:");

        jLabel3.setText("Modo:");

        jLabel4.setText("Juego:");

        jLabel5.setText("Busco...:");

        ComboGenero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ComboModo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ComboJuego.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ComboBusco.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        BusquedaRapida.setText("BUSCAR");
        BusquedaRapida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusquedaRapidaActionPerformed(evt);
            }
        });

        buttonGroup1.add(AyudaGenero);
        AyudaGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AyudaGeneroActionPerformed(evt);
            }
        });

        buttonGroup1.add(AyudaModo);
        AyudaModo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AyudaModoActionPerformed(evt);
            }
        });

        buttonGroup1.add(AyudaJuego);
        AyudaJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AyudaJuegoActionPerformed(evt);
            }
        });

        buttonGroup1.add(AyudaBusco);
        AyudaBusco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AyudaBuscoActionPerformed(evt);
            }
        });

        AyudaBusqueda.setColumns(20);
        AyudaBusqueda.setRows(5);
        AyudaBusqueda.setText("Esto es una ayuda rapida");
        jScrollPane1.setViewportView(AyudaBusqueda);

        javax.swing.GroupLayout BusquedaRápidaLayout = new javax.swing.GroupLayout(BusquedaRápida);
        BusquedaRápida.setLayout(BusquedaRápidaLayout);
        BusquedaRápidaLayout.setHorizontalGroup(
            BusquedaRápidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BusquedaRápidaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BusquedaRápidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BusquedaRápidaLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboBusco, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AyudaBusco))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(BusquedaRápidaLayout.createSequentialGroup()
                        .addGroup(BusquedaRápidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BusquedaRápidaLayout.createSequentialGroup()
                                .addGroup(BusquedaRápidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ComboGenero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(BusquedaRápidaLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(BusquedaRápidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ComboModo, 0, 128, Short.MAX_VALUE)
                                    .addComponent(ComboJuego, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(2, 2, 2)
                        .addGroup(BusquedaRápidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(BusquedaRápidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(AyudaGenero)
                                .addComponent(AyudaModo))
                            .addComponent(AyudaJuego)))
                    .addComponent(BusquedaRapida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        BusquedaRápidaLayout.setVerticalGroup(
            BusquedaRápidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BusquedaRápidaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BusquedaRápidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ComboGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AyudaGenero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BusquedaRápidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ComboModo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AyudaModo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BusquedaRápidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ComboJuego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AyudaJuego))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BusquedaRápidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ComboBusco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AyudaBusco))
                .addGap(18, 18, 18)
                .addComponent(BusquedaRapida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        Herramientas.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Herramientas");

        CrearPersonaje.setText("Crear Personaje");
        CrearPersonaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearPersonajeActionPerformed(evt);
            }
        });

        VerFichas.setText("Ver Fichas de Personaje");
        VerFichas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerFichasActionPerformed(evt);
            }
        });

        AdministrarPerfil.setText("Administrar Perfil");
        AdministrarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdministrarPerfilActionPerformed(evt);
            }
        });

        TirarDados.setText("Tirar Dados");
        TirarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TirarDadosActionPerformed(evt);
            }
        });

        RegistroTiradas.setText("Registro de Tiradas");
        RegistroTiradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroTiradasActionPerformed(evt);
            }
        });

        Notas.setText("Notas");
        Notas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NotasActionPerformed(evt);
            }
        });

        CONSOLA.setColumns(20);
        CONSOLA.setRows(5);
        CONSOLA.setText("Aqui irá una consola,\nsi averiguo como\nimplementarla.");
        jScrollPane2.setViewportView(CONSOLA);

        javax.swing.GroupLayout HerramientasLayout = new javax.swing.GroupLayout(Herramientas);
        Herramientas.setLayout(HerramientasLayout);
        HerramientasLayout.setHorizontalGroup(
            HerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HerramientasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addComponent(TirarDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AdministrarPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CrearPersonaje, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RegistroTiradas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Notas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, HerramientasLayout.createSequentialGroup()
                        .addComponent(VerFichas, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        HerramientasLayout.setVerticalGroup(
            HerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HerramientasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AdministrarPerfil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CrearPersonaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VerFichas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TirarDados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RegistroTiradas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Notas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        Mapa.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Map.setColumns(20);
        Map.setRows(5);
        jScrollPane3.setViewportView(Map);

        javax.swing.GroupLayout MapaLayout = new javax.swing.GroupLayout(Mapa);
        Mapa.setLayout(MapaLayout);
        MapaLayout.setHorizontalGroup(
            MapaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
        );
        MapaLayout.setVerticalGroup(
            MapaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MapaLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("MAPA");

        menuArchivo.setText("Archivo");

        loadPref.setText("Cargar Preferencias");
        loadPref.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadPrefActionPerformed(evt);
            }
        });
        menuArchivo.add(loadPref);

        savePref.setText("Guardar Preferencias");
        menuArchivo.add(savePref);

        exit.setText("Salir");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        menuArchivo.add(exit);

        jMenuBar1.add(menuArchivo);

        menuPreferencias.setText("Preferencias");

        modPrefUbi.setText("Modificar Preferencias de Ubicación");
        menuPreferencias.add(modPrefUbi);

        modPerm.setText("Modificar Permisos (Superuser)");
        modPerm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modPermActionPerformed(evt);
            }
        });
        menuPreferencias.add(modPerm);

        ccfDebug.setText("Crear Clientes Ficticios (Debugger)");
        menuPreferencias.add(ccfDebug);

        addGame.setText("Agregar Juego (Superuser)");
        menuPreferencias.add(addGame);

        jMenuBar1.add(menuPreferencias);

        menuAyuda.setText("Ayuda");

        helpManual.setText("Manual de Uso");
        menuAyuda.add(helpManual);

        helpInstrucciones.setText("Instrucciones Rápidas");
        menuAyuda.add(helpInstrucciones);

        helpCreditos.setText("Creditos");
        menuAyuda.add(helpCreditos);

        changelog.setText("Changelog");
        menuAyuda.add(changelog);

        jMenuBar1.add(menuAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BusquedaRápida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Mapa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Herramientas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BusquedaRápida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Herramientas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Mapa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AyudaJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AyudaJuegoActionPerformed
        AyudaBusqueda.setText(controller.changeHelpBox(2));     ///< Cambia el texto de la caja de ayuda
    }//GEN-LAST:event_AyudaJuegoActionPerformed

    private void modPermActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modPermActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modPermActionPerformed

    /**
     * Este metodo hace un Update de los datos que se buscan en el mapa
     *
     * @param evt
     */
    private void BusquedaRapidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusquedaRapidaActionPerformed
        ///< Sirve para hacer el Update del mapa
        Map.setText(controller.MapUpdate((String) ComboGenero.getSelectedItem(), (String) ComboModo.getSelectedItem(), (String) ComboJuego.getSelectedItem(), (String) ComboBusco.getSelectedItem()));
    }//GEN-LAST:event_BusquedaRapidaActionPerformed

    private void AdministrarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdministrarPerfilActionPerformed
        ///< Este metodo abrirá la ventana de administración del perfil

    }//GEN-LAST:event_AdministrarPerfilActionPerformed

    private void CrearPersonajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearPersonajeActionPerformed
        ///< Este metodo abrirá la ventana de creación de personajes

    }//GEN-LAST:event_CrearPersonajeActionPerformed

    private void VerFichasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerFichasActionPerformed
        ///< Este metodo pedirá al usario la ficha que desea ver y la mostrará, sin posibilidad de editarla

    }//GEN-LAST:event_VerFichasActionPerformed

    private void TirarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TirarDadosActionPerformed
        ///< Este metodo tirará los dados según la petición del usuario y guardará el resultado

    }//GEN-LAST:event_TirarDadosActionPerformed

    private void RegistroTiradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroTiradasActionPerformed
        ///< Este metodo mostrará el registro de las ultimas tiradas

    }//GEN-LAST:event_RegistroTiradasActionPerformed

    private void NotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NotasActionPerformed
        ///< Este metodo servirá simplemente para guardar notas del personaje

    }//GEN-LAST:event_NotasActionPerformed

    private void loadPrefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadPrefActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loadPrefActionPerformed

    private void AyudaGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AyudaGeneroActionPerformed
        AyudaBusqueda.setText(controller.changeHelpBox(0));     ///< Cambia el texto de la caja de ayuda
    }//GEN-LAST:event_AyudaGeneroActionPerformed

    private void AyudaModoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AyudaModoActionPerformed
        AyudaBusqueda.setText(controller.changeHelpBox(1));     ///< Cambia el texto de la caja de ayuda
    }//GEN-LAST:event_AyudaModoActionPerformed

    private void AyudaBuscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AyudaBuscoActionPerformed
        AyudaBusqueda.setText(controller.changeHelpBox(3));     ///< Cambia el texto de la caja de ayuda
    }//GEN-LAST:event_AyudaBuscoActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        ///< Simplemente saldrá. Si es necesario, se agregará codigo para que guarde el estado de la app
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void UpdateMap() {
        ///< Este metodo actualiza el mapa
        Map.setText(controller.UpdateMap());
    }

    private void SendInfo() {
        ////< Este metodo mandará informacion a los demas usuarios
        controller.SendInfo();
    }

    private class UpdateMapMethod extends TimerTask {

        private MainFrame m;

        public UpdateMapMethod(MainFrame m) {
            this.m = m;
        }

        @Override
        public void run() {
            try {
                m.UpdateMap();          ///< Recibir
                m.SendInfo();           ///< Enviar
            } catch (Exception ex) {
                System.out.println("Error Updating Map: " + ex.getMessage());
            }
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdministrarPerfil;
    private javax.swing.JRadioButton AyudaBusco;
    private javax.swing.JTextArea AyudaBusqueda;
    private javax.swing.JRadioButton AyudaGenero;
    private javax.swing.JRadioButton AyudaJuego;
    private javax.swing.JRadioButton AyudaModo;
    private javax.swing.JButton BusquedaRapida;
    private javax.swing.JPanel BusquedaRápida;
    private javax.swing.JTextArea CONSOLA;
    private javax.swing.JComboBox ComboBusco;
    private javax.swing.JComboBox ComboGenero;
    private javax.swing.JComboBox ComboJuego;
    private javax.swing.JComboBox ComboModo;
    private javax.swing.JButton CrearPersonaje;
    private javax.swing.JPanel Herramientas;
    private javax.swing.JTextArea Map;
    private javax.swing.JPanel Mapa;
    private javax.swing.JButton Notas;
    private javax.swing.JButton RegistroTiradas;
    private javax.swing.JButton TirarDados;
    private javax.swing.JButton VerFichas;
    private javax.swing.JMenuItem addGame;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JMenuItem ccfDebug;
    private javax.swing.JMenuItem changelog;
    private javax.swing.JMenuItem exit;
    private javax.swing.JMenuItem helpCreditos;
    private javax.swing.JMenuItem helpInstrucciones;
    private javax.swing.JMenuItem helpManual;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JMenuItem loadPref;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenu menuPreferencias;
    private javax.swing.JMenuItem modPerm;
    private javax.swing.JMenuItem modPrefUbi;
    private javax.swing.JMenuItem savePref;
    // End of variables declaration//GEN-END:variables
    private Controller controller;
}
