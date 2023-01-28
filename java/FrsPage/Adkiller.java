package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class Adkiller extends Message {
  public static final Integer DEFAULT_AD_LEFT_NUM;
  
  public static final List<AdkillerAd> DEFAULT_AD_LIST;
  
  public static final String DEFAULT_HINT_URL = "";
  
  public static final Integer DEFAULT_SHOW_AD;
  
  public static final Integer DEFAULT_SHOW_HINT;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer ad_left_num;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 5)
  public final List<AdkillerAd> ad_list;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String hint_url;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer show_ad;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer show_hint;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_SHOW_HINT = integer;
    DEFAULT_SHOW_AD = integer;
    DEFAULT_AD_LEFT_NUM = integer;
    DEFAULT_AD_LIST = Collections.emptyList();
  }
  
  public Adkiller(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<AdkillerAd> list;
    if (paramBoolean == true) {
      Integer integer2 = paramBuilder.show_hint;
      if (integer2 == null) {
        this.show_hint = DEFAULT_SHOW_HINT;
      } else {
        this.show_hint = integer2;
      } 
      integer2 = paramBuilder.show_ad;
      if (integer2 == null) {
        this.show_ad = DEFAULT_SHOW_AD;
      } else {
        this.show_ad = integer2;
      } 
      String str = paramBuilder.hint_url;
      if (str == null) {
        this.hint_url = "";
      } else {
        this.hint_url = str;
      } 
      Integer integer1 = paramBuilder.ad_left_num;
      if (integer1 == null) {
        this.ad_left_num = DEFAULT_AD_LEFT_NUM;
      } else {
        this.ad_left_num = integer1;
      } 
      list = paramBuilder.ad_list;
      if (list == null) {
        this.ad_list = DEFAULT_AD_LIST;
      } else {
        this.ad_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.show_hint = ((Builder)list).show_hint;
      this.show_ad = ((Builder)list).show_ad;
      this.hint_url = ((Builder)list).hint_url;
      this.ad_left_num = ((Builder)list).ad_left_num;
      this.ad_list = Message.immutableCopyOf(((Builder)list).ad_list);
    } 
  }
  
  public Adkiller(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<Adkiller> {
    public Integer ad_left_num;
    
    public List<AdkillerAd> ad_list;
    
    public String hint_url;
    
    public Integer show_ad;
    
    public Integer show_hint;
    
    public Builder() {}
    
    public Builder(Adkiller param1Adkiller) {
      super(param1Adkiller);
      if (param1Adkiller == null)
        return; 
      this.show_hint = param1Adkiller.show_hint;
      this.show_ad = param1Adkiller.show_ad;
      this.hint_url = param1Adkiller.hint_url;
      this.ad_left_num = param1Adkiller.ad_left_num;
      this.ad_list = Message.copyOf(param1Adkiller.ad_list);
    }
    
    public Adkiller build(boolean param1Boolean) {
      return new Adkiller(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
