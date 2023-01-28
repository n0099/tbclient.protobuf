package tbclient.HomePage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class TwzbThreadItem extends Message {
  public static final String DEFAULT_ABSTRACT = "";
  
  public static final String DEFAULT_LINK_URL = "";
  
  public static final String DEFAULT_PIC_URL = "";
  
  public static final Long DEFAULT_TID = Long.valueOf(0L);
  
  public static final String DEFAULT_TITLE = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String _abstract;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String link_url;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String pic_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long tid;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String title;
  
  public TwzbThreadItem(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.tid;
      if (long_ == null) {
        this.tid = DEFAULT_TID;
      } else {
        this.tid = long_;
      } 
      String str1 = paramBuilder.title;
      if (str1 == null) {
        this.title = "";
      } else {
        this.title = str1;
      } 
      str1 = paramBuilder._abstract;
      if (str1 == null) {
        this._abstract = "";
      } else {
        this._abstract = str1;
      } 
      str1 = paramBuilder.pic_url;
      if (str1 == null) {
        this.pic_url = "";
      } else {
        this.pic_url = str1;
      } 
      str = paramBuilder.link_url;
      if (str == null) {
        this.link_url = "";
      } else {
        this.link_url = str;
      } 
    } else {
      this.tid = ((Builder)str).tid;
      this.title = ((Builder)str).title;
      this._abstract = ((Builder)str)._abstract;
      this.pic_url = ((Builder)str).pic_url;
      this.link_url = ((Builder)str).link_url;
    } 
  }
  
  public TwzbThreadItem(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<TwzbThreadItem> {
    public String _abstract;
    
    public String link_url;
    
    public String pic_url;
    
    public Long tid;
    
    public String title;
    
    public Builder() {}
    
    public Builder(TwzbThreadItem param1TwzbThreadItem) {
      super(param1TwzbThreadItem);
      if (param1TwzbThreadItem == null)
        return; 
      this.tid = param1TwzbThreadItem.tid;
      this.title = param1TwzbThreadItem.title;
      this._abstract = param1TwzbThreadItem._abstract;
      this.pic_url = param1TwzbThreadItem.pic_url;
      this.link_url = param1TwzbThreadItem.link_url;
    }
    
    public TwzbThreadItem build(boolean param1Boolean) {
      return new TwzbThreadItem(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
