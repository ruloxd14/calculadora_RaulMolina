package molina.raul.calculadora_raulmolina_116463

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var mostrar = ""
    var sig = ""
    var op = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCero = findViewById(R.id.cero) as Button
        val btnUno = findViewById(R.id.uno) as Button
        val btnDos = findViewById(R.id.dos) as Button
        val btnTres = findViewById(R.id.tres) as Button
        val btnCuatro = findViewById(R.id.cuatro) as Button
        val btnCinco = findViewById(R.id.cinco) as Button
        val btnSeis = findViewById(R.id.seis) as Button
        val btnSiete = findViewById(R.id.siete) as Button
        val btnOcho = findViewById(R.id.ocho) as Button
        val btnNueve = findViewById(R.id.nueve) as Button
        val btnMas = findViewById(R.id.mas) as Button
        val btnMenos = findViewById(R.id.menos) as Button
        val btnPor = findViewById(R.id.por) as Button
        val btnDividir = findViewById(R.id.dividir) as Button
        val btnBorrar = findViewById(R.id.borrar) as Button
        val btnResultado = findViewById(R.id.result) as Button
        val resultado: TextView = findViewById(R.id.resultado) as TextView
        val operacion: TextView = findViewById(R.id.operacion) as TextView

        btnCero.setOnClickListener {
            mostrar = resultado.getText().toString()
            mostrar = mostrar + "0"
            resultado.setText(mostrar)
        }

        btnUno.setOnClickListener {
            mostrar = resultado.getText().toString()
            mostrar = mostrar + "1"
            resultado.setText(mostrar)
        }

        btnDos.setOnClickListener {
            mostrar = resultado.getText().toString()
            mostrar = mostrar + "2"
            resultado.setText(mostrar)
        }

        btnTres.setOnClickListener {
            mostrar = resultado.getText().toString()
            mostrar = mostrar + "3"
            resultado.setText(mostrar)
        }

        btnCuatro.setOnClickListener {
            mostrar = resultado.getText().toString()
            mostrar = mostrar + "4"
            resultado.setText(mostrar)
        }

        btnCinco.setOnClickListener {
            mostrar = resultado.getText().toString()
            mostrar = mostrar + "5"
            resultado.setText(mostrar)
        }

        btnSeis.setOnClickListener {
            mostrar = resultado.getText().toString()
            mostrar = mostrar + "6"
            resultado.setText(mostrar)
        }

        btnSiete.setOnClickListener {
            mostrar = resultado.getText().toString()
            mostrar = mostrar + "7"
            resultado.setText(mostrar)
        }

        btnOcho.setOnClickListener {
            mostrar = resultado.getText().toString()
            mostrar = mostrar + "8"
            resultado.setText(mostrar)
        }

        btnNueve.setOnClickListener {
            mostrar = resultado.getText().toString()
            mostrar = mostrar + "9"
            resultado.setText(mostrar)
        }

        btnMas.setOnClickListener {
            sig = resultado.getText().toString()
            op = "+"
            resultado.setText("")
        }

        btnMenos.setOnClickListener {
            sig = resultado.getText().toString()
            op = "-"
            resultado.setText("")
        }

        btnPor.setOnClickListener {
            sig = resultado.getText().toString()
            op = "*"
            resultado.setText("")
        }

        btnDividir.setOnClickListener {
            sig = resultado.getText().toString()
            op = "/"
            resultado.setText("")
        }

        btnBorrar.setOnClickListener {
            mostrar = resultado.getText().toString()
            mostrar = mostrar.substring(0,mostrar.length-1)
            resultado.setText(mostrar)
        }

        btnResultado.setOnClickListener {
            mostrar = resultado.getText().toString()
            mostrar = mostrar + "1"
            if(op.equals("-")){
                var total = sig.toDouble() - (resultado.getText().toString()).toDouble()
                operacion.setText(total.toString())
            }
            if(op.equals("+")){
                var total = sig.toDouble() + (resultado.getText().toString()).toDouble()
                operacion.setText(total.toString())
            }
            if(op.equals("/")){
                var total = sig.toDouble() / (resultado.getText().toString()).toDouble()
                operacion.setText(total.toString())
            }
            if(op.equals("*")){
                var total = sig.toDouble() * (resultado.getText().toString()).toDouble()
                operacion.setText(total.toString())
            }
        }



    }
}