import { Locau } from "./locau.model";
import { Newsletter } from "./newsletter.model";
import { Competition } from "./competition.model";
import { User } from "./user.model";
export class ClubSport {

  id?: number;
  nom?: string;
  tel?: number;
  mail?: string;
  siret?: string;
  adresse?: string;
  ville?: string;
  region?: string;
  locau?: Locau;  // Assuming you have a Locau model/interface
  newsletter?: Newsletter[];  // Assuming you have a Newsletter model/interface
  competition?: Competition[];  // Assuming you have a Competition model/interface
  users?: User[];  // Assuming you have a User model/interface
}

