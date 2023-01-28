package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class PkItem extends Message {
  public static final Long DEFAULT_HAS_CLICKED;
  
  public static final String DEFAULT_LAST_USERNAME = "";
  
  public static final String DEFAULT_PK_DESC = "";
  
  public static final String DEFAULT_PK_ICON = "";
  
  public static final String DEFAULT_PK_ICON_AFTER = "";
  
  public static final Long DEFAULT_PK_INDEX;
  
  public static final Long DEFAULT_PK_NUM;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT64)
  public final Long has_clicked;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String last_username;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String pk_desc;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String pk_icon;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String pk_icon_after;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT64)
  public final Long pk_index;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long pk_num;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_PK_NUM = long_;
    DEFAULT_HAS_CLICKED = long_;
    DEFAULT_PK_INDEX = long_;
  }
  
  public PkItem(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_2 = paramBuilder.pk_num;
      if (long_2 == null) {
        this.pk_num = DEFAULT_PK_NUM;
      } else {
        this.pk_num = long_2;
      } 
      String str1 = paramBuilder.pk_desc;
      if (str1 == null) {
        this.pk_desc = "";
      } else {
        this.pk_desc = str1;
      } 
      str1 = paramBuilder.last_username;
      if (str1 == null) {
        this.last_username = "";
      } else {
        this.last_username = str1;
      } 
      str1 = paramBuilder.pk_icon;
      if (str1 == null) {
        this.pk_icon = "";
      } else {
        this.pk_icon = str1;
      } 
      Long long_1 = paramBuilder.has_clicked;
      if (long_1 == null) {
        this.has_clicked = DEFAULT_HAS_CLICKED;
      } else {
        this.has_clicked = long_1;
      } 
      long_1 = paramBuilder.pk_index;
      if (long_1 == null) {
        this.pk_index = DEFAULT_PK_INDEX;
      } else {
        this.pk_index = long_1;
      } 
      str = paramBuilder.pk_icon_after;
      if (str == null) {
        this.pk_icon_after = "";
      } else {
        this.pk_icon_after = str;
      } 
    } else {
      this.pk_num = ((Builder)str).pk_num;
      this.pk_desc = ((Builder)str).pk_desc;
      this.last_username = ((Builder)str).last_username;
      this.pk_icon = ((Builder)str).pk_icon;
      this.has_clicked = ((Builder)str).has_clicked;
      this.pk_index = ((Builder)str).pk_index;
      this.pk_icon_after = ((Builder)str).pk_icon_after;
    } 
  }
  
  public PkItem(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<PkItem> {
    public Long has_clicked;
    
    public String last_username;
    
    public String pk_desc;
    
    public String pk_icon;
    
    public String pk_icon_after;
    
    public Long pk_index;
    
    public Long pk_num;
    
    public Builder() {}
    
    public Builder(PkItem param1PkItem) {
      super(param1PkItem);
      if (param1PkItem == null)
        return; 
      this.pk_num = param1PkItem.pk_num;
      this.pk_desc = param1PkItem.pk_desc;
      this.last_username = param1PkItem.last_username;
      this.pk_icon = param1PkItem.pk_icon;
      this.has_clicked = param1PkItem.has_clicked;
      this.pk_index = param1PkItem.pk_index;
      this.pk_icon_after = param1PkItem.pk_icon_after;
    }
    
    public PkItem build(boolean param1Boolean) {
      return new PkItem(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
