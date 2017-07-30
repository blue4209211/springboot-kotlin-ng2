import { NgModule } from '@angular/core';
import {FormsModule} from '@angular/forms';
import {CommonModule} from '@angular/common';

import { HeroDetailComponent } from './hero-detail.component';
import { HeroDetailRouting } from './hero-detail.routing';

@NgModule({
  imports: [
    HeroDetailRouting,
    FormsModule,
    CommonModule
  ],
  declarations: [HeroDetailComponent]
})
export class HeroDetailModule {

}
