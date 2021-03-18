package tasksBlock4

interface CommandList {

    fun programMenu() {
        print(
            "Выберите из списка действий номер операции:\n\n " +
                    "1. - Посмотреть полный список транспортных средств\n\n" +
                    "2. - Посмотреть информацию о транспортном средстве по номеру ТС\n\n" +
                    "3. - Выход из программы\n\n" +
                    "Введите номер:\n\n"
        )
    }
}