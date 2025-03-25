package question04;

public class Particle {
public int x, y;

public Particle(int x, int y){
    this.x = x;
    this.y = y;
}

public void move(String direction){
    switch (direction) {
        case "North":
            this.y -= 1;
            break;
        case "North East":
            this.y -= 1;
            this.x += 1;
            break;
        case "East":
            this.x += 1;
            break;
        case "South East":
            this.y += 1;
            this.x += 1;
            break;
        case "South":
            this.y += 1;
            break;
        case "South West":
            this.y += 1;
            this.x -= 1;
            break;
        case "West":
            this.x -= 1;
            break;
        case "North West":
            this.y -= 1;
            this.x -= 1;
            break;
        default:
            break;
    }
}

}
