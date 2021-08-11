package adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.homework1android2.R;
import com.example.homework1android2.databinding.NoteItemBinding;

import org.jetbrains.annotations.NotNull;

import java.sql.Array;
import java.util.ArrayList;

public class  NoteAdapter extends  RecyclerView.Adapter<NoteAdapter.MyViewHolder> {
    NoteItemBinding binding;
    ArrayList<String> list = new ArrayList<>();

    @NonNull
    @NotNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        binding = NoteItemBinding.inflate(LayoutInflater.from(parent.getContext()));
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.note_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull MyViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class  MyViewHolder extends RecyclerView.ViewHolder {
        public MyViewHolder(@NonNull @NotNull View itemView) {
            super(binding.getRoot());
        }
        private void onBind(String s){

        }
    }}

