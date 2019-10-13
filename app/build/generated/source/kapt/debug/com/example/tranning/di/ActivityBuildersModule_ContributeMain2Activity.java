package com.example.tranning.di;

import android.app.Activity;
import com.example.tranning.di.main.MainModule;
import com.example.tranning.di.main.MainViewModelsModule;
import com.example.tranning.ui.main.MainActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = ActivityBuildersModule_ContributeMain2Activity.MainActivitySubcomponent.class
)
public abstract class ActivityBuildersModule_ContributeMain2Activity {
  private ActivityBuildersModule_ContributeMain2Activity() {}

  @Binds
  @IntoMap
  @ActivityKey(MainActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      MainActivitySubcomponent.Builder builder);

  @Subcomponent(modules = {MainViewModelsModule.class, MainModule.class})
  public interface MainActivitySubcomponent extends AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> {}
  }
}
