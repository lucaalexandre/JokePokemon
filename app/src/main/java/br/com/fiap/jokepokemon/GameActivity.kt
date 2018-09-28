package br.com.fiap.jokepokemon

import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import kotlinx.android.synthetic.main.activity_game.*
import java.util.*

class GameActivity : AppCompatActivity() {

    private var numeroAleatorio: Random? = null

    private  val  pontos = 0
    private val VENUSAUR = 1
    private val CHARIZARD = 2
    private val BLASTOISE = 3

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
    numeroAleatorio = Random()

        IbVenusaur.setOnClickListener{
            IvPlayer!!.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.Venusaur))
            realizarJogada(VENUSAUR)
        }
        IbCharizard.setOnClickListener{
            IvPlayer!!.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.Charizard))
            realizarJogada(CHARIZARD)
        }
        IbBlastoise.setOnClickListener{
            IvPlayer!!.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.Blastoise))
            realizarJogada(BLASTOISE)
        }
    }
    private fun realizarJogada(jogadaPlayer:Int){

        val JogadaPC = numeroAleatorio!!.nextInt(3) + 1

        when(JogadaPC){
            VENUSAUR ->{
                IvIa!!.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.Venusaur))
                when(jogadaPlayer){
                    CHARIZARD->venceu()
                    VENUSAUR ->empatou()
                    BLASTOISE ->perdeu()
                }
            }
            CHARIZARD ->{
                IvIa!!.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.Charizard))
                when(jogadaPlayer){
                    BLASTOISE -> venceu()
                    VENUSAUR -> perdeu()
                    CHARIZARD -> empatou()
                }
            }
            BLASTOISE ->{
                IvIa!!.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.Blastoise))
                when(jogadaPlayer){
                    VENUSAUR -> venceu()
                    CHARIZARD -> perdeu()
                    BLASTOISE -> empatou()
                }
            }
        }
    }
    private fun venceu(){


    }
    private fun perdeu(){

    }
    private fun empatou(){

    }
}
