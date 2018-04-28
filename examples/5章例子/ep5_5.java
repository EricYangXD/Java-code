class ep5_5 {
	public static void main(String args[]) {
		String path = "c:\\myfile\\2000\\result.txt";
		int index = path.lastIndexOf("\\");
		String fileName = path.substring(index + 1);
		String newName = fileName.replaceAll(".txt", ".java");
		System.out.println(path);
		System.out.println(fileName);
		System.out.println(newName);
	}
}
