package pl.com.bottega.documentmanagement.api;

/**
 * Created by bernard.boguszewski on 18.06.2016.
 */
public class SignupResultDto {

    private boolean success;
    private String failreReason;

    public SignupResultDto(){
        success = true;
    }

    public SignupResultDto(String failreReason){
        this.failreReason = failreReason;
        success = false;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getFailreReason() {
        return failreReason;
    }

    public void setFailreReason(String failreReason) {
        this.failreReason = failreReason;
    }
}
