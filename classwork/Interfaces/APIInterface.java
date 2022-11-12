public interface APIInterface {

   @Override
   public void didCancel() {}

    @Override
    public void didFailWithError(String error) {}

    @Override
    public void didReceiveResponse(String response) {}

    @Override
    public String didReceiveData(String data) {}
}