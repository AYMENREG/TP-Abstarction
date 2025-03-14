class Email extends Message {
    public Email(String contenu) {
        super(contenu);
    }

    void envoyer() {
        System.out.println("Email envoyé : " + getContenu());
    }
}
