package tbclient.GetVipInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class VipBasicList extends Message {
  public static final String DEFAULT_CARD_ID = "";
  
  public static final Integer DEFAULT_CARD_TYPE;
  
  public static final String DEFAULT_CLASS_NAME = "";
  
  public static final String DEFAULT_CLASS_URL = "";
  
  public static final String DEFAULT_CLASS_URL_NAME = "";
  
  public static final List<VipSpecialItem> DEFAULT_ITEM = Collections.emptyList();
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String card_id;
  
  @ProtoField(tag = 8, type = Message.Datatype.UINT32)
  public final Integer card_type;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String class_name;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String class_url;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String class_url_name;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<VipSpecialItem> item;
  
  static {
    DEFAULT_CARD_TYPE = Integer.valueOf(0);
  }
  
  public VipBasicList(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      List<VipSpecialItem> list = paramBuilder.item;
      if (list == null) {
        this.item = DEFAULT_ITEM;
      } else {
        this.item = Message.immutableCopyOf(list);
      } 
      Integer integer = paramBuilder.card_type;
      if (integer == null) {
        this.card_type = DEFAULT_CARD_TYPE;
      } else {
        this.card_type = integer;
      } 
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
      str = paramBuilder.card_id;
      if (str == null) {
        this.card_id = "";
      } else {
        this.card_id = str;
      } 
    } else {
      this.item = Message.immutableCopyOf(((Builder)str).item);
      this.card_type = ((Builder)str).card_type;
      this.class_name = ((Builder)str).class_name;
      this.class_url_name = ((Builder)str).class_url_name;
      this.class_url = ((Builder)str).class_url;
      this.card_id = ((Builder)str).card_id;
    } 
  }
  
  public VipBasicList(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<VipBasicList> {
    public String card_id;
    
    public Integer card_type;
    
    public String class_name;
    
    public String class_url;
    
    public String class_url_name;
    
    public List<VipSpecialItem> item;
    
    public Builder() {}
    
    public Builder(VipBasicList param1VipBasicList) {
      super(param1VipBasicList);
      if (param1VipBasicList == null)
        return; 
      this.item = Message.copyOf(param1VipBasicList.item);
      this.card_type = param1VipBasicList.card_type;
      this.class_name = param1VipBasicList.class_name;
      this.class_url_name = param1VipBasicList.class_url_name;
      this.class_url = param1VipBasicList.class_url;
      this.card_id = param1VipBasicList.card_id;
    }
    
    public VipBasicList build(boolean param1Boolean) {
      return new VipBasicList(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
