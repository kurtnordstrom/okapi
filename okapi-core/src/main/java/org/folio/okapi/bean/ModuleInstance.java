package org.folio.okapi.bean;

/**
 * An Instance of a Module that has been enabled for a given tenant.
 * Used internally in the proxy for deciding the routing of requests.
 */
public class ModuleInstance {

  ModuleDescriptor md;
  String url;
  final RoutingEntry re;
  String authToken;


  public ModuleInstance(ModuleDescriptor md, RoutingEntry re) {
    this.md = md;
    this.url = null;
    this.re = re;
    this.authToken = null;
  }

  public ModuleDescriptor getModuleDescriptor() {
    return md;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public RoutingEntry getRoutingEntry() {
    return re;
  }

  public String getAuthToken() {
    return authToken;
  }

  public void setAuthToken(String authToken) {
    this.authToken = authToken;
  }

}
