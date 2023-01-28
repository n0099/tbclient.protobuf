package tbclient.ThreadList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class AdParam extends Message {
  public static final Integer DEFAULT_LOAD_COUNT;
  
  public static final Integer DEFAULT_REFRESH_COUNT;
  
  public static final String DEFAULT_YOGA_LIB_VERSION = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer load_count;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer refresh_count;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String yoga_lib_version;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_LOAD_COUNT = integer;
    DEFAULT_REFRESH_COUNT = integer;
  }
  
  public AdParam(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.load_count;
      if (integer == null) {
        this.load_count = DEFAULT_LOAD_COUNT;
      } else {
        this.load_count = integer;
      } 
      integer = paramBuilder.refresh_count;
      if (integer == null) {
        this.refresh_count = DEFAULT_REFRESH_COUNT;
      } else {
        this.refresh_count = integer;
      } 
      str = paramBuilder.yoga_lib_version;
      if (str == null) {
        this.yoga_lib_version = "";
      } else {
        this.yoga_lib_version = str;
      } 
    } else {
      this.load_count = ((Builder)str).load_count;
      this.refresh_count = ((Builder)str).refresh_count;
      this.yoga_lib_version = ((Builder)str).yoga_lib_version;
    } 
  }
  
  public AdParam(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<AdParam> {
    public Integer load_count;
    
    public Integer refresh_count;
    
    public String yoga_lib_version;
    
    public Builder() {}
    
    public Builder(AdParam param1AdParam) {
      super(param1AdParam);
      if (param1AdParam == null)
        return; 
      this.load_count = param1AdParam.load_count;
      this.refresh_count = param1AdParam.refresh_count;
      this.yoga_lib_version = param1AdParam.yoga_lib_version;
    }
    
    public AdParam build(boolean param1Boolean) {
      return new AdParam(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
