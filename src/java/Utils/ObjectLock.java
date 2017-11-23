/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.io.Serializable;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import servicios.Cliente;
import servicios.Usuario;

/**
 *
 * @author PC-Cristopher
 */
//public class ObjectLock implements Serializable, HttpSessionBindingListener {
public class ObjectLock implements HttpSessionListener {

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("*********************************************************************************");
        System.out.println("La sesion se ha iniciado con ");
//        se.getSession().setMaxInactiveInterval(10*60);
        System.out.println("*********************************************************************************");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        Cliente cliente = (Cliente) se.getSession().getAttribute("cliente");
        Usuario usuario = (Usuario) se.getSession().getAttribute("trabajador");
        if (cliente != null) {
            System.out.println("cliente " + cliente.getPersonaIdpersona().getNombre());
            cerrarSesionCliente(cliente.getIdCliente().intValue());
        } else {
            if (usuario != null) {
                System.out.println("trabajador " + usuario.getPersonaIdpersona().getNombre());
            } else {
                System.out.println("Sesion nula");
            }
        }
        System.out.println("*********************************************************************************");
        System.out.println("La sesion se ha terminado con ");
        System.out.println("*********************************************************************************");
    }

//    @Override
//    public void valueBound(HttpSessionBindingEvent event) {
////        log.info("valueBound:" + event.getName() + " session:" + event.getSession().getId() );
//        System.err.println("valueBound:" + event.getName() + " session:" + event.getSession().getId());
//
//    }
//
//    public void registerSession() {
//        FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("sessionBindingListener", this);
//        System.err.println("registered sessionBindingListener");
////        log.info("registered sessionBindingListener");
//    }
//
//    @Override
//    public void valueUnbound(HttpSessionBindingEvent event) {
////        log.info("valueUnBound:" + event.getName() + " session:" + event.getSession().getId());
//        System.err.println("valueUnBound:" + event.getName() + " session:" + event.getSession().getId());
//        // add you unlock code here:
////        clearLocksForSession(event.getSession().getId());
//    }
    private static int cerrarSesionCliente(int id) {
        servicios.ClienteService_Service service = new servicios.ClienteService_Service();
        servicios.ClienteService port = service.getClienteServicePort();
        return port.cerrarSesionCliente(id);
    }
}
