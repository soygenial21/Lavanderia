package upc.com.lavanderiaproyec.Objects;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import upc.com.lavanderiaproyec.R;

/**
 * Created by julieta on 02/12/2017.
 */

public class RVAdapter  extends RecyclerView.Adapter<RVAdapter.DatosReservaViewHolder> {

    List<Reserva> reservaList;

    public RVAdapter(List<Reserva> reservaList) {
        this.reservaList = reservaList;
    }

    @Override
    public DatosReservaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.vistas, parent, false);
        DatosReservaViewHolder holder = new DatosReservaViewHolder(v);

        return holder;
    }

    @Override
    public void onBindViewHolder(DatosReservaViewHolder holder, int position) {
        holder.txtDATOS.setText(reservaList.get(position).getDATOS());
        holder.txtnameRV.setText(reservaList.get(position).getNameRV());
        holder.txtapeRV.setText(reservaList.get(position).getApeRV());
        holder.txtdireRV.setText(reservaList.get(position).getDireRV());
    }

    @Override
    public int getItemCount() {
        return reservaList.size();
    }

    public static class DatosReservaViewHolder extends RecyclerView.ViewHolder {
        TextView txtDATOS, txtnameRV, txtapeRV, txtdireRV;

        public DatosReservaViewHolder(View itemView) {
            super(itemView);
            txtDATOS = (TextView) itemView.findViewById(R.id.tituloRV);
            txtnameRV = (TextView) itemView.findViewById(R.id.nameRV);
            txtapeRV = (TextView) itemView.findViewById(R.id.apeRV);
            txtdireRV = (TextView) itemView.findViewById(R.id.direRV);

        }
    }
}

