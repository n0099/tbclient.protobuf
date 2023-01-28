package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class NoticeInfo extends Message {
  public static final String DEFAULT_NOTICE = "";
  
  public static final Integer DEFAULT_PULLCOMMENTFREQUENCE = Integer.valueOf(0);
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String notice;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer pullCommentFrequence;
  
  public NoticeInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.notice;
      if (str == null) {
        this.notice = "";
      } else {
        this.notice = str;
      } 
      integer = paramBuilder.pullCommentFrequence;
      if (integer == null) {
        this.pullCommentFrequence = DEFAULT_PULLCOMMENTFREQUENCE;
      } else {
        this.pullCommentFrequence = integer;
      } 
    } else {
      this.notice = ((Builder)integer).notice;
      this.pullCommentFrequence = ((Builder)integer).pullCommentFrequence;
    } 
  }
  
  public NoticeInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<NoticeInfo> {
    public String notice;
    
    public Integer pullCommentFrequence;
    
    public Builder() {}
    
    public Builder(NoticeInfo param1NoticeInfo) {
      super(param1NoticeInfo);
      if (param1NoticeInfo == null)
        return; 
      this.notice = param1NoticeInfo.notice;
      this.pullCommentFrequence = param1NoticeInfo.pullCommentFrequence;
    }
    
    public NoticeInfo build(boolean param1Boolean) {
      return new NoticeInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
