package mjunoy.recyclerview.com.mjunoy_recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList <Poema> poemas = new ArrayList<>();
        for (int i = 0; i < 1000 ; i++) {
            Poema poema = new Poema();
            poema.autor="autor "+i;
            poema.titulo="titulo "+i;
            poema.contenido="contenido "+i;
            poemas.add(poema);
            }

        RecyclerView recyclerView = findViewById(R.id.lista_poemas);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        PoemsRecyclerAdapter poemsRecyclerAdapter = new PoemsRecyclerAdapter(poemas);
        recyclerView.setAdapter(poemsRecyclerAdapter);
    }
}
