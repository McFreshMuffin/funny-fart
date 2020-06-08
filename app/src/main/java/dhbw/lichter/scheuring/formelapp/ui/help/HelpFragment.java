package dhbw.lichter.scheuring.formelapp.ui.help;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import dhbw.lichter.scheuring.formelapp.R;
import io.github.kexanie.library.MathView;

public class HelpFragment extends Fragment {
    public MathView formula;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_help, container, false);

        androidx.appcompat.widget.Toolbar toolbar = (androidx.appcompat.widget.Toolbar) getActivity().findViewById(R.id.toolbar);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(false);


        formula = (MathView) root.findViewById(R.id.help_formula);
        String strFormula = "$$\\color{white}{\\frac{(I * L)^S * K}{(A * g)} = F}$$";
        formula.setEngine(MathView.Engine.MATHJAX);
        formula.setText(strFormula);
        return root;
    }
}
