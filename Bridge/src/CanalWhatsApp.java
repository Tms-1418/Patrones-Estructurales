// CanalSms.java
public class CanalWhatsApp implements Canal {
    @Override
    public void enviar(String destinatario, String texto) {
        System.out.println("[WhatsApp a " + destinatario + "] " + texto);
    }
}