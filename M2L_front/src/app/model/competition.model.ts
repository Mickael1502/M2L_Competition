import { ClubSport } from "./club-sport.model";
import { Salle } from "./salle.model";
import { User } from "./user.model";

export class Competition {
  id?: number;
  dateDebut?: Date;  // Assuming you handle dates as strings, adjust accordingly
  dateFin?: Date;
  heureDebut?: Date;  // Assuming you handle times as strings, adjust accordingly
  heureFin?: Date;
  nbrParticipant?: number;
  clubSport?: ClubSport;  // Assuming you have a ClubSport model/interface
  salle?: Salle;  // Assuming you have a Salle model/interface
  users?: User[];
}
