/*
Comunicación Bluetooth, biblioteca externa, como BlueCove o BlueToothJSR82.
Para detectar dispositivos Bluetooth cercanos, debe usar una clase llamada 
DiscoveryAgent, que es parte de la especificación JSR-82 de Java para Bluetooth.
 */
package bluetooth;
import javax.bluetooth.*;
import java.util.*;
/**
 *
 * @author kwliz
 */
public class Bluetooth {
 public static void main(String[] args) throws Exception {
        // Obtener el adaptador Bluetooth local
        LocalDevice localDevice = LocalDevice.getLocalDevice();
        
        // Iniciar el descubrimiento de dispositivos Bluetooth cercanos
        DiscoveryAgent agent = localDevice.getDiscoveryAgent();
        agent.startInquiry(DiscoveryAgent.GIAC, new DeviceDiscoveryListener());
        
        // Esperar a que se complete el descubrimiento
        Thread.sleep(10000);
    }
    
  private static class Bluetooth implements DiscoveryListener {
        // Métodos de callback para eventos de descubrimiento de dispositivos
        public void deviceDiscovered(RemoteDevice device, DeviceClass deviceClass) {
            System.out.println("Dispositivo encontrado: " + device.getBluetoothAddress());
        }
        
        public void inquiryCompleted(int discType) {
            System.out.println("Descubrimiento completado");
        }
        
        public void servicesDiscovered(int transID, ServiceRecord[] servRecord) {}
        public void serviceSearchCompleted(int transID, int respCode) {}
    }
}  