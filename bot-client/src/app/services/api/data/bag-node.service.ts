import {Injectable} from "@angular/core";
import {AppConfig} from "../../../app-config";
import {HttpClient} from "@angular/common/http";

@Injectable()
export class BagNodeService {

  constructor(
    private config: AppConfig,
    private http: HttpClient
  ) {}

  demo(): void {
    this.http.get(this.config.apiBase + "/bagNodes")
      .subscribe((doc) => console.log(doc));
  }
}
