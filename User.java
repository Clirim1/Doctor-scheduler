public class User {
    String emri,mbiemri,datelindja,data,ora;
    String Doktorri;
    String Diagnoza;
    public User(String emri,String mbiemri,String Doktorri,String Diagnoza,String datelindja,String data,String ora)
    {
        this.emri=emri;
        this.mbiemri=mbiemri;
        this.Doktorri=Doktorri;
        this.Diagnoza=Diagnoza;
        this.datelindja=datelindja;
        this.data=data;
        this.ora=ora;
    }
    public String getEmri()
    {return emri;}

    public String getMbiemri()
    {return mbiemri;}

    public String getDoktorri()
    {return Doktorri;}
    
    public String getDiagnoza()
    {return Diagnoza;}

    public String getDatelindja()
    {return datelindja;}

    public String getData()
    {return data;}

    public String getOra()
    {return ora;}

    public void setData(String i)
    {data=i;}

    public void setOra(String i)
    {ora=i;}
}
