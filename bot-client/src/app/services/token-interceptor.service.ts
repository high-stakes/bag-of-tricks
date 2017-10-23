// src/app/auth/token.interceptor.ts
import { Injectable } from '@angular/core';
import {HttpEvent, HttpInterceptor, HttpHandler, HttpRequest} from '@angular/common/http';

import { AuthService } from './api/core/auth.service';
import {Observable} from "rxjs/Observable";

@Injectable()
export class TokenInterceptor implements HttpInterceptor {
  constructor(public auth: AuthService) {}

  intercept(request: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>> {

    const authReq = request.clone({setHeaders: {Authorization: this.auth.getToken()}});
    return next.handle(authReq);
  }

}
