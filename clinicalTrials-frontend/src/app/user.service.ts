import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, Subject } from 'rxjs';
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
    public hasUser: boolean = false;
    hasUserChange: Subject<boolean> = new Subject<boolean>();

    constructor(private http: HttpClient) {
        this.hasUserChange.subscribe((value) => {
            this.hasUser = value
        });
    }

    updateUserFlag(value: boolean) {
        this.hasUserChange.next(value);
    }

    login(user: Object): Observable<Object> {
        return this.http.post(`${this.baseUrl}/login`, user);
    }

    getUser(): any {
        const userObservable = new Observable(observer => {
            setTimeout(() => {
                observer.next(this.user);
            }, 500);
        });

        return userObservable;
    }

    setUser(user: User): void {
        this.user = user;

    }

}