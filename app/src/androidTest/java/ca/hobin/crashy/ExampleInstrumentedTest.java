package ca.hobin.crashy;

import androidx.test.ext.junit.runners.AndroidJUnit4;

import io.reactivex.Observable;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void tryToCallMethodDeclaredInSharedDependency() {
        // RxJava is both an implementation and androidTestImplementation dependency
        Observable.empty();
    }
}
