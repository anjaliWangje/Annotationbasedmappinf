package ExampleofHibernate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;



    @Entity
    public class Alien {
        @Id
        private int aid;
        private  String aname;
        @Column(name="Aliean_color")
        private String color;

        public int getAid() {
            return aid;
        }

        public void setAid(int aid) {
            this.aid = aid;
        }

        public String getAname() {
            return aname;
        }

        public void setAname(String aname) {
            this.aname = aname;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        @Override
        public String toString() {
            return "Alien{" +
                    "aid=" + aid +
                    ", aname=" + aname +
                    ", color='" + color + '\'' +
                    '}';
        }
//public String getAname() {
       //     return aname;
        }

       // public void setAname(String aname) {
         //   this.aname = aname;
       // }

      //  public String getColor() {
      //      return color;
       // }

       // public void setColor(String color) {
       //     this.color = color;
       // }

       // }





