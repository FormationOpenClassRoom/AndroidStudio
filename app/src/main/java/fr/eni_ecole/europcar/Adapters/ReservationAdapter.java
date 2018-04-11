package fr.eni_ecole.europcar.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import fr.eni_ecole.europcar.R;
import fr.eni_ecole.europcar.entites.Reservation;

public class ReservationAdapter extends ArrayAdapter<Reservation> {

    private int layout;

    /**
     * Constructeur avec paramètres
     * @param context
     * @param resource
     * @param objects
     */
    public ReservationAdapter(@NonNull Context context, int resource, @NonNull List<Reservation> objects) {
        super(context, resource, objects);
        this.layout = resource;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(layout, parent, false);
        }

        Reservation resa = this.getItem(position);
        TextView vehiculeId = convertView.findViewById(R.id.resa_vehiculeId);
        TextView dateDebut = convertView.findViewById(R.id.resa_dateDebut);
        TextView dateFin = convertView.findViewById(R.id.resa_dateFin);
        TextView tarifJournalier = convertView.findViewById(R.id.resa_tarifJournalier);
        vehiculeId.setText(resa.getVehiculeId());

        dateDebut.setText(new SimpleDateFormat("dd/MM/yyyy HH:mm").format(new Date(resa.getDateDebut())));
        //dateDebut.setText(String.valueOf(resa.getDateDebut()));
        dateFin.setText(new SimpleDateFormat("dd/MM/yyyy HH:mm").format(new Date(resa.getDateFin())));
        //dateFin.setText(String.valueOf(resa.getDateFin()));
        tarifJournalier.setText(String.valueOf(resa.getTarifJournalier()) + " €");
        return convertView;
    }
}
