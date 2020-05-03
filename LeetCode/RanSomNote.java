class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {

        if(ransomNote.length() == 0){
            return true;
        }

        if(ransomNote.length() != 0 && magazine.length() == 0){
            return false;
        }

        char[] magChar = magazine.toCharArray();
        char[] ransomNoteChar = ransomNote.toCharArray();
        int[] magCharCount = new int[26];
        for (int i = 0; i < magCharCount.length; i++) {
            magCharCount[i] = 0;
        }

        for (int i = 0; i < magChar.length; i++) {
            magCharCount[magChar[i]-'a'] += 1;
        }

        // check if it is possible.
        for (int i = 0; i < ransomNoteChar.length; i++) {
            int index = ransomNoteChar[i]-'a';
            magCharCount[index]--;

            if(magCharCount[index] < 0)
            {
                return false;
            }
        }

         return true;
    }
}