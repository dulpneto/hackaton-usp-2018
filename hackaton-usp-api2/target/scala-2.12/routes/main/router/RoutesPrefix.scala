// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/eduardolopes/workspace/hackatonUsp/hackaton-usp-api/conf/routes
// @DATE:Sun Jun 10 08:57:21 BRT 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
