import { Competition } from "./competition.model";

export class Salle {
  id?: number;
  nom?: string;
  adresse?: string;
  ville?: string;
  competitions?: Competition[];
}
