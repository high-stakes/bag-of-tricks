import {Component, Injectable} from '@angular/core';
import { BagNodeService } from './services/api/data/bag-node.service'

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

@Injectable()
export class AppComponent {
  title = 'Bag Of Tricks';

  constructor(bagNodeService: BagNodeService) {
    bagNodeService.demo();
  }


}
