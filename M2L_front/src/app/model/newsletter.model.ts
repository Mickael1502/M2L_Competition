import { ClubSport } from "./club-sport.model";
import { User } from "./user.model";

export class Newsletter {
  id?: number;
  dateParution?: string;  // Assuming you handle dates as strings, adjust accordingly
  dateFin?: string;
  clubSport?: ClubSport;  // Assuming you have a ClubSport model/interface
  users?: User[];  // Assuming you have a User model/interfa
}
