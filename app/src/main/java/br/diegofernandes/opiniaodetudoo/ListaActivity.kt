package br.diegofernandes.opiniaodetudoo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import br.diegofernandes.opiniaodetudoo.view.ListFragment
import br.diegofernandes.opiniaodetudoo.R

class ListaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista)
        this.supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_container, ListFragment())
                .commit()

    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }

}
