import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ImpListComponent } from './imp-list.component';

describe('ImpListComponent', () => {
  let component: ImpListComponent;
  let fixture: ComponentFixture<ImpListComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ImpListComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ImpListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
