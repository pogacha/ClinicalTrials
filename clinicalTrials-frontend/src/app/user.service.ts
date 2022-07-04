import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { User } from './classes/user';

@Injectable({
    providedIn: 'root'
})
export class UserService {

    private baseUrl = 'http://localhost:8080/clinical-trials-bio/api/v1';
    public user: User = {
        userId: '',
        sponsorId: '',
        userName!: '',
        pass!: '',
        organisation!: '',
        phone!: '',
        email!: '',
        address!: ''
    };
    constructor(private http: HttpClient) { }

    login(user: Object): Observable<Object> {
        return this.http.post(`${this.baseUrl}/login`, user);
    }

    getUser(): User {
        return this.user;
    }

    setUser(user: User): void {
        this.user = user;

    }

}