package br.com.fiap.pizzaria;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tvUsername)
    TextView username;

    @BindView(R.id.cbBacon)
    CheckBox cbBacon;

    @BindView(R.id.cbAtum)
    CheckBox cbAtum;

    @BindView(R.id.rgTamnaho)
    RadioGroup rgTamanho;

    @BindView(R.id.spPagamentos)
    Spinner spPagamentos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @OnClick(R.id.btfecharPedido)
    public void fecharPedido()
    {
        Pedido pedido = new Pedido();
        pedido.setCliente(nomeUsuario);
    }
}
