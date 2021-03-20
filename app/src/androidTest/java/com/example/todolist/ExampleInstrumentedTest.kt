package com.example.todolist


import android.R
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.test.platform.app.InstrumentationRegistry
import com.example.todolist.ui.AddEditTodoItemActivity
import com.example.todolist.ui.MainActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlinx.android.synthetic.main.activity_main.*
import org.junit.Assert.*
import org.junit.Before
import org.junit.Ignore
import org.junit.Test
import org.junit.runner.RunWith
//import org.robolectric.Robolectric
//import org.robolectric.RobolectricTestRunner
//
//
//@RunWith(RobolectricTestRunner::class)

    class ExampleInstrumentedTest {

    private var activity: AddEditTodoItemActivity? = null

//    @Before
//    fun setup() {
//        activity = Robolectric.setupActivity(AddEditTodoItemActivity::class.java)
//    }

    @Test
    @Ignore
    fun clickButton() {
//        val button: FloatingActionButton = activity!!.findViewById(R.id.fab_add_item)
//        val image:ImageView=activity!!.findViewById(R.id.iv)
//        val text:EditText=activity!!.findViewById(R.id.et_todo_description)
//        assertNotNull("test button could not be found", button)
//        assertTrue("button does not contain text 'Click Me!'", "Click Me" == button.getText())
    }

            @Test
            fun useAppContext() {
                // Context of the app under test.
                val appContext = InstrumentationRegistry.getInstrumentation().targetContext
                assertEquals("com.example.todolist", appContext.packageName)
            }
        }
