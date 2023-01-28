package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class FavoritePanel extends Message {
  public static final String DEFAULT_IMG_URL = "";
  
  public static final String DEFAULT_MAIN_TITLE = "";
  
  public static final Integer DEFAULT_MAX_TIMES;
  
  public static final Long DEFAULT_NUMBER = Long.valueOf(0L);
  
  public static final String DEFAULT_ON_OFF = "";
  
  public static final String DEFAULT_SUB_TITLE = "";
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String img_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String main_title;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer max_times;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT64)
  public final Long number;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String on_off;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String sub_title;
  
  static {
    DEFAULT_MAX_TIMES = Integer.valueOf(0);
  }
  
  public FavoritePanel(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str2 = paramBuilder.main_title;
      if (str2 == null) {
        this.main_title = "";
      } else {
        this.main_title = str2;
      } 
      str2 = paramBuilder.sub_title;
      if (str2 == null) {
        this.sub_title = "";
      } else {
        this.sub_title = str2;
      } 
      Long long_ = paramBuilder.number;
      if (long_ == null) {
        this.number = DEFAULT_NUMBER;
      } else {
        this.number = long_;
      } 
      String str1 = paramBuilder.img_url;
      if (str1 == null) {
        this.img_url = "";
      } else {
        this.img_url = str1;
      } 
      str1 = paramBuilder.on_off;
      if (str1 == null) {
        this.on_off = "";
      } else {
        this.on_off = str1;
      } 
      integer = paramBuilder.max_times;
      if (integer == null) {
        this.max_times = DEFAULT_MAX_TIMES;
      } else {
        this.max_times = integer;
      } 
    } else {
      this.main_title = ((Builder)integer).main_title;
      this.sub_title = ((Builder)integer).sub_title;
      this.number = ((Builder)integer).number;
      this.img_url = ((Builder)integer).img_url;
      this.on_off = ((Builder)integer).on_off;
      this.max_times = ((Builder)integer).max_times;
    } 
  }
  
  public FavoritePanel(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<FavoritePanel> {
    public String img_url;
    
    public String main_title;
    
    public Integer max_times;
    
    public Long number;
    
    public String on_off;
    
    public String sub_title;
    
    public Builder() {}
    
    public Builder(FavoritePanel param1FavoritePanel) {
      super(param1FavoritePanel);
      if (param1FavoritePanel == null)
        return; 
      this.main_title = param1FavoritePanel.main_title;
      this.sub_title = param1FavoritePanel.sub_title;
      this.number = param1FavoritePanel.number;
      this.img_url = param1FavoritePanel.img_url;
      this.on_off = param1FavoritePanel.on_off;
      this.max_times = param1FavoritePanel.max_times;
    }
    
    public FavoritePanel build(boolean param1Boolean) {
      return new FavoritePanel(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
