package tbclient.FineFrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.ZhiBoInfoTW;

public final class FineBanner extends Message {
  public static final Long DEFAULT_FTID = Long.valueOf(0L);
  
  public static final String DEFAULT_LINK_URL = "";
  
  public static final String DEFAULT_PIC_URL = "";
  
  public static final String DEFAULT_TITLE = "";
  
  public static final Integer DEFAULT_TYPE = Integer.valueOf(0);
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long ftid;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String link_url;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String pic_url;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 6)
  public final ZhiBoInfoTW twzhibo_info;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer type;
  
  public FineBanner(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      Long long_ = paramBuilder.ftid;
      if (long_ == null) {
        this.ftid = DEFAULT_FTID;
      } else {
        this.ftid = long_;
      } 
      String str = paramBuilder.title;
      if (str == null) {
        this.title = "";
      } else {
        this.title = str;
      } 
      str = paramBuilder.pic_url;
      if (str == null) {
        this.pic_url = "";
      } else {
        this.pic_url = str;
      } 
      str = paramBuilder.link_url;
      if (str == null) {
        this.link_url = "";
      } else {
        this.link_url = str;
      } 
      Integer integer = paramBuilder.type;
      if (integer == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer;
      } 
      this.twzhibo_info = paramBuilder.twzhibo_info;
    } else {
      this.ftid = paramBuilder.ftid;
      this.title = paramBuilder.title;
      this.pic_url = paramBuilder.pic_url;
      this.link_url = paramBuilder.link_url;
      this.type = paramBuilder.type;
      this.twzhibo_info = paramBuilder.twzhibo_info;
    } 
  }
  
  public FineBanner(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<FineBanner> {
    public Long ftid;
    
    public String link_url;
    
    public String pic_url;
    
    public String title;
    
    public ZhiBoInfoTW twzhibo_info;
    
    public Integer type;
    
    public Builder() {}
    
    public Builder(FineBanner param1FineBanner) {
      super(param1FineBanner);
      if (param1FineBanner == null)
        return; 
      this.ftid = param1FineBanner.ftid;
      this.title = param1FineBanner.title;
      this.pic_url = param1FineBanner.pic_url;
      this.link_url = param1FineBanner.link_url;
      this.type = param1FineBanner.type;
      this.twzhibo_info = param1FineBanner.twzhibo_info;
    }
    
    public FineBanner build(boolean param1Boolean) {
      return new FineBanner(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
