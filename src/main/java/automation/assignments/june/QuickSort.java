package automation.assignments.june;
import java.util.Arrays;
public class QuickSort {

	public static void main(String[] args) {
		
		        Person[] people = {
		            new Person("John", 25),
		            new Person("Alice", 30),
		            new Person("Bob", 20),
		            new Person("Eve", 35),
		            new Person("Michael", 28)
		        };
		        
		        System.out.println("Before sorting:");
		        printPeople(people);
		        
		        quickSort(people, 0, people.length - 1);
		        
		        System.out.println("After sorting:");
		        printPeople(people);
		    }
		    
		    public static void quickSort(Person[] arr, int low, int high) {
		        if (low < high) {
		            int pivotIndex = partition(arr, low, high);
		            quickSort(arr, low, pivotIndex - 1);
		            quickSort(arr, pivotIndex + 1, high);
		        }
		    }
		    
		    public static int partition(Person[] arr, int low, int high) {
		        Person pivot = arr[high];
		        int i = low - 1;
		        
		        for (int j = low; j < high; j++) {
		            if (arr[j].getAge() < pivot.getAge()) {
		                i++;
		                swap(arr, i, j);
		            }
		        }
		        
		        swap(arr, i + 1, high);
		        
		        return i + 1;
		    }
		    
		    public static void swap(Person[] arr, int i, int j) {
		        Person temp = arr[i];
		        arr[i] = arr[j];
		        arr[j] = temp;
		    }
		    
		    public static void printPeople(Person[] people) {
		        for (Person person : people) {
		            System.out.println(person);
		        }
		        System.out.println();
		    }

		    public static class Person {
		        private String name;
		        private int age;
		        
		        public Person(String name, int age) {
		            this.name = name;
		            this.age = age;
		        }
		        
		        public String getName() {
		            return name;
		        }
		        
		        public int getAge() {
		            return age;
		        }
		        
		        public String toString() {
		            return name + " (" + age + " years old)";
		        }
		    
		}

	}


