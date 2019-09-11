/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package birds.n.cars;
  import java.net.InetAddress;
  import java.net.NetworkInterface;
  import java.net.SocketException;
  import java.util.Enumeration;
  
  public class Addrs {
    public static void main(String[] args) throws SocketException {
      Enumeration ifaces = NetworkInterface.getNetworkInterfaces();
  
      while (ifaces.hasMoreElements()) {
        NetworkInterface ni = (NetworkInterface)ifaces.nextElement();
        System.out.println(ni.getName() + ":");
  
        Enumeration addrs = ni.getInetAddresses();
  
        while (addrs.hasMoreElements()) {
          InetAddress ia = (InetAddress)addrs.nextElement();
          System.out.println(" " + ia.getHostAddress());
        }
      }
    }
  }