import { NgModule } from '@angular/core';
import {FormsModule} from '@angular/forms';
import {CommonModule} from '@angular/common';

import { HeroesComponent } from './heroes.component';
import { HeroesRouting } from './heroes.routing';

@NgModule({
  imports: [
    HeroesRouting,
    FormsModule,
    CommonModule
  ],
  declarations: [HeroesComponent]
})
export class HeroesModule {

}
