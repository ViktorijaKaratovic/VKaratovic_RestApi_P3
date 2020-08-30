package ffos.vkaratovic.pjesmeontologija;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import ffos.vkaratovic.pjesmeOntologija.R;


//Za zakomentiratu Filter metodu treba vratiti "implements Filterable"
public class Adapter extends RecyclerView.Adapter<Adapter.Red>  {

    private List<Pjesme> podaci;
    private List<Pjesme> podaciTemp;
    private LayoutInflater mInflater;
    private ItemClickListener mClickListener;

    public Adapter(Context context) {
        this.mInflater = LayoutInflater.from(context);
        podaci = new ArrayList<>();
    }

    @Override
    public Red onCreateViewHolder(ViewGroup roditelj, int viewType) {
        podaciTemp = new ArrayList<>(podaci);
        View view = mInflater.inflate(R.layout.red, roditelj, false);
        return new Red(view);
    }

    @Override
    public void onBindViewHolder(Red red, int position) {
        Pjesme o = podaci.get(position);
        red.pjesma.setText(o.getPjesma());
        red.autor.setText(o.getAutor());
        red.anotacija.setText(o.getAnotacija());


    }

    @Override
    public int getItemCount() {
        return podaci==null ? 0 : podaci.size();
    }


    // Pohranjuje i reciklira pogled kako se prolazi kroz listu
    public class Red extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView pjesma;
        private TextView autor;
        private TextView anotacija;

        Red(View itemView) {
            super(itemView);
            pjesma = itemView.findViewById(R.id.pjesma);
            autor = itemView.findViewById(R.id.autor);
            anotacija = itemView.findViewById(R.id.anotacija);


            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (mClickListener != null) mClickListener.onItemClick(view, getAdapterPosition());
        }
    }


    public Pjesme getItem(int id) {
        return podaci.get(id);
    }

    public void setPodaci(List<Pjesme> itemList) {
        this.podaci = itemList;
    }


    public void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }


    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }


};



