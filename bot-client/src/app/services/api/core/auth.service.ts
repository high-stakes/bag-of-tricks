import { Injectable } from '@angular/core';

@Injectable()
export class AuthService {

  getToken(): string {
    console.log("Basic " + btoa('user:password'));
    return "Basic " + btoa('user:password');
  }

  isAuthenticated(): boolean {
    const token = this.getToken();
    return !!token;
  }
}
