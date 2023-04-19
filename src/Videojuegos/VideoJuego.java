package Videojuegos;
public class VideoJuego {
    private int Indice;
    private String Titulo;
    private String Plataforma;
    private int Año;
    private String Genero;
    private String Publisher;
    private double Ventas_NA;
    private double Ventas_EU;
    private double Ventas_JP;
    private double Ventas_Globales;






    public VideoJuego(int indice, String titulo, String plataforma, int año, String genero, String publisher, double ventas_NA, double ventas_EU, double ventas_JP, double ventas_Globales) {
        Indice = indice;
        Titulo = titulo;
        Plataforma = plataforma;
        Año = año;
        Genero = genero;
        Publisher = publisher;
        Ventas_NA = ventas_NA;
        Ventas_EU = ventas_EU;
        Ventas_JP = ventas_JP;
        Ventas_Globales = ventas_Globales;

    }
        public int getIndice() {
            return Indice;
        }

        public String getTitulo() {
            return Titulo;
        }

        public String getPlataforma() {
            return Plataforma;
        }

        public int getAño() {
            return Año;
        }

        public String getGenero() {
            return Genero;
        }

        public String getPublisher() {
            return Publisher;
        }

        public double getVentas_NA() {
            return Ventas_NA;
        }

        public double getVentas_EU() {
            return Ventas_EU;
        }

        public double getVentas_JP() {
            return Ventas_JP;
        }

        public double getVentas_Globales() {
            return Ventas_Globales;
        }

        public void setIndice(int indice) {
            Indice = indice;
        }

        public void setTitulo(String titulo) {
            Titulo = titulo;
        }

        public void setPlataforma(String plataforma) {
            Plataforma = plataforma;
        }

        public void setAño(int año) {
            Año = año;
        }

        public void setGenero(String genero) {
            Genero = genero;
        }

        public void setPublisher(String publisher) {
            Publisher = publisher;
        }

        public void setVentas_NA(double ventas_NA) {
            Ventas_NA = ventas_NA;
        }

        public void setVentas_EU(double ventas_EU) {
            Ventas_EU = ventas_EU;
        }

        public void setVentas_JP(double ventas_JP) {
            Ventas_JP = ventas_JP;
        }

        public void setVentas_Globales(double ventas_Globales) {
            Ventas_Globales = ventas_Globales;
        }
        @Override
        public String toString() {
            return "VideoJuego{" +
                    "Indice=" + Indice +", Titulo='" + Titulo + '\'' +", Plataforma='" + Plataforma + '\'' +", Año="+ Año +", Genero='" + Genero + '\'' +", Publisher='" + Publisher + '\'' +", Ventas_NA=" + Ventas_NA +", Ventas_EU=" + Ventas_EU +", Ventas_JP=" + Ventas_JP +", Ventas_Globales=" + Ventas_Globales +'}';


        }



    }






