import java.util.ArrayList;
import javax.swing.*;
import java.util.List;
import java.util.*;

public class UserController {
   List<User> users=new ArrayList<>();
   User a;
   UserVIew v;
   GregorianCalendar dateNow = new GregorianCalendar();
   public UserController()
   {}
   public void view(UserVIew v)
   {this.v=v;}
   int month1 = dateNow.get(Calendar.MONTH)+1;
   public void proceso()
   {
      char komanda=readCommand("Komanda(R,N,F,Q)"+"\nR - Regjistro \nN - Ndrysho \nF - fshije \nQ - Hiqe");
      if (komanda=='Q'){}
      else {
         switch (komanda)
         {
            case 'R':
               {
                  String emri=JOptionPane.showInputDialog("Emri:");
                  String mbiemri=JOptionPane.showInputDialog("Mbiemri:");
                  String dita =JOptionPane.showInputDialog("Dita e lindjes:","psh.01 , 02, 03, 04,....31");
                  String muaji=JOptionPane.showInputDialog("Muaji i lindjes:","psh..01 , 02, 03, 04,....12");
                  String viti =JOptionPane.showInputDialog("Viti i lindjes:","psh , 1990 , 1995 , 2000, ...2019");
                  int ditaN = Integer.parseInt(dita);
                  int muajiN = Integer.parseInt(muaji);
                  int vitiN = Integer.parseInt(viti);
                  
                  if (ditaN<0 || ditaN>31)
                  {
                     JOptionPane.showMessageDialog(null,"Dita eshte shtypur gabim , duhet te jete nje numer pre 1 deri 31");
                     proceso();
                  }
                  if (muajiN<0 || muajiN>12)
                  {
                     JOptionPane.showMessageDialog(null,"Muaji eshte shtypur gabim , duhet te jete nje numer pre 1 deri 12");
                     proceso();
                  
                  }
                  if (vitiN<1900 || vitiN>2019)
                  {
                     JOptionPane.showMessageDialog(null, "Viti shtypur gabim , duhet te jete nje numer pre 1900 deri 2019");
                     proceso();
                  }
                  String Datlindja = (dita + "/" + muaji +"/" + viti);
               
                  char komanda1 =readCommand("Doktori:" + " Komanda (1, 2, 3, 4)"+"\n1 - Dr.Clirimi \n2 - Dr.Rinori  \n3 - Dr.Altini \n4 - Dr.Ardiani");
                  String  Doktorri;
                  if(komanda1 =='1'){Doktorri="Dr.Clirimi";}
                  else
                  {
                     if(komanda1 =='2'){Doktorri="Dr.Rinori";}
                     else
                     { 
                        if(komanda1 =='3'){Doktorri="Dr.Altini";}
                        else {
                           if(komanda1 =='4'){Doktorri="Dr.Ardiani";}
                           else {Doktorri= null; JOptionPane.showMessageDialog(null, "Komanda per Doktorrin e shtypur gabim"); proceso();}
                        }
                     }
                  } 
                  char komanda2 = readCommand("Diagnoza:    " + "  Komandat (1 , 2 , 3, 4)  "+"\n1- Kontroll i pergjithshem \n2 - Kontroll Ortopedike \n3- Semundje Kaerdiovaskulare \n4- Analiza Gjaku");   
                  String Diagnoza; 
                  if(komanda2 =='1')
                  {Diagnoza = "Kontroll i Pergjihshem";}
                  else {
                     if(komanda2== '2'){Diagnoza = "Kontroll Ortopedike";}
                     else { 
                        if(komanda2=='3') {Diagnoza="Semundje Kardiaovaskulare";}
                        else { 
                           if(komanda2=='4') {Diagnoza = "Anliza Gjaku";}
                           else {Diagnoza = null; JOptionPane.showMessageDialog(null,"Nuk kemi diagnoz me kete komand"); proceso();}}}}
                             
                  String ditaa=JOptionPane.showInputDialog("Dita ne te cilen deshironi te leni terminin");
                  String muajii=JOptionPane.showInputDialog("Muaji ne te cilen deshironi te leni terminin");
                  int month = dateNow.get(Calendar.MONTH)+1;
                  int muajiNN = Integer.parseInt(muajii);
                  int ditaaNN = Integer.parseInt(ditaa);
                  if(muajiNN<month|| muajiNN>12){JOptionPane.showMessageDialog(null, "Muaji te cilin po kerkoni ka kaluar ose eshte me i madh se muaji i 12");proceso();}
                   if(ditaaNN>31|| ditaaNN<1){JOptionPane.showMessageDialog(null, "Dita e shtypur gabim ju lutem shtypni nje dit brenda 1...31");proceso();}
                   String data = (ditaaNN + "/" + muajiNN+"/" +2019);
                  
                  
                  
                  String ora=JOptionPane.showInputDialog("Ora:");
                  double ora1 =Double.parseDouble(ora);
                  if ( ora1<9 || ora1>18){JOptionPane.showMessageDialog(null,"Ora e dhene esht ore jasht orarit te punes \n ju lutem shtypni nje ore nga 09.00-18.00."); 
                     proceso();
                  }
                     
               
                  users.add(new User(emri,mbiemri,Doktorri,Diagnoza,Datlindja,data,ora));
                  v.repaint();
                  proceso();
                  break;
               }
            case 'N': 
               {
                  int index = new Integer(JOptionPane.showInputDialog("Zgjedh njerin nga " + users.size() + " personat ku do te beni ndryshimet"));
                  a = users.get(index);
                  char c = readCommand("Komanda (D,O) \nD - data \nO - ora");
                  switch (c)
                  {
                     case 'D': 
                        {
                           String ditaaa = JOptionPane.showInputDialog("Dita ne te cilen deshironi te caktoni terminin");
                           String muajiii = JOptionPane.showInputDialog("Muaji ne te cilen deshironi te caktoni terminin");
                           int muajiNNn = Integer.parseInt(muajiii);
                           int ditaaNNn = Integer.parseInt(ditaaa);
                           if(muajiNNn<month1|| muajiNNn>12){JOptionPane.showMessageDialog(null, "Muaji te cilin po kerkoni ka kaluar ose eshte me i madh se muaji i 12");proceso();}
                           if(ditaaNNn>31|| ditaaNNn<1){JOptionPane.showMessageDialog(null, "Dita e shtypur gabim ju lutem shtypni nje dit brenda 1...31");proceso();}
                           String data1 = (ditaaNNn + "/" + muajiNNn+"/" +2019);
                           
                           
                           a.setData(data1);
                           v.repaint();
                           proceso();
                           break;
                        }
                     case 'O':
                        {
                           String ora = JOptionPane.showInputDialog("Ora (ora:minutat)");
                           a.setOra(ora);
                           double ora1 =Double.parseDouble(ora);
                           
                           if ( ora1<9 || ora1>18){JOptionPane.showMessageDialog(null,"Ora e dhene esht ore jasht orarit te punes \n ju lutem shtypni nje ore nga 09.00-18.00."); 
                           
                           proceso(); }
                           else{
                              v.repaint();
                              proceso();
                              break;}}
                     default: 
                        {
                           JOptionPane.showMessageDialog(null, "Komanda e shtypur gabim");
                        }
                  }
                  break;
               }
            case 'F': 
               {
                  int index = new Integer(JOptionPane.showInputDialog("Zgjedh njerin nga "+ users.size()+" pacientet qe deshiron ta fshijsh nga lista"));
                  users.remove(index);
                  v.repaint();
                  proceso();
                  break;
               }
            default: 
               {
                  JOptionPane.showMessageDialog(null, "Komanda e shtypur gabim");
                  proceso();
               }
         
         }
      
      }
   
   
   }

   public char readCommand(String message)
   {
      String s=JOptionPane.showInputDialog(message).trim().toUpperCase();
      if(s==null){proceso();}
      
      return s.charAt(0);
   }

}