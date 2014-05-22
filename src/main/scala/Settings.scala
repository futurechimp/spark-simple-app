import com.typesafe.config.Config

class Settings(config: Config) {

  // non-lazy fields, we want all exceptions at construct time
  val sparkurl = config.getString("simple-app.sparkurl")
  val sparkhome = config.getString("simple-app.sparkhome")
}