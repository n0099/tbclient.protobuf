package tbclient.GetVipInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class VipDailyList extends Message {
  public static final String DEFAULT_CARD_ID = "";
  
  public static final String DEFAULT_CLASS_NAME = "";
  
  public static final String DEFAULT_CLASS_URL = "";
  
  public static final String DEFAULT_CLASS_URL_NAME = "";
  
  public static final List<VipThemeItem> DEFAULT_ITEM = Collections.emptyList();
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String card_id;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String class_name;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String class_url;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String class_url_name;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 4)
  public final List<VipThemeItem> item;
  
  public VipDailyList(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.class_name;
      if (str1 == null) {
        this.class_name = "";
      } else {
        this.class_name = str1;
      } 
      str1 = paramBuilder.class_url_name;
      if (str1 == null) {
        this.class_url_name = "";
      } else {
        this.class_url_name = str1;
      } 
      str1 = paramBuilder.class_url;
      if (str1 == null) {
        this.class_url = "";
      } else {
        this.class_url = str1;
      } 
      List<VipThemeItem> list = paramBuilder.item;
      if (list == null) {
        this.item = DEFAULT_ITEM;
      } else {
        this.item = Message.immutableCopyOf(list);
      } 
      str = paramBuilder.card_id;
      if (str == null) {
        this.card_id = "";
      } else {
        this.card_id = str;
      } 
    } else {
      this.class_name = ((Builder)str).class_name;
      this.class_url_name = ((Builder)str).class_url_name;
      this.class_url = ((Builder)str).class_url;
      this.item = Message.immutableCopyOf(((Builder)str).item);
      this.card_id = ((Builder)str).card_id;
    } 
  }
  
  public VipDailyList(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<VipDailyList> {
    public String card_id;
    
    public String class_name;
    
    public String class_url;
    
    public String class_url_name;
    
    public List<VipThemeItem> item;
    
    public Builder() {}
    
    public Builder(VipDailyList param1VipDailyList) {
      super(param1VipDailyList);
      if (param1VipDailyList == null)
        return; 
      this.class_name = param1VipDailyList.class_name;
      this.class_url_name = param1VipDailyList.class_url_name;
      this.class_url = param1VipDailyList.class_url;
      this.item = Message.copyOf(param1VipDailyList.item);
      this.card_id = param1VipDailyList.card_id;
    }
    
    public VipDailyList build(boolean param1Boolean) {
      return new VipDailyList(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
