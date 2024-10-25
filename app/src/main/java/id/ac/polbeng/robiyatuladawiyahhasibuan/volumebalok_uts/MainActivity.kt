package id.ac.polbeng.robiyatuladawiyahhasibuan.volumebalok_uts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import id.ac.polbeng.robiyatuladawiyahhasibuan.volumebalok_uts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCalculate.setOnClickListener {
            val lengthStr = binding.etLength.text.toString()
            val widthStr = binding.etWidth.text.toString()
            val heightStr = binding.etHeight.text.toString()

            if (lengthStr.isNotEmpty() && widthStr.isNotEmpty() && heightStr.isNotEmpty()) {
                val length = lengthStr.toDouble()
                val width = widthStr.toDouble()
                val height = heightStr.toDouble()

                val volume = length * width * height
                binding.tvResult.text = getString(R.string.result_text, volume)
            } else {
                Toast.makeText(this, R.string.error_message, Toast.LENGTH_SHORT).show()
            }
        }
    }
}
