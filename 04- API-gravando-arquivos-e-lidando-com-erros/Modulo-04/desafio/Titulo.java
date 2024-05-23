import com.google.gson.Gson;

class Titulo {
    // Defina a classe do objeto Titulo aqui

    public static void main(String[] args) {
        Titulo titulo = new Titulo(); 

        Gson gson = new Gson();
        String json = gson.toJson(titulo);

        System.out.println(json);
    }
}
