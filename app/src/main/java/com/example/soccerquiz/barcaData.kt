package com.example.soccerquiz

object barcaData {

    fun getQuestions(): ArrayList<BarcaQuestions>{
        val questionList = ArrayList<BarcaQuestions>()

        val ques1 = BarcaQuestions(1,"რომელ წელს დაარსდა ,,ბარსელონა", "1902",
        "1899","1898", "1900", 2)
        questionList.add(ques1)

        val ques2 = BarcaQuestions(2, "რამდენჯერ აქვს მოგებული ბარსელონას უეფას ჩემპიონთა ლიგა?"
        ,"12","7","5","6",3)
        questionList.add(ques2)
        val ques3 = BarcaQuestions(3, "რამდენჯერ მოიგო ბარსელონამ ესპანეთის ჩემპიონატი (ლალიგა)",
        "15", "20",  "24", "23", 3)
        questionList.add(ques3)
        val ques4 = BarcaQuestions(4,
        "2009 წელს ბარსელონამ დაამყარა რეკორდი, რამდენი ოფიციალური ტურნირის გამარჯვებული გახდა კატალონიური გრანდი იმ წელს? "
        , "3", "4", "5", "6", 4)
        questionList.add(ques4)
        val ques5 = BarcaQuestions(5,"ისტორიის გამნავლობაში, ყველაზე მეტი რამდენი ადამიანი დაესწორო ბარსელონას თამაშს კამპ ნოუზე?"
        , "120 ათასი", "110 ათასი", "105 ათასი", "113 ათასი", 1)
        questionList.add(ques5)
        val ques6 = BarcaQuestions(6, "რომელ წლებში გამოდიოდა ბარსელონას შემადგენლობაში რონალდო(ლუის ნაზარიო)?",
        "1995/1996", "1996/1997", "1998/2002", "1999/2000",
        2)
        questionList.add(ques6)
        val ques7 = BarcaQuestions(7,"რამდენი ოქროს ბურთი აქვს ბარსელონას არგენტინელ თავმდამსხელს ლიონელ მესის?",
        "5", "4", "6","3",1)
        questionList.add(ques7)
        val ques8 = BarcaQuestions(8, "ჩემპიონთა ლიგის გასულ სეზონში ,,ბარსელონამ\" საკუთარ მოედანზე ფრანგული ,,პსჟ\" 6-1 დაამარცხა. ვინ გაიტანა გამარჯვების გოლი",
        "მესიმ","ნეიმარმა","საურესმა", "სერხი რობერტომ",4)
        questionList.add(ques8)

        val ques9 = BarcaQuestions(9, "2006 წელს ჩემპიონთა ლიგის ფინალში ,,ბარსელონამ\" ლონდონის ,,არსენალი\" 2-1 დაამრცხა. ვინ იყო გამარჯვების გოლის ავტორი?",
        "ეტო'ო","რონალდინიო","ჟულიანო ბელეტი","პუიოლი",3)
        questionList.add(ques9)

        val ques10 = BarcaQuestions(10,"რომელი კლუბიდან იყიდა ,,ბარსელონამ\" ლუის სუარესი",
                "ლივერპული","აიაქსი","გრონინგემი","მანჩესტერი",1)
        questionList.add(ques10)

        return questionList
    }
}