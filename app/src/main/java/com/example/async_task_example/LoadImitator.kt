package com.example.async_task_example

import android.os.AsyncTask
import android.widget.TextView
import java.util.concurrent.TimeUnit

class LoadImitator(textView: TextView) : AsyncTask<Void, Void, String>() {
    var processViewContainer1 = textView

    override fun onPreExecute() {
        super.onPreExecute()
        processViewContainer1.text = "Loading..."
    }

    override fun doInBackground(vararg p0: Void?): String {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (e: InterruptedException) {
            e.printStackTrace();
        }
        return "Loaded"
    }

    override fun onPostExecute(result: String?) {
        super.onPostExecute(result)
        processViewContainer1.text = result
    }
}