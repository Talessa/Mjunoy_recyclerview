package mjunoy.recyclerview.com.mjunoy_recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class PoemsRecyclerAdapter extends RecyclerView.Adapter<PoemsRecyclerAdapter.PoemViewHolder>{

    List<Poema> list;

    PoemsRecyclerAdapter(List<Poema> list){
        this.list = list;
    }

    @Override
    public PoemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemPoem = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_poem, parent, false);
        return new PoemViewHolder(itemPoem);
    }

    @Override
    public void onBindViewHolder(final PoemViewHolder holder, final int position) {
        final Poema poem = list.get(position);

        holder.poemAuthor.setText(poem.autor);
        holder.poemTitle.setText(poem.titulo);
        holder.poemContent.setText(poem.contenido);
        holder.poemLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(holder.itemView.getContext(), "Like en el " + position, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return (list != null ? list.size() : 0);
    }

    class PoemViewHolder extends RecyclerView.ViewHolder {
        private TextView poemTitle;
        private TextView poemAuthor;
        private TextView poemContent;
        private Button poemLike;

        PoemViewHolder(View itemPoem) {
            super(itemPoem);
            poemTitle = itemPoem.findViewById(R.id.poem_title);
            poemAuthor = itemPoem.findViewById(R.id.poem_author);
            poemContent = itemPoem.findViewById(R.id.poem_content);
            poemLike = itemPoem.findViewById(R.id.like);
        }
    }
}


