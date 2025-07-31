class DefanginganIPAddress{
    public String defangIPaddr(String address) {
        return address.replace(".","[.]");
    }
}