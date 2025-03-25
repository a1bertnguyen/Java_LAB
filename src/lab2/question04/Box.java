package question04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Box {
    private final int width, height;
    private static Box instance;

    private ArrayList<Particle> particles;
    private Random rand = new Random();

    private Box(int width, int height){
        this.width = width;
        this.height = height;
        particles = new ArrayList<>();

    }

    public static synchronized Box getInstance() {
        if (instance == null){
            instance = new Box(16, 8);
        }
        return instance;
    }

    public void createParticle(int n){
        for (int i = 0; i < n; i++){
            Particle p = new Particle(rand.nextInt(this.width), rand.nextInt(this.height));
            particles.add(p);
        }
    }

    public void updateParticle(){
        String[] listDirections = {"North East", "East", "South East", "South", "South West", "West", "North West"};
        
        for (Particle p : particles){
            while (true){
                int xOld = p.x;
                int yOld = p.y;

                String direction = listDirections[rand.nextInt(listDirections.length)];
                p.move(direction); 

                if (p.x >= 0 && p.x < this.width && p.y >= 0 && p.y < this.height){
                    break;
                } else {
                    p.x = xOld;
                    p.y = yOld;
                }
            }
        }

        collision();
    }

    public void collision() {
        Set<String> checkList = new HashSet<>();
        boolean hasCollision = false;
        ArrayList<Particle> newParticles = new ArrayList<>(); // new warehouse particles
    
        for (Particle p : particles) {
            String key = p.x + "," + p.y;
            
            if (checkList.contains(key)) {
                hasCollision = true;
                newParticles.add(new Particle(rand.nextInt(width), rand.nextInt(height))); // add new particle
            }
    
            checkList.add(key);
        }
    
        if (hasCollision) {
            particles.addAll(newParticles); // add all new warehouse to exist wh
            System.out.println("Bump! Collision detected! New particles added.");
        }
    }

    public void display(){
        char[][] grid = new char[this.height][this.width];
        for (int h = 0; h < height; h++){
            for (int w = 0; w < width; w++){
                grid[h][w] = ' ';
            }
        }

        Map<String, Integer> particleCount = new HashMap<>();
        for (Particle p : particles) {
            String key = p.x + "," + p.y; // String to check when collision
            particleCount.put(key, particleCount.getOrDefault(key, 0) + 1);
        }


        for (Particle p : particles) {
            if (p.y >= 0 && p.y < height && p.x >= 0 && p.x < width) {
                String key = p.x + "," + p.y;
                if (particleCount.get(key) > 1) {
                    grid[p.y][p.x] = 'X'; 
                } else {
                    grid[p.y][p.x] = '*';
                }
            }
        }

        System.out.println("This is the box Putin let me made");
        System.out.println("The number of particles inside: " + particles.size());

        StringBuilder line = new StringBuilder();
        for (int i = -2 ; i < this.width; i++) { // <--- i = -2 b/c width is the final variable
            line.append("--");
        }
        System.out.println(line.toString());

        //Inside box
        for (int i = 0; i < height; i++) {
            System.out.print("| ");
            for (int j = 0; j < width; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println(" |");
        }
        
        System.out.println(line.toString()+"\n");
    }
}
