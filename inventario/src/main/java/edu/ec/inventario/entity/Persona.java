package edu.ec.inventario.entity;

public class Persona {

        
        private String codigo;
        private String descripcion;
        private String cantidad;

        public String getCodigo() {
            return codigo;
        }
        public void setCodigo(String codigo) {
            this.codigo = codigo;
        }
        public String getDescripcion() {
            return descripcion;
        }
        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }
        public String getCantidad() {
            return cantidad;
        }
        public void setCantidad(String cantidad) {
            this.cantidad = cantidad;
        }
        public void setIdCode(String newCode) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'setIdCode'");
        }
        public void setIdDescription(String newDescription) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'setIdDescription'");
        }
        public void setIdAmount(String newAmount) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'setIdAmount'");
        }
        public void setAmount(String newAmount) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'setAmount'");
        }


}
