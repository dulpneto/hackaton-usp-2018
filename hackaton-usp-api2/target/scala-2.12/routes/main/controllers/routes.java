// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/eduardolopes/workspace/hackatonUsp/hackaton-usp-api/conf/routes
// @DATE:Sun Jun 10 08:57:21 BRT 2018

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseOccupationController OccupationController = new controllers.ReverseOccupationController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseOccupationController OccupationController = new controllers.javascript.ReverseOccupationController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
  }

}
