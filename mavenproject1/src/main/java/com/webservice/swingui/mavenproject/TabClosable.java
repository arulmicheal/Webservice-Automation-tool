
package com.webservice.swingui.mavenproject;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.plaf.basic.BasicButtonUI;
 
/**
 *
 * @author thotheolh
 */
public final class TabClosable extends javax.swing.JPanel {
 
    private String target = null; //target refers to title of the tab
 
    private JTabbedPane tabContainer;
 
    public TabClosable(String target, JTabbedPane tabContainer) {
        super(new FlowLayout(FlowLayout.LEFT, 0, 0));
        setOpaque(false);
        setTarget(target);
        this.tabContainer = tabContainer;
        initComponents();
 
        JLabel label = new JLabel(getTarget());
 
        add(label);
 
        //add more space between the label and the button
        label.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 5));
 
        add(new CloseTabBtn());
 
        //add more space to the top of the component
        setBorder(BorderFactory.createEmptyBorder(2, 0, 0, 0));
 
        //add(new JTextArea()); //UNCOMMENT THIS LINE TO MAKE THE 'X' DISAPPEAR AND ADD A TEXTAREA
 
    }
 
 
    private void initComponents() {
        setLayout(new java.awt.BorderLayout());
    }
 
    private class CloseTabBtn extends JButton {
 
        public CloseTabBtn() {
            int size = 17;
            setPreferredSize(new Dimension(size, size));
            setToolTipText("Close this chat");
            //Make the button looks the same for all Laf's
            setUI(new BasicButtonUI());
            //Make it transparent
            setContentAreaFilled(false);
            setFocusable(false);
            setBorder(BorderFactory.createEtchedBorder());
            setBorderPainted(false);
            //Make nice rollover effect
            setRolloverEnabled(true);
            //Action Listener for close btn
            addActionListener(new java.awt.event.ActionListener() {
 
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    //Close tab and remove resource from Resource.
                }
            });
        }
 
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g;
            Stroke stroke = g2.getStroke();
            g2.setStroke(new BasicStroke(2));
            g.setColor(Color.BLACK);
            if (getModel().isRollover()) {
                g.setColor(Color.MAGENTA);
            }
            int delta = 5;
            g.drawLine(delta, delta, getWidth() - delta - 1, getHeight() - delta - 1);
            g.drawLine(getWidth() - delta - 1, delta, delta, getHeight() - delta - 1);
            g2.setStroke(stroke);
 
            int i = tabContainer.getTabCount() - 1;
            tabContainer.setTitleAt(i, getTarget());
        }
    }
    private final static MouseListener buttonMouseListener = new MouseAdapter() {
 
        @Override
        public void mouseEntered(MouseEvent e) {
            Component component = e.getComponent();
            if (component instanceof AbstractButton) {
                AbstractButton button = (AbstractButton) component;
                button.setBorderPainted(true);
            }
        }
 
        @Override
        public void mouseExited(MouseEvent e) {
            Component component = e.getComponent();
            if (component instanceof AbstractButton) {
                AbstractButton button = (AbstractButton) component;
                button.setBorderPainted(false);
            }
        }
    };
 
    /**
     * @return the target
     */
    public String getTarget() {
        return target;
    }
 
    /**
     * @param target the target to set
     */
    public void setTarget(String target) {
        this.target = target;
    }
 
}