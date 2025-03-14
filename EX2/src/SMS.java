class SMS extends Message {
    public SMS(String contenu) {
        super(contenu);
    }

    void envoyer() {
        System.out.println("SMS envoyé : " + getContenu());
    }
}