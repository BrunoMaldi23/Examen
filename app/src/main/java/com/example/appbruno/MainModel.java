package com.example.appbruno;
    public class MainModel {
        String nombre,color,marca,almacenamiento,imgURL;

        public MainModel ( ) {
        }


        public MainModel (String nombre, String marca , String almacenamiento , String color , String imgURL ) {
            this.marca = marca;
            this.almacenamiento = almacenamiento;
            this.color = color;
            this.imgURL = imgURL;
            this.nombre = nombre;
        }

        public String getNombre ( ) {
            return nombre;
        }

        public void setNombre ( String nombre ) {
            this.nombre = nombre;
        }

        public String getColor ( ) {
            return color;
        }

        public void setColor ( String color ) {
            this.color = color;
        }

        public String getMarca ( ) {
            return marca;
        }

        public void setMarca ( String marca ) {
            this.marca = marca;
        }

        public String getAlmacenamiento ( ) {
            return almacenamiento;
        }

        public void setAlmacenamiento ( String almacenamiento ) {
            this.almacenamiento = almacenamiento;
        }

        public String getImgURL ( ) {
            return imgURL;
        }

        public void setImgURL ( String imgURL ) {
            this.imgURL = imgURL;
        }
    }
