package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class TipInfo extends Message {
  public static final String DEFAULT_TIP_INTERVAL = "";
  
  public static final String DEFAULT_TIP_NAME = "";
  
  public static final String DEFAULT_TIP_NOTICE = "";
  
  public static final String DEFAULT_TIP_POP = "";
  
  public static final String DEFAULT_TIP_POP_TITLE = "";
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String tip_interval;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String tip_name;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String tip_notice;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String tip_pop;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String tip_pop_title;
  
  public TipInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.tip_name;
      if (str1 == null) {
        this.tip_name = "";
      } else {
        this.tip_name = str1;
      } 
      str1 = paramBuilder.tip_pop_title;
      if (str1 == null) {
        this.tip_pop_title = "";
      } else {
        this.tip_pop_title = str1;
      } 
      str1 = paramBuilder.tip_pop;
      if (str1 == null) {
        this.tip_pop = "";
      } else {
        this.tip_pop = str1;
      } 
      str1 = paramBuilder.tip_notice;
      if (str1 == null) {
        this.tip_notice = "";
      } else {
        this.tip_notice = str1;
      } 
      str = paramBuilder.tip_interval;
      if (str == null) {
        this.tip_interval = "";
      } else {
        this.tip_interval = str;
      } 
    } else {
      this.tip_name = ((Builder)str).tip_name;
      this.tip_pop_title = ((Builder)str).tip_pop_title;
      this.tip_pop = ((Builder)str).tip_pop;
      this.tip_notice = ((Builder)str).tip_notice;
      this.tip_interval = ((Builder)str).tip_interval;
    } 
  }
  
  public TipInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<TipInfo> {
    public String tip_interval;
    
    public String tip_name;
    
    public String tip_notice;
    
    public String tip_pop;
    
    public String tip_pop_title;
    
    public Builder() {}
    
    public Builder(TipInfo param1TipInfo) {
      super(param1TipInfo);
      if (param1TipInfo == null)
        return; 
      this.tip_name = param1TipInfo.tip_name;
      this.tip_pop_title = param1TipInfo.tip_pop_title;
      this.tip_pop = param1TipInfo.tip_pop;
      this.tip_notice = param1TipInfo.tip_notice;
      this.tip_interval = param1TipInfo.tip_interval;
    }
    
    public TipInfo build(boolean param1Boolean) {
      return new TipInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
