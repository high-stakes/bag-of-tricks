export class AppConfig {

  public apiHost:string = "localhost";
  public apiPort:string = "8080";
  public apiProtocol: string = "http://";
  public apiBase:string = this.apiProtocol + this.apiHost + ":" + this.apiPort ;

  constructor() {
  }
}
