public static Boolean isProperly(String sequence) {
	Stack<Character> st = new Stack<>();
	for(int i = 0; i < sequence.length(); i++) {
		if(sequence.charAt(i) == '(') {
			st.add(sequence.charAt(i));
		} else {
			if(!st.isEmpty()) {
				st.pop();
			} else {
				return false;
			}
		}
	}
	return st.isEmpty();
}
