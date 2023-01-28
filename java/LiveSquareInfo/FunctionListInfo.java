package tbclient.LiveSquareInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class FunctionListInfo extends Message {
  public static final String DEFAULT_DESCRIBE = "";
  
  public static final String DEFAULT_ICON = "";
  
  public static final Integer DEFAULT_ID = Integer.valueOf(0);
  
  public static final String DEFAULT_TITLE = "";
  
  public static final Long DEFAULT_UPDATE_TIME = Long.valueOf(0L);
  
  public static final String DEFAULT_URL = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String describe;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String icon;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT64)
  public final Long update_time;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String url;
  
  public FunctionListInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.id;
      if (integer == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = integer;
      } 
      String str1 = paramBuilder.title;
      if (str1 == null) {
        this.title = "";
      } else {
        this.title = str1;
      } 
      str1 = paramBuilder.describe;
      if (str1 == null) {
        this.describe = "";
      } else {
        this.describe = str1;
      } 
      str1 = paramBuilder.url;
      if (str1 == null) {
        this.url = "";
      } else {
        this.url = str1;
      } 
      Long long_ = paramBuilder.update_time;
      if (long_ == null) {
        this.update_time = DEFAULT_UPDATE_TIME;
      } else {
        this.update_time = long_;
      } 
      str = paramBuilder.icon;
      if (str == null) {
        this.icon = "";
      } else {
        this.icon = str;
      } 
    } else {
      this.id = ((Builder)str).id;
      this.title = ((Builder)str).title;
      this.describe = ((Builder)str).describe;
      this.url = ((Builder)str).url;
      this.update_time = ((Builder)str).update_time;
      this.icon = ((Builder)str).icon;
    } 
  }
  
  public FunctionListInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<FunctionListInfo> {
    public String describe;
    
    public String icon;
    
    public Integer id;
    
    public String title;
    
    public Long update_time;
    
    public String url;
    
    public Builder() {}
    
    public Builder(FunctionListInfo param1FunctionListInfo) {
      super(param1FunctionListInfo);
      if (param1FunctionListInfo == null)
        return; 
      this.id = param1FunctionListInfo.id;
      this.title = param1FunctionListInfo.title;
      this.describe = param1FunctionListInfo.describe;
      this.url = param1FunctionListInfo.url;
      this.update_time = param1FunctionListInfo.update_time;
      this.icon = param1FunctionListInfo.icon;
    }
    
    public FunctionListInfo build(boolean param1Boolean) {
      return new FunctionListInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
