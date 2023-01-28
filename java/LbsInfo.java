package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class LbsInfo extends Message {
  public static final String DEFAULT_LAT = "";
  
  public static final String DEFAULT_LON = "";
  
  public static final String DEFAULT_TOWN = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String lat;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String lon;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String town;
  
  public LbsInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.lat;
      if (str1 == null) {
        this.lat = "";
      } else {
        this.lat = str1;
      } 
      str1 = paramBuilder.lon;
      if (str1 == null) {
        this.lon = "";
      } else {
        this.lon = str1;
      } 
      str = paramBuilder.town;
      if (str == null) {
        this.town = "";
      } else {
        this.town = str;
      } 
    } else {
      this.lat = ((Builder)str).lat;
      this.lon = ((Builder)str).lon;
      this.town = ((Builder)str).town;
    } 
  }
  
  public LbsInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<LbsInfo> {
    public String lat;
    
    public String lon;
    
    public String town;
    
    public Builder() {}
    
    public Builder(LbsInfo param1LbsInfo) {
      super(param1LbsInfo);
      if (param1LbsInfo == null)
        return; 
      this.lat = param1LbsInfo.lat;
      this.lon = param1LbsInfo.lon;
      this.town = param1LbsInfo.town;
    }
    
    public LbsInfo build(boolean param1Boolean) {
      return new LbsInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
