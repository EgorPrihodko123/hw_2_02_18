public class Figure {

        public double radiys_circle;
        public double storona_kvadrata;
        public double storona_treygolnika;
        public double visota_treygolnika;
        public double dlina_pryamoygolnika;
        public double shirina_pryamoygolnika;



    public double getStorona_kvadrata() {
        return storona_kvadrata;
    }

    public void setStorona_kvadrata(double storona_kvadrata) {
        this.storona_kvadrata = storona_kvadrata;
    }

    public double getStorona_treygolnika() {
        return storona_treygolnika;
    }

    public void setStorona_treygolnika(double storona_treygolnika) {
        this.storona_treygolnika = storona_treygolnika;
    }

    public double getVisota_treygolnika() {
        return visota_treygolnika;
    }

    public void setVisota_treygolnika(double visota_treygolnika) {
        this.visota_treygolnika = visota_treygolnika;
    }

    public double getDlina_pryamoygolnika() {
        return dlina_pryamoygolnika;
    }

    public void setDlina_pryamoygolnika(double dlina_pryamoygolnika) {
        this.dlina_pryamoygolnika = dlina_pryamoygolnika;
    }

    public double getShirina_pryamoygolnika() {
        return shirina_pryamoygolnika;
    }

    public void setShirina_pryamoygolnika(double shirina_pryamoygolnika) {
        this.shirina_pryamoygolnika = shirina_pryamoygolnika;
    }


    public double ploshad_circle (double radiys_circle) {
        double ploshad_circle;
        ploshad_circle=3.14*radiys_circle*radiys_circle;
        System.out.println("Площадь круга: "+ploshad_circle);
        return ploshad_circle;
        }


    public double ploshad_kvadrata (double storona_kvadrata) {
        double ploshad_kvadrata;
        ploshad_kvadrata=storona_kvadrata*storona_kvadrata;
        System.out.println("Площадь квадрата: "+ploshad_kvadrata);
        return ploshad_kvadrata;
    }

    public double ploshad_treygolnika (double storona_treygolnika,double visota_treygolnika) {
        double ploshad_treygolnika;
        ploshad_treygolnika=0.5*storona_treygolnika*visota_treygolnika;
        System.out.println("Площадь треугольника: "+ploshad_treygolnika);
        return ploshad_treygolnika;
    }
    public double ploshad_pryamoygolnika (double dlina_pryamoygolnika,double shirina_pryamoygolnika ) {
        double ploshad_pryamoygolnika;
        ploshad_pryamoygolnika=dlina_pryamoygolnika*shirina_pryamoygolnika;
        System.out.println("Площадь прямоугольника: "+ploshad_pryamoygolnika);
        return ploshad_pryamoygolnika;
    }
    }
