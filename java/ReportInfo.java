package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ReportInfo extends Message {
  public static final String DEFAULT_INFO = "";
  
  public static final String DEFAULT_URL = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String info;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String url;
  
  public ReportInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.info;
      if (str1 == null) {
        this.info = "";
      } else {
        this.info = str1;
      } 
      str = paramBuilder.url;
      if (str == null) {
        this.url = "";
      } else {
        this.url = str;
      } 
    } else {
      this.info = ((Builder)str).info;
      this.url = ((Builder)str).url;
    } 
  }
  
  public ReportInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ReportInfo> {
    public String info;
    
    public String url;
    
    public Builder() {}
    
    public Builder(ReportInfo param1ReportInfo) {
      super(param1ReportInfo);
      if (param1ReportInfo == null)
        return; 
      this.info = param1ReportInfo.info;
      this.url = param1ReportInfo.url;
    }
    
    public ReportInfo build(boolean param1Boolean) {
      return new ReportInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
