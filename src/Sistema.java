public class Sistema {

    //METODOS

    //se fija que el contenido que le paso por parametro este en la lista de contenido que el usuario vio por completo
    public static Boolean visteEsteContenidoCompleto(Contenido unContenido,Usuario unUsuario){
        return unUsuario.getContenidoVistoCompleto()
                .stream()
                .anyMatch(contenido -> unContenido.getNombre().equals(contenido.getNombre()));
    }

}
