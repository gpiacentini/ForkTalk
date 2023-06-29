package it.unipi.inginf.lsdb.group15.forktalk.forktalkapp;

import it.unipi.inginf.lsdb.group15.forktalk.forktalkapp.dao.mongoDB.DriverDAO;
import it.unipi.inginf.lsdb.group15.forktalk.forktalkapp.dao.mongoDB.UserDAO;
import it.unipi.inginf.lsdb.group15.forktalk.forktalkapp.dto.UserDTO;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        DriverDAO.openConnection();
        //login: FUNZIONA
        /*UserDTO userDTO = MongoDBUserDAO.loginUser("ianmW7519KN", "cbzuu0Bq");
        String userDTOString = userDTO.toString();  // Assegna la rappresentazione in forma di stringa a una variabile
        System.out.println(userDTOString); */

        //Register a new user: FUNZIONA
        /*User newUser = new User("f.rossi87@gmail.com", "filo87", "ssjj283ss","Filippo", "Rossi", "Milan");
        System.out.println(MongoDBUserDAO.registerUser(newUser)); */

        //remove user: FUNZIONA
        //System.out.println(MongoDBUserDAO.deleteUser("filo87"));

        //update info user: FUNZIONA
        /*UserDTO userDTO = new UserDTO("f_rossi87@gmail.com", "filo87", "ssjj283ss","Filippo", "Rossi", "Rome");
        System.out.println(MongoDBUserDAO.updateUser("filo87", userDTO)); */

        //get user by username: FUNZIONA
        /*UserDTO userDTO = MongoDBUserDAO.getUserByUsername("ianmW7519KN");
        assert userDTO != null;
        String userDTOString = userDTO.toString();  // Assegna la rappresentazione in forma di stringa a una variabile
        System.out.println(userDTOString);*/

        //create RestaurantsList: FUNZIONA
        //System.out.println(MongoDBUserDAO.createRestaurantListToUser(MongoDBUserDAO.getUserByUsername("filo87"), "Best London Fast Food"));

        //delete RestaurantList: FUNZIONA
        //System.out.println(MongoDBUserDAO.deleteRestaurantListFromUser(MongoDBUserDAO.getUserByUsername("filo87"), "Favorite Sushi Restaurant"));

        //get RestaurantsList: FUNZIONA
        /*ArrayList<String> titles = getRestaurantListsOfUser(MongoDBUserDAO.getUserByUsername("filo87"));

        if (titles != null) {
            for (String title : titles) {
                System.out.println(title);
            }
        } else {
            System.err.println("ERROR: Failed to retrieve restaurant lists.");
        }*/

        //add a restaurant to a restaurants list
        //RestaurantDTO new_rest = new RestaurantDTO("g10259438-d19087750", "Band of Burgers");
        //System.out.println(MongoDBUserDAO.addRestaurantToList(MongoDBUserDAO.getUserByUsername("filo87"), "Best London Fast Food", new_rest));


        //delete a restaurant from a restaurants list
        //System.out.println(MongoDBUserDAO.removeRestaurantFromList(MongoDBUserDAO.getUserByUsername("filo87"), "Best London Fast Food", new_rest.getId()));

        //get restaurants from a list given a title: FUNZIONA
        /*RestaurantsListDTO restaurantsList = getRestaurantsFromLists(MongoDBUserDAO.getUserByUsername("filo87"), "Best London Fast Food");

        if (restaurantsList == null) {
            System.out.println("Error occurred while retrieving the restaurant list.");
            return;
        }

        if (restaurantsList.getTitle() == null) {
            System.out.println("List with the given title not found.");
            return;
        }

        System.out.println("Restaurant List: " + restaurantsList.getTitle());
        System.out.println("Restaurants:");

        List<Restaurant> restaurants = restaurantsList.getRestaurants();
        if (restaurants.isEmpty()) {
            System.out.println("No restaurants found in the list.");
        } else {
            for (Restaurant restaurant : restaurants) {
                System.out.println("ID: " + restaurant.getId() + ", Name: " + restaurant.getName());
            }
        } */

        //get reservation
        /*UserDTO user = MongoDBUserDAO.getUserByUsername("ianmW7519KN");
        ArrayList<ReservationDTO> reservations = getReservations(user);

        if (reservations != null) {
            // Stampa l'elenco delle prenotazioni dell'utente
            System.out.println("Elenco prenotazioni utente:");
            for (ReservationDTO reservation : reservations) {
                System.out.println(reservation.toString());
            }
        } else {
            System.out.println("Non sono state trovate prenotazioni per l'utente.");
        }*/

        /* ******** RESTAURANT TEST QUERY ******** */

        //login restaurant
        /*RestaurantDTO rest = MongoDBRestaurantDAO.loginRestaurant("band-of-burgers_695", "f9R3j^u^@x");
        assert rest != null;
        String restDTOString = rest.toString();  // Assegna la rappresentazione in forma di stringa a una variabile
        System.out.println(restDTOString);*/

        //get Restaurants by Name: FUNZIONA
        // Effettua il login come ristorante
        /*String restaurantName = "Band of Burgers";

        // Chiama la funzione per ottenere i ristoranti corrispondenti al nome
        List<RestaurantDTO> restaurants = getRestaurantsByName(restaurantName);

        // Stampa i ristoranti trovati
        if (restaurants != null) {
            for (RestaurantDTO restaurant : restaurants) {
                System.out.println("ID: " + restaurant.getId());
                System.out.println("Nome: " + restaurant.getName());
                System.out.println("Email: " + restaurant.getEmail());
                System.out.println("Username: " + restaurant.getUsername());
                System.out.println("Password: " + restaurant.getPassword());
                System.out.println("Country: " + restaurant.getCountry());
                System.out.println("County: " + restaurant.getCounty());
                System.out.println("District: " + restaurant.getDistrict());
                System.out.println("City: " + restaurant.getCity());
                System.out.println("Address: " + restaurant.getAddress());
                System.out.println("Street Number: " + restaurant.getStreetNumber());
                System.out.println("Postcode: " + restaurant.getPostCode());
                System.out.println("Price: " + restaurant.getPrice());
                System.out.println("Features: " + restaurant.getFeatures());
                System.out.println("Location: " + restaurant.getLocation());
                System.out.println("Rating: " + restaurant.getRating());
                System.out.println("Coordinates: " + restaurant.getCoordinates());
                System.out.println("Reservations: " + restaurant.getReservations());
                System.out.println("Reviews: " + restaurant.getReviews());

                System.out.println("--------------------");
            }
        } else {
            System.out.println("Nessun ristorante trovato.");
        } */

        //get Restaurant by Username
        // Effettua il login come ristorante
        /*String username = "band-of-burgers_695";

        // Chiama la funzione per ottenere il ristorante corrispondente allo username
        RestaurantDTO restaurant = getRestaurantByUsername(username);

        // Stampa il ristorante trovato
        if (restaurant != null) {
            System.out.println("ID: " + restaurant.getId());
            System.out.println("Nome: " + restaurant.getName());
            System.out.println("Email: " + restaurant.getEmail());
            System.out.println("Username: " + restaurant.getUsername());
            System.out.println("Password: " + restaurant.getPassword());
            System.out.println("Country: " + restaurant.getCountry());
            System.out.println("County: " + restaurant.getCounty());
            System.out.println("District: " + restaurant.getDistrict());
            System.out.println("City: " + restaurant.getCity());
            System.out.println("Address: " + restaurant.getAddress());
            System.out.println("Street Number: " + restaurant.getStreetNumber());
            System.out.println("Postcode: " + restaurant.getPostCode());
            System.out.println("Price: " + restaurant.getPrice());
            System.out.println("Features: " + restaurant.getFeatures());
            System.out.println("Location: " + restaurant.getLocation());
            System.out.println("Rating: " + restaurant.getRating());
            System.out.println("Coordinates: " + restaurant.getCoordinates());
            System.out.println("Reservations: " + restaurant.getReservations());
            System.out.println("Reviews: " + restaurant.getReviews());
        } else {
            System.out.println("Nessun ristorante trovato.");
        } */

        /*RestaurantDTO restaurant = new RestaurantDTO();
        restaurant.setId("123456");
        restaurant.setName("Ristorante Italiano");
        restaurant.setEmail("info@ristoranteitaliano.com");
        restaurant.setUsername("italianrestaurant");
        restaurant.setPassword("password123");
        restaurant.setCountry("Italy");
        restaurant.setCounty("Lombardy");
        restaurant.setDistrict("Milan");
        restaurant.setCity("Milan");
        restaurant.setAddress("Via Roma 123");
        restaurant.setStreetNumber("123");
        restaurant.setPostCode("12345");
        restaurant.setPrice(3);

        // Aggiunta delle caratteristiche
        ArrayList<String> features = new ArrayList<>();
        features.add("Italian Cuisine");
        features.add("Pizza");
        features.add("Pasta");
        restaurant.setFeatures(features);

        // Aggiunta della posizione
        ArrayList<String> location = new ArrayList<>();
        location.add("40.7128° N");
        location.add("74.0060° W");
        restaurant.setLocation(location);

        restaurant.setRating(4);

        // Aggiunta delle coordinate
        ArrayList<String> coordinates = new ArrayList<>();
        coordinates.add("40.7128");
        coordinates.add("74.0060");
        restaurant.setCoordinates(coordinates);

        // Aggiunta del ristorante al database
        //System.out.println(addRestaurant(restaurant));

        //delete a restaurant: FUNZIONA
        //System.out.println(deleteRestaurantByUsername("italianrestaurant"));

        //update a restaurant
        /*restaurant.setPrice(10);
        restaurant.setCity("Rome");

        System.out.println(updateRestaurant(restaurant));*/

        //retrieve reviews: FUNZIONA
        //System.out.println(getReviews("band-of-burgers_695"));ù

        //write a review: FUNZIONA
        /*Date date = new Date();

        // Crea un'istanza di SimpleDateFormat con il pattern "yyyy-MM-dd"
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        // Utilizza il formato per formattare la data
        String formattedDate = dateFormat.format(date);

        System.out.println("Data formattata: " + formattedDate);
        ReviewDTO newReview = new ReviewDTO("dfsj3423", formattedDate, 5, "Amazing!!!", "artymart");

        System.out.println(writeReview(newReview,"band-of-burgers_695")); */

        //get restaurant reservations: FUNZIONA
        // Esempio di utilizzo della funzione getReservations
        /*RestaurantDTO restaurant = getRestaurantByUsername("basmati-tandoori_832");
        assert restaurant != null;
        ArrayList<ReservationDTO> reservations = getReservations(restaurant);

        if (reservations != null) {
            System.out.println("Reservations:");
            for (ReservationDTO reservation : reservations) {
                System.out.println(reservation);
            }
        } else {
            System.out.println("An error occurred while retrieving reservations.");
        } */

        //set maximum number of client: FUNZIONA
        //System.out.println(setMaxClient(25, Objects.requireNonNull(getRestaurantByUsername("basmati-tandoori_832"))));

        //add free slots: FUNZIONA
        //System.out.println(addFreeSlot(getRestaurantByUsername("band-of-burgers_695")));

        //get free slots by date: FUNZIONA
        /*ArrayList<String> availableSlots = getFreeSlotsByDate(getRestaurantByUsername("band-of-burgers_695"), "2023-06-28");
        if(availableSlots == null || availableSlots.size() == 0)
            System.out.println("Slots not available");
        else {
            for (String time : availableSlots) {
                System.out.println(time);
            }
        }*/

        //make a reservation: FUNZIONA
        //System.out.println(ReservationDAO.makeLocalReservation(UserDAO.getUserByUsername("filo87"), getRestaurantByUsername("band-of-burgers_695")));

        //delete a reservation: FUNZIONA
        //ReservationDTO reservation = new ReservationDTO("filo87", "Filippo", "Rossi", "g10259438-d19087750", "Band of Burgers", "Walthamstow", " Hoe Street Walthamstow   ", "2023-06-30 19:30:00", 5);
        //System.out.println(deleteReservation(Objects.requireNonNull(UserDAO.getUserByUsername("filo87")), Objects.requireNonNull(getRestaurantByUsername("band-of-burgers_695")), reservation));

        //checkUsername: FUNZIONA
        //System.out.println(UserDAO.isUsernameTaken("lcocchella"));

        //checkEmail
        //System.out.println(UserDAO.isEmailTaken("lcocchella@yahoo.it"));

        System.out.println(UserDAO.deleteUser("bogdanp_UK"));
        DriverDAO.closeConnection();
    }

   /* private static final MongoDBDriverDAO mdb = new MongoDBDriverDAO();
    private static final MongoDBUserDAO mdbuser = new MongoDBUserDAO();
    private static final MongoDBAdministratorDAO mdbadmin = new MongoDBAdministratorDAO();
    private static final MongoDBRestaurantDAO mdbrest = new MongoDBRestaurantDAO();
    private static InputStreamReader input = new InputStreamReader(System.in);

    private static BufferedReader tastiera = new BufferedReader(input);

    public static void main(String[] args) throws IOException {
        MongoDBDriverDAO.openConnection();
        ;
        while (true) {

            System.out.println("\nSelect a command: \nI'm a:" +
                    "\n1. RESTAURANT" +
                    "\n2. USER" +
                    "\n3. ADMINISTRATOR ");


            String option = tastiera.readLine();
            switch (option) {
                case "1":

                    System.out.println("--RESTAURANT--\nWhat do you want to do? " +
                            "\n1. [Login]" +
                            "\n2. [Sign up]" +
                            "\n\n0. [Go back]");


                    String option_doctor = tastiera.readLine();
                case "2":
                    System.out.println("--USER--\nSelect a command: " +
                            "\n1. [LOGIN]" +
                            "\n2. [SIGN UP]" +
                            "\n\n0. [Shut down the application]");


                    String option_user = tastiera.readLine();

                    switch (option_user)
                    {
                        case "1": //LOGIN USER
                            while (true)
                            {
                                System.out.println("--LOGIN USER--\nInsert the username");
                                String username = tastiera.readLine();
                                System.out.println("Insert the password");
                                String password = tastiera.readLine();

                                // aggiungere costruttore

                                if (!mdbuser.loginUser(username, password)) {
                                    System.out.println("Please retry");
                                } else
                                {



                                }


            MongoDBDriverDAO.closeConnection();


        }
    } */
}