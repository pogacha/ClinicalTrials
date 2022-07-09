import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AcListComponent } from './ac-list.component';

describe('AcListComponent', () => {
  let component: AcListComponent;
  let fixture: ComponentFixture<AcListComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AcListComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AcListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
