package sevenpointthree;

public class BuildStringy {

	public static void main(String[] args) {
		String input = "Mijn Feyenoord! O! O! O!";
		System.out.println("String: " + input);
		StringBuilder sb = new StringBuilder();
		System.out.println("StringBuilder: " + sb);

		System.out.println("StringBuilder initial capacity: " + sb.capacity());
		sb.append(input+" ");
		System.out.println("StringBuilder: " + sb);

		System.out.println("StringBuilder capacity after appending: " + sb.capacity());
		sb.append(input+" ");
		sb.append(input+" ");
		System.out.println("StringBuilder: " + sb);

		System.out.println("StringBuilder capacity after appending: " + sb.capacity());

	}

}