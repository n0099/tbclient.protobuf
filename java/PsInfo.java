package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class PsInfo extends Message {
  public static final Long DEFAULT_GAME_ID;
  
  public static final String DEFAULT_GAME_INTRO = "";
  
  public static final String DEFAULT_GAME_PIC_URL = "";
  
  public static final Long DEFAULT_GAME_TYPE;
  
  public static final Long DEFAULT_SCORE;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long game_id;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String game_intro;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String game_pic_url;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT64)
  public final Long game_type;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long score;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_GAME_ID = long_;
    DEFAULT_SCORE = long_;
    DEFAULT_GAME_TYPE = long_;
  }
  
  public PsInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.game_id;
      if (long_ == null) {
        this.game_id = DEFAULT_GAME_ID;
      } else {
        this.game_id = long_;
      } 
      long_ = paramBuilder.score;
      if (long_ == null) {
        this.score = DEFAULT_SCORE;
      } else {
        this.score = long_;
      } 
      long_ = paramBuilder.game_type;
      if (long_ == null) {
        this.game_type = DEFAULT_GAME_TYPE;
      } else {
        this.game_type = long_;
      } 
      String str1 = paramBuilder.game_pic_url;
      if (str1 == null) {
        this.game_pic_url = "";
      } else {
        this.game_pic_url = str1;
      } 
      str = paramBuilder.game_intro;
      if (str == null) {
        this.game_intro = "";
      } else {
        this.game_intro = str;
      } 
    } else {
      this.game_id = ((Builder)str).game_id;
      this.score = ((Builder)str).score;
      this.game_type = ((Builder)str).game_type;
      this.game_pic_url = ((Builder)str).game_pic_url;
      this.game_intro = ((Builder)str).game_intro;
    } 
  }
  
  public PsInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<PsInfo> {
    public Long game_id;
    
    public String game_intro;
    
    public String game_pic_url;
    
    public Long game_type;
    
    public Long score;
    
    public Builder() {}
    
    public Builder(PsInfo param1PsInfo) {
      super(param1PsInfo);
      if (param1PsInfo == null)
        return; 
      this.game_id = param1PsInfo.game_id;
      this.score = param1PsInfo.score;
      this.game_type = param1PsInfo.game_type;
      this.game_pic_url = param1PsInfo.game_pic_url;
      this.game_intro = param1PsInfo.game_intro;
    }
    
    public PsInfo build(boolean param1Boolean) {
      return new PsInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
