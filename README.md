# Truck Management Application

The **Truck Management Application** is a simple Java-based system that performs CRUD (Create, Read, Update, Delete) operations for managing truck information in a MySQL database. It is designed to demonstrate layered architecture and the use of JDBC for database interactions.

---

## Project Structure

The application is organized into the following layers:

1. **Presentation Layer**:
   - Contains the main `App` class for user interaction and orchestrating the application's functionality.

2. **Service Layer**:
   - Contains the `TruckServices` class, which provides the core logic for CRUD operations.

3. **DAO Layer**:
   - Includes the `Truck` class, which maps to the `truck` database table.

4. **Persistence Layer**:
   - Includes the `ConnectionDetails` class for establishing a connection with the MySQL database.

---

## Features

- Add trucks to the database.
- Fetch details of a truck by ID.
- Update truck information.
- Retrieve all trucks from the database.
- Delete a truck from the database.

---

## Technologies Used

- **Java**: Core language for implementation.
- **JDBC**: For database connectivity.
- **MySQL**: Database used to store truck information.

---

## Database Table Structure

The application interacts with the `truck` table in the `truckmgt` database. Ensure this table exists before running the application:

```sql
CREATE TABLE truck (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    model VARCHAR(50),
    capacity INT,
    driver_name VARCHAR(50)
);
```

---

## Setup and Configuration

1. **Database Configuration**:
   - Update the `USERNAME` and `PASSWORD` in the `ConnectionDetails` class to match your MySQL credentials.

2. **Dependencies**:
   - Ensure that the MySQL JDBC driver is added to your project.

3. **IDE Setup**:
   - Import the project into your preferred IDE (e.g., IntelliJ IDEA, Eclipse).

4. **Run the Application**:
   - Execute the `App` class to perform CRUD operations.

---

## Usage Example

Here’s a quick overview of how the application works:

1. **Add Trucks**:
   - Creates and adds `Truck` objects to the database using the `addTruck` method.

2. **Fetch Truck by ID**:
   - Retrieves truck details using the `getTruckById` method.

3. **Update Truck Details**:
   - Updates truck information, such as the driver's name, using the `UpdateTruck` method.

4. **Retrieve All Trucks**:
   - Fetches and displays all trucks from the database using the `getAllTruck` method.

5. **Delete a Truck**:
   - Removes a truck from the database using the `DeleteTruck` method.

---

## Example Output

### Adding Trucks
```
Adding data......
Total row Affected is : 1
Total row Affected is : 1
Total row Affected is : 1
...
```

### Fetching Truck Data
```
Fetching data......
Truck at id 1 Truck{id=1, name='TATA', model='2015-MODEL', capacity=2000, driver_name='Rajesh-Bhaii'}
```

### Updating Truck Data
```
Updating data......
Updated truck data : Truck{id=3, name='LAYLAND', model='2011-MODEL', capacity=1000, driver_name='Michel'}
```

### Fetching All Trucks
```
Get all trucks data......
All trucks in Database:
Truck{id=1, name='TATA', model='2015-MODEL', capacity=2000, driver_name='Rajesh-Bhaii'}
Truck{id=2, name='VOLVO', model='2010-MODEL', capacity=4000, driver_name='Sukhi-Bhaii'}
...
```

### Deleting a Truck
```
Delete the Truck......
Row deleted : 1
```

---

## Output

![image alt]()

---

## Database

![image alt]()

---

## UML Diagram

![image alt]()

---

## Notes

- Ensure the MySQL database is running before executing the application.
- Handle exceptions appropriately to avoid unexpected crashes.

---

## Future Enhancements

- Add a graphical user interface (GUI) for easier interaction.
- Implement user authentication.
- Add more advanced features like filtering and sorting trucks by capacity or model.

---

## Author

**Rohit**

---



