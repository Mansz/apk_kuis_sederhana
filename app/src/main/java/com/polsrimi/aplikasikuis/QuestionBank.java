package com.polsrimi.aplikasikuis;

public class QuestionBank {

    private String textQuestions [] = {
            "1. Siapa Nama Menteri Pendidikan dan Kebudayaan?",
            "2. Siapa Presiden Pertama Indonesia?",
            "3. Siapa Presiden Indonesia Sekarang?",
            "4. Apa Nama Ibukota Indonesia?",
            "5. Siapakah prediksi calon presiden di tahun 2024?"

    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"Nadiem Makarim", "Sri Mulyani", "dr Terawan", "Edhy Prabowo"},
            {"Soeharto", "Jokowi", "SBY", "Ir Soekarno"},
            {"Megawati", "SBY", "Bj Habibi", "Jokowi"},
            {"Palembang", "Bandung", "Jakarta", "Surabaya"},
            {"Ganjar", "Anies", "Prabowo", "Ridwan Kamil"}
    };

    private String mCorrectAnswers[] = {"Nadiem Makarim", "Ir Soekarno", "Jokowi", "Jakarta", "Ganjar"};

    public int getLength(){
        return textQuestions.length;
    }

    public String getQuestion(int a) {
        String question = textQuestions[a];
        return question;
    }

    public String getChoice(int index, int num) {
        String choice0 = multipleChoice[index][num-1];
        return choice0;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}