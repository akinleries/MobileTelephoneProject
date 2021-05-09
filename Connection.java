package MobileTelephone;


import java.time.LocalDateTime;

public class Connection {

    private  int destinationId;
    private LocalDateTime startCall;
    private LocalDateTime endCall;

    public int getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(int destinationId) {
        this.destinationId = destinationId;
    }

    public LocalDateTime getStartCall() {
        return startCall;
    }

    public void setStartCall(LocalDateTime startCall) {
        this.startCall = startCall;
    }

    public LocalDateTime getEndCall() {
        return endCall;
    }

    public void setEndCall(LocalDateTime endCall) {
        this.endCall = endCall;
    }
}
