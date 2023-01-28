package tbclient.Loop;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.ThemeColorInfo;

public final class FestivalInfo extends Message {
  public static final String DEFAULT_BLESS = "";
  
  public static final String DEFAULT_COMMENT_TIPS = "";
  
  public static final Long DEFAULT_MAIN_FID = Long.valueOf(0L);
  
  public static final String DEFAULT_MAIN_FNAME = "";
  
  public static final String DEFAULT_WRITE_SELECT_TIPS = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String bless;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String comment_tips;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT64)
  public final Long main_fid;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String main_fname;
  
  @ProtoField(tag = 6)
  public final ThemeColorInfo tips_color;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String write_select_tips;
  
  public FestivalInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      String str2 = paramBuilder.main_fname;
      if (str2 == null) {
        this.main_fname = "";
      } else {
        this.main_fname = str2;
      } 
      Long long_ = paramBuilder.main_fid;
      if (long_ == null) {
        this.main_fid = DEFAULT_MAIN_FID;
      } else {
        this.main_fid = long_;
      } 
      String str1 = paramBuilder.bless;
      if (str1 == null) {
        this.bless = "";
      } else {
        this.bless = str1;
      } 
      str1 = paramBuilder.write_select_tips;
      if (str1 == null) {
        this.write_select_tips = "";
      } else {
        this.write_select_tips = str1;
      } 
      str1 = paramBuilder.comment_tips;
      if (str1 == null) {
        this.comment_tips = "";
      } else {
        this.comment_tips = str1;
      } 
      this.tips_color = paramBuilder.tips_color;
    } else {
      this.main_fname = paramBuilder.main_fname;
      this.main_fid = paramBuilder.main_fid;
      this.bless = paramBuilder.bless;
      this.write_select_tips = paramBuilder.write_select_tips;
      this.comment_tips = paramBuilder.comment_tips;
      this.tips_color = paramBuilder.tips_color;
    } 
  }
  
  public FestivalInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<FestivalInfo> {
    public String bless;
    
    public String comment_tips;
    
    public Long main_fid;
    
    public String main_fname;
    
    public ThemeColorInfo tips_color;
    
    public String write_select_tips;
    
    public Builder() {}
    
    public Builder(FestivalInfo param1FestivalInfo) {
      super(param1FestivalInfo);
      if (param1FestivalInfo == null)
        return; 
      this.main_fname = param1FestivalInfo.main_fname;
      this.main_fid = param1FestivalInfo.main_fid;
      this.bless = param1FestivalInfo.bless;
      this.write_select_tips = param1FestivalInfo.write_select_tips;
      this.comment_tips = param1FestivalInfo.comment_tips;
      this.tips_color = param1FestivalInfo.tips_color;
    }
    
    public FestivalInfo build(boolean param1Boolean) {
      return new FestivalInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
