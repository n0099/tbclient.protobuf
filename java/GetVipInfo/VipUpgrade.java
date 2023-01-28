package tbclient.GetVipInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class VipUpgrade extends Message {
  public static final String DEFAULT_BUTTON = "";
  
  public static final String DEFAULT_CARD_ID = "";
  
  public static final String DEFAULT_EXPIRE = "";
  
  public static final String DEFAULT_LINK = "";
  
  public static final Integer DEFAULT_NORMAL;
  
  public static final Integer DEFAULT_PAY;
  
  public static final String DEFAULT_SVIP = "";
  
  public static final String DEFAULT_TEXT = "";
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String button;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String card_id;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String expire;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String link;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer normal;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer pay;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String svip;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String text;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_NORMAL = integer;
    DEFAULT_PAY = integer;
  }
  
  public VipUpgrade(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.normal;
      if (integer == null) {
        this.normal = DEFAULT_NORMAL;
      } else {
        this.normal = integer;
      } 
      integer = paramBuilder.pay;
      if (integer == null) {
        this.pay = DEFAULT_PAY;
      } else {
        this.pay = integer;
      } 
      String str1 = paramBuilder.text;
      if (str1 == null) {
        this.text = "";
      } else {
        this.text = str1;
      } 
      str1 = paramBuilder.button;
      if (str1 == null) {
        this.button = "";
      } else {
        this.button = str1;
      } 
      str1 = paramBuilder.link;
      if (str1 == null) {
        this.link = "";
      } else {
        this.link = str1;
      } 
      str1 = paramBuilder.svip;
      if (str1 == null) {
        this.svip = "";
      } else {
        this.svip = str1;
      } 
      str1 = paramBuilder.expire;
      if (str1 == null) {
        this.expire = "";
      } else {
        this.expire = str1;
      } 
      str = paramBuilder.card_id;
      if (str == null) {
        this.card_id = "";
      } else {
        this.card_id = str;
      } 
    } else {
      this.normal = ((Builder)str).normal;
      this.pay = ((Builder)str).pay;
      this.text = ((Builder)str).text;
      this.button = ((Builder)str).button;
      this.link = ((Builder)str).link;
      this.svip = ((Builder)str).svip;
      this.expire = ((Builder)str).expire;
      this.card_id = ((Builder)str).card_id;
    } 
  }
  
  public VipUpgrade(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<VipUpgrade> {
    public String button;
    
    public String card_id;
    
    public String expire;
    
    public String link;
    
    public Integer normal;
    
    public Integer pay;
    
    public String svip;
    
    public String text;
    
    public Builder() {}
    
    public Builder(VipUpgrade param1VipUpgrade) {
      super(param1VipUpgrade);
      if (param1VipUpgrade == null)
        return; 
      this.normal = param1VipUpgrade.normal;
      this.pay = param1VipUpgrade.pay;
      this.text = param1VipUpgrade.text;
      this.button = param1VipUpgrade.button;
      this.link = param1VipUpgrade.link;
      this.svip = param1VipUpgrade.svip;
      this.expire = param1VipUpgrade.expire;
      this.card_id = param1VipUpgrade.card_id;
    }
    
    public VipUpgrade build(boolean param1Boolean) {
      return new VipUpgrade(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
