import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ConfiguartorComponent } from './configuartor.component';

describe('ConfiguartorComponent', () => {
  let component: ConfiguartorComponent;
  let fixture: ComponentFixture<ConfiguartorComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ConfiguartorComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ConfiguartorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
