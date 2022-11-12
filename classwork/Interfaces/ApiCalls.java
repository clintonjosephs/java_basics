public class APICall implements APIInterface {
    
        @Override
        public void didCancel() {
            System.out.println("The API call was cancelled.");
        }
    
        @Override
        public void didFailWithError(String error) {
            System.out.println("The API call failed with error: " + error);
        }
    
        @Override
        public void didReceiveResponse(String response) {
            System.out.println("The API call received response: " + response);
        }
    
        @Override
        public String didReceiveData(String data) {
            System.out.println("The API call received data: " + data);
            return data;
        }
}