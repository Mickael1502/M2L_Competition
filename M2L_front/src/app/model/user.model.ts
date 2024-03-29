import { ClubSport } from "./club-sport.model";
import { Competition } from "./competition.model";
import { Newsletter } from "./newsletter.model";

export class User {
  id?: number;
  nom?: string;
  email?: string;
  mdp?: string;
  region?: string;
  ville?: string;
  adresse?: string;
  rue?: string;
  competitions?: Competition[];
  newsletter?: Newsletter[];
  club?: ClubSport;
}
