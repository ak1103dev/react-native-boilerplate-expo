package TestTest;

import com.facebook.react.ReactPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import TestTest.generated.ExponentBuildConstants;
import host.exp.expoview.ExponentActivity;

public class MainActivity extends ExponentActivity {

  @Override
  public String publishedUrl() {
    return "exp://exp.host/@ak1103dev/react-native-boilerplate2";
  }

  @Override
  public String developmentUrl() {
    return ExponentBuildConstants.DEVELOPMENT_URL;
  }

  @Override
  public List<String> sdkVersions() {
    return new ArrayList<>(Arrays.asList("15.0.0"));
  }

  @Override
  public List<ReactPackage> reactPackages() {
    return ((MainApplication) getApplication()).getPackages();
  }

  @Override
  public boolean isDebug() {
    return BuildConfig.DEBUG;
  }
}
