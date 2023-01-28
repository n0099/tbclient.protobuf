package tbclient.GetGiftMyList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Gift extends Message {
  public static final Integer DEFAULT_GIFT_ID;
  
  public static final String DEFAULT_NAME = "";
  
  public static final Integer DEFAULT_NUM;
  
  public static final String DEFAULT_PLAY_URL = "";
  
  public static final Integer DEFAULT_SEND_TIME;
  
  public static final String DEFAULT_THUMBNAIL_URL = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer gift_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 6, type = Message.Datatype.UINT32)
  public final Integer num;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String play_url;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer send_time;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String thumbnail_url;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_GIFT_ID = integer;
    DEFAULT_SEND_TIME = integer;
    DEFAULT_NUM = integer;
  }
  
  public Gift(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer2 = paramBuilder.gift_id;
      if (integer2 == null) {
        this.gift_id = DEFAULT_GIFT_ID;
      } else {
        this.gift_id = integer2;
      } 
      String str = paramBuilder.name;
      if (str == null) {
        this.name = "";
      } else {
        this.name = str;
      } 
      str = paramBuilder.play_url;
      if (str == null) {
        this.play_url = "";
      } else {
        this.play_url = str;
      } 
      str = paramBuilder.thumbnail_url;
      if (str == null) {
        this.thumbnail_url = "";
      } else {
        this.thumbnail_url = str;
      } 
      Integer integer1 = paramBuilder.send_time;
      if (integer1 == null) {
        this.send_time = DEFAULT_SEND_TIME;
      } else {
        this.send_time = integer1;
      } 
      integer = paramBuilder.num;
      if (integer == null) {
        this.num = DEFAULT_NUM;
      } else {
        this.num = integer;
      } 
    } else {
      this.gift_id = ((Builder)integer).gift_id;
      this.name = ((Builder)integer).name;
      this.play_url = ((Builder)integer).play_url;
      this.thumbnail_url = ((Builder)integer).thumbnail_url;
      this.send_time = ((Builder)integer).send_time;
      this.num = ((Builder)integer).num;
    } 
  }
  
  public Gift(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<Gift> {
    public Integer gift_id;
    
    public String name;
    
    public Integer num;
    
    public String play_url;
    
    public Integer send_time;
    
    public String thumbnail_url;
    
    public Builder() {}
    
    public Builder(Gift param1Gift) {
      super(param1Gift);
      if (param1Gift == null)
        return; 
      this.gift_id = param1Gift.gift_id;
      this.name = param1Gift.name;
      this.play_url = param1Gift.play_url;
      this.thumbnail_url = param1Gift.thumbnail_url;
      this.send_time = param1Gift.send_time;
      this.num = param1Gift.num;
    }
    
    public Gift build(boolean param1Boolean) {
      return new Gift(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
