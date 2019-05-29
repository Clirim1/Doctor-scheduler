import javax.swing.*;
import java.awt.*;
import java.util.GregorianCalendar;

public class UserVIew extends JPanel{
    UserController c;
    public UserVIew(UserController c)
    {   this.c=c;
        JFrame frame=new JFrame();
        frame.getContentPane().add(this);
        frame.setSize(950,600);
        frame.setVisible(true);
        frame.setTitle("Lista e pacienteve");
    }

    public void paintComponent(Graphics g)
    {   g.setColor(Color.white);
        g.fillRect(0,0,950,600);
        g.setColor(Color.black);
          GregorianCalendar b=new GregorianCalendar();
        switch (b.get(b.DAY_OF_WEEK))
        {
            case 2: {g.drawString("E Hene: Kujdestar:Dr.Clirimi ",20,20);
            break;}
            case 3:{g.drawString("E Marte: Kujdestar:Dr.Rinori ",20,20);
             break;}
            case 4:{g.drawString("E Merkure: Kujdestar:Dr.Altini",20,20);
            break;}
            case 5:{g.drawString("E Ejte Kujdestar:Dr.Ardiani ",20,20);
            break;}
            
        }
        for (int i=0;i<c.users.size();i++)
        {   User a=c.users.get(i);
            g.drawString("Pacienti: "+i+ " Emri: "+a.getEmri()+"   Mbiemri: "+a.getMbiemri()+"    Doktorri: "+a.getDoktorri()+
            "    Diagnoza : " +a.getDiagnoza()+"  Datelinda: "+a.getDatelindja()+ "  Data: "+ a.getData()+ "  Ora: "+a.getOra(),20,40+20*i);
        
    //System.out.println("Pacienti: "+i+ " Emri: "+a.getEmri()+"   Mbiemri: "+a.getMbiemri()+"    Doktorri: "+a.getDoktorri()+
                    //"  Datelinda: "+a.getDatelindja()+ "  Data: "+ a.getData()+ "  Ora: "+a.getOra());
                    //System.out.println("");
                    
             }
                    
    
    }

}