package com.example.quizapp

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question> {

        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1,
            "What country does this flag belong to?", R.drawable.ic_flag_of_argentina,
            "Argentina", "Australia",
            "Armenia", "Brazil",
            1
        )
        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Angola", "Austria",
            "Australia", "Armenia",
            3
        )
        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Belarus", "Belize",
            "Brunei", "Brazil",
            4
        )
        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Bahamas", "Belgium",
            "Barbados", "Belize",
            2
        )
        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Gabon", "France",
            "Fiji", "Finland",
            3
        )
        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Germany", "Georgia",
            "Greece", "none of these",
            1
        )
        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Dominica", "Egypt",
            "Denmark", "Ethiopia",
            3
        )
        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "Ireland", "Iran",
            "Hungary", "India",
            4
        )
        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "What country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "Australia", "New Zealand",
            "Tuvalu", "United States of America",
            2
        )
        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait", "Jordan",
            "Sudan", "Palestine",
            1
        )
        questionsList.add(que10)

        // 11
        val que11 = Question(
            11, "Which country is in this picture?", R.drawable.new_zealand,
            "Australia", "Indonesia",
            "New Zealand", "Japan",
            3
        )
        questionsList.add(que11)

        // 12
        val que12 = Question(
            12, "Which country is in this picture?", R.drawable.congo,
            "Algeria", "Egypt", "South Africa",
            "Congo DR",
            4
        )
        questionsList.add(que12)

        // 13
        val que13 = Question(
            13, "Which country is in this picture?", R.drawable.mexico,
            "USA", "Canada", "Mexico", "Brasil",
            3
        )
        questionsList.add(que13)

        // 14
        val que14 = Question(
            14, "Which country is in this picture?", R.drawable.croatia,
            "Serbia", "Croatia", "Greece", "Italy",
            2
        )
        questionsList.add(que14)

        // 15
        val que15 = Question(
            15, "Which country is in this picture", R.drawable.chile,
            "Chile", "Peru", "Argentina", "Bolivia",
            1
        )
        questionsList.add(que15)

        // 16
        val que16 = Question(
            16, "Cangaroo is a national animal of which country?", R.drawable.cangaroo,
            "Australia", "Austria",
            "New Zealand", "China",
            1
        )
        questionsList.add(que16)

        // 17
        val que17 = Question(
            17, "Bear is a national animal of which country?", R.drawable.bear,
            "Serbia", "Poland",
            "Russia", "Canada",
            3
        )
        questionsList.add(que17)

        // 18
        val que18 = Question(
            18, "Tiger is a national animal of which country?", R.drawable.tiger,
            "India", "China",
            "Japan", "South Africa",
            1
        )
        questionsList.add(que18)

        // 19
        val que19 = Question(
            19, "Panda is a national animal of which country?", R.drawable.panda,
            "Japan", "China",
            "South Korea", "Kazakhstan",
            2
        )
        questionsList.add(que19)

        // 20
        val que20 = Question(
            20, "Wolf is a national animal of which country?", R.drawable.wolf,
            "Serbia", "Bosnia and Herzegovina",
            "Montenegro", "France",
            1
        )
        questionsList.add(que20)

        // 21
        val que21 = Question(
            21, "In which city is the building from the picture?", R.drawable.burjkhalifa,
            "Dubai", "Abu Dhabi",
            "Doha", "Kuwait City",
            1
        )
        questionsList.add(que21)

        // 22
        val que22 = Question(
            20, "In which city is the building from the picture?", R.drawable.pisa,
            "Rome", "Milano",
            "Pisa", "Verona",
            3
        )
        questionsList.add(que22)

        // 23
        val que23 = Question(
            23, "In which city is the building from the picture?", R.drawable.sydneyopera,
            "Melbourne", "Perth",
            "Auckland", "Sydney",
            4
        )
        questionsList.add(que23)

        // 24
        val que24 = Question(
            24, "In which city is the statue from the picture?", R.drawable.statueoflibertypg,
            "Los Angeles", "Chicago",
            "New York", "Boston",
            3
        )
        questionsList.add(que24)

        // 25
        val que25 = Question(
            25, "In which city is the building from the picture?", R.drawable.christtheredeemerjpg,
            "Sao Paolo", "Rio de Janeiro",
            "Buenos Aires", "Montevideo",
            2
        )
        questionsList.add(que25)


        return questionsList
    }
    // END
}
