package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class RecreationRankInfo extends Message {
  public static final String DEFAULT_ICON = "";
  
  public static final String DEFAULT_RANK_COLOR = "";
  
  public static final String DEFAULT_RANK_ICON = "";
  
  public static final String DEFAULT_RANK_LINK = "";
  
  public static final String DEFAULT_RANK_NAME = "";
  
  public static final Integer DEFAULT_RANK_SCORE;
  
  public static final Integer DEFAULT_SHOW_TYPE;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String icon;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String rank_color;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String rank_icon;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String rank_link;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String rank_name;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer rank_score;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer show_type;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_RANK_SCORE = integer;
    DEFAULT_SHOW_TYPE = integer;
  }
  
  public RecreationRankInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str2 = paramBuilder.icon;
      if (str2 == null) {
        this.icon = "";
      } else {
        this.icon = str2;
      } 
      str2 = paramBuilder.rank_name;
      if (str2 == null) {
        this.rank_name = "";
      } else {
        this.rank_name = str2;
      } 
      Integer integer1 = paramBuilder.rank_score;
      if (integer1 == null) {
        this.rank_score = DEFAULT_RANK_SCORE;
      } else {
        this.rank_score = integer1;
      } 
      String str1 = paramBuilder.rank_link;
      if (str1 == null) {
        this.rank_link = "";
      } else {
        this.rank_link = str1;
      } 
      str1 = paramBuilder.rank_icon;
      if (str1 == null) {
        this.rank_icon = "";
      } else {
        this.rank_icon = str1;
      } 
      str1 = paramBuilder.rank_color;
      if (str1 == null) {
        this.rank_color = "";
      } else {
        this.rank_color = str1;
      } 
      integer = paramBuilder.show_type;
      if (integer == null) {
        this.show_type = DEFAULT_SHOW_TYPE;
      } else {
        this.show_type = integer;
      } 
    } else {
      this.icon = ((Builder)integer).icon;
      this.rank_name = ((Builder)integer).rank_name;
      this.rank_score = ((Builder)integer).rank_score;
      this.rank_link = ((Builder)integer).rank_link;
      this.rank_icon = ((Builder)integer).rank_icon;
      this.rank_color = ((Builder)integer).rank_color;
      this.show_type = ((Builder)integer).show_type;
    } 
  }
  
  public RecreationRankInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<RecreationRankInfo> {
    public String icon;
    
    public String rank_color;
    
    public String rank_icon;
    
    public String rank_link;
    
    public String rank_name;
    
    public Integer rank_score;
    
    public Integer show_type;
    
    public Builder() {}
    
    public Builder(RecreationRankInfo param1RecreationRankInfo) {
      super(param1RecreationRankInfo);
      if (param1RecreationRankInfo == null)
        return; 
      this.icon = param1RecreationRankInfo.icon;
      this.rank_name = param1RecreationRankInfo.rank_name;
      this.rank_score = param1RecreationRankInfo.rank_score;
      this.rank_link = param1RecreationRankInfo.rank_link;
      this.rank_icon = param1RecreationRankInfo.rank_icon;
      this.rank_color = param1RecreationRankInfo.rank_color;
      this.show_type = param1RecreationRankInfo.show_type;
    }
    
    public RecreationRankInfo build(boolean param1Boolean) {
      return new RecreationRankInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
